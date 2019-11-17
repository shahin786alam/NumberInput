package OopConceptPart1;

public class EncapsulationConcept {
	//Encapsulation is also called data hiding.
	//How to implement Encapsulations:
	//1.private data variables: so that these vars can not accesed 
	//diractly from outside the class.
	private int ssn;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) {
		EncapsulationConcept encap= new EncapsulationConcept();
		encap.setEmpName("Alam");
		encap.setEmpAge(28);
		encap.setSsn(123456789);
		
		System.out.println("Employee name is: "+encap.getEmpName());
		System.out.println("Employee age is: "+encap.getEmpAge());
		System.out.println("Employee ssn is: "+encap.getSsn());

	}
	//2. public getter and setter methods: to set get the values of the fields.
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
