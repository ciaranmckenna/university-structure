/**
 * 
 */
package universityStructure;

/**
 * Lecturer class
 * @author Ciaran
 *
 */
public class Lecturer extends Staff implements IPayable {

	/**
	 * 
	 * Instance vars for school and grade
	 */
	private String school;
	private int grade;

	/**
	 * Default constructor
	 */
	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with arguments
	 * 
	 * @param firstName
	 * @param lastName
	 * @param staffId
	 * @param school
	 * @param grade
	 */
	public Lecturer(String firstName, String lastName, int staffId, String school, int grade) {
		super(firstName, lastName, staffId);
		this.school = school;
		this.setGrade(grade);
		// TODO Auto-generated constructor stub
	}

	/**
	 * gets school
	 * 
	 * @return the school
	 */
	public String getSchool() {
		return this.school;
	}

	/**
	 * sets school
	 * 
	 * @param school
	 *            the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * gets grade
	 * 
	 * @return the grade
	 */
	public int getGrade() {
		return this.grade;
	}

	/**
	 * sets grade business rule: allowable values 1,2 or 3 default grade to 1
	 * 
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(int grade) {
		if (grade >= 1 && grade <= 3) {
			this.grade = grade;
		} else {
			System.out.println("Error in setting grade");
			this.grade = 1;
		}
	}

	/**
	 * method to display all relevant information regarding lecture class
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("School \t\t : " + school);
		System.out.println("Grade \t\t : " + grade);
	}

	/**
	 * method to calculate monthly wage based on grade
	 */
	@Override
	public double calculateMonthlyWage() {

		double salary;
		salary = 0;
		switch (this.grade) {
		case 1:
			salary = 2000;
			break;
		case 2:
			salary = 2500;
			break;
		case 3:
			salary = 3000;
			break;
		default:
			salary = 2000;
			System.out.println("Default setting");
			break;
		}
		System.out.printf("Lecturer wages : £%.2f", salary);
		System.out.println();
		return salary;
	}

}
