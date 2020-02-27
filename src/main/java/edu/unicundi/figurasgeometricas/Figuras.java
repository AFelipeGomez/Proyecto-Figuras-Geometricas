/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 *
 * @author Andres Gomez 
 */
public class Figuras {

    private int lado1;
    private int color;
    private int cordenada1;
    private int cordenada2;
    private int cordenada3;
    private int perimetro;
    private int area;

    public Figuras(int lado1, int color) {
        this.lado1 = lado1;
        this.color = color;

    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setCordenada1(int cordenada1) {
        this.cordenada1 = cordenada1;
    }

    public void setCordenada2(int cordenada2) {
        this.cordenada2 = cordenada2;
    }

    public void setCordenada3(int cordenada3) {
        this.cordenada3 = cordenada3;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getLado1() {
        return lado1;
    }

    public int getColor() {
        return color;
    }

    public int getCordenada1() {
        return cordenada1;
    }

    public int getCordenada2() {
        return cordenada2;
    }

    public int getCordenada3() {
        return cordenada3;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public int getArea() {
        return area;
    }

}
