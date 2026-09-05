public class PatientBST {

    // =========================
    // NODE CLASS
    // =========================

    private class Node {

        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    // =========================
    // ADD PATIENT FOR DELETE TESTING
    // =========================

    public void addPatient(Patient patient) {

        root = addRecursive(root, patient);
    }

    private Node addRecursive(Node current, Patient patient) {

        if (current == null) {
            return new Node(patient);
        }

        if (patient.getPatientId() < current.patient.getPatientId()) {

            current.left = addRecursive(current.left, patient);

        } else if (patient.getPatientId() > current.patient.getPatientId()) {

            current.right = addRecursive(current.right, patient);
        }

        return current;
    }

    // =========================
    // DELETE A PATIENT
    // =========================

    public void deletePatient(int patientId) {

        root = deleteRecursive(root, patientId);
    }

    private Node deleteRecursive(Node current, int patientId) {

        // Patient ID not found
        if (current == null) {
            return null;
        }

        // Patient ID is smaller
        if (patientId < current.patient.getPatientId()) {

            current.left = deleteRecursive(current.left, patientId);
        }

        // Patient ID is greater
        else if (patientId > current.patient.getPatientId()) {

            current.right = deleteRecursive(current.right, patientId);
        }

        // Patient found
        else {

            // =========================
            // CASE 1: NO CHILDREN
            // =========================

            if (current.left == null && current.right == null) {

                return null;
            }

            // =========================
            // CASE 2: ONLY RIGHT CHILD
            // =========================

            if (current.left == null) {

                return current.right;
            }

            // =========================
            // CASE 3: ONLY LEFT CHILD
            // =========================

            if (current.right == null) {

                return current.left;
            }

            // =========================
            // CASE 4: TWO CHILDREN
            // =========================

            Node successor = findMinimum(current.right);

            current.patient = successor.patient;

            current.right = deleteRecursive(
                    current.right,
                    successor.patient.getPatientId()
            );
        }

        return current;
    }

    // =========================
    // FIND MINIMUM PATIENT
    // =========================

    private Node findMinimum(Node current) {

        while (current.left != null) {

            current = current.left;
        }

        return current;
    }

    // =========================
    // DISPLAY PATIENT RECORDS
    // =========================

    public void displayInOrder() {

        inOrder(root);
    }

    private void inOrder(Node current) {

        if (current != null) {

            inOrder(current.left);

            System.out.println(current.patient);

            inOrder(current.right);
        }
    }
}
