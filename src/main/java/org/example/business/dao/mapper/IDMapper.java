package org.example.business.dao.mapper;

// BUS ENT -> DAO ENTRADA
// DAO SALIDA -> BUS SALIDA

import org.example.business.dao.model.DEntrada;
import org.example.business.dao.model.DSalida;
import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;

public interface IDMapper {
    DEntrada mapperEntrada(BEntrada entrada);
    BSalida mapperSalida(DSalida salida);

}
