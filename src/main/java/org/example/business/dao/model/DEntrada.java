package org.example.business.dao.model;

public class DEntrada {
    private  String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "DEntrada{" +
                "texto='" + texto + '\'' +
                '}';
    }
}