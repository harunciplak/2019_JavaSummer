package day14_TernaryScanner;

public class Ternary {

	/*
	int score =80;
		char Finals =' ';
		
		if(score >= 90 && score <=100)
				Finals ='A';
		else if(score >= 80 && score <= 89)
				Finals = 'B';
		else if(score >=70 && score <= 79)
				Finals = 'C';
		else if(score>= 60 && score <= 69)
				Finals ='D';
		else if(score>=0 && score <= 59)
				Finals = 'F';
		else
			Finals = ' ';
		  
	 */
	public static void main(String[] args) {
		
	
	int score =70;
	char finals =' ';
	
	finals = (score >= 90 && score <= 100) ? 'A'
				:(score >= 80 && score <= 89) ? 'B'
						:(score >= 70 && score <= 79) ? 'C'
								:(score >= 60 && score <= 69) ? 'D'
										:(score >= 0 && score <= 59) ? 'F'
												: ' ';
	System.out.println(finals);
	}	
}
