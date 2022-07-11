package Examen;

public class Normal extends Usuario {
    private final int maxRetirar = 3000;
    private int totalCuenta = 10000;
    public Normal(String userName, String userLastN, String numberPhone, String direction, String password) {
        super(userName, userLastN, numberPhone, direction, password);
    }

    public int getMaxRetirar() {
        return maxRetirar;
    }

    public int getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(int totalCuenta) {
        this.totalCuenta = totalCuenta;
    }
}
