    package practicapoo;

/**
 *
 * @author enamo
 */
class CalculadoraEspecial extends PracticaPoo {
    public CalculadoraEspecial(String propietario) {
        
    }

    public double seno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }

    public double tangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }

    public double coseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public double reglaDeTres(double a, double b, double c) {
        return (c * b) / a;
    }

    public String factorizacion(int n) {
        StringBuilder factors = new StringBuilder();
        int divisor = 2;
        while (n > 1) {
            if (n % divisor == 0) {
                factors.append(divisor).append(" ");
                n /= divisor;
            } else {
                divisor++;
            }
        }
        return factors.toString();
    }

    public boolean esPar(int a) {
        return a % 2 == 0;
    }
}



