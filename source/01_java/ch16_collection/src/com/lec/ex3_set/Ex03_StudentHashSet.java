package com.lec.ex3_set;
import java.util.HashSet;
public class Ex03_StudentHashSet {
	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<Student>();
		Student s = new Student(6, "�̼���");
		students.add(s);
		students.add(s);
		students.add(new Student(3, "ȫ�浿"));
		students.add(new Student(3, "ȫ�浿"));
		students.add(new Student(6, "�̼���"));
		System.out.println(students);
	}
}
