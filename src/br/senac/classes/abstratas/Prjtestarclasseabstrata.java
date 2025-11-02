/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.senac.classes.abstratas;

import br.senac.classes.concretas.NavioPassageiro;
import br.senac.classes.concretas.NavioPesqueiro;
import br.senac.classes.tipoPesca.TipoPesca;

/**
 *
 * @author Guilherme Maurey
 */
public class Prjtestarclasseabstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
            chamarNavioPassageiro();
            chamarNavioPesqueiro();
    }
    
    public static void chamarNavioPassageiro(){
        NavioPassageiro Navio1 = new NavioPassageiro("Afrodite", 300.00, 400, 100); 

        Navio1.passageirosAtualmenteEmbarcados();
        System.out.println("-------------------------------------------------"); 
        Navio1.embarcarPassageiros(50);
        Navio1.passageirosAtualmenteEmbarcados();        
        System.out.println("-------------------------------------------------");
        Navio1.desembarcarPassageiros(10);
        Navio1.passageirosAtualmenteEmbarcados();   
        
        System.out.println("-------------------------------------------------");
    }    
        // agora o Pesqueiro
    
    public static void chamarNavioPesqueiro(){   
        NavioPesqueiro Navio2 = new NavioPesqueiro("Isaura", 300.00, 400, TipoPesca.ATUM, 200);
        
        Navio2.apresentarQuantidadeDePescado();
        System.out.println("-------------------------------------------------");
        Navio2.pescar(67);
        System.out.println("-------------------------------------------------");
        Navio2.apresentarQuantidadeDePescado();
        System.out.println("-------------------------------------------------");
        Navio2.desembarcarPescado();
        System.out.println("-------------------------------------------------");
        
    }
    
}
