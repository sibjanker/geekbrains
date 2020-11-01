package ru.geekbrains.java_one.lesson_d.home;

import java.util.Calendar;

public class Employee {
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private float salary;
    private int birthYear;
//    private static int id = 0;
//    public int uid;
//
//    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;
//    Employee (String name,
//                    String secondName,
//                    String surname,
//                    String phone,
//                    String position,
//                    float salary,
//                    int birthYear) {
//        this.birthYear = birthYear;
//        this.name = name;
//        this.surname = surname;
//        this.secondName = secondName;
//        this.position = position;
//        this.phone = phone;
//        this.salary = salary;
//        this.uid = ++id;
//    }

    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;
    Employee (String name,
              String secondName,
              String surname,
              String phone,
              String position,
              float salary,
              int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
      }

    // 3.	Внутри класса «Сотрудник» написать методы, которые возвращают
    // значение каждого поля;
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

    String getPhone() {
        return phone;
    }

    String getFullInfo() {
        return  this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " years old, " +
                this.position + ". Phone number: " +
                this.phone + ". Salary is " +
                this.getSalary() + " RUR.";
    }
}
