import java.util.Scanner;


public class PowerIteration  {
	
	//number of webpages (nodes) in the web graph 
	private int nodesNumber ;
	//matrix of the graph 
	private double[][] mat = new double[nodesNumber][nodesNumber];
	//vector of page rank scores 
	private double [] PageRankVector = new double [this.nodesNumber] ;
	
	
	Scanner sc = new Scanner(System.in);
	
	// method for entering the graph matrix :
	
	private void data(){
		System.out.println("enter the number of nodes :");
		this.nodesNumber=sc.nextInt();
		for(int i =0 ;i< this.nodesNumber ;i++){
			for(int j=0 ; j<this.nodesNumber;j++){
		          System.out.println("enter the element of row"+ " " +i+" " + "and column"+" "+j);
		          
		    }
		}
	}
	
	
	
	//method for verifying if the graph contains a spider trap or a dead end
	private void verify (){
		
		
	} 
	// method for calculating the product of the vector with the matrix R= Matrix *R
	private  double[] product(){
	    double [] s= new double [10];
		return s ;
	}
	
	
	//setters and getters
	private int getnodesNumber(){
		
		return nodesNumber;
	}
		
	
	private void setnodesNumber( int nodesNumber){
		
		this.nodesNumber= nodesNumber;

	}
	
	
public static void main(String[] args) {
	
}
}
