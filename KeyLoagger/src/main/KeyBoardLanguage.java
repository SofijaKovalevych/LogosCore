package main;

import java.awt.im.InputContext;
import java.util.concurrent.TimeUnit;

public class KeyBoardLanguage {
	
	public static void main(String[] args) {
		while(true) {
		System.out.println(InputContext.getInstance().getLocale().getDisplayLanguage());
		try {
			TimeUnit.SECONDS.sleep(2L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	public static String keyBoardLanguage() {
		InputContext context  =  InputContext.getInstance();
		return context.getLocale().getDisplayLanguage();
	}
}
