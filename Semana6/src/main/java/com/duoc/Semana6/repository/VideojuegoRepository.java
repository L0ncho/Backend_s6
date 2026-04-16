package com.duoc.Semana6.repository;

import com.duoc.Semana6.model.Videojuego;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VideojuegoRepository {
    
    private List<Videojuego> catalogo;

    public VideojuegoRepository() {
        catalogo = new ArrayList<>();
        // Poblando los datos internamente
        catalogo.add(new Videojuego(1, "The Legend of Zelda", 59990, "Nintendo Switch", true));
        catalogo.add(new Videojuego(2, "God of War Ragnarok", 64990, "PlayStation 5", true));
        catalogo.add(new Videojuego(3, "Halo Infinite", 45000, "Xbox Series X", false));
        catalogo.add(new Videojuego(4, "Super Mario Odyssey", 49990, "Nintendo Switch", true));
        catalogo.add(new Videojuego(5, "Elden Ring", 55000, "PlayStation 5", true));
    }

    public List<Videojuego> findAll() {
        return catalogo;
    }

    public Videojuego findById(int id) {
        return catalogo.stream()
                .filter(v -> v.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Videojuego> findByTitulo(String titulo) {
        return catalogo.stream()
                .filter(v -> v.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Videojuego> findByPlataforma(String plataforma) {
        return catalogo.stream()
                .filter(v -> v.getPlataforma().equalsIgnoreCase(plataforma))
                .collect(Collectors.toList());
    }
}