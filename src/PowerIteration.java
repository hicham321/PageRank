
public class PowerIteration  {
	
	//number of webpages (nodes) in the web graph 
	private int nodesNumber ;
	//matrix of the graph 
	private double[][] mat = new double[nodesNumber][nodesNumber];
	//vector of page rank scores 
	private double [] PageRankVector = new double [this.nodesNumber] ;
	
	
	
	
	// method for calculating the product of the vector with the matrix R= Matrix *R
	
	private  double[] product(){
	    
		return ;
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
