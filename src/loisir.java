import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")

public class loisir extends JFrame{
	
	/////////     MENU     ///////////
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem afficher;
	JMenuItem reintialiser;
	JMenuItem quiter;
	
	////////     PROFILE    ///////////
	JLabel lnom;
	JTextField tnom;
	JLabel lprenom;
	JTextField tprenom;
	JLabel mdp;
	JPasswordField psw;
	JLabel ladress;
	JTextArea tadress;
	JLabel lsexe;
	JRadioButton rhomme;
	JRadioButton rfemme;
	ButtonGroup gbsexe;
	
	Border compound;
	Border empty;
	Border loweredbevel;
	
	////////////       CHOICE         /////////////
	JCheckBox campagne;
	JCheckBox plage;
	JCheckBox peche;
	JCheckBox montagne;
	JCheckBox camping;
	JCheckBox ville;
	JCheckBox zoo;
	JCheckBox carnaval;
	JCheckBox cirque;
	JCheckBox cinema;
	JCheckBox parc;
	JCheckBox picnic;
	JCheckBox barbecue;
	JCheckBox cineparc;
	TitledBorder title;
	
	////////////       CONSTRUCTOR      //////////
	public loisir(){
		
		/////////     DECLARATIONS     /////////
		menuBar = new JMenuBar();
		menu = new JMenu("Menu");
		
		afficher = new JMenuItem("Afficher");
		afficher.setMnemonic('A');
		
		reintialiser = new JMenuItem("Reintialiser");
		reintialiser.setMnemonic('R');
		
		quiter = new JMenuItem("Quiter");
		quiter.setMnemonic('Q');
		
		lnom = new JLabel("Nom");
		tnom = new JTextField();
		lprenom = new JLabel("Prenom");
		tprenom = new JTextField();
		mdp = new JLabel("Mot de passe");
		psw = new JPasswordField();
		ladress = new JLabel("Adresse");
		tadress = new JTextArea(5, 20);
		
		lsexe = new JLabel("Sexe");
		rhomme = new JRadioButton("Homme");
		rfemme = new JRadioButton("Femme");
		gbsexe = new ButtonGroup();
		
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder(5, 10, 5, 10);
		compound = BorderFactory.createCompoundBorder(
                empty, loweredbevel);
		
		campagne = new JCheckBox("Campagne");
		plage = new JCheckBox("Plage");
		peche = new JCheckBox("Peche");
		montagne = new JCheckBox("Montagne");
		camping = new JCheckBox("Camping");
		ville = new JCheckBox("Ville");
		zoo = new JCheckBox("Zoo");
		carnaval = new JCheckBox("Zarnaval");
		cirque = new JCheckBox("Cirque");
		cinema = new JCheckBox("Cinema");
		parc = new JCheckBox("Parc");
		picnic = new JCheckBox("Picnic");
		barbecue = new JCheckBox("Barbecue");
		cineparc = new JCheckBox("Cineparc");
		title = BorderFactory.createTitledBorder("Loisirs");
		
		//////////     IMPLAMENTATIONS    /////////////
		JPanel centerAll = new JPanel(new BorderLayout());
		JPanel centerCenter = new JPanel(new GridLayout(7, 0));
		JPanel profile = new JPanel(new BorderLayout());
		JPanel south = new JPanel();
		JPanel east = new JPanel(new GridLayout(14, 0));
		
		menuBar.add(menu);
		menu.add(afficher);
		menu.add(reintialiser);
		menu.add(quiter);
		
		centerCenter.add(lnom);
		centerCenter.add(tnom);
		centerCenter.add(lprenom);
		centerCenter.add(tprenom);
		centerCenter.add(mdp);
		centerCenter.add(psw);
		centerCenter.add(ladress);
		centerAll.add(tadress, BorderLayout.SOUTH);
		
		gbsexe.add(rhomme);
		gbsexe.add(rfemme);
		
		centerAll.add(centerCenter, BorderLayout.CENTER);
		
		south.add(lsexe);
		south.add(rhomme);
		south.add(rfemme);
		
		profile.setBorder(compound);
		profile.add(centerAll, BorderLayout.CENTER);
		profile.add(south, BorderLayout.SOUTH);
		
		east.add(campagne);
		east.add(plage);
		east.add(peche);
		east.add(montagne);
		east.add(camping);
		east.add(ville);
		east.add(zoo);
		east.add(carnaval);
		east.add(cirque);
		east.add(cinema);
		east.add(parc);
		east.add(picnic);
		east.add(barbecue);
		east.add(cineparc);
		east.setBorder(title);
		
		add(profile);
		add(east, BorderLayout.EAST);
		setJMenuBar(menuBar);
		
		
		
		setTitle("Loisir");
		setDefaultCloseOperation(3);
		setSize(500, 350);
		setVisible(true);
	}
}
