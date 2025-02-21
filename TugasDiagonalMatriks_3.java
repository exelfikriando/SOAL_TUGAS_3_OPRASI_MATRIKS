public class TugasDiagonalMatriks_3 {  // Deklarasi kelas DiagonalMatriks
    public static void main(String[] args) {  // Deklarasi metode main, titik masuk untuk menjalankan program
        int[][] matriks = {  // Inisialisasi matriks dengan tiga baris dan tiga kolom
            {1, 2, 3},  // Baris pertama dari matriks
            {4, 5, 6},  // Baris kedua dari matriks
            {7, 8, 9}   // Baris ketiga dari matriks
        };

        // Menampilkan diagonal utama
        System.out.println("Diagonal Utama:");  // Menampilkan teks "Diagonal Utama:"
        for (int i = 0; i < matriks.length; i++) {  // Loop untuk setiap baris matriks
            System.out.print(matriks[i][i] + " ");  // Mencetak elemen diagonal utama
        }
        System.out.println();  // Mencetak baris baru

        // Menampilkan diagonal samping
        System.out.println("Diagonal Samping:");  // Menampilkan teks "Diagonal Samping:"
        for (int i = 0; i < matriks.length; i++) {  // Loop untuk setiap baris matriks
            System.out.print(matriks[i][matriks.length - 1 - i] + " ");  // Mencetak elemen diagonal samping
        }
        System.out.println();  // Mencetak baris baru
    }
}

