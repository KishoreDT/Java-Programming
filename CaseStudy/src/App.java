import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame
extends JFrame
implements ActionListener {
// Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private String dates[]
        = { "1", "2", "3", "4", "5",
        "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15",
        "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25",
        "26", "27", "28", "29", "30",
        "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
        "May", "Jun", "July", "Aug",
        "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
        "1999", "2000", "2001", "2002",
        "2003", "2004", "2005", "2006",
        "2007", "2008", "2009", "2010",
        "2011", "2012", "2013", "2014",
        "2015", "2016", "2017", "2018",
        "2019" };
    public MyFrame()
    {
        setTitle("Application");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        title = new JLabel("Application for VIP");
        title.setForeground(Color.MAGENTA);
        title.setFont(new Font("Algerian", Font.PLAIN, 40));
        title.setSize(500, 40);
        title.setLocation(250, 30);
        c.add(title);
        name = new JLabel("Name");
        name.setForeground(Color.green);
        name.setFont(new Font("Algerian", Font.PLAIN, 25));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
        tname = new JTextField();
        tname.setBackground(Color.gray);
        tname.setForeground(Color.green);
        tname.setFont(new Font("Algerian", Font.PLAIN, 20));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
        mno = new JLabel("Mobile");
        mno.setForeground(Color.green);
        mno.setFont(new Font("Algerian", Font.PLAIN, 25));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);
        tmno = new JTextField();
        tmno.setBackground(Color.gray);
        tmno.setFont(new Font("Algerian", Font.PLAIN, 20));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);
        gender = new JLabel("Gender");
        gender.setForeground(Color.green);
        gender.setFont(new Font("Algerian", Font.PLAIN, 25));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);
        male = new JRadioButton("Male");
        male.setForeground(Color.green);
        male.setBackground(Color.black);
        male.setFont(new Font("Algerian", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);
        female = new JRadioButton("Female");
        female.setForeground(Color.green);
        female.setBackground(Color.BLACK);
        female.setFont(new Font("Algerian", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        dob = new JLabel("DOB");
        dob.setForeground(Color.green);
        dob.setFont(new Font("Algerian", Font.PLAIN, 25));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        c.add(dob);
        date = new JComboBox(dates);
        date.setForeground(Color.green);
        date.setBackground(Color.black);
        date.setFont(new Font("Algerian", Font.PLAIN, 20));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);
        month = new JComboBox(months);
        month.setForeground(Color.green);
        month.setBackground(Color.black);
        month.setFont(new Font("Algerian", Font.PLAIN, 20));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        c.add(month);
        year = new JComboBox(years);
        year.setForeground(Color.green);
        year.setBackground(Color.black);
        year.setFont(new Font("Algerian", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        c.add(year);
        add = new JLabel("Address");
        add.setForeground(Color.green);
        add.setFont(new Font("Algerian", Font.PLAIN, 25));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);
        tadd = new JTextArea();
        tadd.setForeground(Color.green);
        tadd.setBackground(Color.gray);
        tadd.setFont(new Font("Algerian", Font.PLAIN, 20));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setBackground(Color.BLACK);
        term.setForeground(Color.green);
        term.setFont(new Font("Algerian", Font.PLAIN, 20));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);
        sub = new JButton("Submit");
        sub.setBackground(Color.BLACK);
        sub.setForeground(Color.green);
        sub.setFont(new Font("Algerian", Font.PLAIN, 20));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
        reset = new JButton("Reset");
        reset.setBackground(Color.BLACK);        
        reset.setForeground(Color.green);
        reset.setFont(new Font("Algerian", Font.PLAIN, 20));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
        tout = new JTextArea();
        tout.setForeground(Color.green);
        tout.setFont(new Font("Algerian", Font.PLAIN, 20));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
        res = new JLabel("");
        res.setForeground(Color.green);
        res.setFont(new Font("Algerian", Font.PLAIN, 25));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
        resadd = new JTextArea();
        resadd.setForeground(Color.green);
        resadd.setFont(new Font("Algerian", Font.PLAIN, 20));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data = "Name : "+ tname.getText() + "\n"+ "Mobile : "+ tmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"+ "\n";
                else
                    data1 = "Gender : Female"+ "\n";
                
                String data2 = "DOB : "+ (String)date.getSelectedItem()+ "/" + (String)month.getSelectedItem()+ "/" + (String)year.getSelectedItem()+ "\n";
                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                + " terms & conditions..");
            }
        }
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}
class login {
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
        f.getContentPane().setBackground(Color.BLACK);
    }
}