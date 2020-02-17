import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        StudentReader reader = new StudentReader();
        List<studentGrade> students = reader.readFile("grades.txt");
        System.out.println(students);

        ClassRoom classRoom = new ClassRoom(students);
        System.out.println(classRoom.getGrades("Computer Science"));
    }
}
