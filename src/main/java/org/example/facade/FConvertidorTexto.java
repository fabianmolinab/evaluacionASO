package org.example.facade;

import org.example.facade.dto.EntradaDtoFacade;
import org.example.facade.dto.SalidaDtoFacade;

public interface FConvertidorTexto {

    SalidaDtoFacade convertirTexto(EntradaDtoFacade texto);
}
