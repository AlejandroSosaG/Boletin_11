package principal;

public class Alumno {
    int matricula;
    StringBuffer nombre, apellidos;
    int[] notas= new int[4];
    double notaMedia;

    public Alumno(int matricula, StringBuffer nombre, StringBuffer apellidos, int[] notas) {
        this.matricula = matricula;
        this.nombre = acotarTamaño(nombre);
        this.apellidos = acotarTamaño(apellidos);
        this.notas = notas;
        this.notaMedia = calcularMedia(notas);
    }
    public static StringBuffer acotarTamaño(StringBuffer cadena){
        if (cadena.length()>10){
            cadena.delete(20, cadena.length());
        }
        return cadena;
    }
    public static double calcularMedia(int[] notas){
        double media=0;
        for (int i = 0; i < notas.length; i++) {
            media+=notas[i];
        }
        return media/4;
    }

}
