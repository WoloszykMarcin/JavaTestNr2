package pl.kurs.task3;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private String city;

    public Person(String firstName, String lastName, String id, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = id;
        this.city = city;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public abstract double getIncome();

    public boolean getGender(Person person) {
        boolean isFemale = true;

        int i = ((Integer.valueOf(person.getIdNumber()) / 10 % 10));

        if (i % 2 == 1) {
            isFemale = false;
        } else if (i % 2 == 0) {
            isFemale = true;
        }

        return isFemale;
    }
}
