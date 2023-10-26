package com.xpanxion.assignments.student;

public class Person {
    private String first;
    private String last;
    private int id;

    public Person() {
    }

    public Person( int newId, String newFirst, String newLast) {
        this.first = newFirst;
        this.last = newLast;
        this.id = newId;
    }

    public String getLastname(){
        return this.last;
    }

    public int getID(){
        return this.id;
    }

    public String toString() {
        String ans = "ID: " + this.id + " firstName = " + this.first + " lastName = " + this.last;
        return ans;
    }

}
