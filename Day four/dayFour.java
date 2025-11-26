public class dayFour{

public static String getIntegerOfTheMonth(int month){

String monthNumber = " ";

if (month > 0 && month <= 3){
	monthNumber = "Q1";
}
if (month > 3 && month <= 6){
	monthNumber = "Q2";
}
if (month > 6 && month <= 9){
	monthNumber = "Q3";
}
if (month > 9 && month  <= 12){
	monthNumber = "Q4";
}
	return monthNumber;
	}


}