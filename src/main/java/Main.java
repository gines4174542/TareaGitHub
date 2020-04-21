/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gigif
 */
public class Main {
   /**
     * @since 02/04/2020
     * @author Gines
     * @version 2.0
     */
    
     /**
     * metodo Sumar
     * este metodo suma dos numeros y nos devuelve su suma
     * @param sumando1 coge el primer numero
     * @param sumando2 coge el segundo numero
     * @return la suma devuelve la suma de los dos numeros
     */
    public int Sumar(int sumando1, int sumando2){
       return sumando1 + sumando2; 
      
    }
    /**
     * metodo Restar
     * Este metodo nos muestra la resta de dos numeros
     * @param minuendo introducimos el minuendo
     * @param sustraendo introducimos el sustraendo
     * @return resta nos muestra la resta de esos dos numeros
     */
    
    public int Restar(int minuendo, int sustraendo){
        return minuendo - sustraendo;
    }
    /**
     * metodo Multiplicar 
     * este metodo nos muestra el resultado de la 
     * multiplicacion de dos numeros
     * @param factor1 coge el primer numero
     * @param factor2 coge el numero por el 
     * que será multiplicado el primero
     * @return resultado nos muestra el resultado de la multiplicacion
     */
    public int Multiplicar (int factor1, int factor2){
        return factor1 * factor2;
    }
    /**
     * metodo Divison
     * nos muestra el resultado de la parte entera 
     * de una division entre dos numeros
     * @throws ArithmeticException el divisor no puede ser 0
     * @param dividendo el dividendo que introducimos
     * @param divisor el divisor que introducimos
     
     * @return resultado muestra el resultado de la parte entera de la division
     */
    public int Division(int dividendo, int divisor){
            int resultado;
            if (divisor == 0) {
            throw new ArithmeticException("El divisor no puede ser 0");
           }
            else{
               resultado = dividendo / divisor;}
        return resultado;
           
    }

    /**
     * metodo Resto 
     * Nos muestra el resto de una division de dos numeros
     * @throws ArithmeticException el divisor no puede ser 0
     * @param dividendo el dividendo que introducimos
     * @param divisor el divisor que introducimos
     * @return reultado
     */
    public int Resto(int dividendo, int divisor){
            int resultado;
            if (divisor == 0) {
            throw new ArithmeticException("El divisor no puede ser 0");
           }
            else{
               resultado = dividendo % divisor;}
        return resultado;
           
    }
     public static void main(String[] args) {
       Main calculadora=new Main();
         System.out.println("Hola mundo estoy usando"
                 + " una calculadora");
       //suma ->
       System.out.println(calculadora.Sumar(5, 25));
       //resta ->
       System.out.println(calculadora.Restar(10, 5));
       //multiplicacion ->
       System.out.println(calculadora.Multiplicar(5, 5));
       //division->
        System.out.println(calculadora.Division(8, 2));
        //probando la excepcion de division ->
        System.out.println(calculadora.Division(8, 0));
        //resto ->
        System.out.println(calculadora.Resto(40, 9));
        //probando la excepcion de resto
        System.out.println(calculadora.Resto(40, 0));
    }
}
