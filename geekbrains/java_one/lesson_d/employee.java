package ru.geekbrains.java_one.lesson_d;
import java.util.Calendar;
public class employee {
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private float salary;
    private int birthYear;

    employee (String name,
              String secondName,
              String surname,
              String position,
              float salary,
              int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.salary = salary;
    }
    int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    int getSalary() {
        return (int)salary;
    }

    void changeSalary(float difference) {
        this.salary = this.salary + difference;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getSecondName() {
        return secondName;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getPosition() {
        return position;
    }
    String getFullInfo() {
        return  this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " years old, " +
                this.position + ". Salary is " +
                this.getSalary() + " RUR.";
    }
}
