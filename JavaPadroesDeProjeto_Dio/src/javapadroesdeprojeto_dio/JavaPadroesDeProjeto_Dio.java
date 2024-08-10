/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapadroesdeprojeto_dio;

import Facade.Facade;
import Singleton.Singleton;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

/**
 *
 * @author GFS_Mac
 */
public class JavaPadroesDeProjeto_Dio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Teste projeto singleton
        Singleton teste = Singleton.getExemplo();

        System.out.println(teste);

        teste = Singleton.getExemplo();
        System.out.println(teste);
        ;

        // Teste projeto Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo meuRobo = new Robo();
        meuRobo.setComportamento(normal);
        meuRobo.mover();
        meuRobo.mover();

        meuRobo.setComportamento(defensivo);
        meuRobo.mover();

        meuRobo.setComportamento(agressivo);
        meuRobo.mover();
        meuRobo.mover();
        meuRobo.mover();

        
        // Teste projeto Facade
        
        Facade facade = new Facade();
        facade.migrarCliente("Marciano", "9110011123");
        
        
        
    }
}
