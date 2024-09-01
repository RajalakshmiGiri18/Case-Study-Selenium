package com.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        String[] employeeDetails = {
            "EmployeeNo: 101",
            "EmployeeFirstName: John",
            "EmployeeLastName: Doe",
            "EmployeeMiddleName: A",
            "EmployeeFullName: John A Doe",
            "EmployeeEmail: john.doe@example.com",
            "EmployeeMobileNo: 1234567890",
            "EmployeePhoneNo: 0987654321"
        };

        for (String detail : employeeDetails) {
            hashSet.add(detail);
            linkedHashSet.add(detail);
            treeSet.add(detail);
        }
        System.out.println("Length of HashSet: " + hashSet.size());
        System.out.println("Length of LinkedHashSet: " + linkedHashSet.size());
        System.out.println("Length of TreeSet: " + treeSet.size());
        System.out.println("\nHashSet contents:");
        iterateSet(hashSet);
        System.out.println("\nLinkedHashSet contents:");
        iterateSet(linkedHashSet);
        System.out.println("\nTreeSet contents:");
        iterateSet(treeSet);
        List<String> hashSetList = new ArrayList<>(hashSet);
        List<String> linkedHashSetList = new ArrayList<>(linkedHashSet);
        List<String> treeSetList = new ArrayList<>(treeSet);
        System.out.println("\nArrayList from HashSet:");
        printList(hashSetList);
        System.out.println("\nArrayList from LinkedHashSet:");
        printList(linkedHashSetList);
        System.out.println("\nArrayList from TreeSet:");
        printList(treeSetList);

	}
	  private static void iterateSet(Set<String> set) {
	        Iterator<String> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	  }
	  private static void printList(List<String> list) {
	        for (String item : list) {
	            System.out.println(item);
	        }
	    }

}
