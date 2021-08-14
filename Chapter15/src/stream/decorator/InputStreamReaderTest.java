package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try (InputStreamReader isr = new InputStreamReader( new FileInputStream("reader.txt")) ) {
			
			int i=0; 
			while ( (i=isr.read()) != -1 ) {
				System.out.print((char)i); 
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		Socket socket = new Socket();
		try { //보조스트림 constructor에 또다른 보조스트림이 들어갈 수 있다
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
