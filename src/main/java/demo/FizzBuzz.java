package main.java.demo;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.HashMap;
import java.util.ArrayList;

public class FizzBuzz {

    private List<String> divisors;

    public FizzBuzz() {

        // Container doesn't need to be a hashmap if we know the elements stored in it after the CollectDivisors method
        // Could be a static array of type Pairs<Int, String> to save memory and time 
        divisors = new ArrayList<String>(); 
    }

    public void start() {

        DisplayHeader();

        CollectDivisors();

        ExecuteAlgorithm();
    }

    /***
     * ...
     */
    private void DisplayHeader() {

        try {

            final String headerPathString = "src/main/resources/header.txt";
            final String prompt = "\n\n\n ~~~~";
            final String border = "===========================================================================================================================================";

            // Stores the contents of header.txt into 'title' string
            final String title = new String(Files.readAllBytes(Paths.get(headerPathString)));

            System.out.println(border);
            System.out.println(title);
            System.out.println(border);

            System.out.println(prompt);

        } catch (IOException e) {

            System.out.println("Error: Could not read header file.");

            e.printStackTrace();
        }
    }

    /***
     * ...
     */
    private void CollectDivisors() {

        Scanner scanner = new Scanner(System.in);

        final String prompt = "Enter the divisor followed by a colon, then the word associated with that divisor or X to execute algorithm. (EX: 3:Fizz, 5:Buzz)\n";
        final String cursor = ">>> ";

        boolean isDone = false;

        System.out.println(prompt);

        while (!isDone) {

            System.out.print(cursor);

            String input = scanner.nextLine();
            String[] parts = new String[2];

            if (input.isEmpty() || isInvalidInput(input, parts)) {

                System.out.println(">>> Invalid input. Please try again.");

                continue;
            }


        }
    
        // Take in input from user
        // - number of divisors
        // intialize static array of size (number of divisors)
        // - the divisor and asscoiated word
        //
    }

    /***
     * 
     */
    private void ExecuteAlgorithm() {
        
        /* // Default values for the moment
        final Integer startingNumber = 1, endingNumber = 100;

        for (Integer i = startingNumber; i <= endingNumber; i++) {

            // Check if the number is divisible by any of the divisors
            // - if it is, print the associated word
            // - if it is not, print the number
        }*/

        return;

    }
}
