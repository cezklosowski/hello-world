package sda.lekcja05.zadania_d3;

public class Employee extends Person {

    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, int birthYear) {
        super(name, surname);
        if (birthYear >= 1900 && birthYear <= 2020) {
            super.setBirthYear(birthYear);
        } else {
            super.setBirthYear(0);
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void whoAmI(){
        System.out.println("Nazywam się " + getName() + " " + getSurname() + " i zarabiam " + getSalary() + " zł.");
    }




}
