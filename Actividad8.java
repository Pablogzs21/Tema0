package Actividades;
import java.util.Random;
public class Actividad8 {
    public static void main(String[] args) {
        Random random = new Random();
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] consonantes = new char[10];
        boolean esVocal;

        for (int i = 0; i < consonantes.length; i++) {
            consonantes[i] = (char) (random.nextInt(26) + 'a');
        }
        for (int i = 0; i < consonantes.length; i++) {
            esVocal = false;
            for (int j = 0; j < vocales.length; j++) {
                if (consonantes[i] == vocales[j]) {
                    esVocal = true;
                    break;
                }
            }
            System.out.println(consonantes[i] + " es " + (esVocal ? "una vocal" : "una consonante"));
        }
    }
}
