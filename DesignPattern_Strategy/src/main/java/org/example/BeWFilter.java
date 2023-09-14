package org.example;

public class BeWFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter!");
    }
}
