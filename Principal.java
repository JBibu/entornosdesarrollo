import java.time.LocalDate; // import the LocalDate class

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        fechayhora();
    }

    public static void fechayhora () {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
    }
}