//Shahzodjon Ismatov (110518374)
public class MatrixMultiplicatoin {

	public static void main(String[] args) {
		double [][] m1 = new double[][]{{1,2},{3,4},{5,6}};
		double [][] m2 = new double[][]{{8,9,10,11},{12,13,14,15}};
		double [][] product = multiply(m1,m2);
		
		/* In order to multiply 2 matrices: 
		 * the # of columns of the 1st matrix must be equal to the # of rows of the 2nd matrix
		 * e.g. 3x2 * 2x4 will result in 3x4 matrix
		 */
		
		printMatrix(product);
	}
	
	public static double[][] multiply(double [][]a, double[][]b){
		double product [][] = new double[a.length][b[0].length];
		for(int i=0; i<a.length;i++)
			for(int j=0; j<b[0].length; j++)
				for(int k=0; k<a[i].length; k++)
					product[i][j] += a[i][k] * b[k][j];
	return product; 	
	}
	
	public static void printMatrix(double [][] product){
		for(double[] row: product){
			for(double i: row)
				System.out.print(i + " ");
			System.out.println();
		}
	}

}
