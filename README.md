````markdown
# Mini Hospital Emergency Management System

## Project Description

The Mini Hospital Emergency Management System is a Java-based system designed to manage patient records, emergency patients, treatment history, and previous hospital visits.

The system demonstrates the use of different data structures to manage hospital information efficiently.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Singly Linked List
- Stack
- Queue
- Binary Search Tree (BST)

## Data Structures Used

### 1. Binary Search Tree (BST)

The Binary Search Tree is used to store and manage patient records.

Operations include:

- Insert a patient
- Search for a patient by Patient ID
- Delete a patient
- Display patient records in ascending order of Patient ID

### 2. Queue

The Emergency Patient Queue is used to manage patients waiting for emergency treatment.

Operations include:

- Enqueue a patient
- Dequeue the next patient
- Display patients currently waiting
- Handle an empty queue

The queue follows the **FIFO (First-In, First-Out)** principle.

This means the patient who enters the queue first is treated first.

### 3. Stack

The Treatment History Stack is used to store completed treatment records.

Operations include:

- Push a completed treatment record
- Pop the most recently completed treatment record
- Display treatment records
- Handle an empty stack

The stack follows the **LIFO (Last-In, First-Out)** principle.

This means the most recently completed treatment is removed first.

### 4. Singly Linked List

A Singly Linked List is used to store a patient's previous hospital visits.

Each visit contains:

- Visit ID
- Visit Date
- Doctor Name
- Diagnosis
- Treatment

Operations include:

- Add a new visit
- Remove a visit
- Search for a visit
- Display the patient's visit history

## Project Structure

```text
MiniHospitalEmergencyManagementSystem
│
└── src
    │
    ├── Patient.java
    ├── PatientBST.java
    ├── EmergencyQueue.java
    ├── TreatmentStack.java
    ├── VisitHistory.java
    └── Main.java
````

## File Description

### Patient.java

Contains the Patient class and patient information such as:

* Patient ID
* Patient Name
* Age
* Contact Number
* Medical Condition

### PatientBST.java

Implements the Binary Search Tree for managing patient records.

### EmergencyQueue.java

Implements the emergency patient queue using the FIFO principle.

### TreatmentStack.java

Implements the treatment history stack using the LIFO principle.

### VisitHistory.java

Implements the Singly Linked List for storing previous patient visits.

### Main.java

Contains the main method and demonstrates the functionality of the system.

## How to Run the Project

### Step 1: Open the Project

Open the project folder in Visual Studio Code or another Java IDE.

### Step 2: Open the src Folder

Open the terminal inside the `src` folder.

### Step 3: Compile the Java Files

Run:

```bash
javac *.java
```

### Step 4: Run the Program

Run:

```bash
java Main
```

**Note:** The class name is `Main`, so use `java Main` with a capital `M`.

## Example Queue

The emergency queue follows FIFO:

```text
FRONT
  ↓
Patient 2001 → Patient 2002 → Patient 2003
                                      ↑
                                     REAR
```

Patient 2001 will be treated first.

## Example Stack

The treatment history stack follows LIFO:

```text
TOP
 ↓
Treatment 2003
Treatment 2002
Treatment 2001
```

Treatment 2003 will be removed first because it was added most recently.

## Example Singly Linked List

Patient visit history is stored as:

```text
Visit 5001 → Visit 5002 → Visit 5003 → null
```

Each node contains the details of one hospital visit.

## Empty Data Structure Handling

The system also handles empty data structures appropriately.

### Empty Queue

```text
Queue is empty. No patient to dequeue.
```

### Empty Stack

```text
Stack is empty. No treatment record to remove.
```

### Empty Visit History

```text
No previous hospital visits found.
```

## Conclusion

This project demonstrates how different data structures can be applied to a hospital emergency management system.

* **BST** → Patient Records
* **Queue** → Emergency Patients
* **Stack** → Treatment History
* **Singly Linked List** → Patient Visit History

The project also demonstrates important concepts such as insertion, deletion, searching, traversal, FIFO, LIFO, and handling empty data structures.

````

Save this file as **`README.md`** in your main project folder, at the same level as the `src` folder:

```text
MiniHospitalEmergencyManagementSystem
│
├── README.md
│
└── src
    ├── Patient.java
    ├── PatientBST.java
    ├── EmergencyQueue.java
    ├── TreatmentStack.java
    ├── VisitHistory.java
    └── Main.java
````

This is suitable for including in your **GitHub repository** as the project documentation.
