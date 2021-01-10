import java.util.Locale;
import java.util.Scanner;

public class PrintPatterns {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
		String choice;
		System.out.println("Изберете фигура: ");
		choice = in.next();
		int num;
		int blank;
		System.out.println("Изберете размер: ");
		num = in.nextInt();
		blank = num - 1;
		if(choice.equals("a")) {
			for (int j=1; j<=num; j++){
				for (int i=1; i<=blank; i++){
					System.out.print(" ");
				}
				blank--;
				for (int k=1; k <=(2*j)-1; k++){
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		if(choice.equals("b")) {
			blank = 1;
			for (int j=1; j<= num-1; j++){
				for (int i=1; i<= blank; i++){
					System.out.print(" ");
				}
				blank++;
				for (int k=1; k<=2 *(num-j)-1; k++){
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		if(choice.equals("c")) {
			
			blank = num - 1;
			for (int j=1; j<=num; j++){
				for (int i=1; i<=blank; i++){
					System.out.print(" ");
				}
				blank--;
				for (int k=1; k<=(2*j)-1; k++){
					System.out.print("*");
				}
				System.out.println("");
			}
			
			blank = 1;
			for (int j=1; j<= num-1; j++){
				for (int i=1; i<= blank; i++){
					System.out.print(" ");
				}
				blank++;
				for (int k=1; k<=2 *(num-j)-1; k++){
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	}

}
