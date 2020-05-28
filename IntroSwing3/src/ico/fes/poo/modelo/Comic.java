/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

/**
 *
 * @author jeshc
 */
public class Comic {
    private int numeroComic;
    private int edicion;
    private String universo;
    private String editorial;
    private String personaje;
    private String titulo;
    private float precio;

    public Comic() {
    }

    public Comic(int numeroComic, int edicion, String universo, String editorial, String personaje, String titulo, float precio) {
        this.numeroComic = numeroComic;
        this.edicion = edicion;
        this.universo = universo;
        this.editorial = editorial;
        this.personaje = personaje;
        this.titulo = titulo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroComic() {
        return numeroComic;
    }

    public void setNumeroComic(int numeroComic) {
        this.numeroComic = numeroComic;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Comic{" + "numeroComic=" + numeroComic + ", edicion=" + edicion + ", universo=" + universo + ", editorial=" + editorial + ", personaje=" + personaje + ", titulo=" + titulo + ", precio=" + precio + '}';
    }
    
    
    
    
}
