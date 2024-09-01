package com.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> t = new ArrayList<>();
		t.add("Selenium Webdriver");
		t.add("Selenium Grid");
		t.add("Selenium IDE");
		t.add("QTP");
		t.add("Postman");
		t.add("JMeter");
		t.add("Appium");
		t.add("RestAssured");
		t.add("API Testing");
		t.add("LoadRunner");
		int length = t.size();
		System.out.println("Length of the ArrayList: " + length);
		Iterator<String> iterator = t.iterator();
		System.out.println("Tools in the list:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
