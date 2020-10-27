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
        if(number%15==0){
            answer = "FizzBuzz";
        }else if(number%3==0){
            answer = "Fizz";
        }
        else if(number%5==0){
           answer = "Buzz";
        }
        return answer;
    }
}
