package pl.kurs.task3;

public class Student extends Person{
    private String group;
    private double scholarship;

    public Student(String firstName, String lastName, String id, String city, String group, double scholarship) {
        super(firstName, lastName, id, city);
        this.group = group;
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }

    @Override
    public boolean getGender(Person person) {
        return super.getGender(person);
    }
}
