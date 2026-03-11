import static javax.management.Query.not;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private double peso;
    private double altura;

    private PesoIdeal pesoIdeal; ;


    public Persona() {}

    public Persona(String nombre, int edad, Sexo sexo) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = Sexo.HOMBRE;
    }

    public Persona(String nombre, int edad, Sexo sexo,
                   double peso, double altura, String DNI, PesoIdeal pesoIdeal) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = Sexo.HOMBRE;
        this.peso = peso;
        this.altura = altura;
        this.DNI = DNI;
        this.pesoIdeal = pesoIdeal;

    }

    public int calcularIMC() {

    }

    public boolean esMayorEdad() {

        return this.edad >= 18;

    }

    private void comprobarSexo(Sexo sexo) {

        if (sexo != SEXO.HOMBRE || sexo != Sexo.MUJER ) {
            this.sexo = Sexo.HOMBRE;
        }
    }

    private String generarDNI() {

    }

    public int generarNumeroDNI() {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad( int edad) {
        this.edad = edad;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double Altura) {
        this.altura = altura;
    }
}
