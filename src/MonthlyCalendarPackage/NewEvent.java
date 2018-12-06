package MonthlyCalendarPackage;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CalendarMain.Event;
import CalendarMain.EventList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;

public class NewEvent extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public static String months;
	public static String days;
	public static String eventTime1, eventTime2;
	public static String name;
	public static String desc;
	public static Boolean am1,am2;
	public static Boolean pm1,pm2;

	/**
	 * Launch the application.
	 */
	public static void createNewEventForm(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewEvent frame = new NewEvent();
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
	public NewEvent() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 460, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setBounds(40, 40, 46, 14);
		contentPane.add(lblMonth);
		
		JLabel lblDay = new JLabel("Day:");
		lblDay.setBounds(121, 40, 46, 14);
		contentPane.add(lblDay);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(204, 40, 46, 14);
		contentPane.add(lblTime);
		
		JLabel lblStart = new JLabel("Start:");
		lblStart.setBounds(204, 75, 46, 14);
		contentPane.add(lblStart);
		
		JLabel lblEnd = new JLabel("End:");
		lblEnd.setBounds(204, 113, 46, 14);
		contentPane.add(lblEnd);
		
		JLabel lblNewEvent = new JLabel("New Event");
		lblNewEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewEvent.setBounds(183, 11, 81, 14);
		contentPane.add(lblNewEvent);
		
		String[] monthNames = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
		JComboBox<String> comboBox = new JComboBox<String>(monthNames);
		comboBox.setBounds(40, 72, 46, 20);
		contentPane.add(comboBox);
		
		
		
		String[] dayNumbers = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		JComboBox<String> comboBox_1 = new JComboBox<String>(dayNumbers);
		comboBox_1.setBounds(121, 72, 46, 20);
		contentPane.add(comboBox_1);
		
	
		
		
		String[] times = {"12:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00" };
		JComboBox<String> comboBox_2 = new JComboBox<String>(times);
		comboBox_2.setBounds(260, 72, 59, 20);
		contentPane.add(comboBox_2);
		
		
		
		JComboBox<String> comboBox_3 = new JComboBox<String>(times);
		comboBox_3.setBounds(260, 110, 59, 20);
		contentPane.add(comboBox_3);
		
		
		
		JRadioButton rdbtnAm = new JRadioButton("AM");
		rdbtnAm.setBounds(319, 71, 51, 23);
		contentPane.add(rdbtnAm);
		
		
		JRadioButton rdbtnPm = new JRadioButton("PM");
		rdbtnPm.setBounds(367, 71, 46, 23);
		contentPane.add(rdbtnPm);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("AM");
		rdbtnNewRadioButton.setBounds(319, 109, 51, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnPm_1 = new JRadioButton("PM");
		rdbtnPm_1.setBounds(367, 109, 46, 23);
		contentPane.add(rdbtnPm_1);
		
		
		JButton btnAddEvent = new JButton("Add Event");
		btnAddEvent.setBounds(78, 227, 100, 23);
		contentPane.add(btnAddEvent);
		btnAddEvent.addActionListener(new ActionListener() {  //if add event button press
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			} 
		} );
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(276, 227, 89, 23);
		contentPane.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {  //if cancel button press
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			} 
		} );
		
		JLabel lblEventName = new JLabel("Event Name:");
		lblEventName.setBounds(40, 113, 89, 14);
		contentPane.add(lblEventName);
		
		textField = new JTextField();
		textField.setBounds(40, 138, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(40, 169, 74, 14);
		contentPane.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(40, 194, 325, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		desc=textField_1.getText();
		//save event
		
		 btnAddEvent.addActionListener(new ActionListener() {  //if add event button press
			 private final EventList eventList = new EventList();
			 public void actionPerformed(ActionEvent e) {
				 //var values
				months=(String) comboBox.getSelectedItem();
				days=(String) comboBox_1.getSelectedItem();
				eventTime1=(String) comboBox_2.getSelectedItem();
				eventTime2=(String) comboBox_3.getSelectedItem();
				name=textField.getText();
				desc=textField_1.getText();
				if(rdbtnAm.isSelected())
					am1=true;
				else
					am1=false;
				if(rdbtnPm.isSelected())
					pm1=true;
				else
					pm1=false;
				if(rdbtnNewRadioButton.isSelected())
					am2=true;
				else
					am2=false;
				if(rdbtnPm_1.isSelected())
					pm2=true;
				else
					pm2=false;
				 Event newEvent= new Event();
				 
				 //add event
				 if (newEvent.createEvent(this.eventList))
                 {
				 try {
						this.eventList.add(newEvent);
					} catch (IOException e1) {
						
						e1.printStackTrace();
					} 
                  try {
						this.eventList.updateSavedEventFile();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					} //adds event to save file
                 }
			 	}
		 	} ); 
		}
	}
