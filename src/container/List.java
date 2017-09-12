/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

/**
 *
 * @author laboratorio
 */
public class List {
    private Node head;
    private Node last;
    private int size;

    public List() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }
    
    /**
     * <h1>Size</h1>
     * <p>Returns the list size.</p>
     * 
     * @return the list's size.
     */
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public boolean add(int data) {
        final Node nNew = new Node(data);
        
        if (null == head) {
            head = nNew;
            last = nNew;
        } else {
            last.setNext(nNew);
            last = nNew;
        }
        
        ++size;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("[ ");
        
        if (!isEmpty()) {
            Node aux = head;
            
            while (null != aux) {
                output.append(aux.getData());
                output.append(" ");
                aux = aux.getNext();
            }
            
        }
        output.append("]");
        return output.toString();
    }
}