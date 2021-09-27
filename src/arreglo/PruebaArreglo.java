/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

/**
 *
 * @author magus919
 */
public class PruebaArreglo {

    public static void main(String[] args) {
        
        int numeros[]={12,33,11,4,5};
        int num[][]={{22,5},{12,2,3,4},{2,3,5,1,88}};
        String voc="Hola Mundo";
        String caracteres="#el precio es de $43 con un descuento del %12";
        
        Arreglo.sumarLista(numeros);
        Arreglo.buscarMayor(num);
        Arreglo.cuentaVocales(voc);
        Arreglo.cuentaCaracter(caracteres,'%');
        
    }
    
}
