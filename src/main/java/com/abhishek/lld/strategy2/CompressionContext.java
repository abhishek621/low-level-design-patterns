package com.abhishek.lld.strategy2;

// Step 3 : Context Class ::: CompressionContext

import java.util.List;

public class CompressionContext {

	private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compressFiles(List<String> files) {
        compressionStrategy.compressFiles(files);
    }
}
