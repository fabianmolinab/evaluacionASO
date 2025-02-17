package org.example.backend;

public class ConvertirTexto {
    public String convertidor(String texto){

        String textoMinusculas = texto.toLowerCase();
        String textoMayusculas = texto.toUpperCase();

        return textoMinusculas + textoMayusculas;
    }
}
