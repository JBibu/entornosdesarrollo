import java.time.LocalDate; // import the LocalDate class
import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        fechayhora();
        System.out.print("Ingrese la cantidad de usuarios que desea crear: ");
        int cantidadUsuarios = sc.nextInt();
        sc.nextLine();
        Usuario[] arrayUsuarios = crearArrayUsuarios(cantidadUsuarios);
        imprimirUsuarios(arrayUsuarios);
    }

    public static void fechayhora () {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
    }

    public static Usuario[] crearArrayUsuarios(int cantidadUsuarios) {
        Usuario[] arrayUsuarios = new Usuario[cantidadUsuarios];
        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.print("Ingrese el nombre del usuario " + (i + 1) + ":");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad del usuario " + (i + 1) + ":");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese el email del usuario " + (i + 1) + ":");
            String email = sc.nextLine();
            arrayUsuarios[i] = new Usuario(nombre, edad, email);
        }
        return arrayUsuarios;
    }

    public static void imprimirUsuarios(Usuario[] arrayUsuarios) {
        for (int i = 0; i < arrayUsuarios.length; i++) {
            System.out.println("Usuario " + (i + 1) + ":");
            System.out.println("Nombre: " + arrayUsuarios[i].getNombre());
            System.out.println("Edad: " + arrayUsuarios[i].getEdad());
            System.out.println("Email: " + arrayUsuarios[i].getEmail());
        }
    }
}