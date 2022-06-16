public class Main {
    public static void main(String[] args) {
        // PARTE 1
        // Crear clase persona

        // PARTE 2
        // Crear las variables privadas edad, nombre y teléfono de la clase persona

        // PARTE 3
        // Crear gets y sets de cada propiedad

        // PARTE 4
        // Crear un objeto persona en el main
        Persona persona = new Persona();

        // PARTE 5
        // Usar los gets y sets para dar valores a las propiedades edad, nombre y
        // teléfono y mostrarlos en cónsola
        persona.setName("Marlon Aurelio Garcia Morales");
        System.out.println("NOMBRE: " + persona.getName());
        persona.setAge(49);
        System.out.println("EDAD: " + persona.getAge());
        persona.setPhone("+57-3123315117");
        System.out.println("TELEFONO: " + persona.getPhone());
    }
}
class Persona {
    private String name;
    private int age;

    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

}
