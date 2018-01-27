/**
 * 
 */
package universityStructure;

/**
 * @author Ciaran
 *
 */
public class Student extends Person {
	
	/**
	 * Student ID instance var
	 */
	private int studentId;
	
	/**
	 * Default constructor
	 */
	public Student() {
		
	}

	/**
	 * constructor with arguments
	 * @param studentId
	 */
	public Student(int studentId, String firstName, String lastName) {
		super(firstName, lastName);
		this.setStudentId(studentId);
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	/**
	 * 
	 * this method outputs the student details 
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Student Id \t\t: " + this.studentId);
	}
	

}
