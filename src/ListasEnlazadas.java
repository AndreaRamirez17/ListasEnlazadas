
public class ListasEnlazadas{
    public static void main(String[] args){

        //Cargamos nuestra Lista enlazada
        ListNode head=new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);

        //Imprimimos la lista inicial importando el metodo VerLista de la clase Metodos
        System.out.println("Lista inicial:");
        Metodos.VerLista(head);
        //Salto de linea
        System.out.println();

        //Invertir la lista
        head= Metodos.Invertir(head);
        //Imprimir la lista importando el metodo necesario
        System.out.println("Lista invertida: ");
        Metodos.VerLista(head);
        //Salto de linea
        System.out.println();

        //Encontrar el elemento medio
        ListNode middle= Metodos.ElementoMedio(head);
        //Imprimir el valor medio de la lista
        System.out.println("Elemento medio: ");
        System.out.println(middle.val);
        //Salto de linea
        System.out.println();

        //Eliminar los elementos duplicados de la lista
        head= Metodos.EliminarDuplicados(head);
        //Imprimir la lista importando el metodo necesario
        System.out.println("Lista sin elementos duplicados: ");
        Metodos.VerLista(head);
    }
}
