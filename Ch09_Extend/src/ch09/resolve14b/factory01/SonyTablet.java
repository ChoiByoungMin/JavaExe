package ch09.resolve14b.factory01;

import ch09.resolve14b.ITablet;

public class SonyTablet implements ITablet {

	@Override
	public void movie()throws InterruptedException {
		System.out.println("SonyTablet - 映画がスムーズに上映される~L");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void music()throws InterruptedException {
		System.out.println("SonyTablet - 音楽がきれいに聞こえる~L");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void readBook()throws InterruptedException {
		System.out.println("SonyTablet - 字がきれいに見える~L");
		Thread.sleep((long)(Math.random()*500)+500);
	}
}
