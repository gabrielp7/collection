package com.gabriel.test.collection;

import java.util.Comparator;
import java.util.Date;

public class Person implements Comparable<Person> {

	private Date bithDate;
	private String name;
	private String surname;
	
	public static final CompateBySurname COMPARE_BY_SURNAME = new CompateBySurname();

	public Person(String name) {
		this.name = name;

	}

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;

	}

	public Person() {

	}

	public Person(final Date bithDate, String name, String surname) {
		super();
		this.bithDate = new Date(bithDate.getTime());
		this.name = name;
		this.surname = surname;
	}

	public Date getBithDate() {
		return new Date(bithDate.getTime());
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return "Person [bithDate=" + bithDate + ", name=" + name + ", surname=" + surname + "]";
	}

	public int compareTo(Person o) {
		return name.compareTo(o.getName());
	}

	
	
	private static class CompateBySurname implements Comparator<Person>{

		private CompateBySurname(){
			
		}
		
		public int compare(Person o1, Person o2) {
			return o1.getSurname().compareTo(o2.getSurname());
		}

		
		
	}
	
	
}
