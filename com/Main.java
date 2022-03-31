package br.com;

import br.com.model.Biblioteca;
import br.com.model.Livros;

import java.util.ArrayList;

public class Main {

    public static void main (String args[]) {

        Biblioteca biblioteca1 = new Biblioteca("Livraria ler +", 1);
        Biblioteca biblioteca2 = new Biblioteca("livraria ler é melhor", 2);

        ArrayList<Livros> livrosBiblioteca1 = new ArrayList<>();
        livrosBiblioteca1.add(new Livros("O Pequeno Principe","Antoine de Saint-Exupéry", 1943));
        livrosBiblioteca1.add(new Livros("Do Mil ao Milhão. Sem Cortar o Cafezinho ", "Thiago Nigro", 2018));
        livrosBiblioteca1.add(new Livros("A Realidade de Madhu", "Mellisa Tobias", 2020));
        livrosBiblioteca1.add(new Livros("Breves respostas para grandes questões", "Stephen Hawking", 2018));
        livrosBiblioteca1.add(new Livros("Buracos Negros", "Stephen Hawking", 2017));


        biblioteca1.setLivro(livrosBiblioteca1);
        System.out.println(biblioteca1.Lista());

        ArrayList<Livros> livrosBiblioteca2 = new ArrayList<>();
        livrosBiblioteca2.add(new Livros("Breves respostas para grandes questões", "Stephen Hawking", 2018));
        livrosBiblioteca2.add(new Livros("O Pequeno Principe","Antoine de Saint-Exupéry", 1943));
        livrosBiblioteca2.add(new Livros("O poder do agora", "Eckhart Tolle", 2000));
        livrosBiblioteca2.add(new Livros("Do Mil ao Milhão. Sem Cortar o Cafezinho ", "Thiago Nigro", 2018));
        livrosBiblioteca2.add(new Livros("Cabeça Fria, Coração Quente", "Vitor Castanheira", 2022));

        biblioteca2.setLivro(livrosBiblioteca2);
        System.out.println(biblioteca2.Lista());


    }
}
