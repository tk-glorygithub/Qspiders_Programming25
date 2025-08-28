import java.util.*;

/**
 * This file provides a complete example of implementing a custom generic LinkedList in Java.
 * <p>
 * It contains:
 * <ul>
 *     <li>Custom Exceptions for index errors and missing elements.</li>
 *     <li>A {@link MyLinkedList} class that mimics functionality of {@link java.util.LinkedList}.</li>
 *     <li>Example usage in {@link Linkedlist_Implementation}.</li>
 * </ul>
 *
 * <h3>Features of {@link MyLinkedList}</h3>
 * <ul>
 *     <li>Add elements at start, end, or specific index.</li>
 *     <li>Retrieve elements (first, last, or by index).</li>
 *     <li>Replace elements using {@code set}.</li>
 *     <li>Search using {@code contains}, {@code firstIndexOf}, {@code lastIndexOf}.</li>
 *     <li>Clear the entire list.</li>
 *     <li>Remove last element.</li>
 *     <li>Check size of the list.</li>
 * </ul>
 *
 * @author Trushna
 * @version 25.0
 */
class MyListIndexNotFoundException extends RuntimeException {
    /**
     * Constructs an exception indicating an invalid index.
     *
     * @param des message describing the error
     */
    public MyListIndexNotFoundException(String des) {
        super(des);
    }
}

/**
 * Exception thrown when a requested element does not exist in the list.
 */
class NosuchElementFoundException extends RuntimeException {
    /**
     * Constructs the exception with a custom message.
     *
     * @param str detail message
     */
    public NosuchElementFoundException(String str) {
        super(str);
    }
}

/**
 * Custom implementation of a generic singly linked list.
 *
 * @param <E> type of elements in this list
 */
class MyLinkedList<E> {

    /** Head (first node) of the list. */
    private Node<E> head;

    /** Tail (last node) of the list. */
    private Node<E> tail;

    /** Number of elements in the list. */
    private int index = 0;

    /**
     * Inner class representing a node in the linked list.
     *
     * @param <E> type of element stored in the node
     */
    private class Node<E> {
        E data;
        Node<E> next;

        /**
         * Constructs a new node containing the given data.
         *
         * @param data element to store in node
         */
        public Node(E data) {
            this.data = data;
        }
    }

    // -------------------- BASIC OPERATIONS --------------------

    /**
     * Adds an element at the end of the list.
     *
     * @param data element to be added
     * @see #addFirst(Object)
     * @see #add(int, Object)
     */
    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (index == 0) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        index++;
    }

    /**
     * Adds an element at the beginning of the list.
     *
     * @param ele element to be added
     */
    public void addFirst(E ele) {
        Node<E> newNode = new Node<>(ele);
        newNode.next = head;
        head = newNode;
        index++;
    }

    /**
     * Adds an element at a specific position in the list.
     *
     * @param ind index where element should be inserted
     * @param ele element to add
     * @throws MyListIndexNotFoundException if index is invalid
     */
    public void add(int ind, E ele) {
        if (ind < 0 || ind > index) {
            throw new MyListIndexNotFoundException("Index: " + ind + ", Size:" + index);
        }
        if (ind == 0) {
            addFirst(ele);
            return;
        }
        Node<E> node = new Node<>(ele);
        Node<E> currN = head;
        int i = 0;
        while (i != ind - 1) {
            currN = currN.next;
            i++;
        }
        Node<E> nextN = currN.next;
        currN.next = node;
        node.next = nextN;
        index++;
    }

    // -------------------- ACCESS METHODS --------------------

    /**
     * Retrieves the first element of the list.
     *
     * @return first element
     * @throws NosuchElementFoundException if list is empty
     */
    public E getFirst() {
        if (head == null)
            throw new NosuchElementFoundException("List is empty");
        return head.data;
    }

    /**
     * Retrieves the last element of the list.
     *
     * @return last element
     */
    public E getLast() {
        return tail.data;
    }

    /**
     * Retrieves an element at a specific index.
     *
     * @param ind index to search
     * @return element at the index
     * @throws MyListIndexNotFoundException if index is negative
     */
    public E get(int ind) {
        if (ind < 0)
            throw new MyListIndexNotFoundException("Index: " + ind + ", Size:" + index);
        Node<E> currNode = head;
        while (ind > 0) {
            currNode = currNode.next;
            ind--;
        }
        return currNode.data;
    }

    /**
     * Replaces the element at the given index with a new element.
     *
     * @param ind index to replace
     * @param e   new element
     * @return old element previously at that index
     */
    public E set(int ind, E e) {
        if (ind < 0)
            throw new MyListIndexNotFoundException("Index: " + ind + ", Size:" + index);
        Node<E> currNode = head;
        while (ind > 0) {
            currNode = currNode.next;
            ind--;
        }
        E temp = currNode.data;
        currNode.data = e;
        return temp;
    }

    // -------------------- REMOVAL --------------------

    /**
     * Removes and returns the last element of the list.
     *
     * @return removed element
     */
    public E removeLast() {
        Node<E> currN = head;
        E temp = tail.data;
        while (currN.next.next != null) {
            currN = currN.next;
        }
        currN.next = null;
        tail = currN;
        index--;
        return temp;
    }

    /**
     * Removes all elements from the list.
     */
    public void clear() {
        head = null;
        tail = null;
        index = 0;
    }

    // -------------------- SEARCH & SIZE --------------------

    /**
     * Checks whether the list contains a given element.
     *
     * @param ele element to check
     * @return true if found, false otherwise
     */
    public boolean contains(E ele) {
        Node<E> node = head;
        while (node != null) {
            if (ele == node.data)
                return true;
            node = node.next;
        }
        return false;
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return size of the list
     */
    public int size() {
        return index;
    }

    /**
     * Finds the first occurrence of an element.
     *
     * @param ele element to search
     * @return index of first occurrence, or size if not found
     */
    public int firstIndexOf(E ele) {
        int i = 0;
        Node<E> n = head;
        while (n != null && n.data != ele) {
            n = n.next;
            i++;
        }
        return i;
    }

    /**
     * Finds the last occurrence of an element.
     *
     * @param ele element to search
     * @return index of last occurrence, or 0 if not found
     */
    public int lastIndexOf(E ele) {
        int i = 0;
        int ans = -1;
        Node<E> n = head;
        while (n != null) {
            if (n.data == ele)
                ans = i;
            i++;
            n = n.next;
        }
        return ans;
    }

    // -------------------- UTILITY --------------------

    /**
     * Returns a string representation of the list.
     *
     * @return string in form [a, b, c]
     */
    @Override
    public String toString() {
        if (head == null) return "[]";
        StringBuilder str = new StringBuilder("[");
        Node<E> n = head;
        while (n.next != null) {
            str.append(n.data).append(", ");
            n = n.next;
        }
        if (n.data != null)
            str.append(n.data);
        return str.append("]").toString();
    }
}

/**
 * Example class to test and demonstrate usage of {@link MyLinkedList}.
 */
public class Linkedlist_Implementation {

    /**
     * Demonstrates how to use {@link MyLinkedList}.
     *
     * @param args command line arguments
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(3, 90909);
        list.add(0, 0);
        list.add(1, -1);

        // Searching
        System.out.println("Contains 30? " + list.contains(30));

        // Printing
        System.out.println("List: " + list);

        // Index operations
        System.out.println("Last index of 30: " + list.lastIndexOf(30));
        System.out.println("First index of 30: " + list.firstIndexOf(30));
    }
}
