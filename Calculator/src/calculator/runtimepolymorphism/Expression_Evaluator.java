package calculator.runtimepolymorphism;

public class Expression_Evaluator {
	
	public String sqroot(String input) {
		double sqr = Double.parseDouble(input.replaceAll("[sqrt()]",""));
		return String.valueOf(Math.sqrt(sqr));
	}
	
	public String absolute(String input) {
		double abs = Double.parseDouble(input.replaceAll("[abs()]",""));
		return String.valueOf(Math.abs(abs));
	}
	
	public String logarithmic(String input) {
		double log = Double.parseDouble(input.replaceAll("[log()]",""));
		return String.valueOf(Math.log(log));
	}
	
	public String square(String input) {
		String dummy = input.replace("^"," ");
		String[] value = dummy.split(" ");
		double num = Double.parseDouble(value[0]);
		double pow = Double.parseDouble(value[1]);
		return String.valueOf(Math.pow(num, pow));
	}
	
	public String sine(String degree) {
		double deg = Double.parseDouble(degree.replaceAll("[sin()]",""));
		deg = Math.toRadians(deg);
		return String.valueOf(Math.sin(deg));
	}
	
	public String cosine(String degree) {
		double deg = Double.parseDouble(degree.replaceAll("[cos()]",""));
		deg = Math.toRadians(deg);
		return String.valueOf(Math.cos(deg));
	}
	
	public String tangent(String degree) {
		double deg = Double.parseDouble(degree.replaceAll("[tan()]",""));
		deg = Math.toRadians(deg);
		return String.valueOf(Math.tan(deg));
	}
	
	public String cosec(String degree) {
		double deg = Double.parseDouble(degree.replaceAll("[cosec()]",""));
		deg = Math.toRadians(deg);
		return String.valueOf(1/Math.sin(deg));
	}
	
	public String sec(String degree) {
		double deg = Double.parseDouble(degree.replaceAll("[sec()]",""));
		deg = Math.toRadians(deg);
		return String.valueOf(1/Math.cos(deg));
	}
	
	public String cot(String degree) {
		double deg = Double.parseDouble(degree.replaceAll("[cot()]",""));
		deg = Math.toRadians(deg);
		return String.valueOf(1/Math.tan(deg));
	}
	
}
