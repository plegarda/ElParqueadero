package utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Vinni@
 */
public class Util {
    public static String convertirDateString(Date fecha){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        if (fecha == null){
            return sd.format(new Date());
        }else{
            return sd.format(fecha);
        }
        
    }
    
}
