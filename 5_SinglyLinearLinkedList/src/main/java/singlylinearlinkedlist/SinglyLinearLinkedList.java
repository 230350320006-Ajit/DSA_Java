/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package singlylinearlinkedlist;

/**
 *
 * @author Upgrade
 */
public class SinglyLinearLinkedList {

    public static void main(String[] args) {
        SinglyLinearInterface obj = new SinglyLinearImple();
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int choice=-1;
     do{
        try{
            System.out.println("\n0. Exit\n1. AddFirst\n2. AddPosition\n3. AddLast\n4. DeleteFirst\n5. DeletePosition\n6. DeleteLast\n7. Traverse\nEnter choice: ");  
            choice=sc.nextInt();
             switch(choice)
            {
                case 1:
                    System.out.println("enter value :");
                    obj.addFirst(sc.nextInt());
                    break;
                case 2:
                    System.out.println("enter position and value :");
                    obj.addPosition(sc.nextInt(),sc.nextInt());
                    break;
                case 3:
                    System.out.println("enter value :");
                    obj.addLast(sc.nextInt());
                    break;    
                case 4:
                    System.out.println("deleted value :"+obj.deleteFirst());
                    break;
                case 5:
                    System.out.println("enter position for delete :");
                    System.out.println("deleted value :"+obj.deletePosition(sc.nextInt()));
                    break;    
                case 6:
                    System.out.println("deleted value :"+obj.deleteLast());
                    break;    
                case 7:
                    System.out.print(java.util.Arrays.toString(obj.traverse()));
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
     }while(choice!=0);
    }
}
