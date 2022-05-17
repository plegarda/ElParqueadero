package logica;

import datos.Registro;
import datos.Opcion;
import datos.Conductor;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import utilidades.GestorPersistencia;

/**
 *
 * @author TP303
 */
public class GestorRegistro {
    private Map<String, Registro> listaIngreso;
    public GestorRegistro(){
        if (listaIngreso == null){
            listaIngreso = (Map<String, Registro> )GestorPersistencia.recuperar();
            if (listaIngreso == null){
                listaIngreso = new HashMap<>();
            }
        }
    }

    
    public Registro crearReg(String nombre, String identificacion, Date fecha, 
            Opcion opcion, String placa){
        if (nombre == null || identificacion == null || fecha == null || placa == null
                || nombre.isEmpty() || identificacion.isEmpty()){
            return null;
        }else{
            Conductor elConductor = this.crearConductor(nombre, identificacion, fecha, placa);
            Registro c = new Registro(elConductor, fecha, opcion);
            
        
             listaIngreso.put(c.getCodigo(), c);
            GestorPersistencia.guardar(listaIngreso);
            return c;
        }
    }
    
    private Conductor crearConductor(String nombre, String identificacion, Date fecha, String placa){
        Conductor p = new Conductor();
        p.modificaFechaNac(fecha);
        p.modificaIdentificacion(identificacion);
        p.modificaPlaca(placa);
        p.modificaNombre(nombre);
        return p;
    }
    public Map<String, Registro> obtenerLista(){
        return this.listaIngreso;
    }

   
}
