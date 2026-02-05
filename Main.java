public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent(3, "Ana");
        manager.addStudent(1, "Ben");
        manager.addStudent(5, "Chris");
         manager.addStudent(8, "Dina");
        manager.addStudent(2, "Eli");
        manager.addStudent(10, "Femi");

        manager.addStudent(2, null); 

        manager.showSortedStudents();

        manager.searchStudent(3);
        manager.removeStudent(1);

        manager.lowestIdStudent();
        manager.highestIdStudent();
    }
}
