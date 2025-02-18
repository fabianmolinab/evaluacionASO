package org.example.business.impl;

import org.example.business.IBConvertidor;
import org.example.business.dao.impl.DConvertidor;
import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;

public class BConvertidor implements IBConvertidor {

    DConvertidor dConvertidor = new DConvertidor();

    @Override
    public BSalida convertidorTexto(BEntrada bEntrada) {
        //Llamar Dao
        BSalida bSalida = dConvertidor.convertir(bEntrada);

        return bSalida;
    }
}
