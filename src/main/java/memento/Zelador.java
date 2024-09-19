/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author talle
 */
public class Zelador {
 private static Zelador instancia;
    private List<Memento> mementos = new ArrayList<>();

    private Zelador() {}

    public static Zelador getInstancia() {
        if (instancia == null) {
            instancia = new Zelador();
        }
        return instancia;
    }

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento getUltimo() {
        if (!mementos.isEmpty()) {
            return mementos.get(mementos.size() - 1);
        }
        return null;
    }    
}
