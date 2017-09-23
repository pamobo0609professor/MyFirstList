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
     * <p>
     * Returns the list size.</p>
     *
     * @return the list's size.
     */
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean addFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            last = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }

        ++size;
        return true;
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

    public boolean add(int index, int data) {
        if (index >= 0 && index <= size) {
            if (isEmpty() && 0 == index) {
                addFirst(data);
            } else if (0 == index) {
                addFirst(data);
            } else if (size == index) {
                add(data);
            } else {
                Node nNew = new Node(data);
                Node aux = head;

                int counter = 0;

                while (counter < index - 1) {
                    aux = aux.getNext();
                    ++counter;
                }

                nNew.setNext(aux.getNext());
                aux.setNext(nNew);
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }

        ++size;
        return true;
    }

    public int indexOf(int dataToSearch) {
        int index = -1;
        int counter = 0;

        Node aux = head;
        while (counter < size && aux != null) {
            if (dataToSearch == aux.getData()) {
                index = counter;
                break;
            } else {
                ++counter;
                aux = aux.getNext();
            }
        }

        return index;
    }

    private int removeHead() {
        final int deleted = head.getData();
        head = head.getNext();

        return deleted;
    }

    private int removeLast() {
        final int deleted = last.getData();

        Node aux = head;
        for (int i = 0; i < size - 2; i++) {
            aux = aux.getNext();
        }

        aux.setNext(null);
        last = aux;

        return deleted;
    }

    public int remove(int index) {
        int result = -1000;
        if (isEmpty()) {
            System.out.println("Can't delete on an empty list.");
        } else {
            if (index >= 0 && index < size) {
                if (0 == index) {
                    result = removeHead();
                } else if (size - 1 == index) {
                    result = removeLast();
                } else {
                    Node aux = head;
                    int counter = 0;

                    while (counter < index - 1) {
                        aux = aux.getNext();
                        ++counter;
                    }

                    result = aux.getNext().getData();

                    aux.setNext(aux.getNext().getNext());
                }

                --size;
            } else {
                throw new ArrayIndexOutOfBoundsException("Invalid index");
            }
        }
        return result;
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
