package com.janoz.aoc.y2021.day6;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

class Day6Test {


    @Test
    void testPart1() {
        assertThat(new Day6().calculate("3,4,3,1,2", 80), equalTo(5934L));
    }

    @Test
    void testPart2() {
        assertThat(new Day6().calculate("3,4,3,1,2", 256), equalTo(26984457539L));
    }
}
