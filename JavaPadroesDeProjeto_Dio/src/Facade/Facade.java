/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Facade.Subsistema1.CrmService;
import Facade.Subsistema2.CepApi;

/**
 *
 * @author GFS_Mac
 */
public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

        System.out.print(nome + "\n");
        System.out.print(cep + "\n");
        System.out.print(cidade + "\n");
        System.out.print(estado + "\n");

    }

}
