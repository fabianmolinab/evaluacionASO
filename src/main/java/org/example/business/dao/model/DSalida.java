package org.example.business.dao.model;

public class DSalida {
    private String textoConvertido;

    public String getTextoConvertido() {
        return textoConvertido;
    }

    public void setTextoConvertido(String textoConvertido) {
        this.textoConvertido = textoConvertido;
    }

    @Override
    public String toString() {
        return "DSalida{" +
                "textoConvertido='" + textoConvertido + '\'' +
                '}';
    }

}
