/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

/**
 *
 * @author s212e12
 */
public interface Stack<E> {
    boolean isEmpty();
    E peak();
    E pop();
    void push(E target);
}
