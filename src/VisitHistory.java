public class VisitHistory {

    // ========== VISIT NODE ==========

    private class Node {

        int visitId;
        String visitDate;
        String doctorName;
        String diagnosis;
        String treatment;

        Node next;

        Node(int visitId, String visitDate, String doctorName,
             String diagnosis, String treatment) {

            this.visitId = visitId;
            this.visitDate = visitDate;
            this.doctorName = doctorName;
            this.diagnosis = diagnosis;
            this.treatment = treatment;
            this.next = null;
        }
    }

    private Node head;

    // ========== ADD NEW VISIT ==========

    public void addVisit(int visitId, String visitDate,
                         String doctorName, String diagnosis,
                         String treatment) {

        Node newNode = new Node(
                visitId,
                visitDate,
                doctorName,
                diagnosis,
                treatment
        );

        if (head == null) {

            head = newNode;

        } else {

            Node current = head;

            while (current.next != null) {

                current = current.next;
            }

            current.next = newNode;
        }
    }

    // ========== REMOVE A VISIT ==========

    public void removeVisit(int visitId) {

        if (head == null) {

            System.out.println("Visit history is empty.");
            return;
        }

        if (head.visitId == visitId) {

            head = head.next;

            System.out.println("Visit ID " + visitId + " removed successfully.");
            return;
        }

        Node current = head;

        while (current.next != null &&
               current.next.visitId != visitId) {

            current = current.next;
        }

        if (current.next != null) {

            current.next = current.next.next;

            System.out.println("Visit ID " + visitId + " removed successfully.");

        } else {

            System.out.println("Visit ID " + visitId + " not found.");
        }
    }

    // ========== SEARCH FOR A VISIT ==========

    public void searchVisit(int visitId) {

        Node current = head;

        while (current != null) {

            if (current.visitId == visitId) {

                System.out.println("Visit found!");
                System.out.println("Visit ID: " + current.visitId);
                System.out.println("Visit Date: " + current.visitDate);
                System.out.println("Doctor: " + current.doctorName);
                System.out.println("Diagnosis: " + current.diagnosis);
                System.out.println("Treatment: " + current.treatment);

                return;
            }

            current = current.next;
        }

        System.out.println("Visit ID " + visitId + " not found.");
    }

    // ========== DISPLAY PATIENT VISIT HISTORY ==========

    public void displayVisitHistory() {

        if (head == null) {

            System.out.println("No previous hospital visits found.");
            return;
        }

        Node current = head;

        while (current != null) {

            System.out.println("Visit ID: " + current.visitId);
            System.out.println("Visit Date: " + current.visitDate);
            System.out.println("Doctor: " + current.doctorName);
            System.out.println("Diagnosis: " + current.diagnosis);
            System.out.println("Treatment: " + current.treatment);
            System.out.println("----------------------------------------");

            current = current.next;
        }
    }
}