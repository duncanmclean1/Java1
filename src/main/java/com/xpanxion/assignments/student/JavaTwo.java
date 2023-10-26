package com.xpanxion.assignments.student;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class JavaTwo {

    public JavaTwo() {
    }

    public void ex1() {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();
        boolean isIterating = true;
        String person = "";

        while (isIterating) {
            System.out.print("Enter Person: ");
            person = keyboard.nextLine();

            if (!person.equals("done")) {
                String[] temp = person.split(", ");
                String[] temp2 = temp[1].split(" ");

                Person placeholder = new Person(Integer.parseInt(temp[0]), temp2[0], temp2[1]);
                list.add(placeholder);
            } else {
                isIterating = false;
            }

        } // while

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }// ex1

    public void ex2() {
        boolean isIterating = true;
        int input = -1;
        Scanner keyboard = new Scanner(System.in);
        Person p1 = new Person(1, "Peter", "Jones");
        Person p2 = new Person(2, "John", "Smith");
        Person p3 = new Person(3, "Mary", "Jane");

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        while(isIterating){
            System.out.print("Enter person ID: ");
            input = keyboard.nextInt();

            for(int i = 0; i < list.size(); i++){
                if(input == list.get(i).getID())
                    System.out.println(list.get(i).toString());
            }

        }

    }

    public void ex3() {
        Invoice invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));

    }

    public void ex4() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6() {
        Calculator test = new Calculator();
        test.run();

    }

    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson"));

        personList.stream().map(person -> person).forEach(System.out::println);
    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson"));

        for (Person p : personList) {
            System.out.println(p);
        }

    }

    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson"));

        var filteredList = Arrays.asList();

        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getLastname().equals("Smith"))
                filteredList.add(personList.get(i));
        }

        for (int j = 0; j < filteredList.size(); j++) {
            System.out.println(filteredList.get(j).toString());
        }

    }

    public void ex10() {
        Queue<Cat> queue = new LinkedList<>();
        Cat cat1 = new Cat("Alice");
        Cat cat2 = new Cat("Bob");
        Cat cat3 = new Cat("Charlie");
        Cat cat4 = new Cat("Dan");

        queue.add(cat1);
        queue.add(cat2);
        queue.add(cat3);
        queue.add(cat4);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek().getName());
            queue.remove();
        }

    }

}
