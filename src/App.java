import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de personas: ");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine();
        Persona[] personas = new Persona[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("");
            System.out.println("Ingrese Persona:");
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Edad: " );
            int edad = scanner.nextInt();
            scanner.nextLine();

            personas[i] = new Persona(nombre, edad);
        }
    }

    public void sortByEdad(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas.length; j++) {
                if (personas[i].getEdad() > personas[j].getEdad()) {
                    Persona aux = personas[i];
                    personas[i] = personas[j];
                    personas[j] = aux;
                }
            }
        }
    }

    public int busquedaBinaria(int[] personas, int edad) {

        int inicio = 0;
        int fin = personas.length - 1;

        while (inicio <= fin) {

            int medio = inicio + (fin - inicio) / 2; // Ecuacion para encontrar la mitad entera

            if (personas[medio] == edad) {
                // ELEMENTO ENCONTRADO
                return medio;
            }

            if (personas[medio] < edad) {

                inicio = medio + 1; // BUscar en la mitad de la derecha
            } else {

                fin = medio - 1; // Buscar en la mitad de la izquierda
            }
        }

        return -1;
    }
}
