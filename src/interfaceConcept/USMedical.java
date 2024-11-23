package interfaceConcept;

public interface USMedical extends WHO {

	int min_fee = 10;

	public void physioServices();

	public void onchologyServices();

	public void orthopedicServices();

	public void radiologyServices();

	public static void Services_911() {
		System.out.println("US - 911services..");
	}

	default void internship() {
		System.out.println("Us-internship");
	}
}