package com.ceep.test;

import com.ceep.enumeraciones.Dias;

public class TestEnum {

    public static void main(String[] args) {
        System.out.println("Primer dia de la semana: " + Dias.LUNES);
    }

    public static void diasSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("El primer dia de la semana");
                break;
            case MARTES:
                System.out.println("El segundo dia de la semana");
                break;
            default:
                throw new AssertionError();
        }
    }
}
