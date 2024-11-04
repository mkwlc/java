class Mod {
	private int alpha;
		public int beta;
		int gamma;
		void setAlpha(int a){
			alpha = a;
		}
		int getAlpha() {
			return alpha;
		}
}
class Block {
	int a, b, c;
	int V;

	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		V = a * b * c;
	}

	boolean sameBlock(Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
		else return false;
	}

	boolean sameV(Block ob) {
		if(ob.V ==V) return true;
		else return false;
	}
}
class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;

	public FailSoftArray(int size, int errv) {
	a = new int[size];
	errval = errv;
	length = size;
	}

	public int get(int index) {
		if(indexOK(index))
			return a[index];
		return errval;
	}
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	private boolean indexOK(int index) {
		if(index>= 0 & index < length)
			return true;
		return false;
	}
}
class CallByValue {
        void noChange(int i11, int j11) {
                i11 = i11 + j11;
                j11 = -j11;
        }
}
class CallByRef {
	int a12, b12;
	CallByRef (int i12, int j12) {
		a12 = i12;
		b12 = j12;	
	}

        void change(CallByRef ob5) {
                ob5.a12 = ob5.a12 + ob5.b12;
                ob5.b12 = -ob5.b12;
	}
}
//method overload
class Overload {
	void ovlDemo() {
		System.out.println("with no param");
	}
	void ovlDemo(int a15) {
		System.out.println("One param int type: " + a15);
	}
	int ovlDemo(int a15, int b15) {
		System.out.println("Two param int type: " + a15 + " " + b15);
		return a15+b15;
	}
	double ovlDemo(double a15, double b15) {
		System.out.println("Two param double type: " + a15 + " " + b15);
		return a15-b15;
	}
}


class pr007 {
	public static void main(String[] args) {
		Mod ob = new Mod();

		ob.setAlpha(77);
		System.out.println("Ob.alpha value: " + ob.getAlpha());
		ob.beta = 242;
		ob.gamma = 34;

		System.out.println();
		
		FailSoftArray fs = new FailSoftArray(5, -999);

		int x;
		System.out.println("скрытая от пользователя обработка ошибок: ");
		for(int i = 0; i<(fs.length * 2); i++)
			fs.put(i, i*16);

		for(int i=0; i<(fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -999) System.out.println(x + " ");
		}
		System.out.println();

		for(int i = 0; i<(fs.length * 2); i++)
			if(!fs.put(i, i*10))
				System.out.println("Index " + i + " Out of bounds");

		for(int i = 0; i<(fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -999) System.out.println(x + " ");
			else System.out.println("Index " + x + " Out of bounds");
		}
	
		System.out.println();

		System.out.println();
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);
		System.out.println("Ob1 equals ob2: " + ob1.sameBlock(ob2));
		System.out.println("Ob1 equals ob3: " + ob1.sameBlock(ob3));
		System.out.println("Ob1 Volume equals ob3: " + ob1.sameV(ob3));

		System.out.println();
		CallByValue ob4 = new CallByValue();
		int a11 = 15, b11 = 20;

		System.out.println("a11 & b11 be4: " + a11 + " " + b11);
		
		ob4.noChange(a11, b11);
		System.out.println("a11 & b11 after noChange: " + a11 + " " + b11);
		//при передаче параметров методу объекта по значению, значения аргументов не изменяются

		//Пример передачи параметров по ссылке
		System.out.println();
		CallByRef ob6 = new CallByRef(15, 20);

		System.out.println("Ob6 a12 & b12 be4: " + ob6.a12 + " " + ob6.b12);
		ob6.change(ob6);
		System.out.println("a12 & b12 after ob4.Change: " + ob6.a12 + " " + ob6.b12);
		
		System.out.println();
		Overload ob7 = new Overload();
		int resI;
		double resD;

		ob7.ovlDemo();
		System.out.println();
		ob7.ovlDemo(2);
		System.out.println();
		resI = ob7.ovlDemo(4, 6);
		System.out.println("Call res ob7.ovlDemo(4, 6): " + resI);
		System.out.println();
		resD = ob7.ovlDemo(4.1, 6.5);
                System.out.println("Call res ob7.ovlDemo(4.1, 6.5): " + resD);
		System.out.println();
	}
}

