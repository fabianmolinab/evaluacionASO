package org.example.business.dao.impl;

import org.example.backend.ConvertirTexto;
import org.example.business.dao.IDConvertidor;
import org.example.business.dao.mapper.impl.DMapper;
import org.example.business.dao.model.DEntrada;
import org.example.business.dao.model.DSalida;
import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;

public class DConvertidor implements IDConvertidor {

    DMapper dMapper = new DMapper();
    ConvertirTexto convertirTexto = new ConvertirTexto();

    @Override
    public BSalida convertir(BEntrada bentrada) {

        //Entrada
        DEntrada dEntrada = dMapper.mapperEntrada(bentrada);
        //Backend
        DSalida dSalida =  convertirTexto.convertidor(dEntrada);

        BSalida bsalida = dMapper.mapperSalida(dSalida);

        return bsalida;
    }
}
