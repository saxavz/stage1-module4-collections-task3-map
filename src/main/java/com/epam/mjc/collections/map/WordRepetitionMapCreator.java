package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String,Integer> m =
        Arrays.stream(sentence.split(" "))
                .filter(s -> sentence.length() > 0)
                .map(w -> w.replaceAll("\\p{P}",""))
                .map(String::toLowerCase)
                .collect(Collectors.toMap(
                                        Function.identity(),
                                        s -> 1,
                                        (u1,u2) -> u1+u2
                        )
                );

        System.out.println(m);
        return m;

    }
}
