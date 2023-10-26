package com.xpanxion.assignments.student;

public class Cat {
    private String name;

    public Cat(){
        this.name = "null";
    }

    public Cat(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

}
