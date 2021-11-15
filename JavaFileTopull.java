package lab5;
import java.util.*;
import java.io.*;

public class lab5Qn5 {

	public static void main(String[] args) {
		try{ 
			int avg;
			Scanner scn=new Scanner(System.in);
			FileOutputStream fos=new FileOutputStream("E:\\score.txt");
			PrintWriter ne=new PrintWriter(fos);
			int score[][]=new int[2][2];
			score[0][0]=40;
			score[0][1]=50;
			score[1][0]=60;
			score[1][1]=70;
			ne.print(score[0][0]);
			ne.println("	"+score[0][1]);
			ne.print(score[1][0]+"	");
			ne.println(score[1][1]);
			ne.println("-----------------");
		    ne.close();
		FileInputStream fin=new FileInputStream("E:\\score.txt");    
	    BufferedInputStream bin=new BufferedInputStream(fin);    
	    int i;    
	    while((i=bin.read())!=-1){    
	     System.out.print((char)i); 
	    } 
	    for(int l=0;l<2;l++) {
	    	int sum=0;int count=0;
	    	for(int j=0;j<2;j++) {
	    		sum+=score[j][l];
	    		count++;
	    	}
	    	 avg=sum/count;
	    	System.out.print(sum/count+"	"); 
	    	 FileOutputStream fo=new FileOutputStream("E:\\score.txt",true);
	 		PrintWriter n=new PrintWriter(fo);
	 		
	 		n.print(avg+"	");
	 		 
	 		n.close();
	    }
	   
	   
	    
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
