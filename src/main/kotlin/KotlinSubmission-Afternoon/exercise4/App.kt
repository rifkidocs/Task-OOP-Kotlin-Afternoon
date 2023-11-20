package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     */

    // Contoh: Membagi dua angka, tangani jika terjadi ArithmeticException
    val numerator = 10
    val denominator = 0

    try {
        val result = divide(numerator, denominator)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    }
}

// Fungsi untuk pembagian dengan penanganan exception
fun divide(numerator: Int, denominator: Int): Int {
    return numerator / denominator
}
