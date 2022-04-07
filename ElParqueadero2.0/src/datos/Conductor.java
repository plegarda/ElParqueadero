/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.Serializable;

/**
 *
 * @author TP303
 */
public class Conductor implements Serializable{
    private int identificacion;
    private String placa; 
    
    
    public int obtenerIdentificacion(){
        return this.identificacion;
    }
    public String obtenerPlaca(){
        return this.placa;
    }

    public void modificaIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }
    public void modificaPlaca(String placa){
        this.placa = placa;
    }

    @Override
    public String toString() {
        return " identificacion "+this.identificacion;
    }
    

            
        }

