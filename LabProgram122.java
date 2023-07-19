import java.util.Scanner; 

public class LabProgram122 {
   public static void main(String[] args) {
	   
	   Scanner scnr = new Scanner(System.in);	   
	   int tempValue = scnr.nextInt();  
	   
	   String[] nameArray = new String[tempValue+1];
	   int[] counter= new int[tempValue];
	   
	   for (int i=0; i<tempValue+1; i++) {
		   nameArray[i] = scnr.next();
	   }
	   
	   for (int i=0; i<tempValue; i++) {
		   String tempString = nameArray[i];
		   for(int j=0; j<tempString.length(); j++) {
			   if (tempString.charAt(j) == nameArray[nameArray.length-1].charAt(0))
				   counter[i]++;
		   }
	   }	   
	   for (int i=0; i<nameArray.length-1; i++) {
		   if (counter[i]>0)
			   System.out.print(nameArray[i] + ",");
	   }
	   System.out.println();
	   
   }
}
