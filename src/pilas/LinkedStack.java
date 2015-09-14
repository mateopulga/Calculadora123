/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import comun.EmptyStructureException;
import comun.Node;

/**
 *
 * @author s212e12
 */
public class LinkedStack<E> implements Stack<E> {

    private Node<E> top;

    public LinkedStack() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public E peak() throws EmptyStructureException {
        if (isEmpty()) {
            throw new EmptyStructureException("Estructura Vacia");
        }
        return top.getItem();
    }

    @Override
    public E pop() throws EmptyStructureException {
        if (isEmpty()) {
            throw new EmptyStructureException("Estructura Vacia");
        }
        E aux = top.getItem();
        top = top.getNext();
        return aux;
    }

    @Override
    public void push(E target) {
        top = new Node<>(target, top);
    }

    public int size() {
        int i = 0;
        while (top != null) {
            top = top.getNext();
        i++;
        }
        
        return i;
    }
}
