import java.util.Random;

public class GeneradorDni {

    protected static String generarDNI() {

        Random dniRandom = new Random();

        int numeroDNI = dniRandom.nextInt(90000000) + 10000000;
        char letra = calcularLetra(numeroDNI);

        return String.valueOf(numeroDNI) + letra;
    }

    protected static char calcularLetra(int numero) {

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numero % 23;
        return letras.charAt(resto);

    }
}
