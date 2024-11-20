package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Employees implements Comparable<Employees>{
    String name;
    int age;

    public Employees(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employees that) {
        if(this.age > that.age){
            return 1;
        }else {
            return -1;
        }
    }
}

public class ComparatorAndComparable {
    public static void main(String[] args){
        //Sorting

        //Collections Class
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("-------------------------------------");

        //Creating Custom Sort
        //Comparator -> getting two item i ang j compare them and return true answer
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(62);
        numbers1.add(35);
        numbers1.add(98);
        numbers1.add(13);
        Collections.sort(numbers1,com);
        System.out.println(numbers1);
        System.out.println("-------------------------------------");

        //Comparator with Class

        Comparator<Student> com1 = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Akram",18));
        students.add(new Student("John",15));
        students.add(new Student("Sam",19));
        students.add(new Student("Anna",25));
        System.out.println(students);

        Collections.sort(students,com1);

        for (Student student:students){
            System.out.println(student);
        }
        System.out.println("-------------------------------------");


        //Comparable -> the same thing as comparator just with class implementation
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("Akram",18));
        employees.add(new Employees("John",15));
        employees.add(new Employees("Sam",19));
        employees.add(new Employees("Anna",25));

        System.out.println(employees);

        Collections.sort(employees);

        for (Employees employee:employees){
            System.out.println(employee);
        }

        System.out.println(employees);
        System.out.println("-------------------------------------");




    }
}
