package com.shop;
import java.util.*;
import com.bangle.product.*;
import com.bangle.product.*;
public class main2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inventory shop = new inventory();
        Bangle bangle = new Bangle();
        login login = new login();
       if( login.authenticate()) {
    	   System.out.println("Welcome To BangleStoreManager...!");
//        shop.showBangles();
//        
// }
//}
//        String username;
//        String pwd;
//        System.out.println("Enter the User name:");
//        username=scanner.next();
//        System.out.println("Enter the password name:");
//        pwd=scanner.next();
//        
        while (true) {
            System.out.println("\nBangle Shop Menu:");
            System.out.println("1. Add Bangle");
            System.out.println("2. Update Bangle");
            System.out.println("3. Delete Bangle");
            System.out.println("4. Show All Bangles");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Bangle ID: ");
//                    int id = scanner.nextInt();
//                    scanner.nextLine();
                    bangle.setId(scanner.nextInt());
                    System.out.print("Enter Bangle Color: ");
//                    String name = scanner.nextLine();
                    bangle.setName(scanner.next());
                    System.out.print("Enter Bangle Price: ");
//                    double price = scanner.nextDouble();
//                    scanner.nextLine();
//                    Bangle bangle = new Bangle(id, name, price);
                    bangle.setPrice(scanner.nextDouble());
                    shop.addBangle(bangle);
                    break;

                case 2:
                    System.out.print("Enter Bangle ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                  bangle.setId(updateId);
                    System.out.println("Enter the field to be updated(color/price):");
            String s= scanner.next();
            if(s.equals("color")) {
            System.out.print("Enter new Bangle Color: ");
                   String newName = scanner.next();
               bangle.setName(newName);
            }
            else if(s.equals("price")) {
             System.out.print("Enter new Bangle Price: ");
                   double newPrice = scanner.nextDouble();
               bangle.setPrice(newPrice);
            }
            shop.updateBangle(bangle,s);
//                    shop.updateBangle(updateId);
                    break;

                case 3:
                    System.out.print("Enter Bangle ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    shop.deleteBangle(deleteId);
                    break;

                case 4:
                    shop.showBangles();
                    break;

                case 5:
                    System.out.println("Exited");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
       else {
    	   System.out.println("Welcome To BangleStoreManager...!");
    	   System.out.println("***Available Bangles***");
    	   shop.showBangles();
       }
}

}

