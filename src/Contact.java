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
		System.out.println("Please enter the first name of your contact");
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
	}
	
}
