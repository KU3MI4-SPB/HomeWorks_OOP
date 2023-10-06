package Home_Work_3;

public class Freelancer extends Employee {
    private double hourlyRate;

    public Freelancer(String surName, String name, double hourlyRate) {
        super(surName, name, 0, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f (руб.)",
                surName, name, calculateSalary());
    }
}