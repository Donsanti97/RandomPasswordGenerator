package org.java;

import java.util.Scanner;

import static org.java.RandomPass.getRandomPassword;
import static org.java.Validaciones.*;

public class Start {
    public static void start(){
        System.out.print("""
                                                        Bienvenido!!
                Para generar su contraseña aleatoria por favor ingrese la longitud que desea para su contraseña.
                                Para esto debe ingresar un número entero entre 8 y 16.
                Ingrese longitud: """);
        try {
            var sc = new Scanner(System.in);
            int length = 0;
            String randomPassword = "";


            //validaciones en una clase aparte
            getLength(sc);
            length  = sc.nextInt();
            validaRango(length);
            randomPassword = getRandomPassword(length);
            validarContrasena(randomPassword, length);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
