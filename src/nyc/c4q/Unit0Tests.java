package nyc.c4q;

import com.sun.xml.internal.ws.util.StringUtils;

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
     // printHelloWorld();
        //System.out.println(returnPrimitiveBooleanTrue());
//        isOdd(6);       //you can put this instead of System.out.println(isOdd(6)) ONLY if you put it sout in the method.
//        isOdd(7);
//        isMultipleOfThree(6);
//        isMultipleOfThree(8);
        //isOddAndIsMultipleOfThree(13);
        //isOddAndIsMultipleOfThree(15);
        //System.out.println(repeatStringXTimes("potato", 5));
        System.out.println(returnStringUntilQ("ubiq"));

    }

    public static void printHelloWorld() {
      System.out.println("Hello World");                                 //add "Hello World"
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;                                                       //since the method ask for true, I returned a true
    }

    public static int returnPrimitiveInt1729() {
        int primitiveInt = 1729;                                        //since the method ask for the int 1729, I gave/declare the number 1729
      return primitiveInt;                                              //and returned the int (unless you want the wrapper Integer?) or return 1729
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
        double primitiveDoubleThreePointOneFour = 3.14;                 //declare a double
      return primitiveDoubleThreePointOneFour;                          //returned a double (or return 3.14)
    }

    public static char returnPrimitiveCharZ() {
        char primitiveChar = 'Z';                                       //you can declare it and then return the variable. Either way is fine
        return primitiveChar;
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for(int i = 1; i < 10; i++){                                    //when you do i < a; a will not be counted because once a=a, the loop will break
            sum += i;                                                   //sum = i++ (this will add the numbers as it goes to the loop)

        }
        System.out.println(sum);                                        //Make sure to use System.out.print outside of the for loop to print the number only

    }

    public static void printSumOf1Upto10000UsingForLoop() {             //Same as the one above it
        int sum = 0;
        for(int i = 1; i < 10000;i++){
            sum += i;

        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n)
    {
        int i = 0;                                                     //have it start to 0
        boolean odd = false;                                           //have the boolean odd be false

        while (i != n) {                                               //while the number is not 0
            odd = !odd;                                                //have the number be true
            i = i + 1;                                                 //then continue going on by adding 1
        }
        System.out.println(odd);                                       //print if it's true or false
        return odd;                                                    //also return it    (can also be n % 2 != 0)
    }

    public static boolean isMultipleOfThree(int n) {
        int i = 0;                                                     //initialize the variable i
        boolean multipleOfThree = false;                               //have it false

        while(i == n % 3) {                                            //while the number is equal to the multiple of 3
            multipleOfThree =!multipleOfThree;                         //have it be true
            i = i + 1;
        }

        System.out.println(multipleOfThree);

      return multipleOfThree;                                          //without printing, you can just return n % 3 == 0;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {            // Talk with AQ
//        int i = 0;
//        boolean isOddAndIsMultipleOfThree = false;
//        while ((i != n) && (i == n % 3))
//        {
//            isOddAndIsMultipleOfThree =! isOddAndIsMultipleOfThree;
//            i = i + 1;
//        }
//        System.out.println(isOddAndIsMultipleOfThree);
//        return isOddAndIsMultipleOfThree;

      return isOdd(n) && isMultipleOfThree(n);
    }

    public static String repeatStringXTimes(String input, int times) {                     // do not know
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".

            String repeatStringXTimes = ("");                          //Declare the variable

            for (int i = 1; i <=times; i++)                            //This calculates how many times the string should repeat
            {
                repeatStringXTimes += input;                           //if i is less or the equal to the i, then have
                                                                       //the repetition occur with the word
            }

        return repeatStringXTimes;                                     //give the new string with the repetitions
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

//First, you check if the input string doesn't have a q
        if (!(input.contains("q"))){
            return "";
        }

        //return a new string if the input does have a q; so it prints before the q
        String string1 = "";
        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'q') {
                break;                                                //string1= string1 + input.charAt(i) (this is concatinating)
            }
            else
                string1 += input.charAt(i);
        }

        return string1;
    }

    public static Person declareAndReturnPersonNamedAda() {              //forgot how to add it
    // Declare Ada using Person and create "new" Person
        Person ada =  new Person("Ada");
    //Make sure you put something inside the parenthese, if you did
    // Person Ada = new Person (), then you told Java that there's nothing
      return ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {   //should london be place in the place.java?
      //Person alan = new Person("Alan Turning From London");

      //Declare the person
        Person p = new Person("Alan Turing");

        //add London to p
        p.setCity("London");

        return p ;
    }

    public static boolean isFromLondon(Person person) {                        //disregard the score

      return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {     //all i got
        //create the ArrayList
        ArrayList<Place> threePlaces = new ArrayList<Place>();

        //Declare the places
        Place place1 = new Place("New York");                //so all three is using the long and lat of NY
        Place place2 = new Place("Berlin");
        Place place3 = new Place("Paris");

        //add the declared places into the Array List
        threePlaces.add(place1);
        threePlaces.add(place2);
        threePlaces.add(place3);

        return threePlaces;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {     //forgot
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`

        //Create Hash Map
        HashMap<String,Person> people = new HashMap<String, Person>();

        //Declare the people
        Person alan = new Person ("Alan Turing");
        Person grace = new Person ("Grace Hopper");

        //add them to HashMap using "put" --- Array list add; HashMap put
        people.put(alan.getName(), alan);
        people.put(grace.getName(), grace);

      return people;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people)
    {
        if(people.containsKey("Alan Turing"))
        {
            people.get("Alan Turing").setCity("Princeton");
            //people.get() will try to get the person from the created Hashmap people and setCity() will make the changes
        }else{
            //Do nothing
        }
    }
    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers()
    {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers()
    {

    }
}
