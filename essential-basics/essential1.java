//日本語を使いたい場合、shift^jis でソースファイルを変更する方法
//もう一つの方法として、javac -encoding utf-8 ~.javaとすればよい。

class Exampleprogram {
	public static void main(String[] args){
		System.out.println("I'm a Simple Program"); //this is not an method
	}
}

//public static void means the JVM can call the programs's main method to start the program(public)
//without creating an instance of the class(static)
//main doesn't belong to to a specific object
//日本語


//and the program does not return data to the JVM(void) whe it ends

//an instance of the class is an executable copy of the class.
//class describes the data and the behavior.
//you need an class instance to aquire and work on the data,.

//main method is static which means it doesn't need an instance.

//however a program must create an instance of a class to access its non-static field and methods. 
//accessing static and non-static fields

//Fields and methods.

//Strings = sequence of characters
//string[]

class LessonTwoA{
	static String text = "I'm a simple program";
	public static void main(String args[]){
		System.out.println(text);
	}
}


class LessonTwoB{
	String text = "I'm a simple program";
	static String text2 = "I'm static text";

	//this method is non static. 
	String getText(){
		return text;
	}
	String getStaticText(){
		return text2;
	}
	public static void main(String[] args){
		LessonTwoB progInstance = new LessonTwoB(); 
		//if you create an instance from the main method, then you can access static
		String retrievedText = progInstance.getText();
		String retrievedStaticText = progInstance.getStaticText();

		System.out.println(retrievedText);
		System.out.println(retrievedStaticText);
	}
}


//static methods and fields are called class methods and fields
//get text method directly without creating an instance of LessonTwoC class

class LessonTwoC{
	static String text = "I'm a simple program";

	static String getText(){
		return text;
	}
	public static void main(String[] args){
		String retrievedText = getText();
		System.out.println(retrievedText);
	}
}

//from B,C
//class methods can only operate on class fields(C)
//instance methods can operate on both class and instance fields(B)
//Difference between B and C 
//there is only one copy of the data stored orset in a class field but each instance
//has its own copy of the data stored or set in an instance field.

//constructors
//special method of the class
//the class constructor always have the same name as the class and no return type.

class LessonTwoD{
	String text;
	//constructor (special type method)	
	LessontwoD(){
		text = "I'm simple program";
	}

	//Accessor method
	String getText(){
		return text;
	}
	public static void main(String[] args){
		LessontwoD progInst = new lessonTwoD();
		String retrievedText = progInst.getText();
	}
}


/*
classs {
	field;
	constroctor 初期化

	public static boid mani[
		instance 作成
		instanceを用いたもので実行プログラムを作成する。を作成ｓるう。
	]
}
*/