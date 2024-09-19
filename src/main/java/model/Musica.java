/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import memento.Memento;

/**
 *
 * @author talle
 */
public class Musica {
    private String nome;
    private String artista;
    private int ano;

    public Musica(String nome, String artista, int ano) {
        this.nome = nome;
        this.artista = artista;
        this.ano = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Criar um memento com o estado atual
    public Memento criar() {
        return new Memento(nome, artista, ano);
    }

    // Restaurar o estado a partir de um memento
    public void restaurar(Memento memento) {
        this.nome = memento.getNome();
        this.artista = memento.getArtista();
        this.ano = memento.getAno();
        System.out.println("Música restaurada: " + this);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Artista: " + artista + ", Ano: " + ano;
    }    
}
