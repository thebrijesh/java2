package LLD.Design_Patterns.Builder_Pattern;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setAge(20).
                setEmail("hi@gmail.com").
                setMobile(9785462).
                setName("brijesh").
                setPsp(500).
                setRollNo(56)
                .build();

        System.out.println(student.toString());

    }



}
