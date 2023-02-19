import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Rishita {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("rishita.dat"));
        TreeMap<String, List<Course>> treeMap = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            Course temp = new Course(tokens[0], tokens[1]);
            if (treeMap.containsKey(tokens[2])) {
                treeMap.get(tokens[2]).add(temp);
            } else {
                List<Course> school = new ArrayList<>();
                school.add(temp);
                treeMap.put(tokens[2], school);
            }
        }
        for (String school : treeMap.keySet()) {
            Collections.sort(treeMap.get(school));
            System.out.println(school);
            for (Course course : treeMap.get(school)) {
                System.out.println("   " + course.courseCode + "   " + course.courseName);
            }
        }
    }

    static class Course implements Comparable<Course> {
        String courseCode;
        String courseName;

        public Course(String name, String code) {
            courseName = name;
            courseCode = code;
        }

        public int compareTo(Course c) {
            return courseCode.compareTo(c.courseCode);
        }
    }
}
