package HandsOn4;

class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void showTypes() {
        System.out.println(
                first.getClass().getSimpleName() + " & " +
                        second.getClass().getSimpleName()
        );
    }

    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }

    public void display() {
        System.out.println(first + " - " + second);
    }
}

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 =
                new Pair<>(10, "Andi");

        Pair<Double, Boolean> pair2 =
                new Pair<>(3.14, true);

        System.out.println("Pair 1:");
        pair1.display();
        pair1.showTypes();
        System.out.println();

        System.out.println("Setelah swap");
        Pair<String, Integer> swapped1 = pair1.swap();
        swapped1.display();
        System.out.println();

        System.out.println("Pair 2:");
        pair2.display();
        pair2.showTypes();
        System.out.println();

        System.out.println("Setelah swap");
        Pair<Boolean, Double> swapped2 = pair2.swap();
        swapped2.display();
    }
}