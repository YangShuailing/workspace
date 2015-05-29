import java.util.Random;


public class RanHundred{
	public static void main(String [] args){
		int n = 100;
		int[] array = new int[n];
		Random  r = new Random(100);
		for(int i=0; i<100; i++){
			array[i] = r.nextInt(100)+1;
			for(int j=0;j<i;j++){
				if(array[i]==array[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0;i<100;i++){
			System.out.println(array[i]);
		}
	}
}