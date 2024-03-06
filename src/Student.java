public class Student {

    String name;
    int stuNo;
    String classes;
    Course math;
    Course physics;
    Course chemistry;
    Course sNote;
    double avrage;
    boolean isPass;

    Student(String name, int stuNo,String classes,Course math, Course physics, Course chemistry){

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        callavrage();
        this.isPass = false;
    }
    //not girişi geçerli mi
    void addBulkExamNote(int math,int physics,int chemistry){

        if(math >= 0 && math <= 100){
            this.math.note = math;
        }

        if(physics >= 0 && physics <= 100){
            this.physics.note = physics;
        }

        if(chemistry >= 0 && chemistry <= 100){
            this.chemistry.note = chemistry;
        }
    }
    // sözlü notu girişi geçerli mi
    void addsNote(int sNoteMath,int sNotephy, int sNotechem){

        if(sNoteMath >= 0 && sNoteMath <= 100){
            this.math.sNote = sNoteMath;
        }
        if(sNotephy >= 0 && sNotephy <= 100){
            this.physics.sNote = sNotephy;
        }
        if(sNotechem >= 0 && sNotechem <= 100){
            this.chemistry.sNote = sNotechem;
        }
    }
    // sınıf geçme
    void isPass(){
        if(this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0
                || this.math.sNote == 0 || this.physics.sNote == 0 || this.chemistry.sNote == 0){
            System.out.println("Notlar tam girilmemiş...");
        }
        else{
            this.isPass = isCheckpass();
                printnote();
            System.out.println("Ortalama: "+this.avrage);
            if(this.isPass){
                System.out.println("Sınıfı geçti!");
                this.avrage = 0;
            }
            else{
                System.out.println("Sınıfta kaldı!");
            }
        }
    }
    //Ortalama Hesapla
    void callavrage(){
        double m = this.math.note* 0.8 + this.math.sNote * 0.2;
        double p = this.physics.note * 0.8 + this.math.sNote * 0.2;
        double c = this.chemistry.note *0.8 + this.chemistry.sNote * 0.2;
        //System.out.println("math = "+m+"\n"+"phy = "+p+"\n"+"chem = "+c);
        this.avrage = (m+p+c)/3 ;
        //System.out.println("ortalama "+this.avrage);
    }
    // geçti mi kontrol
    boolean isCheckpass(){
        callavrage();
        return this.avrage > 55;
    }
    //notları yazdır
    void printnote(){
        System.out.println("-------------------------------------------");
        System.out.println("Student: "+this.name);
        System.out.println("Math note:"+this.math.note);
        System.out.println("Math practice note:"+this.math.sNote);
        System.out.println("Physics note:"+this.physics.note);
        System.out.println("Physics practice note:"+this.physics.sNote);
        System.out.println("Chemistry note:"+this.chemistry.note);
        System.out.println("Chemistry practice note:"+this.chemistry.sNote);
    }
}
