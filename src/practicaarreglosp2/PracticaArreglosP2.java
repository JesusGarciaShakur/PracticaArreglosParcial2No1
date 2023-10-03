/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaarreglosp2;

/**
 * @author jesus
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PracticaArreglosP2 {
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static double[] leerCalificaciones(int n) throws IOException {
        double[] califs = new double[n];
        System.out.println("Escriba calificaciones");
        System.out.println("-------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Escriba la calificacion del alumno con el id: " + i + "");
            entrada = bufer.readLine();
            califs[i] = Double.parseDouble(entrada);
        }
        return califs;
    }

    public static double calcularPromedioGrupo(double[] proms) {
        double suma = 0;
        for (double prom : proms)
            suma = suma + prom;

        return (suma / proms.length);
    }

    public static double calcularPromedioTotal(double[] promt) {
        double total = 0;
        for (double prom : promt)
            total = total + prom;

        return (total / promt.length);
    }
    //calificaciones1 
    public static void imprimirCalificaciones(double[] califs) {
        int i = 0;
        System.out.println("Los promedios del alumno son: ");
        System.out.println("IdAlumno    Promedio Individual");
        System.out.println("--------------------------------");
        for (double calif : califs) {
            System.out.println("  " + i + "             " + calif);
            i++;
        }
    }

    public static void main(String[] args) throws IOException {
        // Declaración de variables
        int t;
        double[] promediosGrupos = new double[5]; // Arreglo para almacenar los promedios de los grupos
        double[] calificaciones;

        // Encontrar el promedio de cada grupo
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Escribe el tamaño del grupo " + (i + 1) + ": ");
            System.out.println("-------------------------------");
            entrada = bufer.readLine();
            t = Integer.parseInt(entrada);
            calificaciones = leerCalificaciones(t);
            System.out.println();
            imprimirCalificaciones(calificaciones);
            promediosGrupos[i] = calcularPromedioGrupo(calificaciones);
            System.out.println("El promedio del grupo " + (i + 1) + " es: " + promediosGrupos[i]);
        }
        // Calcular el promedio total de los grupos
        double promedioTotalGrupos = calcularPromedioGrupo(promediosGrupos);

        // Imprimir el promedio total de los grupos
        System.out.println("El promedio total de los grupos es: " + promedioTotalGrupos);
    }
}
