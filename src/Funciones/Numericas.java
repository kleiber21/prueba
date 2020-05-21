
package Funciones;

public class Numericas 

{

    // funcion para obtener el doble de un número
    public static int getDoble(int numero)
    {
        //obtiene el doble del numero
        return (numero * 2);
    }
    
    //función para obtener el cuadrado de un numero
    public static int getCuadrado(int numero)
    {
        //obtiene el cuadrado
        return (numero * numero);
    }
    
    //funciona para sumar un numero
    public static int Resultado1(int numero1)    
    {
        // obtiene la suma
      return numero1 + 20;
    }
    
    //funciona para sumar un numero
    public static int Resultado2(int numero2)
    {
        return numero2 + 10;
    }
    
            
    // probando funciones
    public static void main(String[] args) 
    {
        // variables para probar
        int resultado = getCuadrado(2);
        int esperado = 2;
       
        
        //validamos
        if (resultado == esperado) 
        {
             System.out.println("Ok getCuadrado");
        }
        
        else
        {
            System.out.println("Fail getCuadrado"); 
        }
        
        // probamos la función
        
        resultado = getDoble(5);
        esperado = 10;
        
        // validamos
        if(resultado == esperado)
        {
            System.out.println("Ok getDoble");
        }
        else
        {
            System.out.println("Fail getDoble");
        }
        
        int resultado1 = Resultado1(30);
        int esperado1 = 50;
        
        if(resultado1 == esperado1)
        {
            System.out.println("Esta bien 1");
        }
        else
        {
            System.out.println("Esta mal 1");
        }
        
       int resultado2 = Resultado2(5);
       int esperado2 = 15;
       
        if (resultado2 == esperado2) 
        {
            System.out.println("Esta bien 2");
        }
        else
        {
            System.out.println("Esta mal 2");            
        }
       
        System.out.println("Hola");
     
    }
    
}
