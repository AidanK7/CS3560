// Part a)
public class Student2 {
    private String name;

    public Student2(String name) {
        this.name = name;
    }
}

public class Transcript {
    private String course;
    private double grade;

    public Transcript(String course, double grade) {
        this.course = course;
        this.grade = grade;
    }
}

// Part b)
public class Course {
    private int code;

    // Fully parameterized constructor
    public Course(int code) {
        this.code = code;
    }
}

public class Book {
    private String name;
    private String author;

    public Book() {
        this.name = "";
        this.author = "";
    }
}

// Part c)
public class Team {
    private int code;

    public Team() {
        this.code = 0; 
    }

    public void addPlayer(Player player) {
        // Implementation for adding a player to the team
    }
}

public class Player {
    private String name;
    private boolean export;

    public Player(String name, boolean export) {
        this.name = name;
        this.export = export;
    }
}

// Part d)
public class Dog {
    private String breed;
    private String name;

    public Dog() {
        this.breed = "";
        this.name = "";
    }
}

public class Paw {
    private int position;

    public Paw(int position) {
        this.position = position;
    }
}

// Part e)
public class Employee {
    private String name;
    private int hours;

    public double calculateSalary() {
        return hours*20;
    }
    public int getHours() {
      return this.hours;
    }
}

public class Professor extends Employee {
    private String field;
    public double calculateSalary() {
        return hours*30;
    }
}

public class Staff extends Employee {
    private int role;
}

// Part f)
interface SaleableItem {
    void sellCopy(); 
}

public class Magazine implements SaleableItem {
    @Override
    public void sellCopy() {
        System.out.println("Selling a Magazine");
    }
}

public class Ticket implements SaleableItem {
    @Override
    public void sellCopy() {
        System.out.println("Selling a Ticket");
    }
}

// Part g)
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Movie {
    private String name;
    private String genre;

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
}

public class Watch {
    private String rating;

    public Watch(String rating) {
        this.rating = rating;
    }
}

// Part h)
public class Payroll {
    public void processPayments(Worker worker) {
        System.out.println("Payment processed to worker: " + worker.getName()); 
    }
}

public class Worker {
    private String name;
    private double hourlyRate;

    public Worker(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }
}
