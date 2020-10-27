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
        String answer = String.valueOf(number);
        if(isMultipleOfThree(number) && isMultipleOfFive(number)){
            answer = "FizzBuzz";
        }else if(isMultipleOfThree(number)){
            answer = "Fizz";
        }
        else if(isMultipleOfFive(number)){
           answer = "Buzz";
        }
        return answer;
    }

    private static boolean isMultipleOfFive(int number) {
        return number%5==0;
    }

    private static boolean isMultipleOfThree(int number) {
        return number%3 == 0;
    }
}
