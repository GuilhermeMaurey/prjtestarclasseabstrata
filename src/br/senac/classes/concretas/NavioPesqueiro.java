/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.classes.concretas;

import br.senac.classes.abstratas.Navio;
import br.senac.classes.tipoPesca.TipoPesca;

/**
 *
 * @author Guilherme Maurey
 */
    public class NavioPesqueiro extends Navio {

    private int capacidade;
    private TipoPesca tipoPesca;
    private int totalPescado;
    
    public NavioPesqueiro() {
    super();
    this.capacidade = 0;
    this.tipoPesca = tipoPesca; 
    this.totalPescado = 0; 
}
    
    public NavioPesqueiro(String nome, double peso, int comprimento, TipoPesca tipoPesca, int capacidade) {
   
        super(nome, peso, comprimento);
        this.capacidade = capacidade;       
        this.tipoPesca = tipoPesca;         
        this.totalPescado = 0;
    }
    
        public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
    }

    public TipoPesca getTipoPesca() {
    return tipoPesca;
    }

    public void setTipoPesca(TipoPesca tipoPesca) {
    this.tipoPesca = tipoPesca;
    }

    public int getTotalPescado() {
    return totalPescado;
    }

    public void setTotalPescado(int totalPescado) {
    this.totalPescado = totalPescado;
    }
   
    // métodos 
    
    public void pescar(int qntdPescada){
    int novoTotalPescado = this.totalPescado + qntdPescada;
    
    if (novoTotalPescado > this.capacidade){
    int redePescador = this.capacidade - this.totalPescado;
    
        System.out.println("A quantidade pescada está além da capacidade do navio. ");
        
    if (redePescador > 0){
        System.out.println( redePescador + " está disponível para armazenamento.");   
        
    } else {
        System.out.println("A capacidade máxima de pescado foi atingida! ");
        
    } 
    
    } else {
        this.totalPescado = novoTotalPescado;
        System.out.println( qntdPescada + " será armazenado. ");
        System.out.println( "Total a bordo: " + this.totalPescado + "/" + capacidade);
        
        if (this.totalPescado == this.capacidade){
        System.out.println("A capacidade máxima de pescado foi atingida! ");
        }
    }
    }
    
    public void apresentarQuantidadeDePescado() {
        System.out.println("A quantidade atual de pescado no navio é de: " + totalPescado);
        System.out.println("A capacidade máxima é de: " + this.capacidade);
    }
    
    public void desembarcarPescado() {
        if (this.totalPescado > 0){
        int descarregar = this.totalPescado;
        this.totalPescado = 0;
        
            System.out.println("Quantidade de pescado descarregada do navio " + descarregar);
            System.out.println( "Total a bordo: " + this.totalPescado + "/" + capacidade);
        }else{
            System.out.println("Não foi possível descarregar pois não há pescado a bordo.");
        }
    }
    
    @Override
    public void partir() {
}

    @Override
    public void navegar() {
    }

    @Override
    public void parar() {
    }

    @Override
    public void atracar() {
   }
    
}
