package com.bangle.product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import com.mysql.cj.xdevapi.Result;
public class inventory {
   private List<Bangle> bangles = new ArrayList<>();
   Connection con;
   Statement stmt;
   ResultSet rs;
        String qry=null;

   public void addBangle(Bangle bangle) {
//        bangles.add(bangle);
    int count=0;
    try {
    Dbutil db=new Dbutil();
    Connection con=db.getDBConnection();
    stmt=con.createStatement();
       qry = "insert into bangles(id,name,price) values('"+bangle.getId()+"','"+bangle.getName()+"','"+bangle.getPrice()+"')";
    count=stmt.executeUpdate(qry);
   
   
    }
    catch(Exception ex) {
    System.out.println(ex.getMessage());
   
    }
    System.out.print("Inserted Successfully");
   }


   public void updateBangle(Bangle bangle,String s) {
//     Scanner sc = new Scanner(System.in);
//        for (Bangle bangle : bangles) {
//            if (bangle.getId() == id) {
//             System.out.println("Enter the field to be updated(color/price):");
//             String s= sc.next();
            if(s.equals("color")) {
////             System.out.print("Enter new Bangle Color: ");
////                    String newName = sc.next();
                   try {
            Dbutil db=new Dbutil();
            Connection con=db.getDBConnection();
            stmt=con.createStatement();
            qry=("update bangles set name='"+bangle.getName()+"' where id="+bangle.getId());
            int count=stmt.executeUpdate(qry);
            }
                   catch(Exception ex) {
                    System.out.println(ex.getMessage());
                   }
            }
//                bangle.setName(newName);
//             }
            else if(s.equals("price")) {
//              System.out.print("Enter new Bangle Price: ");
//                    double newPrice = sc.nextDouble();
//                bangle.setPrice(newPrice);
//             }
//                return;
            try {
            Dbutil db=new Dbutil();
            Connection con=db.getDBConnection();
            stmt=con.createStatement();
            qry=("update bangles set price='"+bangle.getPrice()+"' where id="+bangle.getId());
            int count=stmt.executeUpdate(qry);
            }
                   catch(Exception ex) {
                    System.out.println(ex.getMessage());
                   }
           }
//        }
//        System.out.println("Bangle with ID " + id + " not found.");
//     try {
//     Dbutil db=new Dbutil();
//     con=db.getDBConnection();
//     stmt=con.createStatement();
//     qry=("update bangles set name='"+bangle.getName()+"' where id="+bangle.getId());
//    
//     }
    }


   public void deleteBangle(int id) {
//        Iterator<Bangle> iterator = bangles.iterator();
//        while (iterator.hasNext()) {
//            Bangle bangle = iterator.next();
//            if (bangle.getId() == id) {
//                iterator.remove();
//                return;
//            }
//        }
//        System.out.println("Bangle with ID " + id + " not found.");
    try {
    Dbutil db=new Dbutil();
    Connection con=db.getDBConnection();
    stmt=con.createStatement();
    qry="delete from bangles where id="+id;
    int count=stmt.executeUpdate(qry);
    }
    catch(Exception ex) {
            System.out.println(ex.getMessage());
            }
    System.out.println("Bangle with ID " + id +" Deleted Successfully");
   }


   public void showBangles() {
    try {
   

        Dbutil db =new Dbutil();

        con=db.getDBConnection();

        stmt=con.createStatement();

        rs=stmt.executeQuery("select * from bangles");

        while(((ResultSet) rs).next())

        System.out.println(((ResultSet) rs).getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

        }

        catch(Exception ex)

        {

        System.out.println(ex.getMessage());

        }

    }
    }
//        if (bangles.isEmpty()) {
//            System.out.println("No bangles available.");
//        } else {
//            for (Bangle bangle : bangles) {
//                System.out.println(bangle);
//            }
//        }
//    }
// }