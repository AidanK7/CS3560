public class Exam {

    private int description;
    private Course course;

    public Exam(int description, Course course) {
        this.description = description;
        this.course = course; 
    }

}

public class Course {

    private int code;
    private String name;

    public Course() {
        this.code = 0;
        this.name = "";
    }

}
