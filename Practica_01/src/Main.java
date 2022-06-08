public class Main {
    public static void main(String[] args) {
        int resultadoSuma;
        int resultadoResta;

        resultadoSuma = suma(10, 5);
        System.out.println("La suma es: " + resultadoSuma);

        resultadoResta = resta(10, 5);
        System.out.println("La resta es: " + resultadoResta);
    }
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }
}