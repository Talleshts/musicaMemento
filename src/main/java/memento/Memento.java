/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author talle
 */
public class Memento {
    private String nome;
    private String artista;
    private int ano;

    public Memento(String nome, String artista, int ano) {
        this.nome = nome;
        this.artista = artista;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public int getAno() {
        return ano;
    }
}
