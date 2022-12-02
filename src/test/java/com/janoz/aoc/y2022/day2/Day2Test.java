package com.janoz.aoc.y2022.day2;

import org.junit.jupiter.api.Test;

import static com.janoz.aoc.y2022.day2.RPS.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Day2Test {
    
    
    
    
    @Test
    void testScoreCounter() {
        assertThat(Day2.score(Day2.mapToRPS("A Y")), is(8));
        assertThat(Day2.score(Day2.mapToRPS("B X")), is(1));
        assertThat(Day2.score(Day2.mapToRPS("C Z")), is(6));
    }

    @Test
    void testScoreWithOutcomeCounter() {
        assertThat(Day2.score(Day2.mapToOutcome("A Y")), is(4));
        assertThat(Day2.score(Day2.mapToOutcome("B X")), is(1));
        assertThat(Day2.score(Day2.mapToOutcome("C Z")), is(7));
    }

    @Test
    void testScore() {
        assertThat(Day2.score(ROCK, ROCK), is(1+3));
        assertThat(Day2.score(ROCK, PAPER), is(2+6));
        assertThat(Day2.score(ROCK, SCISSOR), is(3));
        assertThat(Day2.score(PAPER, ROCK), is(1));
        assertThat(Day2.score(PAPER, PAPER), is(2+3));
        assertThat(Day2.score(PAPER, SCISSOR), is(3+6));
    }
}
