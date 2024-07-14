package com.abhishek.lld.strategy2;

// Step 2 : Concrete Strategy Class ::: RarCompression

import java.util.List;

public class RarCompression implements CompressionStrategy {
	
    @Override
    public void compressFiles(List<String> files) {
        System.out.println("Compressing files using RAR approach...");
        // Add RAR compression logic here
        for (String file : files) {
            System.out.println("Compressing file: " + file + " as RAR");
        }
    }
}
