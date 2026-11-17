package HandsOn9;

import java.io.*;
import java.util.ArrayList;

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {

    public static void serialize(ArrayList<Employee> employees) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream("emp.ser"))) {

            oos.writeObject(employees);
            System.out.println("Data berhasil disimpan!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void deserialize() {

        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream("emp.ser"))) {

            ArrayList<Employee> employees =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("\nData Employee:");

            for (Employee e : employees) {
                System.out.println(
                        "Nama: " + e.name + ", Umur: " + e.age
                );
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", 30));
        employees.add(new Employee("Aul", 19));
        employees.add(new Employee("Gumi", 19));

        serialize(employees);
        deserialize();
    }
}