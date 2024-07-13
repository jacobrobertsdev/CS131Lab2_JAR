
public class Application {

	public static void main(String[] args) {

		
		// Create a Wizard object
		Wizard wizard = new Wizard("Gandalf");
		
		System.out.println("Begin tests");
		System.out.println("===========");
		System.out.println();


		// Test health and takeDamage
		System.out.println("Tests for Health & takeDamage");
		System.out.println("=============================");
		System.out.println();
		
		System.out.println("Curent health: " + wizard.getHealth());
		System.out.println("...taking damage");
		wizard.takeDamage(40);
		System.out.println("Health after damage: " + wizard.getHealth());
		
		System.out.println();
		System.out.println("====================================");
		System.out.println("End of tests for Health & takeDamage");
		System.out.println();
		
		// Getters and Setters
		// Name
		System.out.println("Tests for Name");
		System.out.println("==============");
		System.out.println();
		
		System.out.println("My name is: " + wizard.getName());
		System.out.println("Updating name...");
		wizard.setName("Saruman");
		System.out.println("My new name is: " + wizard.getName());
		
		System.out.println();
		System.out.println("=====================");
		System.out.println("End of tests for Name");
		System.out.println();
		
		// Health
		System.out.println("Tests for Health");
		System.out.println("================");
		System.out.println();
		
		System.out.println("Curent health: " + wizard.getHealth());
		System.out.println("Restoring health...");
		wizard.setHealth(100);
		System.out.println("Curent health: " + wizard.getHealth());
		
		System.out.println();
		System.out.println("=======================");
		System.out.println("End of tests for Health");
		System.out.println();
		
		// Key
		System.out.println("Tests for Key");
		System.out.println("=============");
		System.out.println();
		
		System.out.println("Current key: " + wizard.getKey());
		System.out.println("Setting key... ");
		wizard.setKey(12345);
		System.out.println("Key set to: " + wizard.getKey());
		
		System.out.println();
		System.out.println("====================");
		System.out.println("End of tests for Key");
		System.out.println();
		
		
		// Lock, Unlock, and isLocked
		System.out.println("Tests for Lock, Unlock, isLocked");
		System.out.println("================================");
		System.out.println();

		System.out.println("Locked status: " + wizard.isLocked());
		System.out.println("Locking character... ");
		wizard.lock(12345);
		System.out.println("Locked status: " + wizard.isLocked());
		System.out.println("Unlocking character... ");
		wizard.unlock(12345);
		System.out.println("Locked status: " + wizard.isLocked());
		
		System.out.println();
		System.out.println("=======================================");
		System.out.println("End of tests for Lock, Unlock, isLocked");
		System.out.println();








	}

}
