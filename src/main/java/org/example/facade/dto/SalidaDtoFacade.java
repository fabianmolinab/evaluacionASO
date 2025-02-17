package org.example.facade.dto;

public class SalidaDtoFacade {
    private String textoConvertido;

    public String getTextoConvertido() {
        return textoConvertido;
    }

    public void setTextoConvertido(String textoConvertido) {
        this.textoConvertido = textoConvertido;
    }

    @Override
    public String toString() {
        return "SalidaDtoFacade{" +
                "textoConvertido='" + textoConvertido + '\'' +
                '}';
    }
}
