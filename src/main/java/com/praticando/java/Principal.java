package com.praticando.java;

import org.springframework.boot.SpringApplication;

public class Principal {
    public static void main(String[] args) {

        int quantidadePassos = 500;
        double alturaEmMetros = 1.60;

        String nome = "josé" ;

        int alturaEmCentimetros = 170;
        alturaEmMetros = alturaEmCentimetros / 100
        ;

        System.out.println(alturaEmCentimetros);
    }
}
