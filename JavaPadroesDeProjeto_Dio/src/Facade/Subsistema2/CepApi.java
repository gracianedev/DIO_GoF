/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade.Subsistema2;

/**
 *
 * @author GFS_Mac
 */
public class CepApi {
    
    private static CepApi instancia = new CepApi();
    
    private CepApi (){
        super();
    }
    
    public static CepApi getInstancia(){
        return instancia;
    }
    
    public String recuperarCidade (String cep){
        return "Araraquara";
    }
    
     public String recuperarEstado (String cep){
        return "SP";
    }
}
