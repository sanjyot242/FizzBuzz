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
    public void shouldReturnOne()
    {
        assertThat(App.getAnswerFor(1),is("1"));
    }
    @Test
    public void shouldReturnTwo(){
        assertThat(App.getAnswerFor(2),is("2"));
    }





}
