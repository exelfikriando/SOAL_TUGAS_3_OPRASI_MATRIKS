public class TugasMatrixTranspose_2 {  // Deklarasi kelas MatrixTranspose
    public static void main(String[] args) {  // Deklarasi metode main, titik masuk untuk menjalankan program
        int[][] matrix = {  // Inisialisasi matriks matrix dengan dua baris dan tiga kolom
            {1, 2, 3},  // Baris pertama dari matrix
            {4, 5, 6}   // Baris kedua dari matrix
        };

        int[][] transpose = new int[matrix[0].length][matrix.length];  // Deklarasi matriks transpose dengan ukuran yang berlawanan dari matrix asli

        for (int i = 0; i < matrix.length; i++) {  // Loop untuk setiap baris matrix
            for (int j = 0; j < matrix[0].length; j++) {  // Loop untuk setiap kolom matrix
                transpose[j][i] = matrix[i][j];  // Menukar elemen baris dan kolom untuk mendapatkan transpose
            }
        }

        System.out.println("Transpose of the matrix:");  // Menampilkan teks "Transpose of the matrix:"
        for (int[] row : transpose) {  // Loop untuk menjelajahi setiap baris dalam matriks transpose
            for (int value : row) {  // Loop untuk menjelajahi setiap elemen dalam baris
                System.out.print(value + " ");  // Mencetak nilai-nilai elemen dalam baris
            }
            System.out.println();  // Mencetak baris baru setelah setiap baris selesai
        }
    }
}

