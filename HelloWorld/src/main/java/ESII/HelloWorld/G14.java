package ESII.HelloWorld;

public class G14 {
	public int a;
	public int b;
	
	/**
	 * construtor ESII
	 * @param a
	 * @param b
	 */
	public G14(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	/**
	 * serve para mudar valores de a e b
	 * @param n
	 */
	public void change(int n) {
		this.a=n*2;
		this.b=n*4;
	}
	/**
	 * getter de a
	 * @return
	 */
	public int getA() {
		return a;
	}
	/**
	 * setter de a
	 * @param a
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * getter de b
	 * @return
	 */
	public int getB() {
		return b;
	}
	/**
	 * setter de b
	 * @param b
	 */
	public void setB(int b) {
		this.b = b;
	}
}
