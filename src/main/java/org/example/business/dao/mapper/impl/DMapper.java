package org.example.business.dao.mapper.impl;

import org.example.business.dao.mapper.IDMapper;
import org.example.business.dao.model.DEntrada;
import org.example.business.dao.model.DSalida;
import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;

public class DMapper implements IDMapper {
    @Override
    public DEntrada mapperEntrada(BEntrada entrada) {
        DEntrada dEntrada = new DEntrada();
        dEntrada.setTexto(entrada.getTexto());

        return dEntrada;
    }

    @Override
    public BSalida mapperSalida(DSalida salida) {

        BSalida bSalida = new BSalida();
        bSalida.setTextoConvertido(salida.getTextoConvertido());

        return bSalida;
    }
}
