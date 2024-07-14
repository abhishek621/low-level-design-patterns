package com.abhishek.lld.strategy2;

//Step 2 : Concrete Strategy Class ::: GzipCompression

import java.util.List;

public class GzipCompression implements CompressionStrategy {
	
    @Override
    public void compressFiles(List<String> files) {
        System.out.println("Compressing files using GZIP approach...");
        // Add GZIP compression logic here
        for (String file : files) {
            System.out.println("Compressing file: " + file + " as GZIP");
        }
    }
}
