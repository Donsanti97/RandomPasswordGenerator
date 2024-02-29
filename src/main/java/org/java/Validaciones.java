package org.java;

import java.util.Scanner;

import static org.java.RandomPass.getRandomPassword;

public class Validaciones {

    public static boolean getLength(Scanner scanner){
        try {
            if (!scanner.hasNextInt()) {
                System.out.println("No ha ingresado un número entero. Por favor, inténtelo de nuevo:");
                scanner.next();
                return getLength(scanner);
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validaRango(int cantidad){
        try {
            var sc = new Scanner(System.in);
            if (cantidad<8 || cantidad>16){
                System.out.print("La longitud de la contraseña debe estar entre 8 y 16. \n Por favor ingrese un valor válido: ");
                getLength(sc);
                cantidad = sc.nextInt();
                return validaRango(cantidad);
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean validarContrasena(String string, int length){
        try {
            if (string.isEmpty()){
                System.out.println("Su contraseña no puede ser generada... Deberá ejecutar de nuevo el proceso");
                Thread.sleep(3000);
                string = getRandomPassword(length);
                return validarContrasena(string, length);
            }
            System.out.println("Su contraseña generada es: " + string);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static String normalizarCadena(String cadena) {
        return java.text.Normalizer.normalize(cadena, java.text.Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
    }

    public static String validaRespuesta(String respuesta){
        Scanner scanner = new Scanner(System.in);
        respuesta = normalizarCadena(respuesta);
        if (!respuesta.equals("si") && !respuesta.equals("no")){
            System.out.println("Su respuesta no es válida por favor ingrese una respuesta válida (si/no)");
            respuesta = scanner.next();
            return validaRespuesta(respuesta);
        }
        return respuesta;
    }
}
