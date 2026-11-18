import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingImpl {
    static void main(String[] args) {
        Course c1 = new Course(101,"Java",15000);
        Course c2 = new Course(102,"Python",12000);
        Course c3 = new Course(103,"React",15000);
        Course c4 = new Course(104,"SQL",8000);
        Course c5 = new Course(104,"Angular",12000);

        //Display all the courses in an unsorted manner

        List<Course> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        courseList.add(c4);
        courseList.add(c5);

        System.out.println("******** Displaying the Courses ********");
        for(Course c: courseList){
            System.out.println(c);
        }

        //Sorting the array based on fee in Ascending order
        System.out.println("******** Displaying the Courses Sorted in Ascending order of fee ********");
        courseSort(courseList,"ASC");

        //Sorting the array based on fee in Descending order
        System.out.println("******** Displaying the Courses Sorted in Descending order of fee ********");
        courseSort(courseList,"DESC");
    }

    private static void courseSort(List<Course> list, String instruction) {
        Collections.sort(list, new CourseUtility(instruction));
        for(Course c : list){
            System.out.println(c);
        }
    }
}