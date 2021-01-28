package marketsales;

import java.sql.SQLException;
import java.util.Scanner;





public class Main
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		DAO crud=new DAO();
		Scanner sc=new Scanner(System.in);
		int choice,Itemid;
		
		while(true)
		{
			System.out.println("1.Insert the Data\n 2.Display the Data \n 3. Total Item Cost  Data \n 4. Display the list of Items\n 5.Enter any number to exit");
			System.out.println("Select your choice from the above given choices : ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:Bean sales=new Bean();
				System.out.println("===========\nEnter ItemID to insert : ");
				sales.setItemid(sc.nextInt());
				System.out.println("===========\nEnter ItemName to insert : ");
				sales.setItemname(sc.next());
				System.out.println("===========\nEnter  Itemcost to insert : ");
				sales.setItemcost(sc.nextFloat());
				System.out.println("===========\n");
				int i=crud.insertQuerey(sales);
				if (i>0)
				{
				System.out.println(i+" Row Inserted Successfully-------------\n");
				}
				else
				{
				System.out.println("not Inserted Successfully------------\n");
				}
				break;
			case 2:crud.displayQuerey();
				break;
			case 3:crud.toatlcost();
				break;
			case 4:crud.Itemsdisplay();
				break;
			default:System.exit(0);
			}
		}
	}

}
