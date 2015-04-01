package IIS.LDE;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	DoublyLinkedList<Integer> listaDoble = new DoublyLinkedList<Integer>();
    	
    	Node<Integer> first = new Node<Integer>(2, null, null);
    	
    	listaDoble.setFirstNode(first);
    	listaDoble.insertAfter(first,new Node<Integer>(3,null,null));
    	listaDoble.insertBefore(first, new Node<Integer>(1,null,null));
    	listaDoble.insertBeginning(new Node<Integer>(0,null,null));
    	listaDoble.insertEnd(new Node<Integer>(4,null,null));
    	
    	System.out.println("ForWards: ");
    	listaDoble.forwards();
    	
    	System.out.println("BackWards: ");
    	listaDoble.backwards();
    	
    }
}
