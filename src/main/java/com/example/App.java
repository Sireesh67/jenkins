package com.example;

public class App {
    public static void main(String[] args) {
        String name = "Sireesh";
        int[] marks = {85, 90, 78};
        int total = 0;
        for (int m : marks) total += m;

        System.out.println("Student Application Details");
        System.out.println("Name: " + name);
        System.out.println("Marks: 85, 90, 78");
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total / 3.0));
    }
}