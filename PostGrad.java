/**
 * 
 */
package universityStructure;

/**
 * PostGrad Class
 * @author Ciaran
 *
 */
public class PostGrad extends Student {
	
	/**
	 * ProstGrad degree instance var 
	 */
	private String degree;

	/**
	 * Default const
	 */
	public PostGrad() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with args
	 * @param studentId
	 * @param firstName
	 * @param lastName
	 * @param degree
	 */
	public PostGrad(String firstName, String lastName, int studentId, String degree) {
		super(studentId, firstName, lastName);
		this.degree = degree; 
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	/**
	 * display information regarding the PostGrad class 
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Degree \t\t\t:" + this.degree);
	}

}
