package com.org.quick_book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.org.quick_book.services.S3Service;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/s3")
@RequiredArgsConstructor
public class S3Controller {

    private final S3Service s3Service;


    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // Upload the file and get the URL
            String fileUrl = s3Service.uploadFile(file);
            return "File uploaded successfully! Access it at: " + fileUrl;
        } catch (Exception e) {
            return "Error uploading file: " + e.getMessage();
        }
    }

    @GetMapping("/download/{fileName}")
    public String downloadFile(@PathVariable String fileName) {
        return s3Service.downloadFile(fileName);
    }
}

