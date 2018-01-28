/**
 * 
 */
package universityStructure;

/**
 * class to test university infrastructure
 * @author Ciaran
 *
 */
public class UniversityAdmin {

	/**
	 * method to test the university uml infrastructure
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiation of objects
		UnderGrad Annie = new UnderGrad("Annie", "UnderGrad", 900, "Software Engineering");
		PostGrad Andy = new PostGrad("Andy", "Masters", 901, "BSC Chemistry");
		Lecturer Bill = new Lecturer("Bill", "Gates", 111, "Computer Science", 2);
		SupportStaff SteveJobs = new SupportStaff("Steve", "Jobs", 112, 40.00);
		Lecturer LecturerTestCase = new Lecturer("Test", "Case", 101, "Physics", 4);
		SupportStaff SupportStaffTestCase = new SupportStaff("Test", "Case", 102, 300.00);
		
		// method calls 
		/*System.out.println("Testing UnderGrad");
		Annie.displayAll();
		System.out.println("\nTesting PostGrad");
		Andy.displayAll();
		System.out.println("\nTesting Lecturer");
		Bill.displayAll();
		Bill.calculateMonthlyWage();
		System.out.println("\nTesting Support Staff");
		SteveJobs.displayAll();
		SteveJobs.calculateMonthlyWage();*/
		System.out.println("\nTesting Lecturer error conditions");
		LecturerTestCase.displayAll();
		LecturerTestCase.calculateMonthlyWage();
		System.out.println("\nTesting SupportStaff error conditions");
		SupportStaffTestCase.displayAll();
		SupportStaffTestCase.calculateMonthlyWage();
		
		

	}

}
