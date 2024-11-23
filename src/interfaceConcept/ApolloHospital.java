package interfaceConcept;

public class ApolloHospital extends GlobalPatientData implements USMedical, UKMedical, IndianMedical {

	@Override
	public void emergencyServices() {
		System.out.println("AP--emergency services");
	}

	@Override
	public void neuroServices() {
		System.out.println("AP--neuro services");
	}

	@Override
	public void peditricServices() {
		System.out.println("AP--peditrics services");
	}

	@Override
	public void ENTServices() {
		System.out.println("AP--ENT services");
	}

	@Override
	public void ambulanceServices() {
		System.out.println("AP--ambulance services");
	}

	@Override
	public void physioServices() {
		System.out.println("AP--physio services");
	}

	@Override
	public void onchologyServices() {
		System.out.println("AP-oncology services");
	}

	@Override
	public void orthopedicServices() {
		System.out.println("AP--orthopedics services");
	}

	public void OPTServices() {
		System.out.println("AP--opt services");
	}

	public void medicalInsurance() {
		System.out.println("AP--medical insurance");
	}

	public void pathologyServices() {
		System.out.println("AP--pathology services");
	}

	@Override
	public void radiologyServices() {
		System.out.println("AP--radiology services");
	}

	@Override
	public void polioServices() {
		System.out.println("AP--polio services");
	}
}