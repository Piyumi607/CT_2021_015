package Q_05;

public class Course {
    private String CourseName;
    private String CourseCode;
    private Lecturer lecturerIncharge;

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public Lecturer getLecturerIncharge() {
        return lecturerIncharge;
    }

    public void setLecturerIncharge(Lecturer lecturerIncharge) {
        this.lecturerIncharge = lecturerIncharge;
    }
}
