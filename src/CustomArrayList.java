package Lesson13;

import java.util.Arrays;

public class CustomArrayList<T>{
    private T[] array = (T[]) new Object[0];

    public CustomArrayList() {
    }

    public CustomArrayList(int length) {
        this.array = (T[]) new Object[length];
    }

    public void addToTheEnd(T newElement) {
        T[] buffedArray = (T[]) new Object[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            buffedArray[i] = array[i];
        }

        buffedArray[array.length] = newElement;

        this.array = buffedArray;
    }

    public void addWithIndex(int index, T newElement) {
        T[] buffedArray = (T[]) new Object[array.length + 1];
        T[] outOfScopeArray = (T[]) new Object[index];

        if (index > array.length) {
            for (int i = 0; i < array.length; i++) {
                outOfScopeArray[i] = array[i];
            }
//            System.arraycopy(array, 0, outOfScopeArray, 0, array.length);
            outOfScopeArray[index-1] = newElement;
            this.array = outOfScopeArray;

        } else {
            for (int i = 0; i < array.length; i++) {
                while (index > i) {
                    buffedArray[i] = array[i];
                    break;
                }
                int k = i;
                int j = i-1;
                while (index == i & j < array.length) {
                    buffedArray[k++] = array[j++];
                }
            }
            buffedArray[index] = newElement;
            this.array = buffedArray;
        }
    }

    public void removeWithIndex(int index) {
        T[] buffedArray = (T[]) new Object[array.length - 1];
    }

    public boolean isContain(T object) {
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public int findIndexOfElement(T object) throws Exception {
        try {
            for (int i = 0; i < array.length; i++) {
                if (object.equals(array[i])) {
                    return i;
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("does not contain");
            return -1;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
