package daythree.string;

public class StringOperation {

	public static void main(String[] args) {
		String first = new String("Nitin");
		System.out.println(first instanceof String);
		System.out.println(first.indexOf('i'));
		System.out.println(first.lastIndexOf('i'));
		System.out.println(first.length());
		System.out.println(first.charAt(1));
		System.out.println(first.substring(1));
		System.out.println(first.substring(1, 3));
		
		String whiteSpace = "white   ";
		System.out.println(whiteSpace.trim());
		
		int num = 12345;
		String numString = String.valueOf(num);
		Integer number = Integer.parseInt(numString);
		System.out.println(number*5);
		System.out.println(first.hashCode());
		
		String newString = first.concat(whiteSpace);
		System.out.println(newString);
		System.out.println(newString.hashCode());
		
		String strip = "  Whitespace    ";
		System.out.println(strip.stripLeading());
		System.out.println(strip.stripTrailing());
		
		String removeSpace = "Hii there, How are you ?";
		System.out.println(removeSpace.replaceAll(" ",""));
		
		String paragraph = "My name is Nitin. I am from Pithampur. I am Associate Software Engineer at Solera";
		String[] array = paragraph.split("[.]");
		for(String line : array) {
			System.out.println(line.stripLeading());
		}
		
		StringBuffer buff = new StringBuffer("");
		buff.append("Nitin");
		buff.append(" Mankar");
		System.out.println(buff + " " + buff.capacity());
		buff.append(" Associate Software Engineer at Solera");
		System.out.println(buff + " " + buff.capacity());
		
		String firstC = "Nitin Mankar";
		String secondC = "Nitin Mankar";
		String thirdC = "Solera Inc.";
		
		System.out.println(firstC == secondC);
		System.out.println(firstC.equals(secondC));
		System.out.println(firstC.equals(thirdC));
		System.out.println(firstC.hashCode());
		System.out.println(secondC.hashCode());
		
		

	}

}
