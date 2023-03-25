package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.stream.Collectors;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        return sourceMap.entrySet().stream()
                .collect(Collectors.toMap(
                                        Map.Entry::getValue,
                                        Map.Entry::getKey,
                                        (u1,u2) -> (u1 < u2) ? u1 : u2)
                );

    }
}
