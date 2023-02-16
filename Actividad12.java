package Actividades;
import java.util.Scanner;

public class Actividad12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce una cantidad en euros: ");
        double cantidad = input.nextDouble();
        int[] billetes = {500, 200, 100, 50, 20, 10, 5}; // tipos de billetes disponibles
        int[] cantidadBilletes = new int[billetes.length]; // para almacenar la cantidad de cada billete
        int cantidadSobrante = (int) Math.round(cantidad * 100); // convertir euros a céntimos

        for (int i = 0; i < billetes.length; i++) {
            cantidadBilletes[i] = cantidadSobrante / (billetes[i] * 100);
            cantidadSobrante = cantidadSobrante % (billetes[i] * 100);
        }

        System.out.println("Número mínimo de billetes:");
        for (int i = 0; i < billetes.length; i++) {
            if (cantidadBilletes[i] > 0) {
                System.out.println(billetes[i] + "€: " + cantidadBilletes[i]);
            }
        }
        System.out.println("Cantidad sobrante: " + cantidadSobrante / 100.0 + "€");
    }
}