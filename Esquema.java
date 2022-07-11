package Examen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Esquema {
    private String nombreUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- OPCIONES -----\n1) Retirar\n2) Depositar\n3) Salir\nSeleccione una opcion:");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                int monto = 0;
                boolean band = true;
                while (band){
                    try{
                        System.out.print("Monto a retirar: ");
                        monto = scanner.nextInt();
                        band = false;
                    } catch (Exception e){
                        System.out.println("Datos invalidos");
                        System.out.print("Monto a retirar: ");
                        monto = scanner.nextInt();
                    }
                }

                String guardarTransaccion = getNombreUsuario() + " retiro $" + String.valueOf(monto);
                guardarTransaccionB(guardarTransaccion);
                break;
            case 2:
                band = true;
                int montoD = 0;
                int cuentaB = 0;
                while (band){
                    try{
                        System.out.print("Monto a depositar: ");
                        montoD = scanner.nextInt();
                        System.out.print("Numero cuenta Beneficiario:");
                        cuentaB = scanner.nextInt();
                        band = false;
                    } catch (Exception e){
                        System.out.println("Datos invalidos");
                        System.out.print("Monto a depositar: ");
                        montoD = scanner.nextInt();
                        System.out.print("Numero cuenta Beneficiario:");
                        cuentaB = scanner.nextInt();
                    }
                }
                guardarTransaccion = getNombreUsuario() + " deposito $" + String.valueOf(montoD) + " a la cuenta " + String.valueOf(cuentaB);
                guardarTransaccionB(guardarTransaccion);
                break;
            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("Opcion incorrecta");
        }
    }

    public void guardarTransaccionB(String transaccion){
        try(BufferedWriter wr = new BufferedWriter(new FileWriter("C:\\Users\\PROGRAMACION\\IdeaProjects\\Examen\\src\\Examen\\Transacciones.txt", true))){
            wr.append(transaccion).append("\n");
        } catch (Exception e){
            System.out.println("ERROR");
        }

    }
}