public class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sNote;


    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.sNote = 0;
        this.note = 0;

    }
    // öğretmeni derse ata
    void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Operation sucsessfully");
        }
        else{
            System.out.println(t.name+ " This teacher can't teach this lesson");
        }
    }
    void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name+" Lessons Teacher: "+courseTeacher.name);
        }
        else {
            System.out.println(this.name +" teacher not teacher of the course "+courseTeacher.name);
        }
    }
}
