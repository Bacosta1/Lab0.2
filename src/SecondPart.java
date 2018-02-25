	import java.util.ArrayList;
	import java.util.Scanner;

	public class SecondPart {

		public static void main(String[] args){
		}
			public static void cases() {
			Scanner c = new Scanner(System.in);		
			System.out.println("Enter desire cases:");
			int cases = c.nextInt();
			
			ArrayList<Integer> l1 = new ArrayList<Integer>();
			for (int i=0; i<=3;i++) {
			System.out.println("Enter desire request:");
			Scanner in = new Scanner(System.in);		
			int request = in.nextInt();
			 if (request==1) {
				 int x = in.nextInt();
				l1.add(x); 
			 }
			 else if (request==2) {
				 int y = in.nextInt();
				remove(l1,y); 
			 }
			 else {
				 System.out.println(l1.size());
			 }
			}
			}
			private static ArrayList<Integer> remove(ArrayList<Integer> l2, int remove) {
				// TODO Auto-generated method stub
				ArrayList<Integer> l3 = new ArrayList<>();
				l3.addAll(l2);
				l2.clear();
				for (int z:l3) {
					if (z!=remove) {
						l2.add(z);
					}
				}
				return l2;
			}
	}
