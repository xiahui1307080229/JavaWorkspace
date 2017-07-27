package test;

public class ArrJava {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int score[] = null;
			score = new int[3];
			for(int x = 0; x < 3; x++)
			{
				score[x] = x * 2 + 1;
			}
			for(int x = 0; x < score.length ; x++)
			{
				System.out.println("score["+x+"] =" + score[x]);
			}
		}
}
