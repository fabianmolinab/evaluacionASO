package org.example.backend;

import org.example.business.dao.model.DEntrada;
import org.example.business.dao.model.DSalida;

public class ConvertirTexto {
    protected String textoConvertido;

    public DSalida convertidor(DEntrada entrada) {

        //Logica
        String textoMinusculas = entrada.getTexto().toLowerCase();
        String textoMayusculas = entrada.getTexto().toUpperCase();
        this.textoConvertido = textoMinusculas + textoMayusculas;

        DSalida dsalida = new DSalida();
        dsalida.setTextoConvertido(this.textoConvertido);

        return dsalida;
    }
}
