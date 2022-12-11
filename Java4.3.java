package ru.mirea.lab4;

public class Task3 {
    public class Employer {
        private String firstName;
        private String lastName;
        private double income;

        public double getIncome() {
            return income;
        }
    }

    public class Manager extends Employer{
        private double averageSum;

        @Override
        public double getIncome() {
            return super.getIncome() + averageSum*12;
        }
    }
}
