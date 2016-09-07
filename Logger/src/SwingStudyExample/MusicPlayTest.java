package SwingStudyExample;

import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

class MusicPlayTest {
	public static void main(String args[]){
		try{
			File file = new File("A:\\Music\\�ܽ���\\ħ����\\02 - ����һ�׸��ʱ��.mp3");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			try{
				Player player = new Player(bis);
				player.play();
				player.close();
			}catch(JavaLayerException e){
				e.printStackTrace();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}