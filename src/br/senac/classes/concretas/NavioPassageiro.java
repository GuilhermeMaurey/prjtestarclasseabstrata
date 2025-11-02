/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.classes.concretas;

import br.senac.classes.abstratas.Navio;

/**
 *
 * @author Guilherme Maurey
 */
public class NavioPassageiro extends Navio {

    private int numeroPassageiros;
    private int passageirosAtuais;
    
    public int GetNumeroPassageiros() {
    return numeroPassageiros;
};
    
    public NavioPassageiro(){
    this.numeroPassageiros = 0;
    this.passageirosAtuais = 0;
    }
    
    public NavioPassageiro(int numeroPassageiros){
    this.numeroPassageiros = numeroPassageiros;
    }
    
    public NavioPassageiro(String nome, double peso, int comprimento, int capacidadeDePassageiros) {
   
        super(nome, peso, comprimento);
        
        this.numeroPassageiros = capacidadeDePassageiros;
        this.passageirosAtuais = 0;
    }
    
    // métodos
    
    public void embarcarPassageiros(int qntd) {
    int novoTotal = this.passageirosAtuais + qntd;
    System.out.println(novoTotal + " passageiros embarcados");
     
     
    if (novoTotal > this.numeroPassageiros) {
    int excedente = novoTotal - this.numeroPassageiros;
        
    System.out.println("Quantidade acima do permitido. Embarque negado! ");
    } 
    else {
    this.passageirosAtuais = novoTotal;
        
    if (this.passageirosAtuais == this.numeroPassageiros) {
    System.out.println("O navio alcançou sua capacidade máxima. ");
        }
    }
    } 
     
    public void desembarcarPassageiros(int quantidade) {
         
    if (quantidade > this.passageirosAtuais) {
    System.out.println("Não é possível desembarcar mais passageiros do que: " + numeroPassageiros);

    } 
    else if (this.passageirosAtuais == 0) {
    System.out.println("Não há passageiros para desembarcar! ");
        
    } 
    else {
    this.passageirosAtuais -= quantidade;
    System.out.println("Desembarque autorizado! Desembarcando " + quantidade + " passageiros. ");
    }
}     
     
    public void passageirosAtualmenteEmbarcados(){
    System.out.println("O navio possui " + passageirosAtuais + " passageiros embarcados. A capacidade máxima é de: " + numeroPassageiros + " passageiros. ");
    }
     
    public void desembarcarTodos() {
    if (this.passageirosAtuais > 0) {
    int desembarcados = this.passageirosAtuais;
    this.passageirosAtuais = 0;
    
    System.out.println(desembarcados + "passageiros desembarcados! ");
    } else {
        System.out.println("Não há passageiros para desembarcar. ");
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
