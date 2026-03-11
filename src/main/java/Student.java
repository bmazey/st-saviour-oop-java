public class Student implements Comparable<Student> {
    String name;
    int id;
    double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student s) {
        return (int)this.grade - (int)s.grade;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " id: " + this.id + " grade: " + this.grade;
    }
}
