public class TreatmentStack {

    // ========== NODE CLASS ==========

    private class Node {

        String treatmentRecord;
        Node next;

        Node(String treatmentRecord) {
            this.treatmentRecord = treatmentRecord;
            this.next = null;
        }
    }

    private Node top;

    // ========== PUSH TREATMENT RECORD ==========

    public void push(String treatmentRecord) {

        Node newNode = new Node(treatmentRecord);

        newNode.next = top;
        top = newNode;
    }

    // ========== POP MOST RECENT TREATMENT RECORD ==========

    public String pop() {

        // ========== HANDLE EMPTY STACK ==========

        if (top == null) {

            System.out.println("Stack is empty. No treatment record to remove.");
            return null;
        }

        // ========== REMOVE TOP RECORD ==========

        String treatmentRecord = top.treatmentRecord;

        top = top.next;

        return treatmentRecord;
    }

    // ========== DISPLAY TREATMENT RECORDS ==========

    public void displayTreatmentRecords() {

        if (top == null) {

            System.out.println("No treatment records available.");
            return;
        }

        Node current = top;

        while (current != null) {

            System.out.println(current.treatmentRecord);

            current = current.next;
        }
    }
}
