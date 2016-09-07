
public class TwelveDays {
	public static void main(String[] args){
		trueLove("first");
		System.out.println("A Partridge in a Pear Tree\n");
		trueLove("second");
		two();
		trueLove("third");
		three();
		trueLove("fourth");
		four();
	}
	public static void trueLove(String day){
		System.out.print("On the ");
		System.out.println(day + " of Christmas");
		System.out.println("my true love sent to me");
	}
	public static void two(){
		System.out.println("Two Turtle Doves");
		System.out.println("and a Patridge in a Pear Tree\n");
	}
	public static void three(){
		System.out.println("Three French Hens");
		two();
	}
	public static void four(){
		System.out.println("Four Calling Birds");
		three();
	}
	public static void five(){
		System.out.println("Fiiiiiiive golden RIIIIIIIIIINGS");
		four();
	}
	public static void six(){
		System.out.println("Six Geese a Laying");
		five();
	}
}
