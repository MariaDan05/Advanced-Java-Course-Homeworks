import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    private List<Pet> pets;

    public Student(){

    }

    public Student(String firstName, String lastName, double grade, List<Pet> pets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.pets = pets;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", pets=" + pets +
                '}';
    }
}
