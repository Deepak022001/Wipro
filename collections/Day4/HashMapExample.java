import java.util.HashMap;

// Java program to demonstrate HashMap operations
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Emma");
        
        int rollNumberToFind = 103;
        if (students.containsKey(rollNumberToFind)) {
            System.out.println("Student with roll number " + rollNumberToFind + ": " + students.get(rollNumberToFind));
        } else {
            System.out.println("Student with roll number " + rollNumberToFind + " not found.");
        }
        
        int rollNumberToRemove = 104;
        students.remove(rollNumberToRemove);
        
        System.out.println("Updated Student Records:");
        for (Integer rollNumber : students.keySet()) {
            System.out.println("Roll Number: " + rollNumber + ", Name: " + students.get(rollNumber));
        }
    }
}

