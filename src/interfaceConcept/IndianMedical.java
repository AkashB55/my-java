package interfaceConcept;

public interface IndianMedical {

	public void emergencyServices();

	public void neuroServices();

	public void peditricServices();
	
	public void radiologyServices();
	
	public static void dengueServices() {
		System.out.println("India--dengue services");
	}
}