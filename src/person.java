public class person {
    String fname;
    String lname;
    int age;
    String gender;
    String collage;
    String address;
  person(String fname,String lname, int age,String gender, String collage, String address ){
      this.fname = fname;
      this.lname = lname;
      this.age = age;
      this.gender = gender;
      this.collage = collage;
      this.address= address;
  }

  public void changeName(String fname, String lname){
      this.fname = fname;
      this.lname = lname;
      System.out.println("Full Name: "+this.fname+" "+this.lname);
  }
    public void changeAge(int age){
        this.age = age;
        System.out.println("Age: "+this.age);
    }
    public void changeAddress(String address){
      this.address = address;
        System.out.println("Address: "+this.address);
    }

    public void changeCollage(String collage){
      this.collage = collage;
        System.out.println("Collage: "+this.collage);
    }

    public void changeGender(String gender){
      this.gender = gender;
      System.out.println("Gender: "+this.gender);
    }
    public static void main(String[] args) {
        person[] arr = new person[10];
        arr[1] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        arr[2] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        arr[3] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        arr[4] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        arr[5] = new person("Purna", "Nishad", 22, "male", "bit", "Bodarwar");
        arr[6] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        arr[7] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        arr[8] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        arr[9] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        arr[0] = new person("hello", "jhh", 22, "male", "bit", "fjalfjadsiof");
        int i =5;
        System.out.println("First Name: "+ arr[i].fname+ ", Last Name: "+arr[i].lname +", Age: " + arr[i].age+ ", Collage: " + arr[i].collage + ", Address: " + arr[i].address);


    }
}
