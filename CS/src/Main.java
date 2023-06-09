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
    private JTextField tadd;
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
        = { "Jan", "Feb", "Mar", "Apr",
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
        setTitle("Application Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        title = new JLabel("Application Form");
        title.setFont(new Font("Algerian", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        title.setForeground(Color.WHITE);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Calibri", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        name.setBackground(Color.BLACK);
        name.setForeground(Color.YELLOW);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Calibri", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        tname.setBackground(Color.BLACK);
        tname.setForeground(Color.WHITE);
        c.add(tname);

        mno = new JLabel("Roll No");
        mno.setFont(new Font("Calibri", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        mno.setBackground(Color.BLACK);
        mno.setForeground(Color.YELLOW);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Calibri", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        tmno.setBackground(Color.BLACK);
        tmno.setForeground(Color.WHITE);
        c.add(tmno);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Calibri", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        gender.setBackground(Color.BLACK);
        gender.setForeground(Color.YELLOW);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Calibri", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        male.setBackground(Color.BLACK);
        male.setForeground(Color.GREEN);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Calibri", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        female.setBackground(Color.BLACK);
        female.setForeground(Color.GREEN);
        c.add(female);
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Calibri", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        dob.setBackground(Color.BLACK);
        dob.setForeground(Color.YELLOW);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Calibri", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        date.setBackground(Color.BLACK);
        date.setForeground(Color.WHITE);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Calibri", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        month.setBackground(Color.BLACK);
        month.setForeground(Color.WHITE);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Calibri", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        year.setBackground(Color.BLACK);
        year.setForeground(Color.WHITE);
        c.add(year);

        add = new JLabel("Address");
        add.setFont(new Font("Calibri", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        add.setForeground(Color.YELLOW);
        c.add(add);

        tadd = new JTextField();
        tadd.setFont(new Font("Calibri", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setBackground(Color.BLACK);
        tadd.setForeground(Color.WHITE);
        //tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Calibri", Font.PLAIN, 15));
        term.setSize(272, 20);
        term.setBackground(Color.BLACK);
        term.setForeground(Color.WHITE);
        term.setLocation(150, 400);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Calibri", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.setBackground(Color.BLACK);
        sub.setForeground(Color.WHITE);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Calibri", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Calibri", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Calibri", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        res.setForeground(Color.WHITE);
        c.add(res);
        
        resadd = new JTextArea();
        resadd.setFont(new Font("Calibri", Font.PLAIN, 15));
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