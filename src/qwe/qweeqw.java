package qwe;

import java.util.Random;

import javax.swing.JOptionPane;

public class qweeqw {

	public static void main(String[] args){
		int[] numero = new int[5];
		Random r = new Random();
		int n = 0;
		String texto = "";
				
		for(int x = 0; x < 5; x++) {
			n = r.nextInt(19);
			if(x != 0) {
				for(int  y = 0; y < x; y++) {
					if(n == numero[y]) {
						y = x;
						x--;
					}else if(y == x-1) {
						numero[x] = n;
						
					}
				}
				
			}else {
				numero[x] = n;
			}
			

		}
		for (int i : numero) {
			texto += i+"\n";
		}
		JOptionPane.showMessageDialog(null, texto);;

	}

}