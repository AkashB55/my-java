package interfaceConcept;

public class TestHospital {

	public static void main(String[] args) {

		ApolloHospital ap = new ApolloHospital();
		ap.ambulanceServices();
		ap.emergencyServices();
		ap.ENTServices();
		ap.medicalInsurance();
		ap.neuroServices();
		ap.internship();
		ap.getPatientHistory();

		System.out.println(ap.min_fee);
		System.out.println(USMedical.min_fee);
		USMedical.Services_911();

		USMedical us = new ApolloHospital();
		us.physioServices();
		us.onchologyServices();
		us.orthopedicServices();
		us.internship();

		UKMedical uk = new ApolloHospital();
		uk.ambulanceServices();
		uk.ENTServices();
	}
}