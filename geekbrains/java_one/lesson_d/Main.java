package ru.geekbrains.java_one.lesson_d;

public class Main {private static void increaser(employee[] emp, byte age, float increment){
    for (int i = 0; i < emp.length; i++) {
        if (emp[i].getAge() > age) {
            emp[i].changeSalary(increment);
        }
    }
}

    private static float averageSalary(employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getSalary();
        return result / emp.length;
    }
    private static float averageAge(employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getAge();
        return result / emp.length;
    }

    public static void main(String[] args) {

        employee e = new employee("Leha", "Petrowich",
                "Golovin", "cleaner", 35000, 1945);
        System.out.println("Hello "+e.getName() + " " + e.getSecondName() + " " + e.getSurname() + ".");
        employee[] employees = {e,
                new employee("Yra", "Vladimirovich",
                        "Klopov", "Sales manager", 70000, 1984),
                new employee("Viktor", "Viktorovich",
                        "Viktorov", "Builder", 40000, 1972),
                new employee("Kama", "Pulya",
                        "Kamov", "Foreman", 80000, 1995),
                new employee("Kostya", "Kostyanich",
                        "Jban", "colonel", 150000, 1986)
        };

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40)
                System.out.println(employees[i].getFullInfo());

        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());

        increaser(employees, (byte)45, 5000.0f);

        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());
        System.out.println("--------------------------------------------------------");

        System.out.println("Avg. age: " + averageAge(employees) + " years");
        System.out.println("Avg. salary: " + averageSalary(employees) + " RUR");
    }
}
