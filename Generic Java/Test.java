class Gen<T> {
	T ob;
	Gen(T ob) {
		this.ob = ob;
	}	
	public void show() {
		System.out.println("This type of ob:"+ob.getClass().getName());
	}
	public T getOb() {
		return ob;
	}
}
public class Test {
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("Vishal");
		g1.show();
		System.out.println(g1.getOb());

		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getOb());


		Gen<Double> g3 = new Gen<Double>(5.6);
		g3.show();
		System.out.println(g3.getOb());

	}
}