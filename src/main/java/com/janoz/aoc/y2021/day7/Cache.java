package com.janoz.aoc.y2021.day7;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Cache<I,O> {

    private Map<I,O> cache = new HashMap<>();

    public void clear() {
        cache.clear();
    }

    public Function<I, O> cached(Function<I, O> actual) {
        return l -> {
            if (!cache.containsKey(l)) {
                cache.put(l,actual.apply(l));
            }
            return cache.get(l);
        };
    }
}
