import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class Destination2 extends JFrame
{
	
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField jTextField1;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JProgressBar jProgressBar1;
	//private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JPanel contentPane;
	public String Fien="";
	public int i,j;
	public static int fillen;
	public int intfec[];
	public int intval[];
	public char chfec[];
	public char pakch1[][];
	public char filreord[][];
	public String[] filtfr;
	public String filfec[];
	ServerSocket ss;
	Socket so;
	
	public float codrt;
	public float bklen;
	public float intdth,orgblk;
	
	//String rec="";
	public Destination2()
	{
		super();
		initializeComponent();
		
		
		this.setVisible(true);
		try
		{
			ss=new ServerSocket(4502);
			while(true)
			{
				so=ss.accept();
				System.out.println("**************Packets Are Arriving From The Source*********");
				jTextArea1.setText("\n   Packets Recieving Started");
				DataInputStream dis=new DataInputStream(so.getInputStream());
				fillen=dis.readInt();
				filtfr=new String[fillen];
				intval=new int[fillen];
				intfec=new int[fillen];
				chfec=new char[fillen+25];
				pakch1=new char[fillen+25][100];
				filreord=new char[fillen+25][100];
				filfec=new String[fillen];
				jTextField1.setText("//Destination 2/Result2.txt");
				
				System.out.println("fillen : "+fillen);
				 for(i=0;i<fillen;i++)
				 {
					filtfr[i]=dis.readUTF();
					System.out.println("Packet : ["+i+"] = "+filtfr[i]);
					//Thread.sleep(25);
				 }
				System.out.println("**********Packets Recieved From The Source***********");
				
				jTextArea1.append("\n\n   Packets Received");
				System.out.println("fillen : "+fillen);
			}
		}
		catch (Exception er)
		{
			System.out.println(er);
		}
	}
	
	private void initializeComponent()
	{
		jLabel1 = new JLabel();
		jLabel1.setFont(new Font("Arial",Font.BOLD,14));
		jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Arial",Font.BOLD,12));
		jLabel3 = new JLabel();
		jLabel3.setFont(new Font("Arial",Font.BOLD,12));
		jLabel4 = new JLabel();
		jLabel4.setFont(new Font("Arial",Font.BOLD,12));
		jTextField1 = new JTextField();
		jTextField1.setFont(new Font("Arial",Font.BOLD,12));
		jTextArea1 = new JTextArea();
		jTextArea1.setFont(new Font("Arial",Font.BOLD,12));
		jScrollPane1 = new JScrollPane();
		jProgressBar1 = new JProgressBar();
		//jButton1 = new JButton();
		jButton2 = new JButton();//((new ImageIcon("bu1.gif")));
		jButton3 = new JButton();//((new ImageIcon("bu1.gif")));
		jButton4 = new JButton();//((new ImageIcon("bu1.gif")));
		jButton5 = new JButton();//((new ImageIcon("bu1.gif")));
		contentPane = (JPanel)this.getContentPane();

		
		jLabel1.setForeground(new Color(0, 0, 102));
		jLabel1.setText("DESTINATION 2");
		
		jLabel2.setForeground(new Color(0, 0, 102));
		jLabel2.setText("Status Information");
		
		jLabel3.setForeground(new Color(0, 0, 102));
		jLabel3.setText("Recieved File Location : ");
		
		jLabel4.setForeground(new Color(0, 0, 102));
		jLabel4.setText("");
		
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		
		jScrollPane1.setViewportView(jTextArea1);
		
		//jButton2.setBackground(new Color(102, 102, 255));
		jButton2.setForeground(new Color(0, 0, 102));
		jButton2.setText("De-Interleaving");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton2_actionPerformed(e);
			}

		});
		
		//jButton3.setBackground(new Color(102, 102, 255));
		jButton3.setForeground(new Color(0, 0, 102));
		jButton3.setText("Channel Decoding");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton3_actionPerformed(e);
			}

		});
		
		//jButton4.setBackground(new Color(102, 102, 255));
		jButton4.setForeground(new Color(0, 0, 102));
		jButton4.setText("Result");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton4_actionPerformed(e);
			}

		});
		
		//jButton5.setBackground(new Color(102, 102, 255));
		jButton5.setForeground(new Color(0, 0, 102));
		jButton5.setText("Exit");
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton5_actionPerformed(e);
			}

		});
		
		JLabel imageLabel1 = new JLabel();
        ImageIcon v1 = new ImageIcon(this.getClass().getResource("packethiding.JPG"));
			imageLabel1.setIcon(v1);
			
			imageLabel1.setBounds(400,208,487,200);
		add(imageLabel1);
		
		JLabel imageLabel2 = new JLabel();
        ImageIcon v2 = new ImageIcon(this.getClass().getResource("Destination2.JPG"));
			imageLabel2.setIcon(v2);
			
			imageLabel2.setBounds(0,0,1000,100);
		add(imageLabel2);
		
		JLabel imageLabel3 = new JLabel();
        ImageIcon v3 = new ImageIcon(this.getClass().getResource("hiding.JPG"));
			imageLabel3.setIcon(v3);
			
			imageLabel3.setBounds(360,440,628,258);
		add(imageLabel3);
		
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(204, 140, 140));
		contentPane.setForeground(new Color(51, 51, 51));
		//addComponent(contentPane, jLabel1, 285,10,245,18);
		addComponent(contentPane, jLabel2, 90,380,184,18);
		addComponent(contentPane, jLabel3, 87,100,240,30);
		addComponent(contentPane, jLabel4, 27,410,200,20);
		addComponent(contentPane, jTextField1, 87,131,240,30);
		addComponent(contentPane, jScrollPane1, 17,400,316,303);
		//addComponent(contentPane, jProgressBar1, 27,430,600,20);
		//addComponent(contentPane, jButton1, 376,130,83,32);
		addComponent(contentPane, jButton2, 526,130,150,30);
		addComponent(contentPane, jButton3, 90,200,150,30);
		addComponent(contentPane, jButton4, 90,270,120,30);
		addComponent(contentPane, jButton5, 90,340,120,30);
		
		this.setTitle("Packet Hiding- Destination 2");
		//this.setLocation(new Point(630, 450));
		this.setSize(new Dimension(1000, 740));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	//	this.setVisible(true);
		
	}
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	
	private void jTextField1_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField1_actionPerformed(ActionEvent e) called.");
		
	}


	private void jButton2_actionPerformed(ActionEvent e)
	{
		System.out.println("\n***************De-Interleaving Started***************");
		// TODO: Add any handling code here
		//System.out.println("fillen = "+fillen);
		jTextArea1.append("\n\n   De-Interleaving Process Started");
		for(i=0;i<fillen;i++)
		{
			for(j=0;j<filtfr[i].length();j++)
			{
				pakch1[i][j]=filtfr[i].charAt(j);
			}
		}
		//Printing the values
		for(i=0;i<fillen;i++)
		{
			for(j=0;j<filtfr[i].length();j++)
			{
				System.out.print(pakch1[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		
		//De-Interleaving
		for(i=0;i<fillen;i++)
		{
			for(j=0;j<1;j++)
			{
				if((filtfr[i].length())==21)
				{
				bklen=filtfr[i].length();
				filreord[i][0]=pakch1[i][8];
				filreord[i][1]=pakch1[i][10];
				filreord[i][2]=pakch1[i][18];
				filreord[i][3]=pakch1[i][15];
				filreord[i][4]=pakch1[i][9];
				filreord[i][5]=pakch1[i][0];
				filreord[i][6]=pakch1[i][4];
				filreord[i][7]=pakch1[i][13];
				filreord[i][8]=pakch1[i][6];
				filreord[i][9]=pakch1[i][3];
				filreord[i][10]=pakch1[i][5];
				filreord[i][11]=pakch1[i][2];
				filreord[i][12]=pakch1[i][1];
				filreord[i][13]=pakch1[i][12];
				filreord[i][14]=pakch1[i][20];
				filreord[i][15]=pakch1[i][17];
				filreord[i][16]=pakch1[i][14];
				filreord[i][17]=pakch1[i][16];
				filreord[i][18]=pakch1[i][19];
				filreord[i][19]=pakch1[i][11];
				filreord[i][20]=pakch1[i][7];
				}
				else if((filtfr[i].length())==18)
				{
				filreord[i][0]=pakch1[i][7];
				filreord[i][1]=pakch1[i][9];
				filreord[i][2]=pakch1[i][16];
				filreord[i][3]=pakch1[i][13];
				filreord[i][4]=pakch1[i][8];
				filreord[i][5]=pakch1[i][0];
				filreord[i][6]=pakch1[i][4];
				filreord[i][7]=pakch1[i][11];
				filreord[i][8]=pakch1[i][6];
				filreord[i][9]=pakch1[i][3];
				filreord[i][10]=pakch1[i][5];
				filreord[i][11]=pakch1[i][2];
				filreord[i][12]=pakch1[i][1];
				filreord[i][13]=pakch1[i][15];
				filreord[i][14]=pakch1[i][17];
				filreord[i][15]=pakch1[i][10];
				filreord[i][16]=pakch1[i][12];
				filreord[i][17]=pakch1[i][14];
				}
				else
				{
				filreord[i][0]=pakch1[i][7];
				filreord[i][1]=pakch1[i][9];
				filreord[i][2]=pakch1[i][5];
				filreord[i][3]=pakch1[i][10];
				filreord[i][4]=pakch1[i][8];
				filreord[i][5]=pakch1[i][0];
				filreord[i][6]=pakch1[i][4];
				filreord[i][7]=pakch1[i][11];
				filreord[i][8]=pakch1[i][6];
				filreord[i][9]=pakch1[i][3];
				filreord[i][10]=pakch1[i][2];
				filreord[i][11]=pakch1[i][1];
				//System.out.println("Packets Lost");
				}

			}
		}
		//Printing the values
		for(i=0;i<fillen;i++)
		{
			for(j=0;j<filtfr[i].length();j++)
			{
				System.out.print(filreord[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		jTextArea1.append("\n\n   De-Interleaving Process Completed");
		System.out.println("\n***************De-Interleaving Completed***************");
	}

	private void jButton3_actionPerformed(ActionEvent e)
	{
		System.out.println("\n**************Channel Decoding Stsrted********************");
		// TODO: Add any handling code here
			orgblk=7;
		//Decoding FEC
		jTextArea1.append("\n\n   Channel Decoding Process Started");
		for(i=0;i<fillen;i++)
		{
			filfec[i]="";
			for(j=0;j<filtfr[i].length();j++)
			{
				
				if(filreord[i][j+2]!='\0')
				{
					filfec[i]+=""+filreord[i][j+2];
					j+=2;
				}
				else if(filreord[i][j+1]!='\0')
				{
					filfec[i]+=""+filreord[i][j+1];
					j+=2;
				}
				else if(filreord[i][j]!='\0')
				{
					filfec[i]+=""+filreord[i][j];
					j+=2;
				}
			}
		}
		
		//Printing after FEC Decoding
		for(i=0;i<fillen;i++)
		{
			
			System.out.println(filfec[i]);
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		
		//Conersion of Binary Values to String
		jTextArea1.append("\n\n   Conerting Binary to String");
		for(i=0;i<fillen;i++)
		{
			intval[i]= Integer.parseInt(filfec[i],2);
			chfec[i]=(char)intval[i];
		}
		try
		{
			Fien="";
			FileOutputStream fw=new FileOutputStream("Output File/Output2.txt");
			for(i=0;i<fillen;i++)
		{
			//System.out.println("\nDecimal="+intval[i]);
			//System.out.print("\nChar = "+chfec[i]);
			Fien+=Character.toString(chfec[i]);
			fw.write(chfec[i]);
		}
		}
		catch (Exception er)
		{
			er.printStackTrace();
		}
		
		jTextArea1.append("\n\n   Recieved Packets Processing Completed");
		System.out.println("\n\n******************Channel Decoding Process Completed***********************");
		
		jTextArea1.append("\n\n   Channel Decoding  Process Completed");
		//System.out.println("\nOutput : "+Fien);
		//FileOutputStream fwtr=new FileOutputStream("F:/Hector/FEC/Destination/Result.txt");
		//fwtr.writeUTF(Fien);

	}

	private void jButton4_actionPerformed(ActionEvent e)
	{
		System.out.println("\nOpening Recieved File");
		// TODO: Add any handling code here
		Result2 re=new Result2();
		re.show();
		re.jTextArea1.setText(" ");
		
 		re.jTextArea1.setText(Fien);
		intdth=bklen-orgblk;
		codrt=intdth/bklen;
		
		re.jTextField2.setText(""+bklen);
		re.jTextField3.setText(""+codrt);
		re.jTextField4.setText(""+intdth);


	}

	private void jButton5_actionPerformed(ActionEvent e)
	{
		System.out.println("\nExit");
		System.exit(0);

	}

    public static void main(String[] args)
	{
		new Destination2();
	}
}
