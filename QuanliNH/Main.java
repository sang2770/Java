package QuanliNH;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(191203366, "NguyenSang", 100000000,"123");
		Account a2=new Account(191203367, "NguyenNam", 100000000,"124");
		Account a3=new Account(191203368, "ThanhXuan", 1000000000, "125");
		Account a4=new Account(191203369, "NguyenHai", 8000000, "126");
		Account a5=new Account(191203360, "NguyenMai", 2000000, "127");
		Scanner sc=new Scanner(System.in);
		ArrayList<Account> list=new ArrayList<Account>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		while(true) {
			System.out.println("======My ATM Bank=====\n"+"1. Dang nhap\n"+"2.Dang ki");
			int keyi=sc.nextInt();
			switch (keyi) {
				case 1:
					System.out.println("Moi Nhap STK");
					long stk=sc.nextInt();
					System.out.println("Nhap Mat khau");
					String Matkhau=sc.nextLine();
					for(Account z: list)
					{
						if(z.getSoTk()==stk && z.getMk().compareTo(Matkhau)==0)
						{
							System.out.println("Dang nhap thanh cong");
							show();
						}
						else {
							System.out.println("Dang nhap khong thanh cong (Sai So tk-Vui long nhap lai)");
						}
					}
					break;
				case 2:
					System.out.println("Nhap tenTk");
					String name=sc.next();
					System.out.println("Nhap Mat khau");
					String mk=sc.next();
					for (Account account : list) {
						if(account.getNameTk().compareTo(name)==0)
						{
							System.out.println("Tai khoan ton tai vui long nhap lai");
							break;
						}
					}
					break;
				default:
					break;
					}			
		}
}
	public static void show()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("------CHAO MUNG DEN VOI ATM------");
			System.out.println("1. Rut tien\n"+"2.Tra cuu thong tin "+"3.Chuyen tien"+"4.Dao han"+"5.Thoat");
			int x=sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("Nhap so tien can rut(Boi so cu 50.000 VND");
				int y=sc.nextInt();
				if(y<0)
				{
					System.out.println("Vui long nhap lai");
				}
				else {
					
				}
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				break;
			}
		}
	}
}
