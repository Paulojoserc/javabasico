package javabasico.aula45;

public class Test2 {
public static void main(String[] args) {
	Object obj1 = obterString();
	
	String s1 = (String) obj1;//upcasting
	
	Object obj2 = "Minha String";
	String s2 = (String) obj2; //downcasting
	
	Object obj3 = new Object();
	//String s3 = (String) obj3;
	
	Object obj4 = obterinteiro();
	String s4 = (String) obj4;
}

public static String obterString() {
	return "minha String";
}

public static Integer obterinteiro() {
	return 1;
}
}
