package Mini_Projects.Project_01;

public class Student {
    private int semester;
    private String id, name, department;
    private double CGPA;

    public Student(String id, String name, String department, int semester, double CGPA) {
        this.id = id;
        this.semester = semester;
        this.name = name;
        this.department = department;
        this.CGPA = CGPA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
