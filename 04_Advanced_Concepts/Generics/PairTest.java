//Problem 2: Generic Pair

package Generics;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> person = new Pair<>("Shaheer", 20);
        System.out.println(person.getKey() + " is " + person.getValue() + " years old.");

        Pair<Integer, String> product = new Pair<>(101, "Laptop");
        System.out.println("Product ID: " + product.getKey() + ", Name: " + product.getValue());
    }
}
