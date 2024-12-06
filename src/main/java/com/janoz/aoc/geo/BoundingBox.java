package com.janoz.aoc.geo;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class BoundingBox {
    int top,bottom,left,right;

    public BoundingBox(Point origin) {
        top = origin.y;
        bottom = origin.y;
        left= origin.x;
        right = origin.x;
    }

    public void addPoint(Point toAdd) {
        top = Math.min(top,toAdd.y);
        bottom = Math.max(bottom,toAdd.y);
        left = Math.min(left,toAdd.x);
        right = Math.max(right,toAdd.x);
    }

    public Predicate<Point> inBoundsPredicate() {
        return Point.boundsPredicate(left,right,top, bottom);
    }

    public void printGrid(Function<Point,Character> mapToChar) {
        IntStream.rangeClosed(top,bottom).forEach(y -> {
            IntStream.rangeClosed(left,right).mapToObj(x -> new Point(x,y)).map(mapToChar).forEach(System.out::print);
            System.out.println();
        });
    }
}
