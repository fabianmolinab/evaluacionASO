package org.example.facade.mapper.impl;

import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;
import org.example.facade.dto.EntradaDtoFacade;
import org.example.facade.dto.SalidaDtoFacade;
import org.example.facade.mapper.IMapper;

public class Mapper implements IMapper {
    @Override
    public BEntrada mapperEntrada(EntradaDtoFacade entrada) {
        BEntrada bEntrada = new BEntrada();
        bEntrada.setTexto(entrada.getTexto());
        return bEntrada;
    }

    @Override
    public SalidaDtoFacade mapperSalida(BSalida bsalida) {
        SalidaDtoFacade salidaDtoFacade = new SalidaDtoFacade();
        salidaDtoFacade.setTextoConvertido(bsalida.getTextoConvertido());
        return salidaDtoFacade;
    }
}
