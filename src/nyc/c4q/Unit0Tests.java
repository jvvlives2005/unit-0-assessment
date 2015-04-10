package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
      printHelloWorld();

    }

    public static void printHelloWorld() {
      System.out.println("Hello World");                                        //add "Hello World"
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;                                                              //since the method ask for true, I returned a true
    }

    public static int returnPrimitiveInt1729() {
        int primitiveInt = 1729;                                                //since the method ask for the int 1729, I gave/declare the number 1729
      return primitiveInt;                                                      //and returned the int (unless you want the wrapper Integer?) or return 1729
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
        double primitiveDoubleThreePointOneFour = 3.14;                         //declare a double
      return primitiveDoubleThreePointOneFour;                                  //returned a double (or return 3.14)
    }

    public static char returnPrimitiveCharZ() {
        //char primitiveChar = 'z';                                            //you can declare it and then return the variable. Either way is fine
        return 'z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for(int i = 1; i >= 10; i=i++){
            System.out.println(i + " ");
            sum = sum + i;
        }

        System.out.println(sum);                                               //should've worked, but there's something wrong
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for(int i = 1; i >= 10000; i=i++){
            System.out.println(i + " ");
            sum = sum + i;
        }

        System.out.println(sum);

    }

    public static boolean isOdd(int n) {
      return false;
    }

    public static boolean isMultipleOfThree(int n) {
      return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
      return false;
    }

    public static String repeatStringXTimes(String input, int times) {                     // do not know
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return "";
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

        Scanner keyboard = new Scanner(System.in);
        //Has to do with some if statement like
//        if(char i = 'q'){
//            //then print at the first occurance
//        }
//
//        return "";
    }

    public static Person declareAndReturnPersonNamedAda() {              //forgot how to add it
      return null;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {   //should london be place in the place.java?
      return null;
    }

    public static boolean isFromLondon(Person person) {
      return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {     //all i got
        ArrayList<Place> threePlaces = new ArrayList<Place>();

        return threePlaces;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {     //forgot
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
      return null;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
    }

    HashMap<String, Person> people = new HashMap<String, Person>();
    //that all I got

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers()
    {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers()
    {

    }
}
