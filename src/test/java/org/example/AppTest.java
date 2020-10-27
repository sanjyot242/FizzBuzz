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
    public void shouldReturnOne_For_1()
    {
        assertThat(App.getAnswerFor(1),is("1"));
    }
    @Test
    public void shouldReturnTwo_For_2(){
        assertThat(App.getAnswerFor(2),is("2"));
    }
    @Test
    public void shouldReturnFizz_For_3(){
        assertThat(App.getAnswerFor(3),is("Fizz"));
    }
    @Test
    public void shouldReturnFour_For_4(){
        assertThat(App.getAnswerFor(4),is("4"));
    }
    @Test
    public void shouldReturnBuzz_For_5(){
        assertThat(App.getAnswerFor(5),is("Buzz"));
    }







}
