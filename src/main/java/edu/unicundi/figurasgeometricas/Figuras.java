/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricas;

/**
 *
 *
 * @author Andres Gomez-Ruby Cardenas
 */
public class Figuras {

    private int coordenada1;
    private int coordenada2;
    private int coordenada3;
    private int perimetro;
    private int area;
    private int color;

    public Figuras(int coordenada1, int coordenada2, int coordenada3, int color) {

        this.color = color;
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
        this.coordenada3 = coordenada3;
        this.color = color;

    }

    public void hallarDistancias() {

    }

    public int getCoordenada1() {
        return coordenada1;
    }

    public int getCoordenada2() {
        return coordenada2;
    }

    public int getCoordenada3() {
        return coordenada3;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public int getArea() {
        return area;
    }

    public int getColor() {
        return color;
    }

    public void setCoordenada1(int coordenada1) {
        this.coordenada1 = coordenada1;
    }

    public void setCoordenada2(int coordenada2) {
        this.coordenada2 = coordenada2;
    }

    public void setCoordenada3(int coordenada3) {
        this.coordenada3 = coordenada3;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
