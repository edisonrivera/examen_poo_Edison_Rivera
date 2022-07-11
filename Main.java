package Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Esquema esquema = new Esquema();
        fillUsers fillUs = new fillUsers();
        ArrayList<Usuario> usuarioFinales = fillUs.fillU();
        boolean band = true;
        while (band){
            System.out.print("Nombre de Usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.print("Contrasenia Usuario: ");
            String password = scanner.nextLine();
            for (int index =0; index<usuarioFinales.size();index++){
                if(usuarioFinales.get(index).getPassword().equals(password) & usuarioFinales.get(index).getUserName().equals(nombreUsuario)){
                    System.out.println("ACCESO LOGRADO");
                    esquema.setNombreUsuario(nombreUsuario);
                    esquema.menu();
                    band = false;
                    break;
                }
            }
        }
    }
}