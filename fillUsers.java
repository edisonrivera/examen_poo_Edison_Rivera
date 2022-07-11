package Examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class fillUsers {
    public ArrayList<Usuario> fillU(){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try(BufferedReader wr = new BufferedReader(new FileReader("C:\\Users\\PROGRAMACION\\IdeaProjects\\Examen\\src\\Examen\\Users.txt"))){
            String line = wr.readLine();
            if (line != null){
                String[] datosUser = line.split(",");
                usuarios.add(new Normal(datosUser[0],datosUser[1],datosUser[2],datosUser[3], datosUser[4]));
                line = wr.readLine();
                datosUser = line.split(",");
                usuarios.add(new Vip(datosUser[0],datosUser[1],datosUser[2],datosUser[3], datosUser[4]));
                line = wr.readLine();
                datosUser = line.split(",");
                usuarios.add(new Platino(datosUser[0],datosUser[1],datosUser[2],datosUser[3], datosUser[4]));

            }
        } catch (Exception e){
            System.out.println("ERROR");
        }
        return usuarios;
    }
}
