package org.example;

import org.example.backend.ConvertirTexto;
import org.example.facade.dto.EntradaDtoFacade;
import org.example.facade.dto.SalidaDtoFacade;
import org.example.facade.imp.ConvertidorTexto;

public class Main {
    public static void main(String[] args) {

        ConvertidorTexto texto = new ConvertidorTexto();
        SalidaDtoFacade salida = texto.convertirTexto(generarEntrada());

        System.out.println(salida);
    }

    public static EntradaDtoFacade generarEntrada(){
        EntradaDtoFacade entrada = new EntradaDtoFacade();
        entrada.setTexto("Fabian");
        return entrada;
    }
}