/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.musicamemento;

import memento.Zelador;
import model.Musica;

/**
 *
 * @author talle
 */
public class Principal {

    public static void main(String[] args) {
        Musica musica = new Musica("Smells Like Teen Spirit", "Nirvana", 1991);
        System.out.println("Estado inicial: " + musica);

        // Salva o estado inicial
        Zelador.getInstancia().add(musica.criar());

        // Altera o ano
        musica.setAno(1993);
        System.out.println("Estado alterado: " + musica);

        // Ctrl+Z (restaurar)
        musica.restaurar(Zelador.getInstancia().getUltimo());
    }
}
