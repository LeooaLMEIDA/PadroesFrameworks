package org.example;

public class ImageStorage {
//
//    private Compressor compressor;
//    private Filter filter;
//
//    public ImageStorage(Compressor compressor, Filter filter) {
//        this.compressor = compressor;
//        this.filter = filter;
//    }

    public void store(String fileName, Compressor compressor, Filter filter) {
        //jpeg, png...
        compressor.compress(fileName);
//        if (compressor.equals("jpeg")) {
//            System.out.println("Compressing using .jpeg!");
//        } else if (compressor.equals("png")) {
//            System.out.println("Compressing using .png!");
//        }
//        //b&w
         filter.apply(fileName);
//        if (filter.equals("b&w")) {
//            System.out.println("Applying filter b&w");
//        } else if (filter.equals("high contranst")) {
//            System.out.println("Applying filter hig constrant");
//        }
    }
}
