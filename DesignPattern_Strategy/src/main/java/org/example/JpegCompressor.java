package org.example;

public class JpegCompressor implements Compressor {

    @Override
    public void compress(String filename) {
        //algoritmo de compressão
        System.out.println("Compressing using .jpg");
    }
}
