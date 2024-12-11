package com.org.quick_book.services;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class S3Service {

    private final AmazonS3 amazonS3;
    private final String bucketName = "gminato-moviedb";
    private final String folderName = "movie-images"; // Your folder within the bucket

    public String uploadFile(MultipartFile file) throws IOException {
        File convFile = convertMultiPartToFile(file);

        String uniqueFileName = folderName + "/" + UUID.randomUUID().toString() + "-" + file.getOriginalFilename();

        amazonS3.putObject(new PutObjectRequest(bucketName, uniqueFileName, convFile));

        return amazonS3.getUrl(bucketName, uniqueFileName).toString();

    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        try (FileOutputStream fos = new FileOutputStream(convFile)) {
            fos.write(file.getBytes());
        } catch (IOException e) {
            throw new IOException("Error converting the multi-part file to file", e);
        }
        return convFile;
    }

    // Generate a URL to access the file from S3
    public String downloadFile(String fileName) {
        return amazonS3.getUrl(bucketName, fileName).toString();
    }
}
