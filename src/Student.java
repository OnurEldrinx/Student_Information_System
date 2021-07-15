public class Student {

    String name,studentNo;
    int classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPassed;

    public Student(String name, int classes, String studentNo, Course course1, Course course2, Course course3) {

        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        calculateAverage();

    }

    public void addBulkExamNote(int course1WrittenGrade,int course1OralGrade,double course1OralPercentage,int course2WrittenGrade,int course2OralGrade,double course2OralPercentage,int course3WrittenGrade,int course3OralGrade,double course3OralPercentage){

        this.course1.writtenExam = course1WrittenGrade;
        this.course2.writtenExam = course2WrittenGrade;
        this.course3.writtenExam = course3WrittenGrade;

        this.course1.oralExam = course1OralGrade;
        this.course2.oralExam = course2OralGrade;
        this.course3.oralExam = course3OralGrade;

        this.course1.oralPercentage = course1OralPercentage;
        this.course2.oralPercentage = course2OralPercentage;
        this.course3.oralPercentage = course3OralPercentage;



        course1.writtenPercentage = 1 - course1OralPercentage;
        course2.writtenPercentage = 1 - course2OralPercentage;
        course3.writtenPercentage = 1 - course3OralPercentage;

        double course1Grade = (course1WrittenGrade * course1.writtenPercentage) + (course1OralGrade * course1OralPercentage);
        double course2Grade = (course2WrittenGrade * course2.writtenPercentage) + (course2OralGrade * course2OralPercentage);
        double course3Grade = (course3WrittenGrade * course3.writtenPercentage) + (course3OralGrade * course3OralPercentage);


        if (course1Grade>=0 && course1Grade<=100){

            this.course1.note = course1Grade;

        }

        if (course2Grade>=0 && course2Grade<=100){

            this.course2.note = course2Grade;

        }

        if (course3Grade>=0 && course3Grade<=100){

            this.course3.note = course3Grade;

        }

    }
    public void isPassed(){

        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0) {
            System.out.println("Grades are not entered completely!");
        } else {
            this.isPassed = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);

            if (this.isPassed) {
                System.out.println("Passed the class.\n");
            } else {
                System.out.println("Failed the class.\n");
            }
        }


    }
    public void calculateAverage(){

        this.average = (this.course1.note + this.course2.note + this.course3.note) / 3;

    }

    public boolean isCheckPass() {
        calculateAverage();
        return this.average > 55;
    }

    public void printNote(){

        System.out.println("==================================================");
        System.out.println("Student : " + this.name);
        System.out.println(course1.name +" Grade : " + this.course1.note);
        System.out.println(course2.name +" Grade : " + this.course2.note);
        System.out.println(course3.name +" Grade : " + this.course3.note);
        System.out.println("==================================================");

    }

}
