package org.java;

public enum Constantes {

    NUMEROS("1234567890"),
    LETRAS_MINUSCULAS("qwertyuiopasdfghjklzxcvbnm"),
    LETRAS_MAYUSCULAS(LETRAS_MINUSCULAS.contenido.toUpperCase()),
    CARACTERES("!@#$%^&*()_+{}[]");

    private String contenido;

    private Constantes(String contenido){
        this.contenido = contenido;
    }

}
