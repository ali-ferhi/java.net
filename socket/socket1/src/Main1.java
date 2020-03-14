import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main1 {

	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("localhost", 1000);
			
			// out
			OutputStream outStream = socket.getOutputStream();
			PrintWriter stringWriter = new PrintWriter(outStream);
			
			// in
			InputStream inStream = socket.getInputStream();
			InputStreamReader charReader = new InputStreamReader(inStream);
			BufferedReader stringReader = new BufferedReader(charReader);
			
			// writting
			stringWriter.print("ali");
			stringWriter.flush();
			
			// reading
			String string = stringReader.readLine();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
