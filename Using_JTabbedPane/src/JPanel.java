import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class JPanel extends javax.swing.JPanel {

	/**
	 * Create the panel.
	 */
	public JPanel() {
		setLayout(null);
		
		javax.swing.JPanel Firstpanel = new javax.swing.JPanel();
		Firstpanel.setBounds(10, 11, 216, 117);
		add(Firstpanel);
		Firstpanel.setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(10, 11, 65, 14);
		Firstpanel.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname :");
		lblSurname.setBounds(10, 36, 65, 14);
		Firstpanel.add(lblSurname);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(10, 61, 65, 14);
		Firstpanel.add(lblGender);
		
		JLabel lblExampleOfGender = new JLabel("Example of Gender");
		lblExampleOfGender.setBounds(85, 61, 121, 14);
		Firstpanel.add(lblExampleOfGender);
		
		JLabel lblExampleOfSurname = new JLabel("Example of Surname");
		lblExampleOfSurname.setBounds(85, 36, 121, 14);
		Firstpanel.add(lblExampleOfSurname);
		
		JLabel lblExmapleOfName = new JLabel("Example of Name");
		lblExmapleOfName.setBounds(85, 11, 121, 14);
		Firstpanel.add(lblExmapleOfName);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setBounds(10, 86, 65, 14);
		Firstpanel.add(lblAge);
		
		JLabel lblExampleOfAge = new JLabel("Example of Age");
		lblExampleOfAge.setBounds(85, 86, 121, 14);
		Firstpanel.add(lblExampleOfAge);
		
		javax.swing.JPanel Secondpanel = new javax.swing.JPanel();
		Secondpanel.setBounds(236, 11, 216, 117);
		add(Secondpanel);
		Secondpanel.setLayout(null);
		
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(10, 11, 65, 14);
		Secondpanel.add(lblCountry);
		
		JLabel lblProfession = new JLabel("Profession :");
		lblProfession.setBounds(10, 36, 65, 14);
		Secondpanel.add(lblProfession);
		
		JLabel lblStatus = new JLabel("Status :");
		lblStatus.setBounds(10, 61, 65, 14);
		Secondpanel.add(lblStatus);
		
		JLabel lblInsured = new JLabel("Insured :");
		lblInsured.setBounds(10, 86, 65, 14);
		Secondpanel.add(lblInsured);
		
		JLabel lblExampleOfCountry = new JLabel("Example of Country");
		lblExampleOfCountry.setBounds(85, 11, 121, 14);
		Secondpanel.add(lblExampleOfCountry);
		
		JLabel lblExampleOfProfession = new JLabel("Example of Profession");
		lblExampleOfProfession.setBounds(85, 36, 121, 14);
		Secondpanel.add(lblExampleOfProfession);
		
		JLabel lblExampleOfStatus = new JLabel("Example of Status");
		lblExampleOfStatus.setBounds(85, 61, 121, 14);
		Secondpanel.add(lblExampleOfStatus);
		
		JLabel lblExampleOfInsured = new JLabel("Example of Insured");
		lblExampleOfInsured.setBounds(85, 86, 121, 14);
		Secondpanel.add(lblExampleOfInsured);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 139, 442, 150);
		add(tabbedPane);
		
		javax.swing.JPanel TabbedPanel_1 = new javax.swing.JPanel();
		tabbedPane.addTab("Work Experience", null, TabbedPanel_1, null);
		TabbedPanel_1.setLayout(null);
		
		javax.swing.JPanel TabbedPanel_2 = new javax.swing.JPanel();
		tabbedPane.addTab("Education", null, TabbedPanel_2, null);
		TabbedPanel_2.setLayout(null);
		
		JTabbedPane PanelContainer = new JTabbedPane(JTabbedPane.TOP);
		PanelContainer.setBounds(10, 5, 417, 106);
		TabbedPanel_2.add(PanelContainer);
		
		javax.swing.JPanel SubPanel_1 = new javax.swing.JPanel();
		PanelContainer.addTab("Schools", null, SubPanel_1, null);
		
		javax.swing.JPanel SubPanel_2 = new javax.swing.JPanel();
		PanelContainer.addTab("University", null, SubPanel_2, null);
		SubPanel_2.setLayout(null);
		
		javax.swing.JPanel TabbedPanel_3 = new javax.swing.JPanel();
		tabbedPane.addTab("Hobbies", null, TabbedPanel_3, null);

	}
}
