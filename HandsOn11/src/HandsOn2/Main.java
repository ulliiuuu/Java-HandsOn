package HandsOn2;

enum AccountType {
    SAVINGS("SA", 0.03),
    CREDIT("CR", 0.00),
    DEPOSIT("DP", 0.05);


    private String code;
    private double interestRate;

    AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

public class Main {
    public static void main(String[] args) {
        for (AccountType type : AccountType.values()) {
            System.out.println("Nama: " + type.name());
            System.out.println("Kode: " + type.getCode());
            System.out.println("Suku Bunga: " +
                    type.getInterestRate());
            System.out.println();
        }
    }
}