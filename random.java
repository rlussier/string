public class Program
{
    static String randomString = "I am hungry";
    
    static final double PINUM = 1.5;
    
	public static void main(String[] args) {
		System.out.println(randomString);
		System.out.println(PINUM);
		
		int integerOne = 22;
		int integerTwo = integerOne + 3;
		
		System.out.println(integerTwo);
		
		byte bigByte = 125;
		short bigShort = 32767;
		int bigInt = 250000000;
		long bigLong = 5500000000L;
		float bigFloat = 5.67F;
		double bigDouble = 5.6787864534343;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 55;
		char anotherChar = 'x';
		
		System.out.println(randomChar);
		System.out.println(anotherChar);
	}
}
