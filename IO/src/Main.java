import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
public static void main(String[] args) {
	try {
		FileOutputStream fo = new FileOutputStream("C:/Users/sangb/Desktop/Spring/IO/src/hi.txt");
		BufferedOutputStream buffer = new BufferedOutputStream(fo);

		buffer.write("안녕하세요!".getBytes());
		buffer.close();
		fo.close();
	} catch (FileNotFoundException e) {
		System.out.println("파일을 찾을 수 없습니다.");

	} catch (IOException e) {
		System.out.println("입출력 오류.");

	}
}
}
