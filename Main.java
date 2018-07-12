import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class Main {
public static void main(String[] args) throws IOException {
	int x,n,calculation;
	int count=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Vector<Integer> num = new Vector<Integer>();
	String line;
	while((line=br.readLine())!=null && !line.isEmpty()) {
		Scanner sc = new Scanner(line);
		x= sc.nextInt();
		num.add(x);
		count++;
		Collections.sort(num);
		if(count==1) {
			System.out.println(num.get(0));
		}else if(count%2==0) {
			n= count/2;
			calculation=(num.get(n)+num.get(n-1))/2;
			System.out.println(calculation);
		}else {
			System.out.println(num.get(count/2));
		}
		sc.close();
	}
	
}
}
