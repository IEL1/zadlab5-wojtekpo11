/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author student
 */
public class książka {

    private String tytuł;
    private String autor;
    private int liczba_stron;
    private int rok_wydania;
    private double cena;

    public książka(String tytuł, String autor, int liczba_stron, int rok_wydania, double cena) {
        this.tytuł = tytuł;
        this.autor = autor;
        this.liczba_stron = liczba_stron;
        this.rok_wydania = rok_wydania;
        this.cena = cena;
    }

    public String getTytuł() {
        return tytuł;
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczba_stron() {
        return liczba_stron;
    }

    public int getRok_wydania() {
        return rok_wydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}
