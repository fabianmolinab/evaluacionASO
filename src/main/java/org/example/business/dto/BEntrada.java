package org.example.business.dto;

public class BEntrada {
    private String texto;

    public BEntrada() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "BEntrada{" +
                "texto='" + texto + '\'' +
                '}';
    }
}
