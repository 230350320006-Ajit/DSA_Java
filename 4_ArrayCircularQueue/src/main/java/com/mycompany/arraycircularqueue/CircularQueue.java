/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.arraycircularqueue;

/**
 *
 * @author Upgrade
 */
public interface CircularQueue {
    boolean isEmpty();
    boolean isFull();
    int deleteQ();
    void addQ(int i);
    int[] iterate();
}
