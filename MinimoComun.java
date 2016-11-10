import java.util.Scanner;
public class MinimoComun{
	public static void main(String[]args){
		int mcd = 0;
		int mcm;
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba el primer numero");
		num1=sc.nextInt();
		System.out.println("Escriba el segundo numero");
		num2=sc.nextInt();
		

        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
		
		mcm=(num1*num2)/mcd;
		
		System.out.println("El minimo comun multiplo entre el " + num1 + " y " + num2 + " es : " + mcm);
		System.out.println("El maximo comun divisor es " + mcd);
		
	}
	
}