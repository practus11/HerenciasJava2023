package practicapoo;

class Calculadora {
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;

    public Calculadora(String propietario) {
        // Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
        // Constructor de la clase
        this.tipoCalculadora = "Calculadora Básica";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "Azul";
        this.nombrePropietario = propietario;
    }

    // Constructor vacio
    public Calculadora() {
    }

    // Área de declaración de métodos
    // En clase hemos dicho "funciones" anteriormente, pero en POO son métodos.
    public double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public double dividir(double primerNumero, double segundoNumero) {
        return primerNumero / segundoNumero;
    }

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public boolean esPrimo(int numeroBuscado) {
        boolean primo = false;
        int contador = 0;
        for (int i = numeroBuscado; i > 0; i--) {
            if (numeroBuscado % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
    
    // Getters y setters para los atributos privados
    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }
}