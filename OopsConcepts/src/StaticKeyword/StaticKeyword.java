package StaticKeyword;
class Student{
    String name ;
    static String School; // the static keyword is used which are similar for multiple object like school is same for every student
    // similarlly we can define for the method also
    public static void changeSchool (){
        School = "Government High School";
    }


}
public class StaticKeyword {
    public static void main(String[] args) {
        // for the static keyword the memory will allowcate only once
        // but the object memory will allowcate repatadally

        Student.School = "GHS";
        Student.changeSchool(); // here we useing the class name we can access the static variable and method
        Student s1 = new Student();
        s1.name="kedar";
        System.out.println(s1.School);
        System.out.println(s1.name);

        Student s2 = new Student();
        System.out.println(s2.name); // it will give the null values to  the name
        System.out.println(s2.School);


    }
}
