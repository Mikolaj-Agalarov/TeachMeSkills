package Lesson14;

@FunctionalInterface
public interface MyFunction<T> {
     T test(int value, T thing);
}
