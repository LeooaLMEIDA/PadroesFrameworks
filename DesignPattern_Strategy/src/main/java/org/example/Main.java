package org.example;


public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store(
                "arquivo01",
                new JpegCompressor(),
                new HighContrastFilter()
        );
        imageStorage.store(
                "arquivo02",
                new PngCompressor(),
                new BeWFilter()
        );


    }
}