package org.example;

public class Matematik {
    String name;
    String surname;
    private int speed; // скорость вычисления математиком 1 - 100
    private int educationLevel; // образование 0 - 10

    public Matematik(int speed, int educationLevel) {
        if (speed < 1 || speed > 100) {
            throw new RuntimeException("Скорость должна быть между 1 - 100, введено значение: " + speed);
        } else {
            this.speed = speed;
        }
        if (educationLevel < 0 || educationLevel > 10) {
            throw new RuntimeException("Уровень образования должен быть между 0 - 10, введено значение: " + educationLevel);
        } else {
            this.educationLevel = educationLevel;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getEducationLevel() {
        return educationLevel;
    }


    public double calculateCircleArea(double radius) throws Exception {

        if (educationLevel == 10){
            System.out.println("Не хочу ничего делать.");
            return -1;
        }
        if (educationLevel >= 3) {
            System.out.println("Я начал работать.");
            if (radius <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("Радиус круга не может быть отрицательным");
                return -1;
            }
            Thread.sleep(100_000 / speed);
            return Math.PI * radius * radius;
        } else if (educationLevel == 2) {
            System.out.println("Я только начинаю, могу ошибиться с вероятностью 40% в этом непростом для меня вычислении.");
            if (Math.random() > 0.4) {
                Thread.sleep(200_000 / speed);
                return Math.PI * radius * radius;
            } else {
                Thread.sleep(200_000 / speed);
                return Math.PI * radius * radius / 2;
            }
        } else if (educationLevel == 1) {
            System.out.println("Я только начинаю, могу ошибиться с вероятностью 60% в этом непростом для меня вычислении.");
            if (Math.random() > 0.6) {
                Thread.sleep(200_000 / speed);
                return Math.PI * radius * radius;
            } else {
                Thread.sleep(200_000 / speed);
                return Math.PI * radius * radius / 2;
            }
        }

        else {
            System.out.println("Ничего не могу сделать.");
            return -1;

        }
    }
    public double calculatePrismSurfaceArea(double a, double b, double c, double height) throws Exception {

        if (educationLevel == 10){
            System.out.println("Не хочу ничего делать.");
            return -999_999_999;
        }
        if (educationLevel >= 4) {
            System.out.println("Я начал работать.");
            if (a * b * c * height <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("переданные величины не могут быть отрицательными");
                return -1;
            }
            Thread.sleep(100_000 / speed);
            double semiperimeter = (a + b + c) / 2;
            return 2 * Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)) + 2 * semiperimeter * height;

        }

        else {
            System.out.println("Ничего не могу сделать.");
            return -1;
        }
    }

    public double calculateSphereSurfaceArea(double radius) throws Exception {

        if (educationLevel == 10){
            System.out.println("Не хочу ничего делать.");
            return -1;
        }
        if (educationLevel >= 5) {
            System.out.println("Я начал работать.");
            if (radius <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("переданная величина не может быть отрицательной");
                return -1;
            }
            Thread.sleep(100_000 / speed);
            return 4 * Math.PI * radius * radius;

        }

        else {
            System.out.println("Ничего не могу сделать.");
            return -1;
        }
    }







}
