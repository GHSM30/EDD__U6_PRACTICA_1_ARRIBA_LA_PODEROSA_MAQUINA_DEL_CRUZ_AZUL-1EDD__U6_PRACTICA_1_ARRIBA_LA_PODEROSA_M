import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
“Arriba la poderosa máquina del Cruz Azul”
1. Kevin Arturo Castellanos Amador
2. Guillermo Hilario Santos Moya
3. Axel Ulises Paredes Rubio
*/
public class BusquedaBinaria {
    
    public int busquedaBinaria(int []arreglo, int dato){
        
        Arrays.sort(arreglo);
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
          pos = (inicio+fin) / 2;
          if ( arreglo[pos] == dato )
               return pos;
             else if ( arreglo[pos] < dato ) {
        inicio = pos+1;
           } else {
        fin = pos-1;
           }
        }
        return -1;
    }
    
   
}
