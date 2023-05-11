/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.singlycircularlinkedlist;

/**
 *
 * @author Upgrade
 */
public interface SinglyCircularInterface {
    void addFirst(int i);
    void addPosition(int pos,int i);
    void addLast(int i);
    int deleteFirst();
    int deletePosition(int pos);
    int deleteLast();
    int[] traverse();
    boolean isEmpty();
}
