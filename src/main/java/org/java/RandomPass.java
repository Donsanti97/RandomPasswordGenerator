package org.java;

import java.util.Scanner;

import static org.java.Constantes.*;
import static org.java.Validaciones.validaRespuesta;

public class RandomPass {

    public static String getRandomPassword(int length){
        Scanner sc = new Scanner(System.in);

        StringBuilder totalCaracteres = new StringBuilder();
        StringBuilder randomPassword = new StringBuilder();
        System.out.println("A continuación deberá responder unas preguntas..");
        System.out.println("Su contraseña debe tener mayúsculas?[SI/NO]");
        String answer = sc.next();
        answer = validaRespuesta(answer);

        switchPrincipal :
        switch (answer){
            case "si":
                totalCaracteres.append(LETRAS_MAYUSCULAS);
                System.out.println("Su contraseña debe tener minúsculas?[SI/NO]");
                answer = sc.next();
                answer = validaRespuesta(answer);
                switch (answer){
                    case "si":
                        totalCaracteres.append(LETRAS_MINUSCULAS);
                        System.out.println("Su contraseña debe tener números?[SI/NO]");
                        answer = sc.next();
                        answer = validaRespuesta(answer);
                        switch (answer){
                            case "si":
                                totalCaracteres.append(NUMEROS);
                                System.out.println("Su contraseña debe tener caracteres especiales?[SI/NO]");
                                answer = sc.next();
                                answer = validaRespuesta(answer);
                                switch (answer){
                                    case "si":
                                        totalCaracteres.append(CARACTERES);
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break switchPrincipal;

                                    case "no":
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;
                                    default:
                                        System.out.println("La opción elegida no es válida");

                                }
                                break;
                            case "no":
                                System.out.println("Su contraseña debe tener caracteres especiales?[SI/NO]");
                                answer = sc.next();
                                answer = validaRespuesta(answer);
                                switch (answer){
                                    case "si":
                                        totalCaracteres.append(CARACTERES);
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    case "no":
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;
                                    default:
                                        System.out.println("La opción elegida no es válida");

                                }
                                break;
                            default:
                                System.out.println("La opción elegida no es válida");

                        }
                        break;
                    case "no":
                        System.out.println("Su contraseña debe tener números?");
                        answer = sc.next();
                        answer = validaRespuesta(answer);
                        switch (answer){
                            case "si":
                                totalCaracteres.append(NUMEROS);
                                System.out.println("Su contraseña debe tener caracteres especiales?[SI/NO]");
                                answer = sc.next();
                                answer = validaRespuesta(answer);
                                switch (answer){
                                    case "si":
                                        totalCaracteres.append(CARACTERES);
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    case "no":
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;
                                    default:
                                        System.out.println("La opción elegida no es válida");

                                }
                                break;
                            case "no":
                                System.out.println("Su contraseña debe tener caracteres especiales?[SI/NO]");
                                answer = sc.next();
                                answer = validaRespuesta(answer);
                                switch (answer){
                                    case "si":
                                        totalCaracteres.append(CARACTERES);
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    case "no":
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    default:
                                        System.out.println("La opción elegida no es válida");

                                }
                                break;
                            default:
                                System.out.println("La opción elegida no es válida");

                        }
                        break;
                    default:
                        System.out.println("La opción elegida no es válida");
                }
                break;
            case "no":
                System.out.println("Su contraseña debe tener minúsculas?");
                answer = sc.next();
                answer = validaRespuesta(answer);
                switch (answer){
                    case "si":
                        totalCaracteres.append(LETRAS_MINUSCULAS);
                        System.out.println("Su contraseña debe tener números?");
                        answer = sc.next();
                        answer = validaRespuesta(answer);
                        switch (answer){
                            case "si":
                                totalCaracteres.append(NUMEROS);
                                System.out.println("Su contraseña debe tener caracteres especiales?[SI/NO]");
                                answer = sc.next();
                                answer = validaRespuesta(answer);
                                switch (answer){
                                    case "si":
                                        totalCaracteres.append(CARACTERES);
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    case "no":
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;
                                    default:
                                        System.out.println("La opción elegida no es válida");

                                }
                                break;
                            case "no":
                                System.out.println("Su contraseña debe tener caracteres especiales?[SI/NO]");
                                answer = sc.next();
                                answer = validaRespuesta(answer);
                                switch (answer){
                                    case "si":
                                        totalCaracteres.append(CARACTERES);
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    case "no":
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    default:
                                        System.out.println("La opción elegida no es válida");

                                }
                                break;
                            default:
                                System.out.println("La opción elegida no es válida");
                        }
                        break;
                    case "no":
                        System.out.println("Su contraseña debe tener números?");
                        answer = sc.next();
                        answer = validaRespuesta(answer);
                        switch (answer){
                            case "si":
                                totalCaracteres.append(NUMEROS);
                                System.out.println("Su contraseña debe tener caracteres especiales?[SI/NO]");
                                answer = sc.next();
                                answer = validaRespuesta(answer);
                                switch (answer){
                                    case "si":
                                        totalCaracteres.append(CARACTERES);
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    case "no":
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;
                                    default:
                                        System.out.println("La opción elegida no es válida");

                                }
                                break;
                            case "no":
                                System.out.println("Su contraseña debe tener caracteres especiales?[SI/NO]");
                                answer = sc.next();
                                answer = validaRespuesta(answer);
                                switch (answer){
                                    case "si":
                                        totalCaracteres.append(CARACTERES);
                                        for (int i = 0; i < length; i++) {

                                            int randomNumbers = (int) (Math.random()* totalCaracteres.length());

                                            randomPassword.append((totalCaracteres.toString()).charAt(randomNumbers));
                                        }
                                        //return randomPassword.toString();
                                        break;

                                    case "no":
                                    default:
                                        randomPassword.append("");

                                }
                                break;
                            default:
                                System.out.println("La opción elegida no es válida");

                        }
                        break;
                    default:
                        System.out.println("La opción elegida no es válida");
                }
                break;

            default:
                System.out.println("la opción escrita no es válida");

        }

        return randomPassword.toString();

    }
}
