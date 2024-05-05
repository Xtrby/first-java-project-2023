package org.example;

public class Test {
    public static void main(String[] args) throws Exception {
        Matematik schoolMatematik = new Matematik(100, 4);
        schoolMatematik.name = "Иван";
        schoolMatematik.surname = "?";


        System.out.println("Уровень образования математика: " + schoolMatematik.getEducationLevel());
        System.out.println(schoolMatematik.calculateCircleArea(5));
        System.out.println(schoolMatematik.calculatePrismSurfaceArea(3, 4, 5, 1));
        System.out.println(schoolMatematik.calculateSphereSurfaceArea(5));

    }
}
