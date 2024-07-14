package com.abhishek.lld.prototype;

import java.util.HashMap;
import java.util.Map;

// Enhanced Prototype Implementations :::
// Prototype Registry ::: A Prototype Registry maintains a map of prototypes 
// that clients can use to create new objects

// Prototype Registry
public class PrototypeRegistry {
    
	private Map<String, Shape> prototypes = new HashMap<>();

    public void addPrototype(String key, Shape prototype) {
        prototypes.put(key, prototype);
    }

    public Shape getPrototype(String key) {
        Shape prototype = prototypes.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}

