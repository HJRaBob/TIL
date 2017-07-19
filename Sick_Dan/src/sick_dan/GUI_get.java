package sick_dan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class GUI_get extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	FileIO fi = new FileIO();
	int type=1, min_val,max_val;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_get frame = new GUI_get();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_get() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(88, 10, 334, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("   \uCD5C\uC885\uACB0\uACFC");
		lblNewLabel.setBounds(12, 10, 64, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  \uC720\uC0AC \uACB0\uACFC");
		lblNewLabel_1.setBounds(42, 41, 64, 21);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(12, 72, 146, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uCD5C\uC800 \uAC00\uACA9");
		lblNewLabel_2.setBounds(198, 41, 74, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uCD5C\uACE0 \uAC00\uACA9");
		lblNewLabel_3.setBounds(333, 41, 74, 21);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 73, 94, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(313, 72, 94, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel(" ~");
		lblNewLabel_4.setBounds(284, 76, 24, 15);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = (String)comboBox.getSelectedItem();
				if (str.equals("\uBC25+\uCC0C\uAC1C"))
					type = 1;
				else if(str.equals("\uBA74\uB958"))
					type = 2;
				else
					type = 3;
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uBC25+\uCC0C\uAC1C", "\uBA74\uB958", "\uBE75\uB958"}));
		comboBox.setBounds(178, 127, 130, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("\uC885\uB958");
		lblNewLabel_5.setBounds(178, 102, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("\uCD9C\uB825");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				min_val =  Integer.parseInt(textField_2.getText());
				max_val =  Integer.parseInt(textField_3.getText());
				fi.g.get_val(min_val, max_val, type);
				try {//여기서 부터
					fi.input();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}// 여기까진 모르겠다...
				fi.erase();
				fi.sort();
				if(fi.list.size() != 0)
					textField.setText(fi.disp(0));
				else
					textField.setText("");
				if(fi.list.size() > 1)
					textField_1.setText(fi.disp(1));
				else
					textField_1.setText("");
				if(fi.list.size() > 2)
					textField_4.setText(fi.disp(2));
				else
					textField_4.setText("");
				if(fi.list.size() > 3)
					textField_5.setText(fi.disp(3));
				else
					textField_5.setText("");
				if(fi.list.size() > 4)
					textField_6.setText(fi.disp(4));
				else
					textField_6.setText("");
				
				fi.delet();
			}
		});
		btnNewButton.setBounds(178, 158, 244, 156);
		contentPane.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(12, 104, 146, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(12, 136, 146, 22);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(12, 168, 146, 22);
		contentPane.add(textField_6);
	}
}
