package org.example;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream (Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        String compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
