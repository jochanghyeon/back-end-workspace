package com.kh.soket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {

	Socket socket;
	Scanner sc = new Scanner(System.in);
	
	public SendThread(Socket socket) {
		this.socket = socket;
	
		
	}

	public void run() {
		
		try {
			PrintStream ps = new PrintStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
