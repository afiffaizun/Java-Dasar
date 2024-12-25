package dasar;

public class TipeDataNumber {
	public static void main(String[] args) {
		
		int angkaBulat = 10;
		double angkaDesimal = 3.15;
		float angkaFloat = 5.75f;
		
		System.out.println("Angka Bulat        :  "  + angkaBulat);
		System.out.println("Angka Desimal  :  "  + angkaDesimal);
		System.out.println("Angka Float        :  "  + angkaFloat);
		
		//Operasi matematika
		int tambah = angkaBulat + 10;
		double kali = angkaDesimal * 2;
		float bagi = angkaFloat / 2;
		
		System.out.println("Penjumlahan : " + tambah);
		System.out.println("Penjumlahan : " + kali);
		System.out.println("Penjumlahan : " + bagi);
	}
}
