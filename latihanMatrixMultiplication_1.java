public class latihanMatrixMultiplication_1 {  // Deklarasi kelas MatrixMultiplication
    public static void main(String[] args) {  // Deklarasi metode main, titik masuk untuk menjalankan program
        int[][] matrixA = {  // Inisialisasi matriks matrixA dengan tiga baris dan dua kolom
            {1, 2},  // Baris pertama dari matrixA
            {3, 4},  // Baris kedua dari matrixA
            {5, 6}   // Baris ketiga dari matrixA
        };

        int[][] matrixB = {  // Inisialisasi matriks matrixB dengan dua baris dan tiga kolom
            {7, 8, 9},  // Baris pertama dari matrixB
            {10, 11, 12}  // Baris kedua dari matrixB
        };

        int[][] result = new int[matrixA.length][matrixB[0].length];  // Deklarasi matriks result dengan ukuran sesuai hasil perkalian

        for (int i = 0; i < matrixA.length; i++) {  // Loop untuk setiap baris matrixA
            for (int j = 0; j < matrixB[0].length; j++) {  // Loop untuk setiap kolom matrixB
                for (int k = 0; k < matrixA[0].length; k++) {  // Loop untuk elemen-elemen yang akan dikalikan
                    result[i][j] += matrixA[i][k] * matrixB[k][j];  // Perkalian elemen matrixA dan matrixB, hasilnya ditambahkan ke result
                }
            }
        }

        System.out.println("Result of matrix multiplication:");  // Menampilkan teks "Result of matrix multiplication:"
        for (int[] row : result) {  // Loop untuk menjelajahi setiap baris dalam matriks result
            for (int value : row) {  // Loop untuk menjelajahi setiap elemen dalam baris
                System.out.print(value + " ");  // Mencetak nilai-nilai elemen dalam baris
            }
            System.out.println();  // Mencetak baris baru setelah setiap baris selesai
        }
    }
}
