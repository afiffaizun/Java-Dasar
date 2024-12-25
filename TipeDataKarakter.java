package dasar;

public class TipeDataKarakter {

	public static void main(String[] args) {
		
		char huruf1 = 'A'; 
		char huruf2 ='B';
		char simbol = '#';
		
		System.out.println("Karakter pertama : " + huruf1);
		System.out.println("Karakter pertama : " + huruf2);
		System.out.println("Simbol                       : " + simbol);
		
		//Array Karakter
		char[ ] kata = {'J', 'A', 'V', 'A'};
		System.out.println("Kata yang dibentuk dari array karakter:  ");
		for ( char c  :  kata ) {
			System.out.print(c);
		}
	}
}
