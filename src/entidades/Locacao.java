/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.ArrayList;

public class Locacao {
     private int id;
    private double valor;
    private Date data;
    private ArrayList<itemLocacao> itensLocacao;
    private Clientes clientes;
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<itemLocacao> getItensLocacao() {
        return itensLocacao;
    }

    public void setItensLocacao(ArrayList<itemLocacao> itensLocacao) {
        this.itensLocacao = itensLocacao;
    }

    public Clientes getCliente() {
        return clientes;
    }

    public void setCliente(Clientes cliente) {
        this.clientes = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
}
}

