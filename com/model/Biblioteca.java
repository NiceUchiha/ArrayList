package br.com.model;

import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private int id;
    private ArrayList<Livros> livro;


    public Biblioteca(String nome, int id) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livros> getLivro() {
        return livro;
    }

    public void setLivro(ArrayList<Livros> livro) {
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String Lista(){
        String saida = "Biblioteca " + id +
                "\n nome: " + nome +
                "\n\n";

        for (int i = 0; i< livro.size(); i++){
            saida += livro.get(i).Lista() +"\n";
        }

        return  saida;
    }
}