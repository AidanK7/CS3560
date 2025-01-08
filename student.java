public class Student {

    private String name;
    private String major;
    private double gpa;

    public Student() {
        this.name = "";
        this.major = "";
        this.gpa = 0.0;
    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.gpa = 0.0;
    }

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", major='" + major + '\'' 
        		+ ", gpa=" + gpa + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name) && major.equals(student.major);
    }
}
