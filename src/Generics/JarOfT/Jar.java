package Generics.JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar <T> {

    Deque<T> deque = new ArrayDeque<>();

    public void add(T element) {
        deque.offer(element);
    }

    public T remove() {
        return deque.poll();
    }
}
