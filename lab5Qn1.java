package lab5;
import java.io.*;
import java.util.*;

public class lab5Qn1 {

		public static void main(String[] args) {
			try
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter Source File Name:");
				String sfilename=sc.next();
				File j = new File(sfilename);
				if(j.exists()) {
					System.out.println("File exists keep moving");
				}
				else {
					System.out.println("File doesnt exit");
					
				}
				FileInputStream FI=new FileInputStream(sfilename);
				System.out.print("Enter Target File Name:");
				String tfilename=sc.next();
				File f = new File(tfilename);
				if(f.exists()) {
					System.out.println("Destination file exist, keep moving");
				}
				else {
					f.createNewFile();
				}
				System.out.println("Do tou want ot overwrite, choose 1(overwrite) /0(don't overwrite");
				int r=sc.nextInt();
				if(r==1) {
				FileOutputStream FO=new FileOutputStream(tfilename);
				int p;
				//read content and write in another file
				while((p=FI.read())!=-1){
					FO.write(p);
					}
				System.out.println("\nFile Copied...");
				FI.close();		
				FO.close();	
				}
				else{
					System.out.println("Nothing is done");
				}}
			catch(IOException e)
			{
				System.out.println(e);
				}
			}
	

}

