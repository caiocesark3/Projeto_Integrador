/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author ADM
 */
public class Filme extends item {
    private String diretor;
    private int duracao;

    public Filme(Categoria categoria) {
        super(categoria);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
     @Override
    public String toString() {
        return "Filme \n" + 
                "   ID: " + getId() + "\n" +
                "   Diretor: " + diretor + "\n" +
                "   Duração: " + duracao + "\n" +
                "   Título: " + getTitulo() + "\n" +
                "   Descrição: " + getDescricao() + "\n" +
                "   Preço: " + getPreco() + "\n" +
                "   Nº Dias: " + getNumeroDias() + "\n" +
                "   Categoria: " + getCategoria() + "\n" +
                '}';
    }
}
