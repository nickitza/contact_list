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
		String newContact = reader.nextLine();
		contacts.add(newContact);
	}
	
}
