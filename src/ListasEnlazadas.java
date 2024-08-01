
public class ListasEnlazadas{
    public static void main(String[] args){

         //ListNode head=null;
        //Cargamos nuestra Lista enlazada
        ListNode head = ListNode.ConstruirLista();
        if (ListNode.ListaVacia(head)) {
            return;
        }

        //Imprimimos la lista inicial
        System.out.println("Lista inicial:");
        ListNode.VerLista(head);

        //Invertir la lista
        head=ListNode.Invertir(head);
        System.out.println("Lista invertida: ");
        ListNode.VerLista(head);

        //Encontrar el elemento medio
        ListNode middle= ListNode.ElementoMedio(head);
        if (middle != null) {
            System.out.println("Elemento medio:");
            System.out.println(middle.val);
        }

        //Eliminar los elementos duplicados de la lista
        head= ListNode.EliminarDuplicados(head);
        System.out.println("Lista sin elementos duplicados: ");
        ListNode.VerLista(ListNode.Invertir(head));

    }
}
