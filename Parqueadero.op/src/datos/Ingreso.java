package datos;

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;

/**
 *
 * @author 
 */
public class Ingreso implements Serializable{
    private int identificacion;
    private Timer hora;
    private Date fecha;
    private String placa;
    private Conductor elConductor;
    
    public Ingreso(Conductor elConductor, Date fecha, Timer hora){
        this.elConductor = elConductor;
        this.fecha = fecha;
        
    }

    public Ingreso(Conductor elConductor, Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Conductor obtenerConductor(){
        return this.elConductor;
    }
    public Timer obtenerHora(){
        return this.hora;
    }
    public Date obtenerFecha(){
        return this.fecha;
    }

    
    @Override
    public String toString() {
        return " El ingreso es para el conductor identificado con "+elConductor.obtenerIdentificacion()+ "\n el dia "+this.fecha + "\n a las "+this.hora;
    }
    
}
