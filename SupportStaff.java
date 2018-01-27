/**
 * 
 */
package universityStructure;


/**
 * @author Ciaran
 *
 */
public class SupportStaff extends Staff implements IPayable {
	
	/**
	 * constant for suuprt staff fixed rate
	 */
	private static final double supportStaffFixedRate = 10.50;

	/**
	 * contract hours instance vars 
	 */
	private double contractHours;
	
	/**
	 * Default constructor
	 */
	public SupportStaff() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args 
	 * @param firstName
	 * @param lastName
	 * @param staffId
	 * 
	 */
	public SupportStaff(String firstName, String lastName, int staffId, 
			double contractHours ) {
		super(firstName, lastName, staffId);
		this.contractHours = contractHours;
	}
	
	/**
	 * @return the contractFixedHours
	 */
	public double getContractHours() {
		return this.contractHours;
	}

	/**
	 * @param contractFixedHours the contractFixedHours to set
	 * business rule: contract hours can only be set between 1 and 160 inclusive
	 */
	public void setContractHours(double contractHours) {
		if(contractHours < 1 || contractHours > 160) {
			contractHours = 0;
		}else {
			this.contractHours = contractHours;	
		}
	}

	/**
	 * @return the supportStafffixedRate
	 */
	public static double getSupportstafffixedrate() {
		return supportStaffFixedRate;
	}
	
	/**
	 * displays the information for support staff
	 */
	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Contract hours \t\t: " + this.contractHours);
	}

	/**
	 * method to calculate monthly wage
	 */
	@Override
	public double calculateMonthlyWage() {
		double answer = contractHours * supportStaffFixedRate;
		System.out.println("Support staff wages: £" + answer);
		return answer;
	}

}
