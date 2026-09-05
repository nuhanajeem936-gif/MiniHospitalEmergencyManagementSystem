public class Main {

    public static void main(String[] args) {

        // ========== PATIENT VISIT HISTORY ==========

        VisitHistory patientVisitHistory = new VisitHistory();

        // ========== ADD PATIENT VISITS ==========

        patientVisitHistory.addVisit(
                5001,
                "2026-01-15",
                "Dr. Perera",
                "Fever",
                "Prescribed medication"
        );

        patientVisitHistory.addVisit(
                5002,
                "2026-04-20",
                "Dr. Silva",
                "Headache",
                "Pain relief treatment"
        );

        patientVisitHistory.addVisit(
                5003,
                "2026-08-10",
                "Dr. Fernando",
                "Chest Pain",
                "Medical observation"
        );

        // ========== DISPLAY PATIENT'S VISIT HISTORY ==========

        System.out.println();
        System.out.println("========== PATIENT'S VISIT HISTORY ==========");
        System.out.println();

        patientVisitHistory.displayVisitHistory();
    }
}