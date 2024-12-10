CREATE TABLE movies (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    genre VARCHAR(255)[],
    duration INT,
    rating VARCHAR(10),
    release_date DATE,
    poster_url TEXT,
    trailer_url TEXT,
    language VARCHAR(50)
);


CREATE TABLE theaters (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location TEXT NOT NULL
);

CREATE TABLE screens (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    theater_id INT REFERENCES theaters(id) ON DELETE CASCADE
);


CREATE TABLE showtimes (
    id SERIAL PRIMARY KEY,
    movie_id INT REFERENCES movies(id) ON DELETE CASCADE,
    screen_id INT REFERENCES screens(id) ON DELETE CASCADE,
    time TIMESTAMP NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    currency VARCHAR(10) NOT NULL,
    available_seats INT
);
