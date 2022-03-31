package br.com.model;

public class Livros {
    private String titulo;
    private String autor;
    private int ano;

    public Livros( String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setId(int ano) {
        this.ano = ano;
    }

    public String Lista() {
        return "Livros" +
                "\n Titulo: " + titulo +
                "\n Autor: " + autor +
                "\n ano: " + ano + "\n";
    }
}
