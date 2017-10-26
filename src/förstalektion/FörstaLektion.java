package f�rstalektion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;


public class F�rstaLektion extends JFrame implements ActionListener{
	JButton button = new JButton("n�sta bild");
	Path bildMapp = Paths.get("D:\\bilder\\brasvar\\");
	
	JLabel bild1 = new JLabel(new ImageIcon("D:\\bilder\\brasvar\\brabild1.jpg"));
	JLabel bild2 = new JLabel(new ImageIcon("D:\\bilder\\brasvar\\brabild2.jpg"));
	JLabel bild3 = new JLabel(new ImageIcon("D:\\bilder\\brasvar\\brabild3.jpg"));
	int i = 2;
	JPanel p = new JPanel();
	JFrame f = new JFrame("Kolla bild");

	
	public static void main(String[] args){
		F�rstaLektion start = new F�rstaLektion();
		start.k�rProg();
	}
	public void k�rProg(){
		p.setLayout(new BorderLayout());
		p.setBackground(Color.BLACK);
		f.add(p);
		p.add(bild1,BorderLayout.EAST);
		p.add(bild2,BorderLayout.WEST);
		
		p.add(button, BorderLayout.NORTH);
		
		button.addActionListener(this);
		
			
		
		f.setVisible(true);
		f.setSize(1000,1000);
		f.setLocation(300, 300);
		f.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try (DirectoryStream<Path> inl�s = Files.newDirectoryStream(bildMapp)){
			
			for(Path fil: inl�s) {
			if((i%2)==0) {
				bild1.setIcon(new ImageIcon("D:\\bilder\\brasvar\\"+ fil.getFileName()));
				System.out.println("h�r"+i);
				i++;
			}//if	
			
			else {
				bild2.setIcon(new ImageIcon("D:\\bilder\\brasvar\\"+ fil.getFileName()));
				System.out.println("de"+i);
				i++;
				}//else
			}//for
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	
		
	}

}
