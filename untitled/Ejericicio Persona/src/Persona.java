
public class Persona {

    private final Sexo SEXO_DEFECTO = Sexo.HOMBRE;

    private String nombre = "";
    private int edad = 0;
    private Sexo sexo = SEXO_DEFECTO;
    private double peso = 0.0;
    private double altura = 0.0;

    private String dNI;
    private PesoIdeal pesoIdeal;


    public Persona() {
        this.dNI = GeneradorDni.generarDNI();
        this.sexo = SEXO_DEFECTO;
    }

    public Persona(String nombre, int edad, char sexoChar) {

        this.nombre = nombre;
        this.edad = edad;
        this.dNI = GeneradorDni.generarDNI();
        comprobarSexo(sexoChar);
    }

    public Persona(String nombre, int edad, double peso,
                   double altura, char sexoChar) {

        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.dNI = GeneradorDni.generarDNI();
        comprobarSexo(sexoChar);

    }

    // Métodos especiales.

    public int calcularIMC() {

        double imc = (this.peso / (this.altura * this.altura) );

        if (imc > 0 && imc < 20 ) {
            this.pesoIdeal = PesoIdeal.PESO_IDEAL;
            return -1;
        }

        else if (imc  >= 20 && imc <= 25) {
            this.pesoIdeal = PesoIdeal.BAJO_PESO;
            return 0;
        }

        else {
            this.pesoIdeal = PesoIdeal.SOBRE_PESO;
            return 1;
        }
    }

    public boolean esMayorEdad() {

        return this.edad >= 18;

    }

    private void comprobarSexo(char sexoChar) {

        if ( sexoChar == 'M' ) {
            this.sexo = Sexo.MUJER;
        }
        else {
            this.sexo = SEXO_DEFECTO;
        }
    }

    // Setters.

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

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método toString.

    public String toString() {

        return "Nombre: " + this.nombre + ". \n" +
                "Edad: " + this.edad + ". \n" +
                "Sexo: " + this.sexo + ". \n" +
                "DNI: " + this.dNI + ". \n" +
                "Peso: " + this.peso + ". \n" +
                "Altura: " + this.altura + ". \n"
        ;
    }
}
