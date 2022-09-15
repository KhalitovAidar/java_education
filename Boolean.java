class Boolean {

	public static void main(String[] args){
		int b1 = 10;
		int b2 = 9;
		int c1 = 20;
		int ind = 2;
		int big = 90;
		System.out.println("First task");
		System.out.println((b1 + c1) % (++b2 / b1++));
		System.out.println("");
		System.out.println("Second task");
		System.out.println((b1 < c1) && (b2 == -99) || (ind >= 0));
		System.out.println("");
		System.out.println("Third task");
		System.out.println((b1 | c1) & (big ^ b1));
		System.out.println("");
		System.out.println("Four task");
		System.out.println((b1<<3 + c1<<2) % (b2>>5 / b1>>>2));

	}


}