package com.example.dam_examen_final_pizango;

public class Nota {
    private String id;          // Agregar un campo id
    private String titulo;
    private String contenido;
    private boolean favorita;
    private int color;

    // Constructor con id
    public Nota(String id, String titulo, String contenido, boolean favorita, int color) {
        this.id = id;           //
        this.titulo = titulo;
        this.contenido = contenido;
        this.favorita = favorita;
        this.color = color;
    }

    // Getter y setter para id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Métodos getter y setter para los demás atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
