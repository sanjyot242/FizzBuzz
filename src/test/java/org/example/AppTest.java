package org.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturnNumberIfNotDivisibleBy_3_5()
    {
        assertThat(App.getAnswerFor(1),is("1"));
        assertThat(App.getAnswerFor(2),is("2"));
        assertThat(App.getAnswerFor(4),is("4"));
    }
    @Test
    public void shouldReturnFizz_If_3_OrDivisibleBy3(){
        assertThat(App.getAnswerFor(3),is("Fizz"));
        assertThat(App.getAnswerFor(6),is("Fizz"));
    }
    @Test
    public void shouldReturnBuzz_If_5_OrDivisibleBy5(){
        assertThat(App.getAnswerFor(5),is("Buzz"));
        assertThat(App.getAnswerFor(10),is("Buzz"));
    }
    @Test
    public void shouldReturnFizzBuzz_divisibleBy_3_5(){
        assertThat(App.getAnswerFor(15),is("FizzBuzz"));
        assertThat(App.getAnswerFor(30),is("FizzBuzz"));
    }









}
