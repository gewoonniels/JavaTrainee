package h6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab6 {

    public void calculateSum(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        int[] numbers = new int[10];

        System.out.println("Enter numbers");

        for(int i = 0;i < 10; i++){
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.stream(numbers).sum());
    }

    public void print3By3Array(){
        int[] array = new int[3];


    }

}
