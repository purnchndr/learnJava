public class Student {
    String firstName;
    String lastName;
    int graduateYear;
    double gpa;
    String major;

    public Student(String firstName, String lastName, int graduateYear, double gpa, String major){
        this.firstName= firstName;
        this.lastName = lastName;
        this.graduateYear = graduateYear;
        this.gpa = gpa;
        this.major = major;
    }


    public void incrementGY(){
        this.graduateYear = graduateYear+1;
    }
    public static void main(String[] args) {
        Student Student1 = new Student("Ram","Milan", 2021, 3.45,"Electronics and Communication Engineering");
        Student Student2 = new Student("Anand","Maurya", 2021, 3.95,"Mechanical Engineering");
        Student1.incrementGY();
        System.out.println(Student1.graduateYear);
        System.out.println(Student2.firstName);

    }

}
