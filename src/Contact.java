import java.util.*;

public class Contact {
	ArrayList<String> contacts = new ArrayList<String>() {{
	    add("Nicki");
	    add("Eric");
	    add("Sarah");
	}};
	
	
	public void showContacts() {
		for(String contact : contacts) {
			System.out.println(contact);
		}
	}
	
	public void addContact() {
		System.out.println("Please enter the first name of your contact:");
		Scanner reader = new Scanner(System.in);
		String newContact = reader.nextLine().trim();
		if(newContact.isEmpty()) {
			System.out.println("Please enter a valid contact name.");
			addContact();
		}else {contacts.add(newContact);}
	}
	
	public void removeContact() {
		System.out.println(contacts.size());
		System.out.println("Which contact would you like to remove?");
		for(int i = 0; i < contacts.size(); i++) {
			System.out.println(i+1 + ") " + contacts.get(i));
		}
		Scanner scn = new Scanner(System.in);
		int indexToRemove = scn.nextInt();
		System.out.println("Removing " + contacts.get(indexToRemove - 1) + " from contacts...");
		contacts.remove(indexToRemove - 1 );
	}
	
	public void updateContact() {
		System.out.println(contacts.size());
		System.out.println("Which contact would you like to update?");
		for(int i = 0; i < contacts.size(); i++) {
			System.out.println(i+1 + ") " + contacts.get(i));
		}
		Scanner scanInt = new Scanner(System.in);
		int indexToUpdate = scanInt.nextInt();
		System.out.println("Updating " + contacts.get(indexToUpdate -1) + ". Please enter the updated name for this contact.");
		Scanner scanString = new Scanner(System.in);
		String updatedContact = scanString.nextLine();
		contacts.set(indexToUpdate -1, updatedContact);
		
	}
	
}
