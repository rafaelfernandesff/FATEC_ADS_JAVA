public class exercicio03 {
    public static void main(String[] args) {
        int[][] mat = new int[8][8];

        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++){
                if (i == j || i > j) {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

         for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
