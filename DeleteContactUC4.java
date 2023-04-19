package com.java;
import java.util.*;

public class DeleteContactUC4 {

	public static void main(String[] args) {
        System.out.println("-----------------Add new contact to address book----------------");
		
		ArrayList<Persons> myContacts = new ArrayList<Persons>();
		Person persons = new Person();
		Scanner scanner = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("1 - Add new contact \n2 - Show Contacts \n 3 - Update Contact \n 4 Delete contact \nEnter your option:");
			option = scanner.nextInt();
			
			switch (option) {
			/*
			 * Add New Contact Person
			 */
			case 1:
				myContacts.add(new Persons("Deepak","Rana","D@gmail.com","Suresh Colony","Hzb",11111, "89898989"));
				myContacts.add(new Persons("Komal","Rana","K@gmail.com","Dipugarh Colony","korrah", 222222, "8888888888"));
				myContacts.add(new Persons("Mamta","Rana","M@gmail.com","Saketpuri Colony","Blr", 333333, "7777777777"));
				
				break;

			case 2:
				displayListOfContacts(myContacts);
				
				break;
				
			case 3:
				System.out.println("------------------------------------------------------------------");
				myContacts.set(0, (new Persons("Deepak","Rana","D@gmail.com","abc Colony","Kolkata",444444,"89898989")));
				System.out.println("Contact Updated!!!");
				displayListOfContacts(myContacts);
				break;

			case 4:
				myContacts.remove(1);
				displayListOfContacts(myContacts);
				break;

			}
			
		}while(option!=0);
}

	private static void displayListOfContacts(ArrayList<Persons> myContacts) {
		System.out.println("------------------------------------------------------------------");
		for(int i=0; i< myContacts.size(); i++) {
 			System.out.println(myContacts.get(i));
		}
		System.out.println("------------------------------------------------------------------");
		
	}

	}


