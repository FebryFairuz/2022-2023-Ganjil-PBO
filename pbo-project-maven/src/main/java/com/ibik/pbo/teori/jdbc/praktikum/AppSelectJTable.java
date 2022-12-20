package com.ibik.pbo.teori.jdbc.praktikum;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import com.ibik.pbo.teori.jdbc.dao.students.Students;
import com.ibik.pbo.teori.jdbc.dao.students.StudentsDao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppSelectJTable extends JFrame {

	private JPanel contentPane;
	private JTable jt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppSelectJTable frame = new AppSelectJTable();
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
	public AppSelectJTable() {
		setTitle("Query Retrive");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Table of Students");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		DefaultTableModel tableModel = FetchDataSelect();
		jt=new JTable(tableModel);
		jt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clik row");
				GetSelectedData();
			}
		});
		
		JScrollPane sp=new JScrollPane(jt);
		panel_1.add(sp);
	}
	
	protected void GetSelectedData() {
		DefaultTableModel jtModel = (DefaultTableModel) jt.getModel();
		int selectedRow = jt.getSelectedRow();
		System.out.println("You just click row "+selectedRow);
		
		//String id = jtModel.getValueAt(selectedRow, 0).toString();
		String npm = jtModel.getValueAt(selectedRow, 0).toString();
		String name = jtModel.getValueAt(selectedRow, 1).toString();
		String email = jtModel.getValueAt(selectedRow, 2).toString();
		String birthdate = jtModel.getValueAt(selectedRow, 3).toString();
		
		System.out.println("Data:");
		System.out.println("NPM: "+npm);
		System.out.println("Fullname: "+name);
		System.out.println("Email: "+email);
		System.out.println("Birthdate: "+birthdate);
	}

	public DefaultTableModel FetchDataSelect() {
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("NPM");
		tableModel.addColumn("Fullname");
		tableModel.addColumn("Email");
		tableModel.addColumn("Birthdate");
		StudentsDao stdDao = new StudentsDao();
		try {
			List<Students> students = stdDao.findAll();
			for (int i = 0; i < students.size(); i++) {
				String data[] = {students.get(i).getNpm(),
								 students.get(i).getFirstname() + " "+students.get(i).getMiddlename()+" "+ students.get(i).getLastname(),
								 students.get(i).getEmail(),
								 students.get(i).getBirthdate()};
				tableModel.addRow(data);
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Failed load data. Error:"+e.getMessage());
		}
		
		
		return tableModel;
	}

}
