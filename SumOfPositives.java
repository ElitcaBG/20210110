import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class SumOfPositives {
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
		double num = 0;
		double min= 0;
		double max= 0;
		double sum = 0;
		String str ="Въведете положително число: ";
		System.out.print(str);
		num = in.nextDouble();
		min = max = num;
		while(num>0) {
		  sum = sum+num;
		  if(num<min) {min=num;}
		  if(max<num) {max =num;}
	      System.out.print(str);
	      num = in.nextDouble();
	     }
		 DecimalFormat df = new DecimalFormat("#.##");
	     System.out.printf(df.format(sum)+"\n");
	     System.out.printf(df.format(min)+"\n");
	     System.out.printf(df.format(max)+"\n");

	}

}
