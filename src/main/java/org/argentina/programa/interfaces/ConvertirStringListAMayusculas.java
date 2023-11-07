package org.argentina.programa.interfaces;

import java.util.List;

@FunctionalInterface
public interface ConvertirStringListAMayusculas {
    List<String> convertir(List<String> frases);
}
