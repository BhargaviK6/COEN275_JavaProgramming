package ketha.docsafe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ketha.assign3.DocStore;
import ketha.assign3.Document;
import ketha.assign3.Encryptor;
import ketha.assign3.EncryptorDecryptor;
import ketha.docsafe.Demo.ButtonEventHandler;

public class DocSafeGUI extends JFrame {
	private JLabel keyLabel,docLabel,contentLabel,resultLabel,resultLabel1;
	private JTextField keyText,docText,contentText;
	private JPanel panel1,panel2,panel3;
	private JButton keyButton,contentButton;

	public DocSafeGUI(){//gui stuff
		super("DocSafeGUI");
		//do this since we extend JFrame
		//create Panels
		Container container=getContentPane();//create container to hold everything
		panel1=new JPanel();
		panel1.setLayout(new FlowLayout());//create panels to hold other things to organize stuff
		panel2=new JPanel();
		panel2.setLayout(new FlowLayout());
		panel3=new JPanel();
		panel3.setLayout(new FlowLayout());
		
		//create all the inside things
		keyLabel=new JLabel("Enter an encryption key");
		keyText=new JTextField(10);
		docLabel=new JLabel("Enter a Document ID");
		docText=new JTextField(10);
		contentLabel=new JLabel("Enter a the contents for the document");
		contentText=new JTextField(10);
		resultLabel=new JLabel("");
		resultLabel1=new JLabel("");
		panel2.add(resultLabel);
		panel2.add(resultLabel1);
		
		
		panel1.add(keyLabel);
		panel1.add(keyText);
		panel1.add(docLabel);
		panel1.add(docText);
		panel1.add(contentLabel);
		panel1.add(contentText);
		panel2.setPreferredSize(new Dimension(100,100));
		keyButton=new JButton("Create Document");
		keyButton.setActionCommand("keybutton");
		contentButton=new JButton("Retrieve Document");
		contentButton.setActionCommand("Docbutton");
		ButtonEventHandler handler=new ButtonEventHandler();
		keyButton.addActionListener(handler);
		contentButton.addActionListener(handler);
		panel3.setLayout(new FlowLayout());
		panel3.add(keyButton);
		panel3.add(contentButton);
		
		container.add(panel1,BorderLayout.PAGE_START);
		container.add(panel2,BorderLayout.CENTER);
		container.add(panel3,BorderLayout.PAGE_END);
		
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
}
	class ButtonEventHandler implements ActionListener{//implements the event handler
		public void actionPerformed(ActionEvent event){
			
						

					if (event.getActionCommand().equals("keybutton")){           	
	   					resultLabel.setForeground(Color.BLUE);
	   					resultLabel.setText(user(keyText.getText(),docText.getText(),contentText.getText()));
	   					int offset=Integer.parseInt(keyText.getText());
	   					int id=Integer.parseInt(docText.getText());
	   					String content=contentText.getText();
	   					EncryptorDecryptor en=new EncryptorDecryptor(offset);
	   					Encryptor ob2= new EncryptorDecryptor(offset);
	   					String encrypt=ob2.encrypt(content);
	   					resultLabel1.setText(encrypt);
	   					DocStore sto=new DocStore(en);
	   					Document doc=new Document(id,content);
	   					sto.saveDoc(doc);
	   				           	
	   				}
					else
						if (event.getActionCommand().equals("Docbutton")){  
							DocStore stor=new DocStore();
							resultLabel.setText("");
		   					resultLabel.setForeground(Color.BLUE);
		   					int offset=Integer.parseInt(keyText.getText());
		   					int id=Integer.parseInt(docText.getText());
		   					stor.getDoc(offset);
		   					stor.getDoc(offset,id);
		   				           	
		   				}	
			
		}
		public String user(String ke,String docu,String co){
			return "Key entered is:"+ke+"ID:"+docu+"Content:"+co;
		}
	}
	public static void createAndShowGui(){
		Demo app=new Demo();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGui();
			}
		});
	}
	}

