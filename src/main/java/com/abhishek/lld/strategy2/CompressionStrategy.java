package com.abhishek.lld.strategy2;

import java.util.List;

// Step 1: Define the Strategy Interface ::: CompressionStrategy

public interface CompressionStrategy {
	
    void compressFiles(List<String> files);
}
