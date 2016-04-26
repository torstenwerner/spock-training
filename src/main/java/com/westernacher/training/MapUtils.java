package com.westernacher.training;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum MapUtils {
    mapUtils;

    /**
     * calculates a difference between 2 maps which is suitable for logging
     */
    public <K, V> Map<String, String> difference(Map<K, V> before, Map<K, V> after) {
        if (before == null) {
            before = Collections.emptyMap();
        }
        if (after == null) {
            after = Collections.emptyMap();
        }

        final Map<String, String> diff = new HashMap<>();

        for (Map.Entry<K, V> entry : before.entrySet()) {
            final K key = entry.getKey();
            final V beforeValue = entry.getValue();
            if (!after.containsKey(key)) {
                diff.put(key.toString(), beforeValue + " -> null");
                continue;
            }
            final V afterValue = after.get(key);
            if (!Objects.equals(beforeValue, afterValue)) {
                diff.put(key.toString(), beforeValue + " -> " + afterValue);
            }
        }

        for (Map.Entry<K, V> entry : after.entrySet()) {
            final K key = entry.getKey();
            if (!before.containsKey(key)) {
                final V afterValue = entry.getValue();
                diff.put(key.toString(), "null -> " + afterValue);
            }
        }

        return diff;
    }
}
