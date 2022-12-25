import java.util.Arrays;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        // Assignment 7.9/ 7.10/7.20
        System.out.println("This program find smallest value in an array by enter 10 different number \n" +
                "Also shows minimal number and it's index");

        String Continue = "y";
        while (Continue == "y") {
            System.out.println();
            System.out.println("Enter 10 numbers separate by space: ");
            Scanner userInput = new Scanner(System.in);
            String input = userInput.nextLine();
            String[] arrayInput = input.split(" ");
            //Double[] doubleValues = Arrays.stream(arrayInput).map(Double::valueOf).toArray((Double[]::new));
            //invoke method to find minimal and index show to the console
            double[] doubleArray = convertString(arrayInput);
            System.out.println("Number you have entered is: \n" + Arrays.toString(doubleArray));
            System.out.println();
            System.out.println("The minimal value is: \n" + findMin(doubleArray));
            System.out.println();
            System.out.println("The minimal value index is: \n" + findMinindex(doubleArray));
            System.out.println();
            //invoke method selection sort
            selectionSort(doubleArray);

            System.out.println("The sorted array compare larger value swap to the last is: ");
            System.out.println(Arrays.toString(doubleArray));
            System.out.println();
            System.out.println("Do you wish to repeat this process? Enter y to continue other to quit ");
            String input2 = userInput.next();
            if (!(Continue.equals("y"))) {
                break;
            }
        }
    }

    //Convert String array to Double
    public static double[] convertString(String[] inputArrays) {
        double[] doubleValues = new double[inputArrays.length];
        for (int i = 0; i < doubleValues.length; i++) {
            doubleValues[i] = Double.parseDouble(inputArrays[i]);
        }
        return doubleValues;
    }

    //find minimal number in the array
    public static double findMin(double[] numberList) {
        double currentMin = numberList[0];

        for (double num : numberList) {

            if (currentMin > num) {
                currentMin = num;
            }
        }
        return currentMin;
    }

    //find minimal number index in the array
    public static int findMinindex(double[] numbersList) {
        double min = findMin(numbersList);
        int index = 0;
        for (int i = 0; i < numbersList.length; i++) {
            if (numbersList[i] == min) {
                index = i;
                break;
            }
        }
        return index;
    }

    //Reverse selection sort
    public static void selectionSort(double[] numberList) {
        for (int i = numberList.length - 1; i >= 0; i--) {
            double currentMax = numberList[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < numberList[j]) {
                    currentMax = numberList[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                numberList[currentMaxIndex] = numberList[i];
                numberList[i] = currentMax;
            }
        }
    }
}
