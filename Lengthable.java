package Lesson9;

import java.util.Vector;

public interface Lengthable {
    public double measure();
    public Vector sum(Vector someVector);
    public Vector difference(Vector someVector);
    public Vector scalarProduct(Vector someVector, double angle);
}
