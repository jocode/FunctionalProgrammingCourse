package org.example.functional_interface;

@FunctionalInterface
public interface Comparator<T> {
    int compare(T object1, T object2);

    boolean equals(Object object);
}
