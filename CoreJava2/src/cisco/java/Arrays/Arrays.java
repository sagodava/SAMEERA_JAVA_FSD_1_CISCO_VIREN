package cisco.java.Arrays;

public class Arrays {
	

	    public static void main(String[] args) {
	        int rows = 2, columns = 3;
	        int[][] a = { {2, 3, 4}, {5, 2, 3} };
	        int[][] b = { {-4, 5, 3}, {5, 6, 3} };

	        // Adding Two matrices
	        int[][] sum = new int[rows][columns];
	        for(int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }

	        // Displaying the result
	        System.out.println("Sum of the given matrices is: ");
	        for(int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < columns; j++)
	            {
	                System.out.print(sum[i][j] + "    ");
	            }
	            System.out.println();
	        }
	    }
	}


