package javaanudip;

public class Array2D {
  public static void main(String[]args) {
 int[][]arr=new int[2][2];
 arr[0][0]=10;
 arr[0][1]=11;
 arr[1][0]=12;
 arr[1][1]=13;
   
 int i,j;
 for(i=0;i<2;i++)//row 
 {
	 for(j=0;j<2;j++)//col 
 
 System.out.println(arr[i][j]+"");
 System.out.println();
  }
 
  }
}
  
