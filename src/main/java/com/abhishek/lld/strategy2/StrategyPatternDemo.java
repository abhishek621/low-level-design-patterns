package com.abhishek.lld.strategy2;

// Step 4: Use the Strategy Pattern

import java.util.Arrays;
import java.util.List;

public class StrategyPatternDemo {
   
	public static void main(String[] args) {
    
		CompressionContext context = new CompressionContext();
        
		List<String> files = Arrays.asList("file1.txt", "file2.txt", "file3.txt");

        // Compress using ZIP
        context.setCompressionStrategy(new ZipCompression());
        context.compressFiles(files);

        // Compress using RAR
        context.setCompressionStrategy(new RarCompression());
        context.compressFiles(files);

        // Compress using GZIP
        context.setCompressionStrategy(new GzipCompression());
        context.compressFiles(files);
    }
}
