public class Course{
    int id;
    String name;
    int fee;

    public Course(int id, String name, int fee){
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    @Override
    public String toString(){
        return "Course{ id = " + id + ", Name = " + name+ ", fee = " + fee +"}";
    }

}