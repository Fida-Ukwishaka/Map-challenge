import java.util.HashMap;
import java.util.TreeMap;

public class StudentManager {

    private HashMap<Integer, String> students = new HashMap<>();

    
    private TreeMap<Integer, String> sortedStudents = new TreeMap<>();

    // Adding a student
    public void addStudent(int id, String name) {
        try {
            if (name == null) {
                throw new IllegalArgumentException("Name cannot be null");
            }

            students.put(id, name);
            sortedStudents.put(id, name);

            System.out.println("Student added: " + id + " - " + name);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Searching a student by ID
    public void searchStudent(int id) {
        if (students.containsKey(id)) {
            System.out.println("Student is found: " + id + " - " + students.get(id));
        } else {
            System.out.println("Student not found");
        }
    }

    // Removing a student by ID
    public void removeStudent(int id) {
        if (students.containsKey(id)) {
            students.remove(id);
            sortedStudents.remove(id);
            System.out.println("Student removed: " + id);
        } else {
            System.out.println("Cannot remove. Student not found");
        }
    }

    // Showing sorted students by ID
    public void showSortedStudents() {
        System.out.println("Students sorted by ID:");
        for (int id : sortedStudents.keySet()) {
            System.out.println(id + " - " + sortedStudents.get(id));
        }
    }

    // Getting the student with lowest ID
    public void lowestIdStudent() {
        if (!sortedStudents.isEmpty()) {
            int id = sortedStudents.firstKey();
            System.out.println("Student with lowest ID: " + id + " - " + sortedStudents.get(id));
        }
    }

    // Getting the student with highest ID
    public void highestIdStudent() {
        if (!sortedStudents.isEmpty()) {
            int id = sortedStudents.lastKey();
            System.out.println("Student with highest ID: " + id + " - " + sortedStudents.get(id));
        }
    }
}

