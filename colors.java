import java.util.ArrayList;

public class Program
{
	public static void main(String[] args) {
	    ArrayList<String>colors= new ArrayList<String>();
	    colors.add("Red");
	    colors.add("Blue");
	    colors.add("Green");
	    colors.add("Purple");
	    colors.remove("Green");
	    
	    System.out.println(colors);
	    // Output Red, Blue, Purple
	}
}
