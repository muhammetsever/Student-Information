public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Math", "MATH101", "MATH");
        Course fizik = new Course("Physics", "PHY101", "PHY");
        Course kimya = new Course("Chemistry", "CHM101", "CHEM");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MATH");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "PHY");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHEM");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,100,20);
        s1.addsNote(70,70,60);
        s1.isPass();



        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,100,50);
        s2.addsNote(60,70,85);
        s2.isPass();


        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,100,20);
        s3.addsNote(60,55,75);
        s3.isPass();

    }
}