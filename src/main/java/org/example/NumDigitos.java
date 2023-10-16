package org.example;

public class NumDigitos {

    public int verDigitos(int num){
        int n = num;
        String s = Integer.toString(n);
        int digitos = s.length();
        return digitos;
    }
}
