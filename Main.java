package com.company;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt(1,101);
        int min = 1;
        int max = 101;
        int count = 0;
        while(random > 0){

            int guess = ThreadLocalRandom.current().nextInt(min,max);

            if(guess > random){
                max = guess;
                System.out.println(guess);
                count = count + 1;
                System.out.println("太高了");
            }

            else if (guess < random){
                min = guess;
                System.out.println(guess);
                count = count + 1;
                System.out.println("太低了");
            }

            else if(guess == random){
                System.out.println(guess);
                count = count + 1;
                System.out.println("答對了");
                System.out.println("一共猜了" + count + "次。");
                break;
            }
        }
    }


}



