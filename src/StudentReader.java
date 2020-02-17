import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentReader {

    public List<studentGrade> readFile(String fileLocation) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(fileLocation));
        List<studentGrade> students = new ArrayList<>();
        while (scanner.hasNextLine()) {
            studentGrade StudentGrade = fetchStudentGrade(scanner.nextLine());
            students.add(StudentGrade);
        }

        return students;
    }

    private studentGrade fetchStudentGrade(String line) {
        String[] tokens = line.split("\\|");
        System.out.println(Arrays.toString(tokens));
        return new studentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }
}
