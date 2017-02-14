package cs362.dominion;


import java.util.List;
import java.util.Random;




public final class Randomness {

	private Randomness(){
		//no instances
	}

	/**
	 * The random number used any test time a random choice is made. 
	 */
	public static Random random = new Random();

	public static void reset(){
		random = new Random(System.currentTimeMillis());
	}

	public static int totalCallsToRandom = 0;


	/**
	 * Uniformly random int from [0, i)
	 */
	public static int nextRandomInt(int i) {
		totalCallsToRandom++;
		return random.nextInt(i);
	}
	public static <T> T randomMember(List<T> list) {
		if (list == null || list.isEmpty())
			throw new IllegalArgumentException("Expected non-empty list");
		return list.get(nextRandomInt(list.size()));
	}

	public  static void main(String args[]){

		Randomness.reset();	   

		for(int i=0; i<10;i++){
			System.out.println("value=: "+ Randomness.nextRandomInt(10));
		}
		System.exit(0);   
	}


}