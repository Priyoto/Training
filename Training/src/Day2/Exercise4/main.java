package Day2.Exercise4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class main {

	private static final String filepath="C:\\Users\\Priyotosh\\Desktop\\object.txt";
	
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
		Order o1=new Order(100,"Brush","Sourav");
		Order o2=new Order(102,"Soap","Rakesh");
		Order o3=new Order(90,"Mobile","Aritra");
		FileOutputStream fileOut = new FileOutputStream(filepath);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(o1);
        objectOut.writeObject(o2);
        objectOut.writeObject(o3);
        objectOut.close();
        System.out.println("The Object  was succesfully written to a file");
        
        FileInputStream fileIn=new FileInputStream(filepath);
        ArrayList<Order> objectsList = new ArrayList<>();
        ObjectInputStream objectIn=new ObjectInputStream(fileIn);
        
        try {
        while(true) {
        	
        	Order obj=(Order)objectIn.readObject();
        	
        		objectsList.add(obj);
        		
        	
        }
        }catch(EOFException e) {
        	
        	Collections.sort(objectsList, (p1,p2)->p1.getOrder_id()-p2.getOrder_id());
        	System.out.println(objectsList);
        }
        fileIn.close();
        

	}

}
