package org.example.facade.mapper;

import org.example.business.dto.BEntrada;
import org.example.business.dto.BSalida;
import org.example.facade.dto.EntradaDtoFacade;
import org.example.facade.dto.SalidaDtoFacade;

public interface IMapper {

    BEntrada mapperEntrada(EntradaDtoFacade entrada);
    SalidaDtoFacade mapperSalida(BSalida salida);
}
