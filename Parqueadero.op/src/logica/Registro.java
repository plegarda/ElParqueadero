package logica;

import datos.Ingreso;
import datos.Conductor;
import datos.Salida;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TP303
 */
public class Registro {


    public Ingreso crearRegistro(String identificacion, Date fechaHora, String placa, Conductor conductor){
        
        if (identificacion == null || fechaHora == null || placa == null || identificacion.isEmpty()){
            return null;
        }else{
            Conductor elConductor = this.crearConductor(identificacion, fechaHora);
            Ingreso c = new Ingreso(conductor, fechaHora);
        
            return null;
        }
        
    
    }
    private Conductor crearConductor(int identificacion, Date FechaHora){
        Conductor p = new Conductor();
        p.modificaFechaHora(FechaHora);
        p.modificaIdentificacion(identificacion);
        return p;
    }

    private Conductor crearConductor(String identificacion, Date fechaHora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Ingreso crearRegistro(String identificacion, Date fechaHora, String placa, Salida laopcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
