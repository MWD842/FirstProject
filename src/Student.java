public class Student {
    String name;
    int age;
    double gpa;


    public Student() {
    }

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void printInfo() {
        System.out.println(name+", age: "+age+", GPA: "+gpa);
    }

    boolean isExcellentStudent() {
        if (gpa >= 3.5){
            return true;
        }
        return false;
    }

    void birthday(){
        age++;
    }

    void updateGpa(double newGpa) {
        gpa = newGpa;
    }
}
