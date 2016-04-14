package com.gabriel.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App {
	private static final Person LUISA_ANGOLA = new Person("Luisa", "Angola");
	private static final Person GABRIEL_PENA = new Person("GAbriel", "Pena");
	private static final Person RAQUEL_LOPEZ = new Person("Raquel", "Lopez");
	private static final String SEPARATOR = "############";

	public static void main(String[] args) {
		
		//SortedSet
		Set<Person> setPersonas = new TreeSet<Person>();
		setPersonas.add(new Person("Raquel"));
		setPersonas.add(new Person("Raquel"));
		setPersonas.add(new Person("GAbriel"));
		setPersonas.add(new Person("Luisa"));

		for (Person person : setPersonas) {
			System.out.println(person);
		}

		System.out.println(SEPARATOR);

		Set<Person> sortedSetBySurname = new TreeSet<Person>(Person.COMPARE_BY_SURNAME);
		sortedSetBySurname.add(RAQUEL_LOPEZ);
		sortedSetBySurname.add(GABRIEL_PENA);
		sortedSetBySurname.add(LUISA_ANGOLA);

		for (Person person : sortedSetBySurname) {
			System.out.println(person);
		}

		System.out.println(SEPARATOR);

		List<Person> personList = new ArrayList<Person>();
		personList.add(LUISA_ANGOLA);
		personList.add(GABRIEL_PENA);
		personList.add(RAQUEL_LOPEZ);

		Collections.sort(personList, Person.COMPARE_BY_SURNAME);

		for (Person person : personList) {
			System.out.println(person);
		}

		System.out.println(SEPARATOR);
//no order
		Set<Person> hashSet = new HashSet<Person>();
		hashSet.add(RAQUEL_LOPEZ);
		hashSet.add(GABRIEL_PENA);
		hashSet.add(LUISA_ANGOLA);

		for (Person person : hashSet) {
			System.out.println(person);
		}

		System.out.println(SEPARATOR);
//keep order
		Set<Person> linkedHashSet = new LinkedHashSet<Person>();
		linkedHashSet.add(RAQUEL_LOPEZ);
		linkedHashSet.add(GABRIEL_PENA);
		linkedHashSet.add(LUISA_ANGOLA);

		for (Person person : linkedHashSet) {
			System.out.println(person);
		}

	}
}
