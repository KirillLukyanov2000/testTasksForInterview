package ru.lukyanov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FizzBuzzTest {
    @Test
    public void fizzBuzzTest() {
        Assertions.assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz");
    }

    @Test
    public void fizzTest() {
        Assertions.assertEquals(FizzBuzz.fizzBuzz(9), "Fizz");
    }

    @Test
    public void buzzTest() {
        Assertions.assertEquals(FizzBuzz.fizzBuzz(10), "Buzz");
    }


}