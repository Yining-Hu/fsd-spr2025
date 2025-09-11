import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import java.util.Scanner;

public class Faculty {
    private List<Student> students;
    private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Faculty().menu();
    }
    
    public Faculty() {
        this.students = new ArrayList<>();
    }

    private boolean match(int Id) {
        // for (Student student : students) {
        //     if (student.match(Id))
        //         return true;
        // }
        // return false;

        return students.stream().anyMatch(student -> student.match(Id));
    }

    private int uniqID() {
        Random r = new Random();
        int ID = r.nextInt(1000);

        while (match(ID))
            ID = r.nextInt(1000);

        return ID;
    }
    
    private int mark() {
        Random r = new Random();
        return r.nextInt(101);
    }

    private void register() {
        for (int i = 0; i < 10; i++) {
            students.add(new Student(uniqID(), mark()));
        }
    }

    private void show() {
        // for (Student student : students) {
        //     System.out.println(student);
        // }

        // students.forEach(System.out::println);

        students.forEach(s -> System.out.println(s));
    }

    private void clear() {
        students.clear();
    }

    private void partition() {
        Map<Boolean, List<Student>> partitioned = new HashMap<>();
        partitioned = students.stream().collect(Collectors.partitioningBy(s -> s.getMark() >= 50));
        partitioned.forEach((k, v) -> System.out.printf("%4s --> %-12s %n", k ? "PASS" : "FAIL", v));
    }
    
    private void groupByGrade() {
        Map<String, List<Student>> groups = new HashMap<>();
        groups = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        groups.forEach((k, v) -> System.out.printf("%4s --> %-12s%n", k, v));
    }

    private char readChoice() {
        System.out.print("Choice(r/c/g/p/v/x): ");
        return in.next().charAt(0);
    }

    private void menu() {
        char c;

        while ((c = readChoice()) != 'x') {
            switch (c) {
                case 'r':
                    register();
                    break;
                case 'c':
                    clear();
                    break;
                case 'g':
                    groupByGrade();
                    break;
                case 'p':
                    partition();
                    break;
                case 'v':
                    show();
                    break;
                default:
                    help();
            }
        }
    }

    private void help() {
        System.out.println("r - register 10 students");
        System.out.println("c - clear the students list");
        System.out.println("g - group by grade");
        System.out.println("p - partition by pass or fail");
        System.out.println("v - show all students");
        System.out.println("x - exit");
    }
}
