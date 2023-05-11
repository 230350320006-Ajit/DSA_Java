
public class DoublyLinearCtrl {

	public static void main(String[] args) {
		DoublyLinear dl = new DoublyLinear();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int choice = -1;

		do {
			System.out.print("\n0. Exit \n1. addFirst\n2. addMiddle\n3. addLast\n4. deleteFirst\n5. deleteAny\n6. deleteLast\n7. visitNext\n8. visitPrev\nenter choice :");
			try {
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("\nvalue at first :");
					dl.addFirst(sc.nextInt());
					break;
				case 2:
					System.out.print("\nvalue at middle(sort) :");
					dl.addMiddle(sc.nextInt());
					break;	
				case 3:
					System.out.print("\nvalue at last :");
					dl.addLast(sc.nextInt());
					break;
				case 4:
					System.out.println("\ndeleted value :" + dl.deleteFirst());
					break;
				case 5:
					System.out.println("\nvalue for deletion :");
					System.out.println("deleted  :"+dl.deleteAny(sc.nextInt()));
					break;	
				case 6:
					System.out.println("\ndeleted value :" + dl.deleteLast());
					break;
				case 7:
					dl.visitNext();
					break;
				case 8:
					dl.visitPrev();
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
								  }
		} while (choice != 0);
	}

}
