package ex0213.casting;

class CastingExam{
	public static void main(String []args){
		byte b1; //1byte 크기 
		byte b2,b3; //1byte 크기 
		int i1=7; //4byte 크기 
		
		System.out.println("int i1=" + i1);

	    b1 = (byte)i1 ;
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1);// 연산기호를 만나면 무조건 결과는 4byte이상...

		System.out.println("byte b3="+b3);
		
		long lo=56897L; //
		System.out.println("long lo="+lo);

		int i4=(int)lo+i1; 
		System.out.println("int i4="+i4);
		
		boolean boo;
		 boo=false; 
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3; //
		System.out.println("double d="+d);

		float f1 = lo;//  long < float
		System.out.println("float f1="+f1);
				
		
	    float f2= (float)d;
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0167';
		System.out.println("char c1="+c1);

		 b2 = (byte)c1; 
		System.out.println("byte b2="+b2);
		
		c2='A';
		System.out.println("char c2="+c2);
		
		
		c3= (char)(c2 + 2);//연산된다.
		System.out.println("char c3="+c3);
		
		
	}

}