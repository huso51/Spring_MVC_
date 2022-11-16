package com.huseyinaydin.robot;

import org.springframework.stereotype.Component;

@Component("lacivertBas")
public class Lacivert implements Bas {

	@Override
	public void olustur() {
		System.out.println("LACİVERT baş robota eklendi.");
	}

}
