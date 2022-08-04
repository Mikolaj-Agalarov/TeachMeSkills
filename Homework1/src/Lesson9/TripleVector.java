package Lesson9;

import java.util.Vector;

public class TripleVector implements Lengthable {
    private int firstElement;
    private int secondElement;
    private int thirdElement;
    private final static Vector vec = new Vector(3);
    private final static String DESCRIPTION = "Это вектор для трехмерной системы координат";

    public TripleVector(int firstElement, int secondElement, int thirdElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.thirdElement = thirdElement;
    }

    public void setVector() {
        this.vec.add(firstElement);
        this.vec.add(secondElement);
        this.vec.add(thirdElement);
        System.out.println("Triple vector was created: " + vec);
    }
    @Override
    public double measure() {
        int sum = 0;
        for (int i = 0; i < vec.size(); i++) {
            sum += (((int) vec.get(i)) * ((int) vec.get(i)));
        }
        double length = Math.sqrt(sum);
        return length;
    }

    @Override
    public Vector sum(Vector someVector) {
        Vector summedTripleVector = new Vector(3);
        for (int i = 0; i < vec.size(); i++) {
            int a = (((int) vec.get(i)) + ((int) someVector.get(i)));
            summedTripleVector.add(a);
        }
        return summedTripleVector;
    }

    @Override
    public Vector difference(Vector someVector) {
        Vector differencedTripleVector = new Vector(3);
        for (int i = 0; i < vec.size(); i++) {
            int a = (((int) vec.get(i)) - ((int) someVector.get(i)));
            differencedTripleVector.add(a);
        }
        return differencedTripleVector;
    }

    @Override
    public Vector scalarProduct(Vector someVector, double angle) {
        Vector scalaredVector = new Vector(3);
        for (int i = 0; i < vec.size(); i++) {
            double a = ((double)(Math.abs((int) vec.get(i))) * Math.abs((int) someVector.get(i))) * Math.cos(angle);
            scalaredVector.add(a);
        }
        return scalaredVector;
    }
    public Vector showVector() {
        return vec;
    }

    public int getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(int firstElement) {
        this.firstElement = firstElement;
    }

    public int getSecondElement() {
        return secondElement;
    }

    public void setSecondElement(int secondElement) {
        this.secondElement = secondElement;
    }

    public int getThirdElement() {
        return thirdElement;
    }

    public void setThirdElement(int thirdElement) {
        this.thirdElement = thirdElement;
    }

    @Override
    public String toString() {
        return "TripleVector{" +
                "firstElement=" + firstElement +
                ", secondElement=" + secondElement +
                ", thirdElement=" + thirdElement +
                "DESCRIPTION=" + DESCRIPTION +
                '}';
    }
}
