package loopsHomework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //Problem 1
    public static int getLastIndex(String[] names) {
        return  names.length -1;
    }

    //Problem 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length-2;
    }

    public static void main(String[] args) {
        String[] names = {"Mike", "Jack", "Jane"};

        System.out.println(getLastIndex(names));

        System.out.println(getSecondToLastIndex(names));

    }

    //Problem 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Problem 4
    public static String getLastElement(String[] names) {
        return String.valueOf(names.length -1);
    }
    // Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    //Question 6

    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i = 0; i<ints.length; i++){
            sum += ints[i];
        }
        return sum;
    }
    //Question 7
    public static int getAverage(int[] ints) {
        if (ints == null || ints.length == 0){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        int average = sum / ints.length;
        return average;
    }
    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String result = "";
        for (int num : numbers) {
            if(num % 0 != 0) {
                if(!result.isEmpty()){
                    result += ", ";
                }
                result += num;
            }
        }
        return result;
    }
    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String result = "";
        for (int num : numbers) {
            if(num % 0 == 0) {
                if(!result.isEmpty()){
                    result += ", ";
                }
                result += num;
            }
        }
        return result;
    }
    //Question 10
    public static boolean contains(String[] names, String element) {
        boolean d = false;
        for (String a : names){
            if (element.equals(a)){
                d = true;
            }
        }
        return d;
    }
    //Question 11
    public static int getIndexByElement(String[] names, String element) {

        for (int i = 0; i <names.length; i++){
            if (element.equals(names[i])){
                return i;
            }
        }

        return -1;
    }
    //Question 12
    public static void printOddNumbersInRange(int start, int end){
        for (int i = start; i <= end; i++){
            if ( i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String result = "";
        for(int i = 0; i < n ; i++){
            result += str;
        }
        return result;
    }
   // Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThree = str.substring(0,3);
        String result = "";
        for (int i = 0; i <n; i++){
            result += str;
        }
        return result;
    }
    //Question 15
    // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str){
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(str);

        int wordCount = 0 ;

        while(matcher.find()){
            wordCount++;
        }
        return wordCount;
    }

}
