package com.example.lab2;
import java.util.Comparator;

public class Fruit {
  private String name;
  private int price;

  public Fruit () {}
  
  public Fruit(String name, int price) {
	  super();
	  this.name = name;
	  this.price = price;
  }
  
  public static class FruitComparator implements Comparator<Fruit>{

    @Override
    public int compare(Fruit o1, Fruit o2){
      return o1.name.compareTo(o2.name);
    }
  }
  
  public static class FruitComparatorDesc implements Comparator<Fruit>{
    
    @Override
    public int compare(Fruit o1, Fruit o2){
      return o2.name.compareTo(o1.name);
    }
  }
  
  public String getName(){
    return "Fruit name : " + this.name + " and price : " + this.price;
  }
}