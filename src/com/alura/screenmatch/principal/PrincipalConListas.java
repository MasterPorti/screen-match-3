package com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

public class PrincipalConListas {
    public static void main(String[] args) {
        var peliculaEncantada = new Pelicula("Encantada", 2007);
        peliculaEncantada.evalua(8);
        var peliculaMatrix = new Pelicula("Matrix", 1999);
        peliculaMatrix.evalua(9);
        var peliculaPadrino = new Pelicula("Padrino", 1972);
        peliculaPadrino.evalua(10);

        var serieLost = new Serie("Lost", 2004);
        serieLost.evalua(8);
        var serieFriends = new Serie("Friends", 1994);
        serieFriends.evalua(9);
        var serieBreakingBad = new Serie("Breaking Bad", 2008);
        serieBreakingBad.evalua(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaEncantada);
        lista.add(peliculaMatrix);
        lista.add(peliculaPadrino);
        lista.add(serieLost);
        lista.add(serieFriends);
        lista.add(serieBreakingBad);
        for (Titulo titulo : lista) {
            System.out.println(titulo);
            if (titulo instanceof Pelicula pelicula) {
                System.out.println("Clasificación: " + pelicula.getClasificacion());
            }
        }
        ArrayList<String> listaArtista = new ArrayList<>();
        listaArtista.add("Bruno");
        listaArtista.add("Juan");
        listaArtista.add("Ana");

        Collections.sort(listaArtista);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);


        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

    }
}
