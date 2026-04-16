package com.duoc.Semana6.service;

import com.duoc.Semana6.model.Videojuego;
import com.duoc.Semana6.repository.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository videojuegoRepository;

    public List<Videojuego> obtenerTodosLosVideojuegos() {
        return videojuegoRepository.findAll();
    }

    public Videojuego obtenerVideojuegoPorId(int id) {
        return videojuegoRepository.findById(id);
    }

    public List<Videojuego> buscarVideojuegoPorTitulo(String titulo) {
        return videojuegoRepository.findByTitulo(titulo);
    }

    public List<Videojuego> listarVideojuegosPorPlataforma(String plataforma) {
        return videojuegoRepository.findByPlataforma(plataforma);
    }
}