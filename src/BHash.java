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
public class BHash {
   
    public int [] funcionHash(int [] cadenaArreglo){
        int i = 0;
        int x = 0;
        int arreglo[] = new int [cadenaArreglo.length];
        
        for(i = 0; i < arreglo.length-1; i++){
            arreglo[i] = -1;
        }
        for(i = 0; i < cadenaArreglo.length-1; i++){
            int elemento = cadenaArreglo[i];
            int indiceArreglo = elemento % cadenaArreglo.length-1;
            
            do{
                if(arreglo[indiceArreglo] == -1){arreglo[indiceArreglo] = cadenaArreglo[i]; x = 1;}else{
                    indiceArreglo++;
                    if(indiceArreglo > arreglo.length){indiceArreglo = 0;}
                }
                
            }while(x == 1);
        }
        return arreglo;
    }
    
    public int mostrar(int [] cadenaArreglo, int dato){
        int i;
        for(i = 0; i < cadenaArreglo.length; i++){
            if(cadenaArreglo[i] == dato){return i;}
        }
        return i;
    }
}
