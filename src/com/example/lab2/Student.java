package com.example.lab2;

public class Student implements Comparable<Student> {
  private int no;
  private String name;
  private int age;

  public int compareTo(Student o){
    return name.compareTo(o.name);
  }

  public Student(){}
  public Student(int no, String name, int age){
    super();
		this.no = no;
		this.name = name;
		this.age = age;
  }
  
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
}
