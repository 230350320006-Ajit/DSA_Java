/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.doublylinearlinkedlist;

/**
 *
 * @author Upgrade
 */
public interface DoublyLinearInterface {
    void addFirst(int i);
    void addPosition(int po,int i);
    void addLast(int i);
    int deleteFirst();
    int deletePosition(int po);
    int deleteLast();
    boolean isEmpty();
    int[] traverseNext();
    int[] traversePrev();
}
