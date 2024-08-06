package LLD.Design_Patterns.Builder_Pattern;

public class Student {
    private final String name;
    private final String email;
    private final int age;
    private final int mobile;
    private final int rollNo;
    private int psp;

    private Student(StudentBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.mobile = builder.mobile;
        this.psp = builder.psp;
        this.rollNo = builder.rollNo;
        this.email = builder.email;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMobile() {
        return mobile;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getEmail() {
        return email;
    }

    public int getPsp() {
        return psp;
    }

    static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return this.email + " || " + this.rollNo + " || " + this.psp + " || " + this.mobile + " || " + this.name + " || " + this.age;
    }

    public static class StudentBuilder {
        String name;
        int age;
        int mobile;
        int rollNo;

        String email;

        int psp;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setMobile(int mobile) {
            this.mobile = mobile;
            return this;
        }

        public StudentBuilder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
