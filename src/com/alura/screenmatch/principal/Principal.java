package com.alura.screenmatch.principal;
import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var peliculaDeBruno = new Pelicula("Matrix", 1999);
        peliculaDeBruno.setDuracionEnMinutos(180);

        var peliculaDeJuan = new Pelicula("Padrino", 1972);
        peliculaDeJuan.setDuracionEnMinutos(180);

        var peliculaDeAna = new Pelicula("El Señor de los Anillos", 2001);
        peliculaDeAna.setNombre("");
        peliculaDeAna.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(peliculaDeJuan);
        listaDePeliculas.add(peliculaDeAna);

        System.out.println(listaDePeliculas.size());
        System.out.println(listaDePeliculas);

    }
}