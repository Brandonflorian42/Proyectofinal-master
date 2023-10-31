package edu.umg;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inicioSesionExitoso = false;

        while (!inicioSesionExitoso) {
            System.out.print("Nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contraseña = scanner.nextLine();

            if (validarCredenciales(nombreUsuario, contraseña)) {
                System.out.println("Inicio de sesión exitoso. Bienvenido, " + nombreUsuario);
                inicioSesionExitoso = true;
            } else {
                System.out.println("Inicio de sesión fallido. Usuario o contraseña incorrectos. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }

    // Función para validar las credenciales (simulación)
    private static boolean validarCredenciales(String nombreUsuario, String contraseña) {
        // Aquí puedes agregar tu lógica de autenticación, como una comparación de usuario y contraseña
        // En este ejemplo, simularemos una autenticación exitosa solo si las credenciales coinciden
        return nombreUsuario.equals("Anderson") && contraseña.equals("123");
    }
}
