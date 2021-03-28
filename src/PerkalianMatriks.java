public class PerkalianMatriks {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                  {1,2},
                  {2,2},
                  {3,3}
            };
                 
            int[][] b = new int[][]{
                  {1,6,5,7},
                  {2,3,6,8}
            };
           
            System.out.println("Cetak Matriks A");
            for(int i=0; i<3; i++){
                  for(int j=0; j<2; j++){
                        System.out.print( a[i][j]+" ");    
                  }
                  System.out.println(" ");
            }
           
            System.out.println("Cetak Matriks B");
            for(int i=0; i<2; i++){
                  for(int j=0; j<4; j++){
                        System.out.print( b[i][j]+" ");    
                  }
                  System.out.println(" ");
            }
           
            int[][] c = new int[3][4];
            System.out.println("Hasil Perkalian Matriks A * Matriks B");
            for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
            for(int k=0; k<2; k++){
                  c[i][j]+=a[i][k]*b[k][j];
            }
            System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
            }
    }    
    }
