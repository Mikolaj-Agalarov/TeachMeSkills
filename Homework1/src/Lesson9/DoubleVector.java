package Lesson9;
import java.util.Vector;
import java.lang.Math;

public class DoubleVector implements Lengthable  {
    private int firstElement;
    private int secondElement;
    private final static Vector vec = new Vector(2);
    private final static String DESCRIPTION = "Это вектор для двумерной системы координат";

    public DoubleVector(int firstElement, int secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public DoubleVector() {
        this.firstElement = (int) (10 * Math.random());
        this.secondElement = (int) (10 * Math.random());
    }

    public void setVector() {
        this.vec.add(firstElement);
        this.vec.add(secondElement);
        System.out.println("Double vector was created: " + vec);
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
        Vector summedDoubleVector = new Vector(2);
        for (int i = 0; i < vec.size(); i++) {
            int a = (((int) vec.get(i)) + ((int) someVector.get(i)));
            summedDoubleVector.add(a);
        }
        return summedDoubleVector;
    }

    @Override
    public Vector difference(Vector someVector) {
        Vector differencedDoubleVector = new Vector(2);
        for (int i = 0; i < vec.size(); i++) {
            int a = (((int) vec.get(i)) - ((int) someVector.get(i)));
            differencedDoubleVector.add(a);
        }
        return differencedDoubleVector;
    }

    @Override
    public Vector scalarProduct(Vector someVector, double angle) {
        Vector scalaredVector = new Vector(2);
        for (int i = 0; i < vec.size(); i++) {
            double a = ((double)(Math.abs((int) vec.get(i))) * Math.abs((int) someVector.get(i))) * Math.cos(angle);
            scalaredVector.add(a);
        }
        return scalaredVector;
    }

    public Vector showVector() {
        return vec;
    }

    public int getA() {
        return firstElement;
    }

    public void setA(int a) {
        this.firstElement = a;
    }

    public int getB() {
        return secondElement;
    }

    public void setB(int b) {
        this.secondElement = b;
    }

    @Override
    public String toString() {
        return "DoubleVector{" +
                "firstElement=" + firstElement +
                ", secondElement=" + secondElement +
                "DESCRIPTION=" + DESCRIPTION +
                '}';
    }
}
