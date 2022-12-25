import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        //Homework
        //5.16/5.20/6.10
        System.out.println("This program prints first 50 and 1000th prime number \n"
                + "and take user input for determine if number is prime then show prime factor");
        System.out.println();
        System.out.println("The first 50 prime numbers are: \n");
        printPrime(50); // first 50 prime number
        System.out.println();
        System.out.println("The first 1000 prime numbers in an array: \n");
        System.out.println(Arrays.toString(Primes(1000))); // first 1000 prime number in array

        String continueLoop = "y";
        while (continueLoop == "y") {
            System.out.println("Enter a number to check if it is prime: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            //Array binary search check if user input is prime number
            if (binarySearch(Primes(1000), input) < 0) {
                System.out.println("Number you entered is not a prime number according to the 1000 prime number array");
            } else if (binarySearch(Primes(1000), input) > 0) {
                System.out.println("Number you entered is a prime number: ");
            }
            //Procedure to find input value prime factor
            boolean flag = true;
            for (int i = 2; i < input; i++) {
                if (input % i == 0 && flag) {
                    System.out.println("Prime factor is: ");
                    flag = false;
                }
                while (input % i == 0) {
                    System.out.println(i);
                    input = input / i;
                }
            }
            if (input > 2) {
                System.out.println(input);
            }
            System.out.println("Enter y to continue or other to quit: ");
            String input2 = scanner.next();
            if (!(input2.equals("y"))) {
                break;
            }
        }
    }

    //method print first 50 prime number
    public static void printPrime(int primeNumbers) {
        final int numberPerline = 8;
        int count = 0;
        int number = 2;

        while (count < primeNumbers) {

            if (itsPrime(number)) {
                count++;

                if (count % numberPerline == 0) {
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            number++;
        }

    }

    //method check if input its prime number
    public static boolean itsPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    //Method to create array and store prime number
    public static int[] Primes(int n) {
        int[] primes = new int[n];
        int counter = 0;
        int isPrime = 2;
        while (counter < n) {
            boolean prime = true;
            for (int j = 2; j < isPrime; j++) {
                if (isPrime % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[counter] = isPrime;
                counter++;
            }
            isPrime++;
        }
        return primes;
    }

    //binary search introduced in chapter 7
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }
}



