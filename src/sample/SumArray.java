package sample;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class SumArray {


    public static void main(String[] args) {
//      Initialize the scanner object
        Scanner input = new Scanner(System.in);

//      create an ArrayList, so the user can dynamically add values
        ArrayList<Integer> myArr = new ArrayList<>();

//      prompt the user for array size
        System.out.println("Enter a size (less than 10) for your array: ");
        int size = input.nextInt();

//      prompt the user for power to raise each value by
        System.out.println("Enter a power to raise each value in your array: ");
        int power = input.nextInt();

//      start a while loop based on the size of the array. The countNum increments up, and the while loop
//      stops at the size of the user input. Each input is added to myArray.
        int countNum = 1;
        while (countNum <= size) {
            System.out.println("Enter number " + countNum + ": ");
            int num = input.nextInt();
            myArr.add(num);
            countNum++;
        }


//      1.) Find the sum of the elements in the arraylist
        int sum  = 0;
        for (int i=0; i<myArr.size(); i++) {
            sum += myArr.get(i);
        }
        System.out.printf(("Sum: %d"), sum);



//      2.) The program prints the index value of the largest element in the array.
//
//


//      3.) Find the powers of an array, where the length is chosen by user.

        ArrayList<Integer> powerList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int result = (int) Math.pow(i, power);
            powerList.add(result);
        }

        System.out.println("\nHere is you power array: " + powerList);


    }
}