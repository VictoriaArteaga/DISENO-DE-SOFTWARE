import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner persona = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = persona.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = persona.nextInt();

        System.out.println("Ingrese su sexo: ");
        char sexo = persona.next().charAt(0);

        System.out.println("Ingrese su peso: ");
        double peso = persona.nextDouble();

        System.out.println("Ingrese su altura: ");
        double altura = persona.nextDouble();

        Persona persona1 = new Persona(nombre,
                edad, peso, altura, sexo );

        Persona persona2 = new Persona(nombre,
                edad, sexo );

        Persona persona3 = new Persona();

        System.out.println("Persona 1, peso ideal: " + persona1.calcularIMC());
        System.out.println("Persona 2, peso ideal: " + persona2.calcularIMC());
        System.out.println("Persona 3, peso ideal: " + persona3.calcularIMC());

        System.out.println("Persona 1, ¿Es mayor de edad?: " + persona1.esMayorEdad());
        System.out.println("Persona 2, ¿Es mayor de edad?: " + persona2.esMayorEdad());
        System.out.println("Persona 3, ¿Es mayor de edad?: " + persona3.esMayorEdad());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }
}