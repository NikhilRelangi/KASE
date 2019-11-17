import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Result2 extends JFrame
{
	
	public JLabel jLabel1;
	public JLabel jLabel2;
	public JLabel jLabel3;
	public JLabel jLabel4;
	public JLabel jLabel5;
	public JTextField jTextField1;
	public JTextField jTextField2;
	public JTextField jTextField3;
	public JTextField jTextField4;
	public JTextArea jTextArea1;
	public JScrollPane jScrollPane1;
	public JButton jButton1;
	public JPanel contentPane;
	


	public Result2()
	{
		super();
		initializeComponent();
		
		jTextArea1.setText(" ");
		this.setVisible(true);
	}

	
	private void initializeComponent()
	{
		jLabel1 = new JLabel();
		jLabel1.setFont(new Font("Arial",Font.BOLD,14));
		jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Arial",Font.BOLD,14));
		jLabel3 = new JLabel();
		jLabel3.setFont(new Font("Arial",Font.BOLD,14));
		jLabel4 = new JLabel();
		jLabel4.setFont(new Font("Arial",Font.BOLD,14));
		jLabel5 = new JLabel();
		jLabel5.setFont(new Font("Arial",Font.BOLD,14));
		jTextField1 = new JTextField();
		jTextField1.setFont(new Font("Arial",Font.BOLD,14));
		jTextField2 = new JTextField();
		jTextField2.setFont(new Font("Arial",Font.BOLD,14));
		jTextField3 = new JTextField();
		jTextField3.setFont(new Font("Arial",Font.BOLD,14));
		jTextField4 = new JTextField();
		jTextField4.setFont(new Font("Arial",Font.BOLD,14));
		jTextArea1 = new JTextArea();
		jTextArea1.setFont(new Font("Arial",Font.BOLD,14));
		
		jScrollPane1 = new JScrollPane();
		jButton1 = new JButton();
		contentPane = (JPanel)this.getContentPane();

		
		jLabel1.setForeground(new Color(0, 0, 102));
		jLabel1.setText("Recieved File Content");
		
		jLabel2.setForeground(new Color(0, 0, 102));
		jLabel2.setText("Efficacy of AONT-HS : ");
		
		jLabel3.setForeground(new Color(0, 0, 102));
		jLabel3.setText("Jamming Block Length : ");
		
		jLabel4.setForeground(new Color(0, 0, 102));
		jLabel4.setText("Coding Rate : ");
		
		jLabel5.setForeground(new Color(0, 0, 102));
		jLabel5.setText("Interleaving Depth : ");
		
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		
		jTextField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField2_actionPerformed(e);
			}

		});
		
		jTextField3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField3_actionPerformed(e);
			}

		});
		
		jTextField4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField4_actionPerformed(e);
			}

		});
		
		jScrollPane1.setViewportView(jTextArea1);
		
		jLabel1.setForeground(new Color(0, 0, 102));
		jButton1.setText("Exit");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton1_actionPerformed(e);
			}

		});
		
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(224, 124, 125));
		addComponent(contentPane, jLabel1, 259,7,224,35);
		//addComponent(contentPane, jLabel2, 225,472,176,26);
		addComponent(contentPane, jLabel3, 225,509,187,27);
		addComponent(contentPane, jLabel4, 225,550,148,25);
		addComponent(contentPane, jLabel5, 225,590,148,25);
		//addComponent(contentPane, jTextField1, 384,474,100,22);
		addComponent(contentPane, jTextField2, 384,511,100,22);
		addComponent(contentPane, jTextField3, 384,550,100,22);
		addComponent(contentPane, jTextField4, 384,590,100,22);
		addComponent(contentPane, jScrollPane1, 24,50,681,408);
		addComponent(contentPane, jButton1, 620,570,83,35);
		
		this.setTitle("Result 2");
		this.setLocation(new Point(250,250));
		this.setSize(new Dimension(729, 650));
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

	private void jTextField2_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField2_actionPerformed(ActionEvent e) called.");
		
	}

	private void jTextField3_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField3_actionPerformed(ActionEvent e) called.");
		

	}

	private void jTextField4_actionPerformed(ActionEvent e)
	{
		System.out.println("\njTextField4_actionPerformed(ActionEvent e) called.");
		

	}

	private void jButton1_actionPerformed(ActionEvent e)
	{
		System.out.println("\nExit");
		
		
		
		this.dispose();	
	}

	public static void main(String[] args)
	{
		new Result2();
	}
}
