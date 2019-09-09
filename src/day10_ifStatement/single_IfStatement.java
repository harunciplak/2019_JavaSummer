package day10_ifStatement;

public class single_IfStatement {
	
public static void main(String[] args) {

	int month = 15;
	if (month > 0 && month < 13) {
		if (month == 4 || month == 6 || month == 9 || month == 11) { 
			System.out.println("30 Days");	
					}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31 Days");
		}
		else 
			System.out.println("28 Days");
}
	else 
		System.out.println("Invalid Entry\n");

System.out.println("1______");

int num1=1; 
int num2=2;
int num3=3;

if (num1==num2 && num1!=num3)
	System.out.println(num1+"Equal to "+num2);

else if (num1==num3 && num1!=num2)
	System.out.println(num1+"Equal to "+num3);

else if (num2==num3 && num1!=num2)
	System.out.println(num2+"Equal to "+num3);

else if (num1==num2 && num1==num3)
	System.out.println("all the numbers are equal");

else
	System.out.println("None of them is equal\n");

System.out.println("2______");

int grade =101;
if (grade >=0 && grade <=100) {
if (grade >= 60) {
	
		if (grade >=90) {
			System.out.println("with an A ");
		}else if (grade >=80) {
			System.out.println("with an B ");
		}else if (grade >=70) {
			System.out.println("with an C ");
		}else if (grade >=60) {
			System.out.println("with an D ");
		}
}
else {
			System.out.println("You Failed");
}
}else{ 
System.out.println("Invalid Entry");
}
}
}
