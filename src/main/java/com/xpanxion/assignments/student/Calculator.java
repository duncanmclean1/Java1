package com.xpanxion.assignments.student;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    private int x;
    private int y;
    String ans = "";

    public Calculator() {
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public void setAns(String newAns) {
        this.ans = newAns;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String ans() {
        return this.ans;
    }

    // Change the order of printing
    public void run() {
        Scanner keyboard = new Scanner(System.in);
        boolean isRunning = true;
        String check = "";
        ArrayList<String> list = new ArrayList<>();

        while (isRunning) {
            System.out.print("Enter the first number: ");
            setX(keyboard.nextInt());
            System.out.println("Enter the second number: ");
            setY(keyboard.nextInt());

            System.out.print("Enter the operation (add, sum, mult, div, done)");
            check = keyboard.next();
            check.toLowerCase();

            if (check.equals("add")) {
                System.out.println("Sum: " + (x + y));
                list.add(x + " - " + y + " = " + (x + y));
            } else if (check.equals("sub")) {
                System.out.println("Difference: " + (x - y));
                list.add(x + " - " + y + " = " + (x - y));
            } else if (check.equals("mult")) {
                System.out.println("Product: " + (x * y));
                list.add(x + " * " + y + " = " + (x * y));
            } else if (check.equals("div")){
                System.out.println("Quotient: " + (x / y));
                list.add(x + " / " + y + " = " + (x / y));
            }
            else if (check.equals("done")) {
                isRunning = false;
                System.out.println("Done: ");
                for(int i = 0; i < list.size(); i++)
                    System.out.println(list.get(i));
            }
        } // while()
    }// run()

}// Calculator
