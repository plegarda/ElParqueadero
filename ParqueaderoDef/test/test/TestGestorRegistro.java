
package test;

import org.junit.Assert;
import org.junit.Test;
import utilidades.GestorPersistencia;


public class TestGestorRegistro {
@Test
    public void guardarNull(){
        String abc ="Jose";
        boolean rta = GestorPersistencia.guardar(abc);
        System.out.println(rta);
        Assert.assertEquals(rta,true);
    }
    @Test
    public void guardarNull2(){
        boolean rta = GestorPersistencia.guardar(null);
        System.out.println(rta);
        Assert.assertEquals(rta,true);
    }
    @Test
    public void guardarOk (){
        boolean rta = GestorPersistencia.guardar(this);
        Assert.assertEquals(rta,false);
                }
    @Test
    public void recuperarNotNull (){
        Object rta = (Object)GestorPersistencia.recuperar();
        Assert.assertNotNull(rta);
                }

    @Test
    public void recuperarVacio(){
        Object rta = (Object)GestorPersistencia.guardar(this);
        Assert.assertEquals(rta,false);
                }
}