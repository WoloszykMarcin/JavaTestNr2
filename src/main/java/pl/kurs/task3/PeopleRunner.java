package pl.kurs.task3;

public class PeopleRunner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Maciek", "Barman", "12546413", "Sopot", "barman", 4500);
        Employee employee2 = new Employee("Karol", "Olej", "42610552", "Poznan", "sprzedawca", 3500);
        Employee employee3 = new Employee("Matt", "Cross Origin", "52316430", "Charlotte", "FullStack Java Developer", 35000);
        Student student1 = new Student("Ania", "Kowalska", "01298842", "Chorzow", "administracja", 4000);
        Student student2 = new Student("Emily", "Choke", "64215524", "Miami", "art", 8000);
        Student student3 = new Student("Marry", "Stretch", "64215564", "Las Vegas", "Croupier", 9000);
        Student nulltest = null;

        Person[] people = {employee1, employee2, student3, employee3, student1, student2, nulltest};
        getPersonWithTheHighestIncome(people);
        countChosenGenderInArray("female", people);
    }
    public static void getPersonWithTheHighestIncome(Person... people) {
        if (people == null) throw new RuntimeException("Array is Null");
        double max = 0;
        int index = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null && people[i].getIncome() > max) {
                max = people[i].getIncome();
                index = i;
            }
        }
        System.out.println("Person with the highest income: " + people[index].toString());
    }

    public static void countChosenGenderInArray(String gender, Person... people) {
        int counter = 0;
        if (people == null) throw new RuntimeException("Array is Null");
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null && people[i].getGender(people[i]) && gender.equalsIgnoreCase("female")) {
                counter++;
            }
            if (people[i] != null && !people[i].getGender(people[i]) && gender.equalsIgnoreCase("male")) {
                counter++;
            }
        }
        System.out.println("Found " + counter + " " + gender + "'s");
    }
}
