package datos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 
 */
public class Registro implements Serializable{
    private Conductor elConductor;
    private Opcion opcionr;
    private Date fecha;
    private String placa;
    private String codigo;
    
    public Registro(Conductor elConductor, Date fecha, Opcion opcionr){
        this.elConductor = elConductor;
        this.fecha = fecha;
        this.opcionr = opcionr;
        this.codigo = elConductor.obtenerPlaca()+fecha.getTime();
    }
    public Conductor obtenerConductor(){
        return this.elConductor;
    }
    public Opcion obtenerOpcion(){
        return this.opcionr;
    }
    public Date obtenerFecha(){
        return this.fecha;
    }
    public String obtenerPlaca(){
        return this.placa;
    }
    public String   getCodigo(){
        
        return codigo;
    }
    @Override
    public String toString() {
        return " Registro para "+this.codigo+ "\n el dia "+this.fecha;
    }
    
}
