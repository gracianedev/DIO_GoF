/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author GFS_Mac
 */
public class Singleton {
    private static Singleton exemplo = new Singleton();

    private Singleton() {
        super();
    }
    
    public static Singleton getExemplo(){
        return Singleton.exemplo;
    }
    
    
}
