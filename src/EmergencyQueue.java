public class EmergencyQueue {

    // =========================
    // NODE CLASS
    // =========================

    private class Node {

        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    // Front and rear of the queue
    private Node front;
    private Node rear;

    
        // ========== ENQUEUE PATIENT ==========


    public void enqueue(Patient patient) {

        Node newNode = new Node(patient);

        // If queue is empty
        if (rear == null) {

            front = newNode;
            rear = newNode;

        } else {

            // Add patient at the rear
            rear.next = newNode;
            rear = newNode;
        }
    }

    
        // ========== DEQUEUE PATIENT - FIFO ==========

    public Patient dequeue() {

        // Handle empty queue
        if (front == null) {

            System.out.println(
                    "Queue is empty. No patient to dequeue."
            );

            return null;
        }

        // Store the patient at the front
        Patient patient = front.patient;

        // Move front to the next patient
        front = front.next;

        // If queue becomes empty, reset rear
        if (front == null) {

            rear = null;
        }

        return patient;
    }

    // ==========  DISPLAY WAITING PATIENTS ==========

    public void displayWaitingPatients() {

        // Handle empty queue
        if (front == null) {

            System.out.println(
                    "No patients are currently waiting."
            );

            return;
        }

        Node current = front;

        System.out.println("Patients currently waiting:");

        while (current != null) {

            System.out.println(current.patient);

            current = current.next;
        }
    }

    // ========== CHECK IF QUEUE IS EMPTY ==========

    public boolean isEmpty() {

        return front == null;
    }
}
