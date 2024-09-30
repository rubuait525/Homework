package hw14Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();

		columbiaUniversity.biology();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.maths();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.gymnasium();
		columbiaUniversity.commonRoom();
		columbiaUniversity.dorm();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.morgue();
		columbiaUniversity.vocationalInfo();
		
		System.out.println("--------------------------------------------------------");
		
		// University university = new University(); < This  is interface so we can not instantiated  it.)

		University university = new ColumbiaUniversity();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.dorm();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.languageClub();
		university.morgue();
		university.playGround();
		university.surgeryRoom();
		university.teacher();
		
		System.out.println("---------------------------------------------------------");
		
		//MedicalSchool madicalSchool = new MedicalSchool(); < This an Abstract Class so we can not instantiated it .)
		
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.aeronauticalInfo();
		medicalSchool.anatomyLab();
		medicalSchool.anthropology();
		medicalSchool.biochemistryLab();
		medicalSchool.caring();
		medicalSchool.computerLab();
		medicalSchool.hygiene();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
		

		
		
		

	}
}