public class Main {
    public static void main(String[] args) {
        // PARTE 1
        // 1.- Función que sume  tres parámetros numéricos
        // 2.- LLamada de la función en em Main
        int resultadoSuma;
        resultadoSuma = suma(10, 5, 12);
        System.out.println("La suma es: " + resultadoSuma);

        // PARTE 2
        // 1.- Crear una clase coche.
        // 2.- Dentro de la clase coche, una variable numérica que almacene el
        //     número de puertas que tiene.
        // 3.- Una función que incremente el número de puertas que tiene el coche.
        // 4.- Crear un objeto miCoche en el main y añadirle una puerta.
        // 5.- Mostrar el número de puertas que tiene el objeto.
        Coche miCoche = new Coche();
        miCoche.Doors();
        miCoche.Doors();
        miCoche.Doors();
        System.out.println("El coche tiene " + miCoche.numberDoors + " puertas");
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int numberDoors = 0;

    public void Doors() {
        this.numberDoors++;
    }
}