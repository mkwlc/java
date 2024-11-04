class pr002 {
        public static void main(String args[]) {
                byte b, bb, bbb; // 8-bit peremennaya
                short s, ss, sss; // 16-bit peremennaya
                int i, ii, I; // 32- bit peremennaya
                long l, ll, L;  // 64-bit peremennaya
                b = 127;
                bb = (byte)130;
                s = 32000;
                ss = (short)33000;
                System.out.println("bb = " + bb + "\nss = " + ss);
                sss = 100;
                //bbb = sss; avtopreobrazovanie zapreweno tak kak mojet privesti k potere dannyx
                bbb = (byte)sss;
                System.out.println("bbb = " + bbb + "\nsss = " + sss);

                // primer ispolzovaniya razlichnix celyx tipov
                ii = 700000; // storona kyba v millimetrax
                int V = ii*ii*ii; // obyem kyba
                long VV = (long)ii*ii*ii;
                System.out.println(VV);

                double d, dd;
                d = b/2;
                System.out.println("d = " + d);
                dd = (double)b/2;
                System.out.println("dd = " + dd);
		
		//symbol data type
		char ch;
		ch = 'D';
		System.out.println("Value ch: " + ch);
		ch++;
		System.out.println("New value ch: " + ch);
		ch = 97;
		System.out.println("value ch with 97 code: " + ch);
		I = (int)ch;
		System.out.println("ch code: " + I);
		ch = 'А';
		for (i=0; i<63; i++) {
			I = (int)ch;
			System.out.print("Symbol code " + ch + ":" + I + " \n");
			ch++;
		}

		//log data type
		System.out.println("log sym type exmp\n");
		boolean boob;
		boob = false;
		System.out.println("boob value:" + boob);
		boob = true;
		System.out.println("boob value:" + boob);
		if(boob) System.out.println("vivodim stroku, if \"boob\" true ");
		if(!boob) System.out.println("vivodim stroku, if inversia \"boob\" true ");
		boob = (ch== 'я');
		if(boob)
			System.out.println("symbol ch equals \"я\"");

	//Log operations 
	System.out.println("\n");
	boolean p, q;
	System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
	p = true; q = true;
	System.out.print(p + "\t" + q + "\t");
	System.out.print((p&q) + "\t" + (p|q) + "\t");
	System.out.println((p^q) + "\t" + (!p));

	p = false; q = false;
	System.out.print(p + "\t" + q + "\t");
	System.out.print((p&q) + "\t" + (p|q) + "\t");
	System.out.println((p^q) + "\t" + (!p));

	p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
	
	p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
	

	//Unexp increase data type exmp
	System.out.println("\n");
	byte b11;
	int i11;
	b11 = 10;
	i11 = b11 * b11;   //Pri umnojenii tipov byte poluchaetsa povishenie do int

	b11 = 10;
	b11 = (byte)(b11 * b11);
	System.out.println("i11 and b11: " + i11 + " " + b11);


	}

}
