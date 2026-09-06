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

    // Root node of the BST
    private Node root;

    // ========== INSERT / ADD PATIENT ==========

    public void addPatient(Patient patient) {

        root = addRecursive(root, patient);
    }

    private Node addRecursive(Node current, Patient patient) {

        // If the tree is empty, create a new node
        if (current == null) {
            return new Node(patient);
        }

        // Insert into the left subtree
        if (patient.getPatientId() < current.patient.getPatientId()) {

            current.left = addRecursive(current.left, patient);

        }
        // Insert into the right subtree
        else if (patient.getPatientId() > current.patient.getPatientId()) {

            current.right = addRecursive(current.right, patient);
        }

        // Duplicate Patient ID is not inserted
        return current;
    }


    // ========== SEARCH FOR A PATIENT ==========


    public Patient searchPatient(int patientId) {

        return searchRecursive(root, patientId);
    }

    private Patient searchRecursive(Node current, int patientId) {

        // Patient not found
        if (current == null) {
            return null;
        }

        // Patient found
        if (patientId == current.patient.getPatientId()) {
            return current.patient;
        }

        // Search left subtree
        if (patientId < current.patient.getPatientId()) {

            return searchRecursive(current.left, patientId);
        }

        // Search right subtree
        return searchRecursive(current.right, patientId);
    }

    // ========== DELETE A PATIENT ==========

    public void deletePatient(int patientId) {

        root = deleteRecursive(root, patientId);
    }

    private Node deleteRecursive(Node current, int patientId) {

        // Patient ID not found
        if (current == null) {
            return null;
        }

        // Search in the left subtree
        if (patientId < current.patient.getPatientId()) {

            current.left = deleteRecursive(current.left, patientId);
        }

        // Search in the right subtree
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

            // Replace current patient with successor
            current.patient = successor.patient;

            // Delete successor from the right subtree
            current.right = deleteRecursive(
                    current.right,
                    successor.patient.getPatientId()
            );
        }

        return current;
    }

    // =========================
    // FIND MINIMUM NODE
    // =========================

    private Node findMinimum(Node current) {

        while (current.left != null) {

            current = current.left;
        }

        return current;
    }

    // ========== IN-ORDER TRAVERSAL ==========

    public void displayInOrder() {

        inOrder(root);
    }

    private void inOrder(Node current) {

        if (current != null) {

            // Visit left subtree
            inOrder(current.left);

            // Display current patient
            System.out.println(current.patient);

            // Visit right subtree
            inOrder(current.right);
        }
    }
}