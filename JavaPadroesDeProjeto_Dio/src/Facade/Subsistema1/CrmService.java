/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade.Subsistema1;

/**
 *
 * @author GFS_Mac
 */
public class CrmService {
    private CrmService (){
    super();
}
    
    public static void gravarCliente (String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM.");
    }
}
