package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    }

    public static String getAnswerFor(int number) {
        if(number%3==0){
            return "Fizz";
        }
        if(number==5){
            return "Buzz";
        }
        String num = String.valueOf(number);
        return num;
    }
}
