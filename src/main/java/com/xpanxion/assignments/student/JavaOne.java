package com.xpanxion.assignments.student;

import java.util.Scanner;
import java.util.Random;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {
    }

    //
    // Public methods
    //

    public void ex1() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name");
        String input = keyboard.next();

        System.out.println("Upper Case" + input.toUpperCase());
        System.out.println();
    }

    public void ex2() {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter string: ");
        String input = keyboard.next();

        for (int i = 0; i < input.length(); i++)
            if (Character.isUpperCase(input.charAt(i)))
                count++;

        System.out.println("Number of uppercase: " + count);
        System.out.println();
    }

    public void ex3() {
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        

        System.out.print("Enter a string: ");
        input = keyboard.nextLine();

        String[] split = input.split(" ");

        for(int i = 0; i < split.length; i++){
            if(i % 2 == 0)
                split[i] = split[i].toUpperCase();
        }

        for(int j = 0; j < split.length; j++){
            System.out.print(split[j].toString() + " ");
        }

    }

    public void ex4() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = keyboard.next();
        String temp = " ";

        StringBuilder test = new StringBuilder();
        test.append(input);
        test.reverse();

        if (input.equals(test.toString()))
            System.out.println("Is palindrome");
        else
            System.out.println("Not palindrome");

    }

    public void ex5() {
        Scanner keyboard = new Scanner(System.in);
        int vowels = 0;
        int cons = 0;
        String input = " ";

        while (!input.equals("quit")) {

            System.out.print("Enter a string: ");
            input = keyboard.next();
            input.toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'u'
                        || input.charAt(i) == 'o')
                    vowels++;
                else
                    cons++;
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + cons);

            vowels = 0;
            cons = 0;
        }
    }

    public void ex6() {
        Scanner keyboard = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.print("Enter the first number: ");
        x = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        y = keyboard.nextInt();

        System.out.println("Sum of nums: " + (x + y));
    }

    public void ex7() {
        Scanner keyboard = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String ans = "";

        System.out.print("Enter the first number: ");
        x = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        y = keyboard.nextInt();

        System.out.print("Enter operation (add, sub, mult, div): ");
        ans = keyboard.next();
        ans.toLowerCase();

        if (ans.equals("add"))
            System.out.println("Sum: " + (x + y));
        else if (ans.equals("sub"))
            System.out.println("Difference: " + (x - y));
        else if (ans.equals("mult"))
            System.out.println("Product: " + (x * y));
        else if (ans.equals("div"))
            System.out.println("Quotient: " + (x / y));

    }

    public void ex8() {
        Scanner keyboard = new Scanner(System.in);
        int w = 0;
        int h = 0;
        double price = 0;
        double cost = 0;
        String ans = "";

        System.out.print("Enter price per square: ");
        price = keyboard.nextDouble();

        while (!ans.equals("done")) {
            System.out.print("Enter the width: ");
            w = keyboard.nextInt();
            System.out.print("Enter the height: ");
            h = keyboard.nextInt();

            cost += (h * w) * price;

            System.out.print("Continue?: ");
            ans = keyboard.next();
        }

        System.out.println("Total cost: " + "$" + cost);
    }

    public void ex9() {
        Scanner keyboard = new Scanner(System.in);
        int guess = 0;
        Random rand = new Random();
        int ans = rand.nextInt(5);

        if (ans == 0)
            ans++;

        while (guess != ans) {
            System.out.print("Guess: ");
            guess = keyboard.nextInt();

            if (guess == ans)
                System.out.println("Correct!");
            else
                System.out.println("Guess again!");
        }

    }

    public void ex10() {
        Scanner keyboard = new Scanner(System.in);
        String ans = " ";
        String spaces = "";

        System.out.print("Enter a string: ");
        ans = keyboard.nextLine();

        String[] split = ans.split(" ");

        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split[i].length(); j++) {
                System.out.println(spaces + split[i].charAt(j));
                spaces += " ";
            }
            spaces = "";

        }

    }

    //
    // Private helper methods
    //
}
