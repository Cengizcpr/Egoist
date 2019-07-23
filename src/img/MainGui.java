package img;

import Logic.Actions;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGui {

    private JFrame jf;
    private JPanel jpAna;
    private JLabel jlArka, jlYazı, jlBt1, jlBt2, jlBt3, jlBt4, jlBt5, jlBt6, jt, jb, ja1, ja2, ja3, ja4, ja5, ja6,jlogo;
    private ImageIcon resim, button, yazı,button2,logo;
    private JComboBox cb = new JComboBox();
    String[] tarife = {"Seçiniz..", "Öğrenci", "Tam"};
    private ComboBoxModel tm;
    private JTextField jtBky;
    private Font font, font2;
    double bakiye1;
    Actions aa;

    public MainGui() {
        init();
    }
    public void init() {
        //Arkaplan Resmini Çektik
        resim = new ImageIcon(getClass().getResource("1background.png"));
        //Frame oluşturduk
        jf = new JFrame("EGOİST KART V2.0.1 (FULL)");
        jf.setVisible(true);
        jf.setSize(972, 649);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);

        //Ana Panelimizi Oluşturduk
        jpAna = new JPanel();
        jpAna.setBackground(Color.BLACK);
        jpAna.setLocation(0, 0);
        jpAna.setSize(972, 649);
        jpAna.setLayout(null);
        
        //logomuzu ekledik
        logo = new ImageIcon(getClass().getResource("logo2.png"));
        jlogo = new JLabel();
        jlogo.setIcon(logo);
        jlogo.setLocation(250,-50);
        jlogo.setSize(600, 400);
        
        //Arkaplan Yazımızı Ekledik
        yazı = new ImageIcon(getClass().getResource("yazı.png"));
        jlYazı = new JLabel();
        jlYazı.setIcon(yazı);
        jlYazı.setLocation(300, 317);
        jlYazı.setSize(400, 106);

        //Arkaplan Resmimizi Ekledik
        jlArka = new JLabel();
        jlArka.setLocation(0, 0);
        jlArka.setSize(972, 649);
        jlArka.setIcon(resim);

        font2 = new Font("Arial", 1, 20);

        //Buton Yazımızı Ekledik
        ja1 = new JLabel("OTOBÜS ");
        ja1.setBounds(90, 120, 100, 20);
        ja1.setForeground(Color.black);
        ja1.setFont(font2);

        ja2 = new JLabel("TRAMVAY");
        ja2.setBounds(90, 270, 130, 20);
        ja2.setForeground(Color.black);
        ja2.setFont(font2);

        ja3 = new JLabel("FERİBOT");
        ja3.setBounds(90, 410, 130, 20);
        ja3.setForeground(Color.black);
        ja3.setFont(font2);

        ja4 = new JLabel("METROBÜS");
        ja4.setBounds(770, 120, 150, 20);
        ja4.setForeground(Color.BLACK);
        ja4.setFont(font2);

        ja5 = new JLabel("VAPUR");
        ja5.setBounds(815, 270, 100, 20);
        ja5.setForeground(Color.BLACK);
        ja5.setFont(font2);

        ja6 = new JLabel("METRO");
        ja6.setBounds(810, 410, 100, 20);
        ja6.setForeground(Color.BLACK);
        ja6.setFont(font2);

        //Buton Resmimizi Çektik
        button = new ImageIcon(getClass().getResource("button.png"));
        button2 = new ImageIcon(getClass().getResource("button2.png"));
        //Butonlarımızı Ekledik
        jlBt1 = new JLabel();
        jlBt1.setIcon(button);
        jlBt1.setLocation(20, 100);
        jlBt1.setSize(61, 60);
        jlBt1.addMouseListener(getAa());

        jlBt2 = new JLabel();
        jlBt2.setIcon(button);
        jlBt2.setLocation(20, 250);
        jlBt2.setSize(61, 60);
        jlBt2.addMouseListener(getAa());

        jlBt3 = new JLabel();
        jlBt3.setIcon(button);
        jlBt3.setLocation(20, 390);
        jlBt3.setSize(61, 60);
        jlBt3.addMouseListener(getAa());

        jlBt4 = new JLabel();
        jlBt4.setIcon(button);
        jlBt4.setLocation(892, 100);
        jlBt4.setSize(61, 60);
        jlBt4.addMouseListener(getAa());

        jlBt5 = new JLabel();
        jlBt5.setIcon(button);
        jlBt5.setLocation(892, 250);
        jlBt5.setSize(61, 60);
        jlBt5.addMouseListener(getAa());

        jlBt6 = new JLabel();
        jlBt6.setIcon(button);
        jlBt6.setLocation(892, 390);
        jlBt6.setSize(61, 60);
        jlBt6.addMouseListener(getAa());
        font = new Font("Arial", 1, 20);

        //Yazımızı Ekledik
        jt = new JLabel("Tarife  : ");
        jt.setBounds(370, 450, 100, 20);
        jt.setForeground(Color.black);
        jt.setFont(font);

        //Combobox Ekledik
        cb = new JComboBox();
        cb.setBounds(470, 450, 100, 20);
        tm = new DefaultComboBoxModel(tarife);
        cb.setModel(tm);
        cb.addMouseListener(getAa());
        
        //Yazımızı Ekledik
        jb = new JLabel("Bakiye : ");
        jb.setBounds(370, 500, 100, 20);
        jb.setForeground(Color.black);
        jb.setFont(font);

        //TextField Ekledik
        jtBky = new JTextField("Bakiyenizi Giriniz.");
        jtBky.setBounds(470, 500, 100, 20);
        jtBky.addMouseListener(getAa());
        
        jlArka.add(getJlBt1());
        jlArka.add(getJlBt2());
        jlArka.add(getJlBt3());
        jlArka.add(getJlBt4());
        jlArka.add(getJlBt5());
        jlArka.add(getJlBt6());
        jlArka.add(getJb());
        jlArka.add(getJt());
        jlArka.add(getJb());
        jlArka.add(getJtBky());
        jlArka.add(getCb());
        jlArka.add(getJlYazı());
        jlArka.add(jlogo);
        jlArka.add(ja1);
        jlArka.add(ja2);
        jlArka.add(ja3);
        jlArka.add(ja4);
        jlArka.add(ja5);
        jlArka.add(ja6);

        jpAna.add(getJlArka());
        jf.add(getJpAna());
        jf.setSize(980, 679);

    }

    public ImageIcon getButton2() {
        return button2;
    }

    public void setButton2(ImageIcon button2) {
        this.button2 = button2;
    }

    public JFrame getJf() {
        return jf;
    }
    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    public JPanel getJpAna() {
        return jpAna;
    }
    public void setJpAna(JPanel jpAna) {
        this.jpAna = jpAna;
    }

    public JLabel getJlArka() {
        return jlArka;
    }
    public void setJlArka(JLabel jlArka) {
        this.jlArka = jlArka;
    }

    public JLabel getJlYazı() {
        return jlYazı;
    }
    public void setJlYazı(JLabel jlYazı) {
        this.jlYazı = jlYazı;
    }

    public JLabel getJlBt2() {
        return jlBt2;
    }
    public void setJlBt2(JLabel jlBt2) {
        this.jlBt2 = jlBt2;
    }

    public JLabel getJlBt3() {
        return jlBt3;
    }

    public void setJlBt3(JLabel jlBt3) {
        this.jlBt3 = jlBt3;
    }

    public JLabel getJlBt4() {
        return jlBt4;
    }

    public void setJlBt4(JLabel jlBt4) {
        this.jlBt4 = jlBt4;
    }

    public JLabel getJlBt5() {
        return jlBt5;
    }

    public void setJlBt5(JLabel jlBt5) {
        this.jlBt5 = jlBt5;
    }

    public JLabel getJlBt6() {
        return jlBt6;
    }

    public void setJlBt6(JLabel jlBt6) {
        this.jlBt6 = jlBt6;
    }

    public JLabel getJt() {
        return jt;
    }

    public void setJt(JLabel jt) {
        this.jt = jt;
    }

    public JLabel getJb() {
        return jb;
    }

    public void setJb(JLabel jb) {
        this.jb = jb;
    }

    public ImageIcon getResim() {
        return resim;
    }

    public void setResim(ImageIcon resim) {
        this.resim = resim;
    }

    public ImageIcon getButton() {
        return button;
    }

    public void setButton(ImageIcon button) {
        this.button = button;
    }

    public JComboBox getCb() {
        return cb;
    }

    public void setCb(JComboBox cb) {
        this.cb = cb;
    }
    
    public JTextField getJtBky() {
        return jtBky;
    }

    public void setJtBky(JTextField jtBky) {
        this.jtBky = jtBky;
    }

    public double getBakiye1() {
        return bakiye1;
    }

    public void setBakiye1(double bakiye1) {
        this.bakiye1 = bakiye1;
    }

    public JLabel getJlBt1() {

        return jlBt1;
    }

    public void setJlBt1(JLabel jlBt1) {
        this.jlBt1 = jlBt1;
    }

    public Actions getAa() {
        if (aa == null) {
            aa = new Actions(this);
        }
        return aa;
    }

    public void setAa(Actions aa) {
        this.aa = aa;
    }

}
