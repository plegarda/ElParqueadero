package datos;

import java.io.Serializable;
import java.util.Date;

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

    public void modificaIdentificacion(String identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void modificaFechaHora(Date FechaHora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

            
        }

