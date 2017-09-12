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
public class Node {
    private Node next;
    private final int data;

    /**
     * <h1>Node</h1>
     * <p>Creates a new instance of the Node object.</p>
     * 
     * @param data the actual data to save.
     */
    public Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Node{" + "next=" + next + ", data=" + data + '}';
    }
}
