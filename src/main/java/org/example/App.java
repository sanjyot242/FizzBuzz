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
        if(number==3){
            return "Fizz";
        }
        String num = String.valueOf(number);
        return num;
    }
}
