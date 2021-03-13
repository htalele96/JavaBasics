package practicepkg;

import maths.Formula;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		
		maths.Formula formula = new Formula();
		float addition= formula.add(a, b);
		 
		System.out.println(addition);

		int atomicOxy=18;
		chemistry.Formula formulaChem =  new chemistry.Formula();
		int atoimicWeight= formulaChem.getAtomicWeight(atomicOxy); 
		System.out.println(atoimicWeight);
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            