import java.util.Scanner;

public class ContactsApp {
		Contact myContacts = new Contact();
	
	public void showMenu() {
		
		System.out.println();
		System.out.println("-- Please choose what you would like to do: --");
		System.out.println("1) Show Contacts");
		System.out.println("2) Add Contact");
		System.out.println("3) Delete Contact");
		System.out.println();
		Scanner reader = new Scanner(System.in);
		String choice = reader.nextLine();
		switch(choice)
		{
		case "1":
			System.out.println("Showing contacts...");
			myContacts.showContacts();
			Scanner listener = new Scanner(System.in);
			System.out.println("-- Press enter to return to main menu --");
			String listen = listener.nextLine();
			if(listen != null) {
				showMenu();
			}
			break;
			
		case "2":
			System.out.println("Adding contact...");
			myContacts.addContact();
			showMenu();
			break;
			
		case "3":
			System.out.println("Contact removal...");
			myContacts.removeContact();
			showMenu();
			break;
			
		default: System.out.println("Please choose again.");
				showMenu();
			break;
		}
	}
}
