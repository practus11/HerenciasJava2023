package practicapoo;

import java.util.Scanner;

public class PracticaPoo {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Calculadora Calculadora = new Calculadora("enamorado");
        CalculadoraEspecial CalculadoraEspecial = new CalculadoraEspecial("enamorado");
 
        boolean salir = false;
        int opcion;

        do {
            System.out.println("");
            System.out.println("=======================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raiz Cuadrada");
            System.out.println("6. Verificar numero primo");
            System.out.println("7. Seno");
            System.out.println("8. Tangente");
            System.out.println("9. Coseno");
            System.out.println("10. Regla de Tres");
            System.out.println("11. Factorizacion");
            System.out.println("12. Par o impar");
            System.out.println("13. Salir");
            System.out.println("=======================");
            System.out.println("Selecciona una opción");
            System.out.println("=======================");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el primer numero:");
                    double num1 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num2 = sn.nextDouble();
                    System.out.println("El resultado de la suma es = " + Calculadora.sumar(num1, num2));
                }
                case 2 -> {
                    System.out.println("Ingrese el primer numero:");
                    double num3 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num4 = sn.nextDouble();
                    System.out.println("El resultado de la resta es = " + Calculadora.restar(num3, num4));
                }
                case 3 -> {
                    System.out.println("Ingrese el primer numero:");
                    double num5 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num6 = sn.nextDouble();
                    System.out.println("El resultado de la multiplicación es = " + Calculadora.multiplicar(num5, num6));
                }
                case 4 -> {
                    System.out.println("Ingrese el primer numero:");
                    double num7 = sn.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    double num8 = sn.nextDouble();
                    System.out.println("El resultado de la división es = " + Calculadora.dividir(num7, num8));
                }
                case 5 -> {
                    System.out.println("Ingrese el numero:");
                    double numero = sn.nextDouble();
                    System.out.println("El resultado de la raiz cuadrada es = " + Calculadora.raizCuadrada(numero));
                }
                case 6 -> {
                    System.out.println("Ingrese el numero:");
                    int numeroBuscado = sn.nextInt();
                    if (Calculadora.esPrimo(numeroBuscado)) {
                        System.out.println("El numero es primo.");
                    } else {
                        System.out.println("El numero no es primo.");
                    }
                }
                case 7 -> {
                    System.out.println("Ingrese el angulo (en grados):");
                    double angulo1 = sn.nextDouble();
                    System.out.println("El seno del angulo es = " + CalculadoraEspecial.seno(angulo1));
                }
                case 8 -> {
                    System.out.println("Ingrese el angulo (en grados):");
                    double angulo2 = sn.nextDouble();
                    System.out.println("La tangente del angulo es = " + CalculadoraEspecial.tangente(angulo2));
                }
                case 9 -> {
                    System.out.println("Ingrese el angulo (en grados):");
                    double angulo3 = sn.nextDouble();
                    System.out.println("El coseno del angulo es = " + CalculadoraEspecial.coseno(angulo3));
                }
                case 10 -> {
                    System.out.println("Ingrese el valor 1:");
                    double valor1 = sn.nextDouble();
                    System.out.println("Ingrese el valor 2:");
                    double valor2 = sn.nextDouble();
                    System.out.println("Ingrese el valor 3:");
                    double valor3 = sn.nextDouble();
                    System.out.println("El resultado de la regla de tres es = " + CalculadoraEspecial.reglaDeTres(valor1, valor2, valor3));
                }
                case 11 -> {
                    System.out.println("Ingrese el numero:");
                    int numeroFactorizar = sn.nextInt();
                    System.out.println("La factorización del numero es = " + CalculadoraEspecial.factorizacion(numeroFactorizar));
                }
                case 12 -> {
                    System.out.println("Ingrese el numero:");
                    int numeroParImpar = sn.nextInt();
                    if (CalculadoraEspecial.esPar(numeroParImpar)) {
                        System.out.println("El numero es par.");
                    } else {
                        System.out.println("El numero es impar.");
                    }
                }
                case 13 -> salir = true;
                default -> System.out.println("Solo numeros entre 1 y 13");
            }
        } while (!salir);
    }
}
