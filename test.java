class test{
	public static void main(String[] args) {
		System.out.println();
		System.out.println(p.origin.x);	 
		//p t = new p();
		//System.out.println(t.origin.origin.origin.x);
	}
}
class p{
	int x, y;
	p(){ 
		System.out.println("Constructor Called");
		x = 0;
		y = 0;
	}
	static final p origin = new p();
}

/* 
 * p(static)
 */