import java.util.Scanner;
public class XSSchoolSupplies 
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		String items[] = {"Ballpen","Pencil","B. Paper","Eraser","Pad Paper","Folder","Sharpener","Colored Paper","Crayons","Correction Tape"};
		double price[] = {8.00,7.50,1.00,5.00,15.00,12.00,8.00,2.00,30.00,15.00};
		int i;
		int qty;
		
		System.out.println("==[School Supplies]==");
		System.out.println(" ");
		System.out.println("[0] - " + items[0] + "\t" + "[1] - " + items[1]);
		System.out.println("[2] - " + items[2] + "\t" + "[3] - " + items[3]);
		System.out.println("[4] - " + items[4] + "\t" + "[5] - " + items[5]);
		System.out.println("[6] - " + items[6] + "\t" + "[7] - " + items[7]);
		System.out.println("[8] - " + items[8] + "\t" + "[9] - " + items[9]);
		System.out.println(" ");
		System.out.print("Enter an item key: ");
		i = input.nextInt();
		System.out.println(" ");
		System.out.println("Item Name : " + items[i]);
		System.out.println("Item Price: PHP " + price[i]);
		System.out.print("Quantity    : ");
		qty = input.nextInt();
		double total = price[i]*qty;
		System.out.println(" ");
		System.out.println("Total: PHP " + total);
	}
}
