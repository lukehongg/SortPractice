package com.example.lab2;
import java.util.ArrayList;
import java.util.List;

import com.example.lab2.Fruit.FruitComparator;
import com.example.lab2.Fruit.FruitComparatorDesc;

import java.util.Collections;

class Main {
  public static void main(String[] args) {
    
    List<Student> al = new ArrayList<Student>();
    System.out.println("Student List (ordered by name)");
    al.add(new Student(6, "F", 25));
    al.add(new Student(7, "G", 26));
    al.add(new Student(8, "H", 27));
    al.add(new Student(9, "I", 28));
    al.add(new Student(10, "J",29));
    al.add(new Student(1, "A", 20));
    al.add(new Student(2, "B", 21));
    al.add(new Student(3, "C", 22));
    al.add(new Student(4, "D", 23));
    al.add(new Student(5, "E", 24));
    
    Collections.sort(al);
    for(Student s:al){
      System.out.println(s.toString());
    }
    System.out.println("Student List (reverse order by name)");
    Collections.sort(al, Collections.reverseOrder());
    for(Student s:al){
      System.out.println(s.toString());
    }
    
   // Comparator

    List<Fruit> fl = new ArrayList<Fruit>();
    System.out.println("Fruit List (ordered by name)");
    fl.add(new Fruit("FashionFruit", 1000));
    fl.add(new Fruit("Grape", 1001));
    fl.add(new Fruit("Orange", 1027));
    fl.add(new Fruit("Peach", 1028));
    fl.add(new Fruit("Pear",1029));
    fl.add(new Fruit("Mango", 1020));
    fl.add(new Fruit("Melon", 1021));
    fl.add(new Fruit("Kiwi", 1022));
    fl.add(new Fruit("Banana", 1023));
    fl.add(new Fruit("Apple", 1024));
    
    Collections.sort(fl, new FruitComparator());
    for(Fruit s: fl){
      System.out.println(s.getName());
    }
    System.out.println("Fruit List (reverse order by name)");
    Collections.sort(fl, new FruitComparatorDesc());
    for(Fruit s:fl){
      System.out.println(s.getName());
    }
    
  }
    
    
    
  }

