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
public class TDA_V {
    int [] numero;
    int [] o;
    int [] o2;

    public TDA_V() {
        this.numero = numero;
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    public int[] getO() {
        return o;
    }

    public void setO(int[] o) {
        this.o = o;
    }

    public  int [] Genera(int tam){
       numero = new int [tam];
       o = new int [tam];
       for(int i = 0; i< numero.length; i++){
           numero[i] = (int)(Math.random()*99);
           o[i] = numero[i];
       }
       return numero;
    }
   
}
