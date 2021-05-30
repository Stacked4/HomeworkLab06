// Ashby Andrus
// Date: May 29,2021
// CIS 143

package com.olympic.cis143.m06.students.homework;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class HomeworkStuff {

	public Integer calculateAddListValues(final List<Integer> integrers) {
        return integrers
                .stream()
                .reduce(0, (a, b) -> a + b);
        
           } 
	public Optional<Person> findTheOldestPerson(final List<Person> people) {
        return people
                .stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2);
    }	
		
    public List<String> orderNamesAndConvertToUppercase(final List<String> names) {
    	return names
                .stream()
                .sorted((n1, n2) -> n1.compareTo(n2))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
         
    }
    public List<Person> findPeople21OrOver(final List<Person> people) {
        return people
                .stream()
                .filter(p -> p.getAge() >= 21)
                .collect(Collectors.toList());
    }
    public List<Person> orderByAge(final List<Person> people){
        return people
                .stream()
                .sorted((p1, p2) -> p1.getAge().compareTo(p2.getAge()))
                .collect(Collectors.toList());
    }
}   
    
    
    