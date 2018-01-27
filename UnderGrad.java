/**
 * 
 */
package universityStructure;

/**
 * @author Ciaran
 *
 */
public class UnderGrad extends Student {
	
	/**
	 * Course instance var
	 */
	private String course;

	/**
	 * 
	 * default constructor
	 */
	public UnderGrad() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * @param studentId
	 * @param firstName
	 * @param lastName
	 * @param course
	 */
	public UnderGrad( String firstName, String lastName, int studentId, String course) {
		super(studentId, firstName, lastName);
		this.course = course;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	/**
	 * method to display information regarding the UnderGrad
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Course \t\t\t: " + this.course);
	}

}
