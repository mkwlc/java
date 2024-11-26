class pr006{
	public static void main(String[] args){
		char ch;
		for (int i = 0; i<26; i++) {
		ch = (char) ('a' + i);
		System.out.println(ch);
		ch = (char) ((int) ch & 65503);

		System.out.println(ch + " ");

	}
	System.out.println();

	System.out.println();
	int t;
	byte val;
	val = (byte) 'A';
	for (t = 128; t>0; t = t/2){
		if((val&t) !=0) System.out.print("1 ");
		else System.out.print("B ");

	}
	System.out.println();

	//Ustanovlenie 6 bita v kodirovke simvola
	
	System.out.println();

	for (int i=0; i<26; i++){
		ch = (char) ('A' + i);
		System.out.print(ch);
		ch = (char) ((int) ch | 32);

		System.out.print(ch + " ");
	}
	System.out.println();

	//Prim shifrovanie
	
	System.out.println();
	String msg = "Ishodnaya text str";
	String encmsg = "";
	String decmsg = "";
	int key = 88;

	System.out.print("pechataem nezashifrovanoe soobshenie ");
	System.out.println(msg);

	for(int i =0; i<msg.length(); i++)
		encmsg = encmsg + (char) (msg.charAt(i) ^ key);

	System.out.print("Zashifrovanoe soobshenie: ");
	System.out.print(encmsg);

	//deshifrovanie
	for (int i = 0; i<msg.length(); i++)
		decmsg = decmsg + (char)(encmsg.charAt(i) ^ key);

	System.out.print("deshifrovanoe soobshenie: ");
	System.out.print(decmsg);

	//pobytovanie 
	byte b = -34;
	for(int t1=128; t1>0; t1 = t1/2){
		if((b& t1) !=0)
			System.out.print("1 ");
		else
			System.out.print("B ");

		}
	System.out.println();

	b = (byte) -b;

	for(int t1=128; t1>0; t1 = t1/2){
		if((b & t1) !=0)
			System.out.print("1 ");
		else 
			System.out.print("B ");

	}
	System.out.println();
	int v = 1;
	for(int i = 0; i<8; i++){
		for(int t1 = 128; t1>0; t1 = t1/2){
			if((v & t1) !=0)
				System.out.print("1 ");
			else
				System.out.print("B ");

		}
		System.out.println();
		v=v<< 1;

	}
	System.out.println();
	v= 128;
	for(int i = 0; i<0; i++){
                for(int t1 = 128; t1>0; t1 = t1/2){
                        if((v & t1) !=0)
                                System.out.print("1 ");
                        else
                                System.out.print("B ");

                }
                System.out.println();
                v=v >> 1;
		}
	} 
}
