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
/**
 *
 * @author MEMO0464
 */
public class BusquedaSecuencial {
    
    public  int busquedaSecuencial(int []arreglo,int dato){
    boolean encontrado = false;
    int i = 0;
    while((i < arreglo.length) && !encontrado){
        if(arreglo[i++] == dato){
            encontrado = true;
        }
    }
    if(encontrado == false) return -2;
    return i-1;
   }
    
}
