package HandsOn1;

enum AccountType {
    SAVINGS("Tabungan"),
    CREDIT("Kredit"),
    DEPOSIT("Deposito");

    private String description;

    AccountType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        for (AccountType type : AccountType.values()) {
            System.out.println(type.name() + ": " + type);
        }
    }
}