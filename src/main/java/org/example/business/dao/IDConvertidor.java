package org.example.business.dao;

import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;

public interface IDConvertidor {
    BSalida convertir(BEntrada bentrada);
}
