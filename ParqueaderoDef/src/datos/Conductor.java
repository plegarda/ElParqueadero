package datos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author TP303
 */
public class Conductor implements Serializable{
    
    private String nombre;
    private String identificacion;
    private Date fecha; 
    private String placa;
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public String obtenerIdentificacion(){
        return this.identificacion;
    }
    public Date obtenerFechaNac(){
        return this.fecha;
        
    }
    public String obtenerPlaca(){
        return this.placa;
    }
    
    public void modificaNombre(String nombre){
        this.nombre = nombre;
    }
        public void modificaIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public void modificaFechaNac(Date fechaNac){
        this.fecha = fechaNac;
    }
     public void modificaPlaca(String placa){
        this.placa = placa;
    }
    
    

    @Override
    public String toString() {
        return "Conductor "+this.nombre+ " con identificacion "+this.identificacion;
    }
    
    public Integer obtenerFecha(){
        Integer entrada = null;
        if (this.fecha != null){
            Calendar hoy= Calendar.getInstance();
            
            Calendar fechaR= Calendar.getInstance();
            fechaR.setTime(this.fecha);
            
            if (fechaR.before(hoy)){
                long edadEnDias = (hoy.getTimeInMillis() - fechaR.getTimeInMillis())
                        / 1000 / 60 / 60 / 24;

                entrada = Double.valueOf(edadEnDias / 365.25d).intValue();
                return entrada;
            }
            
        }
        return entrada;
        
    }
    
}
