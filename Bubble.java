//import scanner
import java.util.Scanner;

//class Bubble
public class Bubble{
	//main class
	public static void main (String[] args){
		
		//input how many number want to put
		Scanner input = new Scanner(System.in);
		System.out.println("How mant numbers you want to input : ");
        int a = input.nextInt();
        int[] t = new int[a];
		
		//input the numbers
		for (int i =0 ; i < a;i++){
		System.out.println("input the number " + (i+1) + ": ");
		t[i] = input.nextInt();
		System.out.println("---------------------------------");
		}
		//call the method and input the array t
		BubbleSort(t);
		
		//output the array number from big to small
		for(int i = 0 ; i < a ; i ++){
		System.out.println(t[i]);
		}
	}
	public static void BubbleSort( int num[ ]  ){
		int j;
		boolean flag = true;   // set flag to true to begin first pass
		int temp;   //holding variable

		while ( flag ){
		
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ ){
				
                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
					} 
            } 
		} 
	}
}
