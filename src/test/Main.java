package test;

@FunctionalInterface
interface MyInterface {
	void show(String name);
	void showf(String name);
}

public class Main {

	public static void main(String args[]) {

		MyInterface obj = (name) -> System.out.println("Hello "+name);

		obj.show("Prem");
	}
}