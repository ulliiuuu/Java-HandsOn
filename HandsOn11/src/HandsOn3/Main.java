package HandsOn3;
class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        System.out.println("Tipe: " +
                data.getClass().getSimpleName());
    }
}

public class Main {
    public static void main(String[] args) {
        Cell<Integer> angka = new Cell<>();
        angka.setValue(100);

        Cell<String> teks = new Cell<>();
        teks.setValue("Hello Java");

        System.out.println(angka.getValue());
        angka.displayType();

        System.out.println(teks.getValue());
        teks.displayType();
    }
}