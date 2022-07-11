package Examen;

public class Platino extends Usuario{
    private final int maxMoney = 15000;
    private int totalCuenta = 500000;
    public Platino(String userName, String userLastN, String numberPhone, String direction, String password) {
        super(userName, userLastN, numberPhone, direction, password);
    }

    public int getMaxMoney() {
        return maxMoney;
    }

    public int getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(int totalCuenta) {
        this.totalCuenta = totalCuenta;
    }
}
