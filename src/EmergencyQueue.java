public class EmergencyQueue {

    // ========== NODE CLASS ==========

    private class Node {

        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    // ========== ENQUEUE PATIENT ==========

    public void enqueue(Patient patient) {

        Node newNode = new Node(patient);

        if (rear == null) {

            front = newNode;
            rear = newNode;

        } else {

            rear.next = newNode;
            rear = newNode;
        }
    }

    // ========== DEQUEUE PATIENT - FIFO ==========

    public Patient dequeue() {

        // ========== HANDLE EMPTY QUEUE ==========

        if (front == null) {

            System.out.println("Queue is empty. No patient to dequeue.");
            return null;
        }

        // ========== REMOVE FRONT PATIENT ==========

        Patient patient = front.patient;

        front = front.next;

        // ========== UPDATE REAR IF QUEUE BECOMES EMPTY ==========

        if (front == null) {

            rear = null;
        }

        return patient;
    }

    // ========== DISPLAY ALL WAITING PATIENTS ==========

    public void displayWaitingPatients() {

        if (front == null) {

            System.out.println("No patients are currently waiting.");
            return;
        }

        Node current = front;

        while (current != null) {

            System.out.println(current.patient);

            current = current.next;
        }
    }
}
