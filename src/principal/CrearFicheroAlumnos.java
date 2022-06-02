package principal;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CrearFicheroAlumnos {
    public Scanner s = new Scanner(System.in);
    boolean creaFichero(String ruta, String nombre){
        boolean crear=true;
        try {
            System.out.println("Escriba la ruta");
            ruta = s.next();
            nombre= "Alumnos.dat";
            File file =new File(ruta, nombre);
            if (file.exists()){
                throw new Exception("Error");
            }
            else RandomAccessFile archivo = new RandomAccessFile(nombre, "rw");
        }catch (Exception e){
            System.out.println("El fichero ya existe");
        }
        return crear;
    }
}
