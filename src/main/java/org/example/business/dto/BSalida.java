package org.example.business.dto;

public class BSalida {
    private String textoConvertido;

    public String getTextoConvertido() {
        return textoConvertido;
    }

    public void setTextoConvertido(String textoConvertido) {
        this.textoConvertido = textoConvertido;
    }

    @Override
    public String toString() {
        return "BSalida{" +
                "textoConvertido='" + textoConvertido + '\'' +
                '}';
    }
}
