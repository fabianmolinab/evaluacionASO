package org.example.facade.dto;

public class EntradaDtoFacade {
    private String texto;

    public EntradaDtoFacade() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "EntradaDtoFacade{" +
                "texto='" + texto + '\'' +
                '}';
    }
}
