/**
 * 
 */
package universityStructure;

/**
 * Person class
 * @author Ciaran
 *
 */
public class Person {
	
	/**
	 * Person instance vars
	 */
	
	private String firstName;
	private String lastName;

	/**
	 * Default constructor 
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * method to display all the information related to the person class
	 */
	public void displayAll() {
		System.out.println("First name \t\t :" + this.firstName);
		System.out.println("Last name \t\t :" + this.lastName);

	}
	
	

}
