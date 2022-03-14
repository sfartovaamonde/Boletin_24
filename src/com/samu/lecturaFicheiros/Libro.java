package com.samu.lecturaFicheiros;

import java.util.Objects;
public class Libro implements Comparable {

    private String título;
    private String autor;
    private String ISBN;
    private float prezo;
    private int unidades;

    @Override
    public int compareTo(Object o) {
        return this.getTitulo().compareTo(((Libro) o).getTitulo());
    }

    @Override
    public String toString() {
        return "titulo=" + título + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", unidades=" + unidades;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return true;
    }

    public String getTitulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
