package Home_Work_3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    protected static int age;

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        Employee.age = age;
    }

    public int compareTo(Employee o) {
        int surNameRes = this.surName.compareTo(o.surName);
        if (surNameRes == 0) {
            int nameRes = this.name.compareTo(o.name);
            if (nameRes == 0) {
                return Integer.compare(Employee.age, Employee.age);
            }
            return nameRes;
        }
        return surNameRes;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    
    
}

