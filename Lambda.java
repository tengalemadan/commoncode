package lambda;

@FunctionalInterface
interface Lambda {
	void p();
	default void print1()
	{
		System.out.println("This is default Method");
	}
	static void print2()
	{
		System.out.println("This is static Method");
	}
	
}	