package Logic;

import img.MainGui;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

public class Actions implements MouseListener {

    MainGui mg;
    
    public Actions(MainGui mg) {
        this.mg = mg;
    }

    static int sayac=0;
    
    @Override
    public void mouseClicked(MouseEvent e) {
        //1.Buton(Otobüs)
        if (e.getSource() == this.mg.getJlBt1()) {
            if (mg.getJlBt1().getIcon().toString().equals(getClass().getResource("/img/button.png").toString())) {
                mg.setResim(mg.getButton2());
                mg.getJlBt1().setIcon(mg.getResim());

                Timer to = new Timer();
                TimerTask go = new TimerTask() {

                    @Override
                    public void run() {
                        sayac++;
                        if (sayac == 5) {
                            mg.setResim(mg.getButton());
                            mg.getJlBt1().setIcon(mg.getResim());
                            to.cancel();
                        }

                    }
                };

                to.schedule(go, 1, 200);
                sayac=0;
                double a = Double.parseDouble(mg.getJtBky().getText());
                mg.setBakiye1(a);
                if ((mg.getCb().getSelectedItem().toString() == "Öğrenci") && mg.getBakiye1() >= 1.25) {
                    Otobüs o = new Otobüs(mg.getBakiye1(), 1.25);
                    mg.getJtBky().setText(" " + o.getHesaplama());
                    Ses.Call("12.wav");
                } else if ((mg.getCb().getSelectedItem().toString() == "Tam") && mg.getBakiye1() >= 2.5) {
                    Otobüs o = new Otobüs(mg.getBakiye1(), 2.5);
                    mg.getJtBky().setText(" " + o.getHesaplama());
                    Ses.Call("13.wav");

                } else {
                    mg.getJtBky().setText("Yetersiz Bakiye");
                    Ses.Call("14.wav");
                }

            } else {
                mg.setResim(mg.getButton());
                mg.getJlBt1().setIcon(mg.getResim());
            }
        }//2.Buton(Tramvay)
        else if (e.getSource() == this.mg.getJlBt2()) {
            if (mg.getJlBt2().getIcon().toString().equals(getClass().getResource("/img/button.png").toString())) {
                mg.setResim(mg.getButton2());
                mg.getJlBt2().setIcon(mg.getResim());
                
                Timer tt = new Timer();
                TimerTask gt = new TimerTask() {

                    @Override
                    public void run() {
                        sayac++;
                        if (sayac == 5) {
                            mg.setResim(mg.getButton());
                            mg.getJlBt2().setIcon(mg.getResim());
                            tt.cancel();
                        }

                    }
                };

                tt.schedule(gt, 1, 200);
                sayac=0;
                double a = Double.parseDouble(mg.getJtBky().getText());
                mg.setBakiye1(a);
                if ((mg.getCb().getSelectedItem().toString() == "Öğrenci") && mg.getBakiye1() >= 1.25) {
                    Tramvay t = new Tramvay(mg.getBakiye1(), 1.25);
                    mg.getJtBky().setText(" " + t.getHesaplama());
                    Ses.Call("12.wav");

                } else if ((mg.getCb().getSelectedItem().toString() == "Tam") && mg.getBakiye1() >= 2.5) {
                    Tramvay t = new Tramvay(mg.getBakiye1(), 2.5);
                    mg.getJtBky().setText(" " + t.getHesaplama());
                    Ses.Call("13.wav");

                } else {
                    mg.getJtBky().setText("Yetersiz Bakiye");
                    Ses.Call("14.wav");
                }
            } else {
                mg.setResim(mg.getButton());
                mg.getJlBt2().setIcon(mg.getResim());
            }
        } //3.Buton(Feribot)
        else if (e.getSource() == this.mg.getJlBt3()) {
            if (mg.getJlBt3().getIcon().toString().equals(getClass().getResource("/img/button.png").toString())) {
                mg.setResim(mg.getButton2());
                mg.getJlBt3().setIcon(mg.getResim());
                
                Timer tf = new Timer();
                TimerTask gf = new TimerTask() {

                    @Override
                    public void run() {
                        sayac++;
                        if (sayac == 5) {
                            mg.setResim(mg.getButton());
                            mg.getJlBt3().setIcon(mg.getResim());
                            tf.cancel();
                        }

                    }
                };
                
                tf.schedule(gf, 1, 200);
                sayac=0;
                double a = Double.parseDouble(mg.getJtBky().getText());
                mg.setBakiye1(a);
                if ((mg.getCb().getSelectedItem().toString() == "Öğrenci") && mg.getBakiye1() >= 2.5) {
                    Feribot f = new Feribot(mg.getBakiye1(), 2.5);
                    mg.getJtBky().setText(" " + f.getHesaplama());
                    Ses.Call("12.wav");

                } else if ((mg.getCb().getSelectedItem().toString() == "Tam") && mg.getBakiye1() >= 4.5) {
                    Feribot f = new Feribot(mg.getBakiye1(), 4.5);
                    mg.getJtBky().setText(" " + f.getHesaplama());
                    Ses.Call("13.wav");

                } else {
                    mg.getJtBky().setText("Yetersiz Bakiye");
                    Ses.Call("14.wav");
                }

            } else {
                mg.setResim(mg.getButton());
                mg.getJlBt3().setIcon(mg.getResim());
            }
        } //4.Buton(Metrobüs)
        else if (e.getSource() == this.mg.getJlBt4()) {
            if (mg.getJlBt4().getIcon().toString().equals(getClass().getResource("/img/button.png").toString())) {
                mg.setResim(mg.getButton2());
                mg.getJlBt4().setIcon(mg.getResim());
                
                Timer tmb = new Timer();
                TimerTask gmb = new TimerTask() {

                    @Override
                    public void run() {
                        sayac++;
                        if (sayac == 5) {
                            mg.setResim(mg.getButton());
                            mg.getJlBt4().setIcon(mg.getResim());
                            tmb.cancel();
                        }

                    }
                };

                tmb.schedule(gmb, 1, 200);
                sayac=0;
                double a = Double.parseDouble(mg.getJtBky().getText());
                mg.setBakiye1(a);
                if ((mg.getCb().getSelectedItem().toString() == "Öğrenci") && mg.getBakiye1() >= 1.25) {
                    Metrobüs mb = new Metrobüs(mg.getBakiye1(), 1.25);
                    mg.getJtBky().setText(" " + mb.getHesaplama());
                    Ses.Call("12.wav");

                } else if ((mg.getCb().getSelectedItem().toString() == "Tam") && mg.getBakiye1() >= 2.5) {
                    Metrobüs mb = new Metrobüs(mg.getBakiye1(), 2.5);
                    mg.getJtBky().setText(" " + mb.getHesaplama());
                    Ses.Call("13.wav");

                } else {
                    mg.getJtBky().setText("Yetersiz Bakiye");
                    Ses.Call("14.wav");
                }
            } else {
                mg.setResim(mg.getButton());
                mg.getJlBt4().setIcon(mg.getResim());
            }
        } //5.Buton(Vapur)
        else if (e.getSource() == this.mg.getJlBt5()) {
            if (mg.getJlBt5().getIcon().toString().equals(getClass().getResource("/img/button.png").toString())) {
                mg.setResim(mg.getButton2());
                mg.getJlBt5().setIcon(mg.getResim());
                
                Timer tv = new Timer();
                TimerTask gv = new TimerTask() {

                    @Override
                    public void run() {
                        sayac++;
                        if (sayac == 5) {
                            mg.setResim(mg.getButton());
                            mg.getJlBt5().setIcon(mg.getResim());
                            tv.cancel();
                        }

                    }
                };

                tv.schedule(gv, 1, 200);
                sayac=0;
                double a = Double.parseDouble(mg.getJtBky().getText());
                mg.setBakiye1(a);
                if ((mg.getCb().getSelectedItem().toString() == "Öğrenci") && mg.getBakiye1() >= 1.25) {
                    Vapur v = new Vapur(mg.getBakiye1(), 1.25);
                    mg.getJtBky().setText(" " + v.getHesaplama());
                    Ses.Call("12.wav");

                } else if ((mg.getCb().getSelectedItem().toString() == "Tam") && mg.getBakiye1() >= 2.5) {
                    Vapur v = new Vapur(mg.getBakiye1(), 2.5);
                    mg.getJtBky().setText(" " + v.getHesaplama());
                    Ses.Call("13.wav");
                } else {
                    mg.getJtBky().setText("Yetersiz Bakiye");
                    Ses.Call("14.wav");
                }
            } else {
                mg.setResim(mg.getButton());
                mg.getJlBt5().setIcon(mg.getResim());
            }
        } //6.Buton(Metro)
        else if (e.getSource() == this.mg.getJlBt6()) {
            if (mg.getJlBt6().getIcon().toString().equals(getClass().getResource("/img/button.png").toString())) {
                mg.setResim(mg.getButton2());
                mg.getJlBt6().setIcon(mg.getResim());
                
                Timer tm = new Timer();
                TimerTask gm = new TimerTask() {

                    @Override
                    public void run() {
                        sayac++;
                        if (sayac == 5) {
                            mg.setResim(mg.getButton());
                            mg.getJlBt6().setIcon(mg.getResim());
                            tm.cancel();
                        }

                    }
                };

                tm.schedule(gm, 1, 200);
                sayac=0;
                double a = Double.parseDouble(mg.getJtBky().getText());
                mg.setBakiye1(a);
                if ((mg.getCb().getSelectedItem().toString() == "Öğrenci") && mg.getBakiye1() >= 1.25) {
                    Metro m = new Metro(mg.getBakiye1(), 1.25);
                    mg.getJtBky().setText(" " + m.getHesaplama());
                    Ses.Call("12.wav");
                } else if ((mg.getCb().getSelectedItem().toString() == "Tam") && mg.getBakiye1() >= 2.5) {
                    Metro m = new Metro(mg.getBakiye1(), 2.5);
                    mg.getJtBky().setText(" " + m.getHesaplama());
                    Ses.Call("13.wav");
                } else {
                    mg.getJtBky().setText("Yetersiz Bakiye");
                    Ses.Call("14.wav");
                }
            } else {
                mg.setResim(mg.getButton());
                mg.getJlBt6().setIcon(mg.getResim());
            }
        } else if (e.getSource() == this.mg.getCb()) {
            mg.getJtBky().setText("Bakiyenizi Giriniz.");
            Ses.Call("15.wav");
        } else if (e.getSource() == this.mg.getJtBky()){
            mg.getJtBky().setText("");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
