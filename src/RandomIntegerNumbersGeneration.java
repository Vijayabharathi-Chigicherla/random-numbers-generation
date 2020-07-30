
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntegerNumbersGeneration {

	public static void main(String[] args) {

		System.out.println("enter input value");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input;
		try {
			input = Integer.parseInt(in.readLine());
			Random rand = new Random();
			List<Integer> randomIntList = new ArrayList<Integer>();
			while (randomIntList.size() < input) {
				float randomFloat = rand.nextFloat();
				int randomInt = (int) (randomFloat * input);
				if (randomInt == 0) {
					randomInt = input;
				}
				if (!randomIntList.contains(randomInt)) {
					randomIntList.add(randomInt);
				}
			}
			System.out.println("integers between 1 and " + input + " in random order:");
			System.out.println(randomIntList);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
