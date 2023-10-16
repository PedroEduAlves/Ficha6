package org.example;

public class Retangulo {
    public int area(int base, int altura){
        return base * altura;
    }

    public int perimetro(int base, int altura){
        return base + base + altura + altura;
    }
    public boolean isTriangle(int a, int b, int c){

        boolean state = true;

        if((a < b+c) && (b< a+c) && (c<a+b)){
            return state;
        }
        else {
            state = false;
            return state;
        }
    }
}
