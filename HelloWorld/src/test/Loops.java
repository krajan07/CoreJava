package test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// While Looping
		//int index = 5;
		
		/*while(index>0)
		{
			System.out.println("Loop : " + index);
			index--;
		}*/
		
		
		/*while(index>0)
		{
			System.out.println("Loops : " + index);
			index = index-1;
		}*/
		
		/* while(index>0)
		{
			if(index!=3)
			{
			System.out.println("Looped : " + index);
			}
			index--;
		} 
		
		int index1 =5 ;
		
		while (index1>0)
		{
			System.out.println("Looped : " + index1);
			if(index1==3)
			{
				break;
			}
			index1--;
			
		}
		
		// DO WHILE LOOP
		
		int index3 = 1;
		
		do {
			System.out.println("In Loop : " + index3);
			index3++;
		}while(index3<11);

	}
	
	int index4 = 10;
	do {
		System.out.println("Inside Loop : " + index4);
		index4--;
	}while(index4>0); 
		
	// FOR LOOP
		
	for(int i=1; i<11; i++)
		{
		System.out.println("i = " + i);
		}
		
		for(int i=10; i>0; i--)
		{
		System.out.println("i value = " + i);
		} */
		
		
		String array2[] = {"Rishi", "Sid", "Siva", "Renu"};
		for(int i=0; i<array2.length;i++) {
			System.out.println("Value in array " + i + " is " + array2[i]);
		}
		
	
  }
}
