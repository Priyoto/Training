package Day1.Exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class main {

	public static void main(String[] args) {
       ArrayList<Student> list=new ArrayList<>();
		Student s1=new Student("Avinash",30,100);
		Student s2=new Student("Raj",45,101);
		Student s3=new Student("Manish",25,102);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		//sort by name
		Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		for(Student s:list)
		System.out.println(s);
		System.out.println("--------------------");
		//sort by age
		Collections.sort(list,(p1,p2)->p1.getAge()-p2.getAge());
		for(Student s:list)
		System.out.println(s);
		System.out.println("--------------------");
		//sort by id
		Collections.sort(list,(p1,p2)->p1.getId()-p2.getId());
		for(Student s:list)
		System.out.println(s);
		
		
	}
}
	
