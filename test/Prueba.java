
import Funciones.Numericas;
import org.junit.Test;
import static org.junit.Assert.*;

public class Prueba 
{
    
    @Test
    public void getDobleTest() 
    {
        // probamos una función
        int resultado = Numericas.getDoble(5);
        
        // declaramos el resultado esperado
        
        int esperado = 10;
        
        //Evaluamos
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void getCuadradoTest()
    {
       int resultado = Numericas.getCuadrado(5);
       
       
       int esperado = 24;
       
        assertEquals(esperado, resultado);
    }
    
     @Test
    public void Resultado1()  
    {
        int resultado = Numericas.Resultado1(30);
        int esperado = 50;
        
        assertEquals(resultado, esperado);

    }
    
    @Test
    public void Resultado2()
    {
        int resultado = Numericas.Resultado2(5);
        int esperado = 15;
        
        assertEquals(resultado, esperado);
        
    }
   
}
    