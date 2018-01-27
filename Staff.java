package universityStructure;

public class Staff extends Person {
	
	//Staff ID instance var
	private int staffId;

	/**
	 * default constructor
	 */
	public Staff() {
	}

	/**
	 * constructor with args
	 * @param firstName
	 * @param lastName
	 */
	public Staff(String firstName, String lastName, int staffId) {
		super(firstName, lastName);
		this.staffId = staffId;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the staffId
	 */
	public int getStaffId() {
		return this.staffId;
	}

	/**
	 * @param staffId the staffId to set
	 */
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	/**
	 * method displaying all the information regarding staff
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("StaffId : \t\t " + staffId);
	}

}
