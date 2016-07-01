package ketha.docsafe;
import ketha.assign3.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Demo extends JFrame {
	
private JLabel keyLabel,docLabel,contentLabel,resultLabel,resultLabel1;
private JTextField keyText,docText,contentText;
private JPanel panelFull,panel1,panel2,panel3;
private JButton keyButton,contentButton;
private static final int FRAME_WIDTH = 900;
private static final int FRAME_HEIGHT = 900;

public Demo(){//gui stuff
		super("Demo");
	   setSize(FRAME_WIDTH, FRAME_HEIGHT);
	//super("Demo");//do this since we extend JFrame
	//create Panels
	Container container=getContentPane();//create container to hold everything
	panelFull=new JPanel();
	panel1=new JPanel();
	panel1.setLayout(new FlowLayout());//create panels to hold other things to organize stuff
	panel2=new JPanel();
	panel2.setLayout(new FlowLayout());
	panel3=new JPanel();
	panel3.setLayout(new FlowLayout());
	
	//create all the inside things
	keyLabel=new JLabel("Enter an encryption key");
	keyText=new JTextField(10);
	Font labelFont = new Font("Arial", Font.PLAIN, 20);
    keyLabel.setFont(labelFont);
	docLabel=new JLabel("Enter a Document ID");
	docLabel.setFont(labelFont);
	docText=new JTextField(10);
	contentLabel=new JLabel("Enter a the contents for the document");
	contentLabel.setFont(labelFont);
	contentText=new JTextField(10);
	resultLabel=new JLabel("");
	resultLabel1=new JLabel("");
	resultLabel.setFont(labelFont);
	resultLabel1.setFont(labelFont);
	panel2.add(resultLabel);
	panel2.add(resultLabel1);
	
	
	panel1.add(keyLabel);
	panel1.add(keyText);
	panel1.add(docLabel);
	panel1.add(docText);
	panel1.add(contentLabel);
	panel1.add(contentText);
	panel1.setPreferredSize(new Dimension(900,200));
	panel2.setPreferredSize(new Dimension(900,200));
	panel2.setPreferredSize(new Dimension(900,200));
	
	ButtonEventHandler handler=new ButtonEventHandler();
	
	keyButton=new JButton("Create Document");
	keyButton.setActionCommand("keybutton");
	keyButton.setFont(labelFont);
	contentButton=new JButton("Retrieve Document");
	contentButton.setActionCommand("Docbutton");
	contentButton.setFont(labelFont);
	
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
	Toolkit toolkit = getToolkit();
    Dimension size = toolkit.getScreenSize();
    setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
}

class ButtonEventHandler implements ActionListener{//implements the event handler
	public void actionPerformed(ActionEvent event){
			

				if (event.getActionCommand().equals("keybutton")){
					int offset=Integer.parseInt(keyText.getText());
					int id=Integer.parseInt(docText.getText());
					String content=contentText.getText();
					EncryptorDecryptor en=new EncryptorDecryptor(offset);
					DocStore sto;
					Document doc;
   					resultLabel.setForeground(Color.BLUE);
   					 en=new EncryptorDecryptor(offset);
   					 sto=new DocStore(en);
   					 doc=new Document(id,content);
   					
   					
   						sto.saveDoc(doc);
   					
   					
   					resultLabel.setText(user(keyText.getText(),docText.getText(),contentText.getText()));
//   					String result=sto.getDoc(id,offset);
//   					resultLabel.setText(result);
   					}        	

				else
					if (event.getActionCommand().equals("Docbutton"))
					{  
						int offset=Integer.parseInt(keyText.getText());
						int id=Integer.parseInt(docText.getText());
						DocStore sto=new DocStore();
						String result=sto.getDoc(id,offset);
	   					resultLabel.setText(result);

	   				           	
	   				}	

		
	}
	public String user(String ke,String docu,String co){
		return " key:"+ke+"		"+"ID:"+docu+"	"+"and content:"+co+""+"		"
				+"\r"+"Document has been created and stored in the DocStore!";
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
