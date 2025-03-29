package Q_05;

public class Main {
    public static void main(String[] args) {
        Course course=new Course();
        course.setCourseName("OOP");
        course.setCourseCode("CTEC-22043");


        Lecturer lecturer=new Lecturer();
        lecturer.setLecturerName("Dr.A.B.Perera");
        lecturer.setCourseTeaching("OOP");

        Student student=new Student();
        student.setStudentName("Piyumi");
        student.setCourseFollowing("OOP");
        student.setDegreeName("BICT");

        System.out.println("Course Name:"+course.getCourseName());
        System.out.println("Course Code:"+course.getCourseCode());

        System.out.println("Lecture Name:"+lecturer.getLecturerName());
        System.out.println("Course Teaching:"+lecturer.getCourseTeaching());

        System.out.println("Student Name:"+student.getStudentName());
        System.out.println("DegreeName:"+student.getDegreeName());
        System.out.println("Course Following:"+student.getCourseFollowing());

    }
}
