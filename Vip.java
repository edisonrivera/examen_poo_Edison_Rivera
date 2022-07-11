package Examen;

public class Vip extends Usuario{
    private final int maxRetiro = 1000;
    private int totalCuenta = 1000000;
    public Vip(String userName, String userLastN, String numberPhone, String direction, String password) {
        super(userName, userLastN, numberPhone, direction, password);
    }

    public int getMaxRetiro() {
        return maxRetiro;
    }

    public int getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(int totalCuenta) {
        this.totalCuenta = totalCuenta;
    }
}
