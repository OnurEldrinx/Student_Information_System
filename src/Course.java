public class Course {

    String name,code,prefix;
    double note;
    int oralExam,writtenExam;
    double oralPercentage,writtenPercentage;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher teacher){

        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println(teacher.name + " is saved to the system successfully.\n");
        } else {
            System.out.println(teacher.name + " can't give this course.\n");
        }

    }
    public void printTeacher(){

        if (teacher != null) {
            System.out.println("Academic of the course named " + this.name + " : " + teacher.name);
            System.out.println();
        } else {
            System.out.println(this.name + " course has not a academic.\n");
        }

    }

}
