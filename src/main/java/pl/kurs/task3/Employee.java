package pl.kurs.task3;

public class Employee extends Person{
    private String position;
    private double monthSalary;

    public Employee(String firstName, String lastName, String id, String city, String position, double monthSalary) {
        super(firstName, lastName, id, city);
        this.position = position;
        this.monthSalary = monthSalary;
    }

    @Override
    public double getIncome() {
        return monthSalary;
    }

    @Override
    public boolean getGender(Person person) {
        return super.getGender(person);
    }
}
