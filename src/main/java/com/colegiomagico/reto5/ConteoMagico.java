package com.colegiomagico.reto5;

public class ConteoMagico {

    public static int contar(int limite) {
        int suma = 0;
        int numero = 1;

        while (numero <= limite) {
            System.out.println(numero);
            suma += numero;
            numero++;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Conteo hasta 4:");
        contar(4);
    }
}