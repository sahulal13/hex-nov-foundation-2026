import java.util.Comparator;


public class CourseUtility implements Comparator<Course> {

    String instruction;

    public CourseUtility(String instruction){
        this.instruction = instruction;
    }

    @Override
    public int compare(Course c1, Course c2){
        if(instruction.equals("ASC")){
            if(c1.fee > c2.fee){
                return 1;
            }else{
                return -1;
            }
        }else{
            if(c1.fee < c2.fee){
                return 1;
            }else{
                return -1;
            }
        }


    }



}
