/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.calculadora.modelo;

/**
 *
 * @author 17100508
 */
public class Calculadora {
    public Double somar (Double parcela1, Double parcela2){
        return parcela1 + parcela2;
    }
    
    public Double dividir (Double dividendo, Double divisor){
        if(divisor.equals(new Double(0))) return null;
        return dividendo / divisor;
    }
}
