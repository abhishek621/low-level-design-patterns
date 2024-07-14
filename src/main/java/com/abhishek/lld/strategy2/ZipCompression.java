package com.abhishek.lld.strategy2;

// Step 2 : Concrete Strategy Class ::: ZipCompression

import java.util.List;

public class ZipCompression implements CompressionStrategy {
	
    @Override
    public void compressFiles(List<String> files) {
        System.out.println("Compressing files using ZIP approach...");
        // Add ZIP compression logic here
        for (String file : files) {
            System.out.println("Compressing file: " + file + " as ZIP");
        }
    }
}
