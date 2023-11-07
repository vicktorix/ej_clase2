package org.argentina.programa;

import org.argentina.programa.interfaces.ConvertirStringListAMayusculas;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> listaConFrases = List.of(
                "Lorem ipsum dolor sit amet",
                "consectetur adipiscing elit",
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                "Ut enim ad minim veniam",
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"
        );

        ConvertirStringListAMayusculas conversor = (lista) -> lista.stream().map(String::toUpperCase).collect(Collectors.toList());

        List<String> listasConFrasesEnMayusculas = conversor.convertir(listaConFrases);

        listasConFrasesEnMayusculas.forEach(System.out::println);
    }
}