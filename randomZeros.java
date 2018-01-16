import java.util.Arrays;
public class randomZeros {
	public static void main(String[] args) {
		 int[] numbers = new int[10];       
		    for(int i = 0; i < numbers.length; i++) {
		      numbers[i] = (int)(Math.random()*50 + 1);
		    }
		    System.out.println(Arrays.toString(numbers));
		}
	}