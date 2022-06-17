public class Main {
    public static void main(String[] args) {
        // PARTE 1
        // Crear una clase Persona con las variables edad, nombre y teléfono

        // PARTE 2
        // Una vez creada la clase, crear una nueva clase Cliente que herede de Persona,
        // esta nueva clase tendrá la variable credito solo para esa clase

        // PARTE 3
        // Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
        // el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla
        Customer customer = new Customer();
        customer.name = "Marlon Garcia";
        customer.age = 49;
        customer.phone = "+57-3123315117";
        customer.credit = 10000;

        System.out.println("NOMBRE DEL CLIENTE: " + customer.name);
        System.out.println("EDAD DEL CLIENTE: " + customer.age);
        System.out.println("TELEFONO DEL CLIENTE: " + customer.phone);
        System.out.println("CREDITO DEL CLIENTE: " + customer.credit + "$");

        // PARTE 4
        // Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
        // y con una variable salario que solo tenga la clase Trabajador.
        Employee employee = new Employee();
        employee.name = "Marol Garcia";
        employee.age = 47;
        employee.phone = "+58-7040900";
        employee.salary = 2000;

        System.out.println("--------------------------------------------------");
        System.out.println("NOMBRE DEL TRABAJADOR: " + employee.name);
        System.out.println("EDAD DEL TRABAJADOR: " + employee.age);
        System.out.println("TELEFONO DEL TRABAJADOR: " + employee.phone);
        System.out.println("SALARIO DEL TRABAJADOR: " + employee.salary + "$");
    }
}
class Person {
    String name;
    int age;
    String phone;
}

class Customer extends Person {
    double credit;
}

class Employee extends Person {
    double salary;
}