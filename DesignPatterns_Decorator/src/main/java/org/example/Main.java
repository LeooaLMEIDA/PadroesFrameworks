package org.example;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard (Stream stream) {
        stream.write("1234-1234-2345-1325");
    }
}