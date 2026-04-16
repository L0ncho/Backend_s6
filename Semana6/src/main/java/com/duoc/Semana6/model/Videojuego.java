package com.duoc.Semana6.model;

public class Videojuego {
    private int id;
    private String titulo;
    private int precio;
    private String plataforma;
    private boolean disponibilidad;
    // constructor sin parámetros
    public Videojuego() {
    }
    // constructor con parámetros
    public Videojuego(int id, String titulo, int precio, String plataforma, boolean disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.plataforma = plataforma;
        this.disponibilidad = disponibilidad;
    }
    // getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }
}