/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.classes.abstratas;

/**
 *
 * @author Guilherme Maurey
 */
public abstract class Navio {

    protected String nome;
    protected double peso;
    protected int comprimento;

    public Navio() {
        super();
    }

    public Navio(String nome, double peso, int comprimento) {
        this.nome = "nome";
        this.peso = 0.0;
        this.comprimento = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public abstract void partir();

    public abstract void navegar();

    public abstract void parar();

    public abstract void atracar();
}

