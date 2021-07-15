public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MAT101", "MATH");
        Course physics = new Course("Physics", "PHYS101", "PHYS");
        Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Mahmut Holland", "90550000000", "MATH");
        Teacher t2 = new Teacher("Fatma Sun", "90550000001", "PHYS");
        Teacher t3 = new Teacher("Ali Crane", "90550000002", "CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        math.printTeacher();
        physics.printTeacher();
        chemistry.printTeacher();


        Student s1 = new Student("Cow John", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50,80,0.25,75,60,0.30,90,50,0.20);
        s1.isPassed();

        Student s2 = new Student("Short Ned", 4, "2211133", math, physics, chemistry);
        s1.addBulkExamNote(80,45,0.25,42,69,0.30,95,78,0.20);
        s2.isPassed();

        Student s3 = new Student("Naughty Smile", 4, "221121312", math, physics, chemistry);
        s1.addBulkExamNote(30,60,0.25,89,95,0.30,72,85,0.20);
        s3.isPassed();

    }
}
