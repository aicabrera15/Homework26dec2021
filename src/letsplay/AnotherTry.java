package letsplay;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AnotherTry {

	public int[] shuffleGame(int[] ar) {//{0, 1, 1}

		Random rnd = ThreadLocalRandom.current();

		for (int i = ar.length - 1; i > 0; i--) {

		int index = rnd.nextInt(i + 1);

		int a = ar[index];

		ar[index] = ar[i];

		ar[i] = a;

		}

		return ar;

		}


	
}
