package Actividades;
import java.util.Scanner;
public class Actividad11 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t;
	    int horas, minutos, segundos;
	    
	    System.out.print("Ingrese el tiempo en segundos: ");
	    t = sc.nextInt();
	    
	    horas = t / 3600;
	    t = t % 3600;
	    
	    minutos = t / 60;
	    segundos = t % 60;
	    
	    System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
	  }

}
