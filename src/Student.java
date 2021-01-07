class Student {
    String firstName;
    String lastName;
    int graduateYear;
    double gpa;
    String major;

 Student(String firstName, String lastName, int graduateYear, double gpa, String major){
        this.firstName= firstName;
        this.lastName = lastName;
        this.graduateYear = graduateYear;
        this.gpa = gpa;
        this.major = major;
    }


    public void incrementGY(){
        this.graduateYear = graduateYear+1;
    }
    public void changeFirstName(String firstName){
        this.firstName = firstName;
    }

    public void changeLastName(String lastName){
        this.lastName = lastName;
    }
    public static void main(String[] args) {
        Student Student1 = new Student("Ram","Milan", 2021, 3.45,"Electronics and Communication Engineering");
        Student Student2 = new Student("Anand","Maurya", 2021, 3.95,"Mechanical Engineering");
        Student2.incrementGY();
        Student1.changeFirstName("Purnachandra");
        Student2.changeLastName("Nishad");
        System.out.println(Student1.firstName);
        System.out.println(Student2.lastName);
        Student2.incrementGY();
        System.out.println(Student2.graduateYear);

    }

}
