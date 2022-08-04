package Lesson9;

import java.lang.Math;
import java.util.*;

public class main{

    public static void main(String[] args) {
        // Создание двумерного и трехмерного векторов
        DoubleVector firstDoubleVector = new DoubleVector(5, -2);
        firstDoubleVector.setVector();

        TripleVector firstTripleVector = new TripleVector(4, 6, 2);
        firstTripleVector.setVector();

        // проверка работоспособности метода, вычисляющего длинну вектора
        double lengthOfDoubleVector = firstDoubleVector.measure();
        System.out.println(lengthOfDoubleVector);

        double lengthOfTripleVector = firstTripleVector.measure();
        System.out.println(lengthOfTripleVector);

        // Проверка метода, вычисляющего сумму векторов
        Vector secondDoubleVector = new Vector(2);
        secondDoubleVector.add(2);
        secondDoubleVector.add(3);

        Vector summedDoubleVector = firstDoubleVector.sum(secondDoubleVector);
        System.out.println("\nFirst double vector is equal to: " + firstDoubleVector.showVector() +
                "\nSecond double vector is equal to " + secondDoubleVector +
                      "\nSum of vectors is: " + summedDoubleVector);

        Vector secondTripleVector = new Vector(3);
        secondTripleVector.add(2);
        secondTripleVector.add(6);
        secondTripleVector.add(-4);

        Vector summedTripleVector = firstTripleVector.sum(secondTripleVector);
        System.out.println("\nFirst double vector is equal to: " + firstTripleVector.showVector() +
                "\nSecond double vector is equal to " + secondTripleVector +
                "\nSum of vectors is: " + summedTripleVector);

        // Проверка метода, вычисляющего разницу векторов
        Vector differencedDoubleVector = firstDoubleVector.difference(summedDoubleVector);
        System.out.println("\nFirst double vector is equal to: " + firstDoubleVector.showVector() +
                "\nSecond double vector is equal to " + summedDoubleVector +
                "\nSum of vectors is: " + differencedDoubleVector);

        Vector differencedTripleVector = firstTripleVector.difference(summedTripleVector);
        System.out.println("\nFirst double vector is equal to: " + firstTripleVector.showVector() +
                "\nSecond double vector is equal to " + summedTripleVector +
                "\nDifference between vectors is: " + differencedTripleVector);

        // Проверка метода,  возвращающего скалярное произведение векторов.
        double angle = 60;

        Vector scalaredDoubleVector = firstDoubleVector.scalarProduct(differencedDoubleVector, angle);
        System.out.println("\nFirst double vector is equal to: " + firstDoubleVector.showVector() +
                "\nSecond double vector is equal to " + differencedDoubleVector +
                "\nAngle is equal to: " + angle +
                "\nScalared product of vectors is: " + scalaredDoubleVector);

        Vector scalaredTripleVector = firstTripleVector.scalarProduct(differencedTripleVector, angle);
        System.out.println("\nFirst double vector is equal to: " + firstTripleVector.showVector() +
                "\nSecond double vector is equal to " + differencedTripleVector +
                "\nAngle is equal to: " + angle +
                "\nScalared product of vectors is: " + scalaredTripleVector);

        // Генерацция массива случайных векторов
        System.out.println("Enter the quantity of double vectors you wish to be in the array: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfVectors = scanner.nextInt();

        DoubleVector[] arrayWithVectors = new DoubleVector[numberOfVectors];
        for (int i = 0; i < numberOfVectors; i++) {
            DoubleVector vector = new DoubleVector();
            arrayWithVectors[i] = vector;
            System.out.println(vector.showVector());
        }




        // Метод сравнения векторов отсутствует: не понял по какому критерию необходимо сравнивать вектора
    }

}
