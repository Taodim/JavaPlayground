package sandboxes;
import java.util.Arrays;
import sandboxes.Sand;


public class Runner {

	public static void main(String[] args) {
		
		//Create new sand obj
		Sand obj = new Sand();
		
		//Call Speak
		obj.Speak();
		
		//Print array toString differences
		System.out.println(Arrays.toString(obj.array1));
		System.out.println(obj.array1.toString());
	}

}
