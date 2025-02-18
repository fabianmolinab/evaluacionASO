package org.example.facade.imp;

import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;
import org.example.business.impl.BConvertidor;
import org.example.facade.FConvertidorTexto;
import org.example.facade.dto.EntradaDtoFacade;
import org.example.facade.dto.SalidaDtoFacade;
import org.example.facade.mapper.impl.Mapper;

public class ConvertidorTexto  implements FConvertidorTexto {

    Mapper mapper = new Mapper();
    BConvertidor bConvertidor = new BConvertidor();
    @Override
    public SalidaDtoFacade convertirTexto(EntradaDtoFacade texto) {

        //Entrada Business
        BEntrada bEntrada = mapper.mapperEntrada(texto);

        //Business Salida

        BSalida bSalida = bConvertidor.convertidorTexto(bEntrada);


        //Maper Salida
         SalidaDtoFacade salidaDtoFacade = mapper.mapperSalida(bSalida);

        return salidaDtoFacade;
    }
}
