/*2-3 ins: 
Si el árbol está vacío
  Entonces crea un nuevo nodo y colocar el en el lado izquierdo del nodo.
Si ya hay un elemento y existe espacio en el nodo hacer 
  Si r1 es menos que el elemento 
    Entonces el elemento 0 se coloca a la derecha.
  Sino 
    Si r1 es mayor que el elemento entonces el elemento se coloca del lado izquierdo y r1 del lado derecho.
Sino 
    Si el nodo esta lleno se parte en dos nodos del mismo nivel, se crea un nuevo nodo
y se reparten los tres elementos (dos elementos del nodo y el nuevo elemento)*/

/*conexo
public boolean conexo() {
Object[][] rsult = generaMatrizAdyacencia();
int x = 0;
if (rsult.length > 0) {
for (int i = 0; i < rsult.length - 1; i++) {
for (int j = 0; j < rsult.length - 1; j++) {
if (i != j) {
if ((Integer) rsult[i][j] == 0 && (Integer)
rsult[j][i] == 0) {
x += 1;
}} }
if (x == rsult.length - 1) {
return false;
}
x = 0;
}
return true;
}
return false;
}
*/
/*anch
public ArrayList<Integer> recorridoAnchura(int nodoI) {
//Lista donde guardo los nodos recorridos
        ArrayList<Integer> recorridos = new ArrayList<Integer>();
//El nodo inicial ya está visitado
        visitiadoAnchura[nodoI] = true;
//Cola de visitas de los nodos adyacentes
        ArrayList<Integer> cola = new ArrayList<Integer>();
//Se lista el nodo como ya recorrido
        recorridos.add(nodoI);
//Se agrega el nodo a la cola de visitas
        cola.add(nodoI);
//Hasta que visite todos los nodos
        while (!cola.isEmpty()) {
            int j = cola.remove(0); //Se saca el primero nodo de la cola
//Se busca en la matriz que representa el grafo los nodos adyacentes
           for (int i = 0; i < g.length; i++) {

//Si es un nodo adyacente y no está visitado entonces
                if (g[j][i] == 1 && !visitiadoAnchura[i]) {
                    cola.add(i);//Se agrega a la cola de visitas
                    recorridos.add(i);//Se marca como recorrido
                    visitiadoAnchura[i] = true;//Se marca como visitado
                }
            }
        }
        return recorridos;//Devuelvo el recorrido del grafo en anchura
    }
*/

/*prof
public ArrayList<Integer> recorridoProfunidad(int nodoI) {
//Lista donde guardo los nodos recorridos
        ArrayList<Integer> recorridos = new ArrayList<Integer>();
       visitiadoProfunidad[nodoI] = true;//El nodo inicial ya está visitado
//Cola de visitas de los nodos adyacentes
        ArrayList<Integer> cola = new ArrayList<Integer>();
        recorridos.add(nodoI);//Listo el nodo como ya recorrido
        cola.add(nodoI);//Se agrega el nodo a la cola de visitas
        while (!cola.isEmpty()) {//Hasta que visite todos los nodos
            int j = cola.remove(0);//Se saca el primer nodo de la cola
    //Se busca en la matriz que representa el grafo los nodos adyacentes
            for (int i = 0; i < g.length; i++) {
//Si es un nodo adyacente y no está visitado entonces
                if (g[j][i] == 1 && !visitiadoProfunidad[i]) {
                    cola.add(i);//Se agrega a la cola de visita
//Se recorren los hijos del nodo actual de visita y se agrega el recorrido al la lista
                    recorridos.addAll(recorridoProfunidad(i));
                    visitiadoProfunidad[i] = true;//Se marca como visitado
                }
            }
        }
       return recorridos;//Se devuelve el recorrido del grafo en profundidad
    }
}

*/
/*http://www.grycap.upv.es/gmolto/docs/eda/EDA_Tema_14_Parte_I_gmolto.pdf
https://www.tutorialspoint.com/data_structures_algorithms/heap_data_structure.htm*/
