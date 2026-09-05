public class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String contactNumber;
    private String medicalCondition;

    // Constructor
    public Patient(int patientId, String patientName, int age,
                   String contactNumber, String medicalCondition) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
    }

    // Get Patient ID
    public int getPatientId() {
        return patientId;
    }

    // Get Patient Name
    public String getPatientName() {
        return patientName;
    }

    // Get Age
    public int getAge() {
        return age;
    }

    // Get Contact Number
    public String getContactNumber() {
        return contactNumber;
    }

    // Get Medical Condition
    public String getMedicalCondition() {
        return medicalCondition;
    }

    // Display Patient Record
    @Override
    public String toString() {

        return "Patient ID: " + patientId
                + ", Name: " + patientName
                + ", Age: " + age
                + ", Contact: " + contactNumber
                + ", Condition: " + medicalCondition;
    }
}