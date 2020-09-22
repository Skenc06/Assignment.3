package assignment3;

public class Question5 {

	public static void main(String[] args) {
		
		int inputSecond=3695;
		
		int hours = inputSecond/3600;
		int minutes = (inputSecond - hours * 3600) / 60;
		int seconds = inputSecond %60;
		
		System.out.println("inputSecond is " + inputSecond);
		System.out.println();
		System.out.println(hours+" hours, " + minutes + " minutes, " + seconds + " seconds");

	}

}
