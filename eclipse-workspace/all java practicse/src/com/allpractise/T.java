package com.allpractise;
class Animal{
	
}
class Dog extends Animal
{
	
}
 class T {
	Animal test()
	{
		System.out.println("animal type");
		return new Animal();
	}}
	class T1 extends T 
	{
	Dog test()
	{
		System.out.println("dog type");
		return new Dog();
	}
	

	public static void main(String[] args) {
		
		new T1().test();

	}

}
