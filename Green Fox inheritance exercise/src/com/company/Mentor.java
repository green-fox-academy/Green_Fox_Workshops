package com.company;

public class Mentor extends Person {

        String level;

    Mentor (String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    Mentor () {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }

        public void getGoal () {
            System.out.println("My goal is: Educate brilliant junior software developers.");
        }

        public void introduce () {
            System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + this.level + " mentor.");
        }


}
