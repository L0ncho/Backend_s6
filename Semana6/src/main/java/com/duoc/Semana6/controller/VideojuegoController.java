package com.duoc.Semana6.controller;

import com.duoc.Semana6.model.Videojuego;   
import com.duoc.Semana6.service.VideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {

    @Autowired
    private VideojuegoService videojuegoService;
    // ListarVideojuegos GET api/videojuegos
    @GetMapping
    public List<Videojuego> ListarVideojuegos() {
        return videojuegoService.obtenerTodosLosVideojuegos();
    }
    //BuscarVideojuego Get api/videojuegos/{ID}
    @GetMapping("/{id}")
    public Videojuego BuscarVideojuego(@PathVariable int id) {
        return videojuegoService.obtenerVideojuegoPorId(id);
    }
    // BuscarVideojuegoPorTitulo GET api/videojuegos/titulo/{titulo}
    @GetMapping("/titulo/{titulo}")
    public List<Videojuego> BuscarVideojuegoPorTitulo(@PathVariable String titulo) {
        return videojuegoService.buscarVideojuegoPorTitulo(titulo);
    }
    //ListarVideoJuegoPorPlataforma GET api/videojuegos/plataforma/{plataforma}
    @GetMapping("/plataforma/{plataforma}")
    public List<Videojuego> ListarVideojuegosPorPlataforma(@PathVariable String plataforma) {
        return videojuegoService.listarVideojuegosPorPlataforma(plataforma);
    }


}
