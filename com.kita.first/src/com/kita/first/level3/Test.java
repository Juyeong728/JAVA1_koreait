package com.kita.first.level3;

public class Test {
	public static void main(String[] args) {
		ProGamer p1 = new ProGamer();
		Game game = new Game();
		p1.playGame(game);
		
		StardewValley sDew = new StardewValley();
		p1.playGame(sDew); //자동 형변환
		
		Lol lol = new Lol();
		p1.playGame(lol);
		
		
		
		
		Student minsu = new Student();
		
		for(int i=1; i<=5; i++) {
			int result = minsu.readBooks();
			switch(result) {
			case 1: //minsu가 book1을 다 읽었을 경우
				minsu.book1 = new ComicBook(8); //book1에 새 만화책을 가져옴
				System.out.println("새 만화책을 가져왔다.");
				break;
			case 2: //minsu가 book2을 다 읽었을 경우
				minsu.book2 = new MajorTextBook(7);
				System.out.println("새 전공서적을 가져왔다.");
				break;
			case 3: //minsu가 book3을 다 읽었을 경우
				minsu.book3 = new Book(4);
				System.out.println("새 책을 가져왔다.");
				break;
			}
			System.out.println("------------------");
		}
		
		
		
		
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		animal.crying();
		
		animal = new Animal();
		animal = cat; //부모 안에 자식을 집어넣을 때 자식 타입의 객체는 부모 타입의 객체로 자동 형변환이 가능
					  //animal이 cat의 주소를 가리킴
		animal.crying();
		
		animal = dog;
		animal.crying();
		
		boolean result = animal instanceof Dog;
		System.out.println(result);
		
//		animal.barking(); // 부모 클래스에 있는 필드와 메소드만 접근 가능
		Dog dog1 = (Dog)animal;
		dog1.barking();
		
//		System.out.println(animal);
//		System.out.println(cat);
//		System.out.println(animal == cat);
		
	}
}
