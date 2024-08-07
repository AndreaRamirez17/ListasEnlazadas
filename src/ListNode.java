import java.util.HashMap;
import java.util.Scanner;

//Ejemplo proporcionado de la estructura del nodo
public class ListNode {
    //Ejemplo de estrutura de nodo
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
    // Funcion para construir la lista enlazada
    public static ListNode ConstruirLista() {
        Scanner scanner = new Scanner(System.in);
        ListNode head = null;//primer nodo de la lista
        ListNode tail = null; //ultimo nodo de la lista y s eutiliza para añadir nuevos nodos

        System.out.println("Introduce los valores para la lista enlazada (introduce F para terminar):");
        while (true) {
            System.out.print("Valor: ");
            int val = scanner.nextInt(); //introducimos un valor entero
            if (val == 'F') {
                break;
            }// para salirnos del loop
            ListNode nuevoNodo = new ListNode(val);//se crea el nuevo nodo de la lista con los valores instroducidos
            if (head == null) {// Inicialización de la lista
                head = nuevoNodo;
                tail = nuevoNodo;
            } else {
                tail.next = nuevoNodo;
                tail = nuevoNodo;
            }
        }
        return head;
    }
    //Funcion para ver si la lista está vacia
    public static boolean ListaVacia(ListNode head){
        if (head == null) {
            System.out.println("La lista está vacía.");
            return true;
        }
        return false;
    }
    //Funcion para imprimir las listas en cada caso
    public static void VerLista(ListNode head){
        // Inicializar el puntero 'current' al primer nodo de la lista
        ListNode current=head;
        // Recorrer la lista enlazada mientras el puntero 'current' no sea null
        while(current!=null){
            // Imprimir el valor del nodo actual seguido de un espacio
            System.out.print(current.val+" ");
            // Avanzar al siguiente nodo en la lista
            current=current.next;
        }
        System.out.println();
    }

    //Metodo para invertir la lista
    public static ListNode Invertir(ListNode head){
        //punteros
        ListNode prev = null;// Nodo previo, inicialmente es null
        ListNode current = head; // Nodo actual, comenzando en la cabeza
        ListNode next; // Nodo siguiente, inicialmente es null

        while (current != null) {
            next = current.next; // Guardar el siguiente nodo
            current.next = prev; // Invertir el enlace de los nodos
            prev = current; // Mover el puntero previo al nodo actual
            current = next; // Mover el puntero actual al siguiente nodo
        }
        return prev; // regresar el nuevo head que es el antiguo último nodo
    }

    //Metodo para encontrar el elemento medio
    public static ListNode ElementoMedio(ListNode head){

        int count=0;//variable para contar el numero de nodos
        ListNode current=head; // Inicializar el puntero actual al primer nodo de la lista

        // Recorrer la lista para contar los nodos
        while(current !=null) {
            count++; // Incrementar el contador de nodos
            current=current.next; // Avanzar al siguiente nodo
        }
        //encontrar el indice del nodo medio
        int medio=count/2; // La posición del nodo medio se encuentra en la mitad de la lista

        // Volver a iniciar desde la cabeza de la lista para encontrar el nodo medio
        current=head; //Reiniciar el puntero al primer nodo de la lista

        // Recorrer la lista hasta llegar al nodo medio
        for(int i=0; i<medio;i++){
            current=current.next; // Avanzar al siguiente nodo en cada iteración
        }
        return current; // Devolver el nodo que se encuentra en la posición media
    }

    //Metodo para eliminar elementos duplicados de la lista
    public static ListNode EliminarDuplicados(ListNode head){

        ListNode current=head; // Puntero para recorrer la lista
        ListNode prev=null; // Puntero para mantener el nodo anterior
        HashMap<Integer,Boolean> duplicado=new HashMap<>(); // Usamos HasMap para encontrar valores duplicados

        // Recorrer la lista para eliminar nodos duplicados
        while(current != null){
            // Verificar si el valor actual ya ha sido visto
            if(duplicado.containsKey(current.val)){
                // Si el valor ya existe en el HashMap, eliminar el nodo actual
                prev.next=current.next;
            }else {
                // Si el valor es nuevo, agregarlo al HashMap
                duplicado.put(current.val,true); // Registrar el valor como visto
                prev=current; // Mover el puntero 'prev' al nodo actual
            }
            current=current.next; // Avanzar al siguiente nodo en la lista
        }
        return head; // Devolver el head de la lista con duplicados eliminados
    }

}
