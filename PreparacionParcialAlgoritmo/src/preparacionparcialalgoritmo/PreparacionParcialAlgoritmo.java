/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preparacionparcialalgoritmo;

import estructuras.ListaDoble;
import pruebas.Test;

/**
 *
 * @author mauro
 */
public class PreparacionParcialAlgoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           ListaDoble<Test> listaTest = new ListaDoble<>();
        Test test = new Test("hola");
        Test test1 = new Test("hola");
        Test test2 = new Test("hola");
        listaTest.agregarOrd(test);
        listaTest.agregarOrd(test1);
        listaTest.agregarOrd(test2);        
        listaTest.mostrar();

    }
    
    /*
    private static int posMinimoDelVector(int[] v, int desde, int hasta) {
        // Devuelve la posicion del minimo elemento entre el desde y el hasta inclusive
            int min = v[desde];
            int pos = desde;
            for (int i = desde ; i <= hasta; i++) {
                    if (v[i] < min) {
                        min = v[i];
                        pos = i;
                    }
            }
            return pos;
    }
    
    private static void SelectionSort(int[] v, int desde, int hasta) {
            for (int i = desde; i < hasta; i++) {
                int posMin = posMinimoDelVector(v, i, hasta);
                int aux = v[i];
                v[i] = v[posMin];
                v[posMin] = aux;
            }
    }
    public static void selectionSort_doble (int v[]){
        // Algoritmo de Sort por Seleccion pero buscando el minimo y el maximo al mismo tiempo
        for (int i=0, j=v.length-1; i<j ; i++,j--){
            int pos_min = i;
            int min = v[i];
            int pos_max = i;
            int max = v[i];
            
            for (int k=i;k<=j;k++){
                if (v[k]<min){
                    min = v[k];
                    pos_min=k;
                }
                if (v[k]>max) {
                    max = v[k];
                    pos_max=k;
                }               
            }
            
            int aux= v[i];
            v[i]= min;
            v[pos_min]=aux;
            
            if (v[pos_min] == max){
                aux= v[j];                    
                v[j]= max;                      
                v[pos_min]=aux;            
            }
            else {
                aux= v[j];                    
                v[j]= max;                      
                v[pos_max]=aux;    
            }                        
        }        
    }

    public static void selectionSort_ordenado (int v[])    {
    // Algoritmo de Sort por Seleccion que determina si el vector ya está ordenado y  termina
        int largo = v.length;
        boolean ordenado = false;

        for (int i = 0; i<largo && !ordenado;i++){
            int min = v[i];
            int pos_min = i;
            ordenado = true;
            for (int j=i;j<largo;j++){
                if (j+1<largo) {
                    if (v[j]<v[j+1]){
                        ordenado = true && ordenado;
                    }
                    else {
                        ordenado = false && ordenado;
                    }                  
                }
                if (v[j] < min) {
                    min = v[j];
                    pos_min = j;
                }
            }
            if (!ordenado){
                int aux = v[i];
                v[i] = min;
                v[pos_min]=aux;
            } else {
                System.out.println("El vector ya estaba ordenado");
            }        
        }
    }

    private static void burbujaSort( int[] v){

        int ultimo = v.length-1;
        for (int i = 0; i<v.length;i++){
            for (int j=0;j<ultimo;j++){
                if (v[j]>v[j+1]){
                        int aux = v[j+1];
                        v[j+1]=v[j];
                        v[j] = aux;
                }
            }
            ultimo=ultimo-1;
        }
    }
        
    private static void insercionSort( int[] v){

        for (int i = 1; i < v.length;i++){
            int j=i;
            while (j>0 && v[j]<v[j-1]) {	    	    	
                   int aux = v[j];
                   v[j]=v[j-1];
                   v[j-1] = aux;		    	    	
                   j--;
           }
        }
    }
    
    public static int[] merge_vectores (int[] a, int[] b){
        // crea un nuevo vector ordenado a partir de otros dos vectores ORDENADOS        
        int largo_a = a.length ;
        int largo_b = b.length;

        //creo nuevo vector c 
        int[] c = new int[largo_a + largo_b];

        int i_a=0, i_b=0, i_c = 0;
        while (i_a<largo_a && i_b < largo_b){
                if (a[i_a] < b[i_b]){
                        c[i_c]= a[i_a];
                        i_a++;
                } else {
                        c[i_c] = b[i_b];
                        i_b++;
                }
                i_c++;
        }
        while (i_a<largo_a){
                c[i_c] = a[i_a];
                i_a++;
                i_c++;
        }
        while (i_b<largo_b){
                c[i_c]= b[i_b];
                i_b++;
                i_c++;
        }
        return c;
    }

    public static int buscarporpuntomedio(int[] v, int elemento){
        int izquierda = 0, derecha = v.length - 1;

        while(izquierda <= derecha){
            // Calculamos las mitades...
            int posMedio = (izquierda + derecha) / 2;
            int elementoDelMedio = v[posMedio];

            // Ver si está en la mitad y romper aquí el ciclo
            if(elementoDelMedio == elemento){
                return posMedio;
            }
            // Si no, entonces vemos si está a la izquierda o derecha

            if(elemento < elementoDelMedio){
                derecha = posMedio - 1;
            }else{
                izquierda = posMedio + 1;
            }
        }
    // Si no se rompió el ciclo ni se regresó el índice, entonces el elemento no existe
        return -1;
    }

    public static void mostrarVector ( int[] v){
        for ( int i=0; i<v.length;i++){
            if (i<v.length-1) {
                System.out.print(v[i] + "-");
            }
            else {
                System.out.println(v[i]);
            }
        }
    }    
    */
    
}
