package org.example.business;

import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;

public interface IBConvertidor {


    BSalida convertidorTexto(BEntrada bEntrada);
}
