class RotateMatrix {
	public static int[][] rotateMatrix(int[][] matrix) {
		int N = matrix.length;
		// System.out.println((N + 1) / 2);
		for(int i = 0; i < (N + 1) / 2; i++) {
			for(int j = i; j < N - 1 - i; j++) {
				// System.out.println(i + " " + j);
				// to in place must store value, and remove all 4 in the rotation.
				int ci = i;
				int cj = j;
				int ni = 0;
				int nj = 0;
				int cv = matrix[ci][cj];
				int ncv = 0;

				for(int r = 0; r < 4; r++) {
					if(r != 0) {
						ci = ni;
						cj = nj;
						cv = ncv;
					}
					ni = cj;
					nj = N - 1 - ci;
					ncv = matrix[ni][nj];
					matrix[ni][nj] = cv;
				}
				
			}
		}
		return matrix;
	}
	public static void print2DMatrix(int [][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length - 1; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print(matrix[i][matrix[i].length - 1] + "\n");
		}
	}
	public static void main(String[] args) {
		int N = 5;
		int[][] matrix = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				matrix[i][j] = (int) (Math.random()*10.0);
			}
		}
		print2DMatrix(matrix);
		for(int r  = 1; r <= 4; r++) {
			System.out.println("Rotation " + r);
			print2DMatrix(rotateMatrix(matrix));
		}
		
	}
}