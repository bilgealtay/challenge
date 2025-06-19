package com.example.test;
import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;

    // Constructor to initialize cache with a specific capacity
    public SimpleCache(int capacity) {
        this.capacity = capacity;
        // Creating a LinkedHashMap with access order and a custom removal logic when the capacity is exceeded
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                // When the size of the map exceeds the defined capacity, the eldest entry is removed
                return size() > SimpleCache.this.capacity;
            }
        };
    }

    // Adds a new key-value pair to the cache or updates the value if the key already exists
    public void put(K key, V value) {
        cache.put(key, value);
    }

    // Retrieves the value associated with the key if it exists; returns null if the key is not found
    public V get(K key) {
        return cache.getOrDefault(key, null);
    }

    // Optional: Prints the current state of the cache (for debugging purposes)
    public void displayCache() {
        System.out.println(cache);
    }

    public static void main(String[] args) {
        // Example usage of the SimpleCache class
        SimpleCache<Integer, String> cache = new SimpleCache<>(3);

        // Adding items to the cache
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        // Accessing an item (marking it as recently used)
        System.out.println("Get 1: " + cache.get(1));

        // Adding a new item, which should trigger the removal of the least recently used item
        cache.put(4, "Four");

        // Display the cache contents
        cache.displayCache();  // Expected output: {3=Three, 1=One, 4=Four}
    }
}
