public class Main {
    public static void main(String[] args) {
        // PARTE 1
        // Usando un if, crear una condición que compare si la variable numeroIf es positivo,
        // negativo, o 0.
        // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        System.out.println("PARTE 1");
        int numeroIf = 10;
        typeNumber(numeroIf);

        // PARTE 2
        // Crea un bucle While, este bucle tendrá que tener como condición que la variable
        // numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //      Incrementar el valor de la variable en uno cada vez que se ejecute.
        //      Mostrarlo por pantalla cada vez que se ejecute.
        System.out.println("---------------------------------------------------------");
        System.out.println("PARTE 2");
        int numeroWhile = 0;
        while (numeroWhile < 3)
        {
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }

        // PARTE 3
        // Para el bucle Do While, deberás crear la misma estructura que en el While,
        // pero solo se debe ejecutar una vez.
        System.out.println("---------------------------------------------------------");
        System.out.println("PARTE 3");
        int numeroDoWhile = 1;
        do {
            System.out.println("numeroDoWhile = " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 1);

        // PARTE 4
        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
        // y su condición será que la variable sea igual o menor que 3, se irá incrementando
        // en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        System.out.println("---------------------------------------------------------");
        System.out.println("PARTE 4");
        int numeroFor = 0;
        for (int i = 0; i <= 3; i++)
        {
            System.out.println("numeroFor = " + i);
        }

        // PARTE 5
        // Por último, para el Switch, deberás crear la variable estacion, y distintos case
        // para las cuatro estaciones del año. Dependiendo del valor de la variable estacion
        // se deberá mandar un mensaje por consola informando de la estación en la que está.
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.
        System.out.println("---------------------------------------------------------");
        System.out.println("PARTE 5");
        String estacion = "Otoño";
        stations(estacion);
    }
    public static void typeNumber(int number) {
        if (number > 0) {
            System.out.println("El numero " + number + " es positivo!!!");
        } else if ((number < 0)) {
            System.out.println("El numero " + number + " es negativo!!!");
        } else {
            System.out.println("El numero es cero!!!");
        }
    }
    public static void stations(String estacion) {
        switch(estacion)
        {
            case "Verano":
                System.out.println("La estacion es: " + estacion);
                break;
            case "Invierno":
                System.out.println("La estacion es: " + estacion);
                break;
            case "Otoño":
                System.out.println("La estacion es: " + estacion);
                break;
            case "Primavera":
                System.out.println("La estacion es: " + estacion);
                break;
            default:
                System.out.println("no coincide");
        }
    }

}
