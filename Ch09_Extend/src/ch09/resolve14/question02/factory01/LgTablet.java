package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LgTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LgTablet - 영화가 부드럽게 상영 된다~L");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void music() throws InterruptedException{
		System.out.println("LgTablet - 음악이 깨끗하게 잘 들린다~L");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void readBook() throws InterruptedException{
		System.out.println("LgTablet - 글자가 깨끗하게 잘 보여진다~L");
		Thread.sleep((long)(Math.random()*500)+500);
	}

}
