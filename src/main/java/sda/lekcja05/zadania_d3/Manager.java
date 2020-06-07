package sda.lekcja05.zadania_d3;

public class Manager extends Employee {

    public Manager(Employee employee) {
        super.setName(employee.getName());
        super.setSurname(employee.getSurname());
        super.setSalary(employee.getSalary()+0.1*employee.getSalary());

    }

    @Override
    public void whoAmI(){
        System.out.println("Nazywam się manager " + getName() + " " + getSurname() + " i zarabiam " + getSalary() + " zł.");
    }







}
