package com.huseyinaydin.robot;

import org.springframework.stereotype.Component;

@Component("sariBas")
public class Sari implements Bas {

	@Override
	public void olustur() {
		System.out.println("SARI baş robota eklendi.");
	}

}
