package SESIONA;




public class calculadora {

    public static int Suma(int a, int b) {
        return a + b;
    }

    public static int Resta(int a, int b) {
        return a - b;
    }

    public static int Multiplicacion(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }
}






