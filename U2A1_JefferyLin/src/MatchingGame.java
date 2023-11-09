/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author 342441086
 */
public class MatchingGame extends javax.swing.JFrame {
    
    ArrayList<String> cards = new ArrayList<String>();
    ArrayList<String> set = new ArrayList<String>();
    ImageIcon a = new ImageIcon("ram.jpg");
    ImageIcon b = new ImageIcon("case.jpg");
    ImageIcon c = new ImageIcon("dvd.jpg");
    ImageIcon d = new ImageIcon("harddrive.jpg");
    ImageIcon e = new ImageIcon("keyboard.jpg");
    ImageIcon f = new ImageIcon("mice.jpg");
    ImageIcon g = new ImageIcon("monitor.jpg");
    ImageIcon h = new ImageIcon("printer.jpg");
    ImageIcon back = new ImageIcon("cardback.jpg");
    ImageIcon done = new ImageIcon("done.jpg");
    int count, c1, c2, card1, card2;
    int cardsLeft = 16;
    int[] change = new int[16];

    /**
     * Creates new form MatchingGame
     */
    public MatchingGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitle = new javax.swing.JLabel();
        Card1 = new javax.swing.JButton();
        Card2 = new javax.swing.JButton();
        Card3 = new javax.swing.JButton();
        Card4 = new javax.swing.JButton();
        Card5 = new javax.swing.JButton();
        Card6 = new javax.swing.JButton();
        Card7 = new javax.swing.JButton();
        Card8 = new javax.swing.JButton();
        Card9 = new javax.swing.JButton();
        Card10 = new javax.swing.JButton();
        Card11 = new javax.swing.JButton();
        Card12 = new javax.swing.JButton();
        Card13 = new javax.swing.JButton();
        Card14 = new javax.swing.JButton();
        Card15 = new javax.swing.JButton();
        Card16 = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        btuGuessAgain = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtInstruction = new javax.swing.JTextField();
        Card17 = new javax.swing.JButton();
        Card18 = new javax.swing.JButton();
        Card19 = new javax.swing.JButton();
        Card20 = new javax.swing.JButton();
        Card21 = new javax.swing.JButton();
        Card22 = new javax.swing.JButton();
        Card23 = new javax.swing.JButton();
        Card24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matching Game");
        getContentPane().setLayout(null);

        mainTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(255, 0, 0));
        mainTitle.setText("Matching Game");
        getContentPane().add(mainTitle);
        mainTitle.setBounds(400, 0, 165, 29);

        Card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card1ActionPerformed(evt);
            }
        });
        getContentPane().add(Card1);
        Card1.setBounds(58, 35, 130, 115);

        Card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card2ActionPerformed(evt);
            }
        });
        getContentPane().add(Card2);
        Card2.setBounds(206, 35, 129, 115);

        Card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card3ActionPerformed(evt);
            }
        });
        getContentPane().add(Card3);
        Card3.setBounds(353, 35, 123, 115);

        Card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card4ActionPerformed(evt);
            }
        });
        getContentPane().add(Card4);
        Card4.setBounds(494, 36, 123, 117);

        Card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card5ActionPerformed(evt);
            }
        });
        getContentPane().add(Card5);
        Card5.setBounds(58, 171, 130, 116);

        Card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card6ActionPerformed(evt);
            }
        });
        getContentPane().add(Card6);
        Card6.setBounds(206, 171, 129, 116);

        Card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card7ActionPerformed(evt);
            }
        });
        getContentPane().add(Card7);
        Card7.setBounds(353, 171, 123, 116);

        Card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card8ActionPerformed(evt);
            }
        });
        getContentPane().add(Card8);
        Card8.setBounds(494, 171, 123, 116);

        Card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card9ActionPerformed(evt);
            }
        });
        getContentPane().add(Card9);
        Card9.setBounds(58, 305, 130, 119);

        Card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card10ActionPerformed(evt);
            }
        });
        getContentPane().add(Card10);
        Card10.setBounds(206, 305, 129, 119);

        Card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card11ActionPerformed(evt);
            }
        });
        getContentPane().add(Card11);
        Card11.setBounds(353, 305, 123, 119);

        Card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card12ActionPerformed(evt);
            }
        });
        getContentPane().add(Card12);
        Card12.setBounds(494, 305, 123, 119);

        Card13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card13ActionPerformed(evt);
            }
        });
        getContentPane().add(Card13);
        Card13.setBounds(58, 442, 130, 123);

        Card14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card14ActionPerformed(evt);
            }
        });
        getContentPane().add(Card14);
        Card14.setBounds(206, 442, 129, 123);

        Card15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card15ActionPerformed(evt);
            }
        });
        getContentPane().add(Card15);
        Card15.setBounds(350, 440, 123, 123);

        Card16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card16ActionPerformed(evt);
            }
        });
        getContentPane().add(Card16);
        Card16.setBounds(490, 440, 123, 123);

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay);
        btnPlay.setBounds(58, 583, 76, 27);

        btuGuessAgain.setText("Guess Again");
        btuGuessAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btuGuessAgainActionPerformed(evt);
            }
        });
        getContentPane().add(btuGuessAgain);
        btuGuessAgain.setBounds(169, 583, 99, 27);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(447, 583, 76, 27);

        txtInstruction.setText("Click the Play button to start.  Make sure click Guess Again after each guess.");
        getContentPane().add(txtInstruction);
        txtInstruction.setBounds(58, 628, 586, 26);

        Card17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card17ActionPerformed(evt);
            }
        });
        getContentPane().add(Card17);
        Card17.setBounds(630, 37, 123, 120);

        Card18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card18ActionPerformed(evt);
            }
        });
        getContentPane().add(Card18);
        Card18.setBounds(630, 170, 123, 116);

        Card19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card19ActionPerformed(evt);
            }
        });
        getContentPane().add(Card19);
        Card19.setBounds(630, 300, 123, 119);

        Card20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card20ActionPerformed(evt);
            }
        });
        getContentPane().add(Card20);
        Card20.setBounds(630, 440, 123, 123);

        Card21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card21ActionPerformed(evt);
            }
        });
        getContentPane().add(Card21);
        Card21.setBounds(770, 40, 123, 120);

        Card22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card22ActionPerformed(evt);
            }
        });
        getContentPane().add(Card22);
        Card22.setBounds(770, 170, 123, 116);

        Card23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card23ActionPerformed(evt);
            }
        });
        getContentPane().add(Card23);
        Card23.setBounds(770, 300, 123, 119);

        Card24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card24ActionPerformed(evt);
            }
        });
        getContentPane().add(Card24);
        Card24.setBounds(770, 440, 123, 123);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit the application.
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        
        /** Set change array */
        for (int z = 0; z <= 15; z++) {
            change[z] = 1;
        }
        
        /** Assign cards at random */
        String temp;
        for (int x = 0; x <= 7; x++) {
            for (int y = 1; y <= 2; y++) {
                temp = Integer.toString(x);
                set.add(temp);
            }
        }
        
        for (int x=0; x <= 15; x++) {
            double index = Math.floor(Math.random()*(16-x));
            int index1 = (int)index;
            cards.add(set.get(index1));
            set.remove(set.get(index1));
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void Card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card1ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(0);
        
        if (temp.equals("0")) {
            Card1.setIcon(a);
        } else if (temp.equals("1")) {
            Card1.setIcon(b);
        } else if (temp.equals("2")) {
            Card1.setIcon(c);
        } else if (temp.equals("3")) {
            Card1.setIcon(d);
        } else if (temp.equals("4")) {
            Card1.setIcon(e);
        } else if (temp.equals("5")) {
            Card1.setIcon(f);
        } else if (temp.equals("6")) {
            Card1.setIcon(g);
        } else if (temp.equals("7")) {
            Card1.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[0] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[0] = 0;
        }
        
    }//GEN-LAST:event_Card1ActionPerformed

    private void Card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card2ActionPerformed
        // TODO add your handling code here:
                
        String temp = cards.get(1);
        
        if (temp.equals("0")) {
            Card2.setIcon(a);
        } else if (temp.equals("1")) {
            Card2.setIcon(b);
        } else if (temp.equals("2")) {
            Card2.setIcon(c);
        } else if (temp.equals("3")) {
            Card2.setIcon(d);
        } else if (temp.equals("4")) {
            Card2.setIcon(e);
        } else if (temp.equals("5")) {
            Card2.setIcon(f);
        } else if (temp.equals("6")) {
            Card2.setIcon(g);
        } else if (temp.equals("7")) {
            Card2.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[1] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[1] = 0;
        }
    }//GEN-LAST:event_Card2ActionPerformed

    private void Card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card3ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(2);
        
        if (temp.equals("0")) {
            Card3.setIcon(a);
        } else if (temp.equals("1")) {
            Card3.setIcon(b);
        } else if (temp.equals("2")) {
            Card3.setIcon(c);
        } else if (temp.equals("3")) {
            Card3.setIcon(d);
        } else if (temp.equals("4")) {
            Card3.setIcon(e);
        } else if (temp.equals("5")) {
            Card3.setIcon(f);
        } else if (temp.equals("6")) {
            Card3.setIcon(g);
        } else if (temp.equals("7")) {
            Card3.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[2] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[2] = 0;
        }
    }//GEN-LAST:event_Card3ActionPerformed

    private void Card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card5ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(4);
        
        if (temp.equals("0")) {
            Card5.setIcon(a);
        } else if (temp.equals("1")) {
            Card5.setIcon(b);
        } else if (temp.equals("2")) {
            Card5.setIcon(c);
        } else if (temp.equals("3")) {
            Card5.setIcon(d);
        } else if (temp.equals("4")) {
            Card5.setIcon(e);
        } else if (temp.equals("5")) {
            Card5.setIcon(f);
        } else if (temp.equals("6")) {
            Card5.setIcon(g);
        } else if (temp.equals("7")) {
            Card5.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[4] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[4] = 0;
        }
        
    }//GEN-LAST:event_Card5ActionPerformed

    private void Card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card4ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(3);
        
        if (temp.equals("0")) {
            Card4.setIcon(a);
        } else if (temp.equals("1")) {
            Card4.setIcon(b);
        } else if (temp.equals("2")) {
            Card4.setIcon(c);
        } else if (temp.equals("3")) {
            Card4.setIcon(d);
        } else if (temp.equals("4")) {
            Card4.setIcon(e);
        } else if (temp.equals("5")) {
            Card4.setIcon(f);
        } else if (temp.equals("6")) {
            Card4.setIcon(g);
        } else if (temp.equals("7")) {
            Card4.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[3] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[3] = 0;
        }
    }//GEN-LAST:event_Card4ActionPerformed

    private void Card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card6ActionPerformed
        // TODO add your handling code here:
        
        
        String temp = cards.get(5);
        
        if (temp.equals("0")) {
            Card6.setIcon(a);
        } else if (temp.equals("1")) {
            Card6.setIcon(b);
        } else if (temp.equals("2")) {
            Card6.setIcon(c);
        } else if (temp.equals("3")) {
            Card6.setIcon(d);
        } else if (temp.equals("4")) {
            Card6.setIcon(e);
        } else if (temp.equals("5")) {
            Card6.setIcon(f);
        } else if (temp.equals("6")) {
            Card6.setIcon(g);
        } else if (temp.equals("7")) {
            Card6.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[5] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[5] = 0;
        }
        
        
    }//GEN-LAST:event_Card6ActionPerformed

    private void Card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card7ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(6);
        
        if (temp.equals("0")) {
            Card7.setIcon(a);
        } else if (temp.equals("1")) {
            Card7.setIcon(b);
        } else if (temp.equals("2")) {
            Card7.setIcon(c);
        } else if (temp.equals("3")) {
            Card7.setIcon(d);
        } else if (temp.equals("4")) {
            Card7.setIcon(e);
        } else if (temp.equals("5")) {
            Card7.setIcon(f);
        } else if (temp.equals("6")) {
            Card7.setIcon(g);
        } else if (temp.equals("7")) {
            Card7.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[6] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[6] = 0;
        }
        
    }//GEN-LAST:event_Card7ActionPerformed

    private void Card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card8ActionPerformed
        // TODO add your handling code here:
        
        
        String temp = cards.get(7);
        
        if (temp.equals("0")) {
            Card8.setIcon(a);
        } else if (temp.equals("1")) {
            Card8.setIcon(b);
        } else if (temp.equals("2")) {
            Card8.setIcon(c);
        } else if (temp.equals("3")) {
            Card8.setIcon(d);
        } else if (temp.equals("4")) {
            Card8.setIcon(e);
        } else if (temp.equals("5")) {
            Card8.setIcon(f);
        } else if (temp.equals("6")) {
            Card8.setIcon(g);
        } else if (temp.equals("7")) {
            Card8.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[7] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[7] = 0;
        }
        
    }//GEN-LAST:event_Card8ActionPerformed

    private void Card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card9ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(8);
        
        if (temp.equals("0")) {
            Card9.setIcon(a);
        } else if (temp.equals("1")) {
            Card9.setIcon(b);
        } else if (temp.equals("2")) {
            Card9.setIcon(c);
        } else if (temp.equals("3")) {
            Card9.setIcon(d);
        } else if (temp.equals("4")) {
            Card9.setIcon(e);
        } else if (temp.equals("5")) {
            Card9.setIcon(f);
        } else if (temp.equals("6")) {
            Card9.setIcon(g);
        } else if (temp.equals("7")) {
            Card9.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[8] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[8] = 0;
        }
        
    }//GEN-LAST:event_Card9ActionPerformed

    private void Card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card10ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(9);
        
        if (temp.equals("0")) {
            Card10.setIcon(a);
        } else if (temp.equals("1")) {
            Card10.setIcon(b);
        } else if (temp.equals("2")) {
            Card10.setIcon(c);
        } else if (temp.equals("3")) {
            Card10.setIcon(d);
        } else if (temp.equals("4")) {
            Card10.setIcon(e);
        } else if (temp.equals("5")) {
            Card10.setIcon(f);
        } else if (temp.equals("6")) {
            Card10.setIcon(g);
        } else if (temp.equals("7")) {
            Card10.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[9] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[9] = 0;
        }
    }//GEN-LAST:event_Card10ActionPerformed

    private void Card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card11ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(10);
        
        if (temp.equals("0")) {
            Card11.setIcon(a);
        } else if (temp.equals("1")) {
            Card11.setIcon(b);
        } else if (temp.equals("2")) {
            Card11.setIcon(c);
        } else if (temp.equals("3")) {
            Card11.setIcon(d);
        } else if (temp.equals("4")) {
            Card11.setIcon(e);
        } else if (temp.equals("5")) {
            Card11.setIcon(f);
        } else if (temp.equals("6")) {
            Card11.setIcon(g);
        } else if (temp.equals("7")) {
            Card11.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[10] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[10] = 0;
        }
        
    }//GEN-LAST:event_Card11ActionPerformed

    private void Card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card12ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(11);
        
        if (temp.equals("0")) {
            Card12.setIcon(a);
        } else if (temp.equals("1")) {
            Card12.setIcon(b);
        } else if (temp.equals("2")) {
            Card12.setIcon(c);
        } else if (temp.equals("3")) {
            Card12.setIcon(d);
        } else if (temp.equals("4")) {
            Card12.setIcon(e);
        } else if (temp.equals("5")) {
            Card12.setIcon(f);
        } else if (temp.equals("6")) {
            Card12.setIcon(g);
        } else if (temp.equals("7")) {
            Card12.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[11] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[11] = 0;
        }
        
    }//GEN-LAST:event_Card12ActionPerformed

    private void Card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card13ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(12);
        
        if (temp.equals("0")) {
            Card13.setIcon(a);
        } else if (temp.equals("1")) {
            Card13.setIcon(b);
        } else if (temp.equals("2")) {
            Card13.setIcon(c);
        } else if (temp.equals("3")) {
            Card13.setIcon(d);
        } else if (temp.equals("4")) {
            Card13.setIcon(e);
        } else if (temp.equals("5")) {
            Card13.setIcon(f);
        } else if (temp.equals("6")) {
            Card13.setIcon(g);
        } else if (temp.equals("7")) {
            Card13.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[12] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[12] = 0;
        }
    }//GEN-LAST:event_Card13ActionPerformed

    private void Card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card14ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(13);
        
        if (temp.equals("0")) {
            Card14.setIcon(a);
        } else if (temp.equals("1")) {
            Card14.setIcon(b);
        } else if (temp.equals("2")) {
            Card14.setIcon(c);
        } else if (temp.equals("3")) {
            Card14.setIcon(d);
        } else if (temp.equals("4")) {
            Card14.setIcon(e);
        } else if (temp.equals("5")) {
            Card14.setIcon(f);
        } else if (temp.equals("6")) {
            Card14.setIcon(g);
        } else if (temp.equals("7")) {
            Card14.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[13] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[13] = 0;
        }
        
        
    }//GEN-LAST:event_Card14ActionPerformed

    private void Card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card15ActionPerformed
        // TODO add your handling code here:
        
        String temp = cards.get(14);
        
        if (temp.equals("0")) {
            Card15.setIcon(a);
        } else if (temp.equals("1")) {
            Card15.setIcon(b);
        } else if (temp.equals("2")) {
            Card15.setIcon(c);
        } else if (temp.equals("3")) {
            Card15.setIcon(d);
        } else if (temp.equals("4")) {
            Card15.setIcon(e);
        } else if (temp.equals("5")) {
            Card15.setIcon(f);
        } else if (temp.equals("6")) {
            Card15.setIcon(g);
        } else if (temp.equals("7")) {
            Card15.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[14] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[14] = 0;
        }
    }//GEN-LAST:event_Card15ActionPerformed

    private void Card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card16ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(15);
        
        if (temp.equals("0")) {
            Card16.setIcon(a);
        } else if (temp.equals("1")) {
            Card16.setIcon(b);
        } else if (temp.equals("2")) {
            Card16.setIcon(c);
        } else if (temp.equals("3")) {
            Card16.setIcon(d);
        } else if (temp.equals("4")) {
            Card16.setIcon(e);
        } else if (temp.equals("5")) {
            Card16.setIcon(f);
        } else if (temp.equals("6")) {
            Card16.setIcon(g);
        } else if (temp.equals("7")) {
            Card16.setIcon(h);
        }
        
        count++;
        if (count == 1) {
            c1 = Integer.parseInt(temp);
            change[15] = 0;
        } else if (count == 2) {
            c2 = Integer.parseInt(temp);
            change[15] = 0;
        }
        
    }//GEN-LAST:event_Card16ActionPerformed

    private void btuGuessAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btuGuessAgainActionPerformed
        // TODO add your handling code here:
        
        count = 0;
        if (c1 == c2) {
            for (int y = 1; y <= 2; y++) {
                if (change[0] == 0) {
                    Card1.setIcon(done);
                    change[0] = 2;
                } else if (change[1] == 0) {
                    Card2.setIcon(done);
                    change[1] = 2;
                } else if (change[2] == 0) {
                    Card3.setIcon(done);
                    change[2] = 2;
                } else if (change[3] == 0) {
                    Card4.setIcon(done);
                    change[3] = 2;
                } else if (change[4] == 0) {
                    Card5.setIcon(done);
                    change[4] = 2;
                } else if (change[5] == 0) {
                    Card6.setIcon(done);
                    change[5] = 2;
                } else if (change[6] == 0) {
                    Card7.setIcon(done);
                    change[6] = 2;
                } else if (change[7] == 0) {
                    Card8.setIcon(done);
                    change[7] = 2;
                } else if (change[8] == 0) {
                    Card9.setIcon(done);
                    change[8] = 2;
                } else if (change[9] == 0) {
                    Card10.setIcon(done);
                    change[9] = 2;
                } else if (change[10] == 0) {
                    Card11.setIcon(done);
                    change[10] = 2;
                } else if (change[11] == 0) {
                    Card12.setIcon(done);
                    change[11] = 2;
                } else if (change[12] == 0) {
                    Card13.setIcon(done);
                    change[12] = 2;
                } else if (change[13] == 0) {
                    Card14.setIcon(done);
                    change[13] = 2;
                } else if (change[14] == 0) {
                    Card15.setIcon(done);
                    change[14] = 2;
                } else if (change[15] == 0) {
                    Card16.setIcon(done);
                    change[15] = 2;
                } 
            }
        }
        else {

            for (int z = 1; z <= 2; z++) {

                if (change[0] == 0) {
                    Card1.setIcon(back);
                    change[0] = 1;
                } else if (change[1] == 0) {
                    Card2.setIcon(back);
                    change[1] = 1;
                } else if (change[2] == 0) {
                    Card3.setIcon(back);
                    change[2] = 1;
                } else if (change[3] == 0) {
                    Card4.setIcon(back);
                    change[3] = 1;
                } else if (change[4] == 0) {
                    Card5.setIcon(back);
                    change[4] = 1;
                } else if (change[5] == 0) {
                    Card6.setIcon(back);
                    change[5] = 1;
                } else if (change[6] == 0) {
                    Card7.setIcon(back);
                    change[6] = 1;
                } else if (change[7] == 0) {
                    Card8.setIcon(back);
                    change[7] = 1;
                } else if (change[8] == 0) {
                    Card9.setIcon(back);
                    change[8] = 1;
                } else if (change[9] == 0) {
                    Card10.setIcon(back);
                    change[9] = 1;
                } else if (change[10] == 0) {
                    Card11.setIcon(back);
                    change[10] = 1;
                } else if (change[11] == 0) {
                    Card12.setIcon(back);
                    change[11] = 1;
                } else if (change[12] == 0) {
                    Card13.setIcon(back);
                    change[12] = 1;
                } else if (change[13] == 0) {
                    Card14.setIcon(back);
                    change[13] = 1;
                } else if (change[14] == 0) {
                    Card15.setIcon(back);
                    change[14] = 1;
                } else if (change[15] == 0) {
                    Card16.setIcon(back);
                    change[15] = 1;
                }                                              
            }
        }                        
    }//GEN-LAST:event_btuGuessAgainActionPerformed

    private void Card17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card17ActionPerformed

    private void Card18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card18ActionPerformed

    private void Card19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card19ActionPerformed

    private void Card20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card20ActionPerformed

    private void Card21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card21ActionPerformed

    private void Card22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card22ActionPerformed

    private void Card23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card23ActionPerformed

    private void Card24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Card24ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Card1;
    private javax.swing.JButton Card10;
    private javax.swing.JButton Card11;
    private javax.swing.JButton Card12;
    private javax.swing.JButton Card13;
    private javax.swing.JButton Card14;
    private javax.swing.JButton Card15;
    private javax.swing.JButton Card16;
    private javax.swing.JButton Card17;
    private javax.swing.JButton Card18;
    private javax.swing.JButton Card19;
    private javax.swing.JButton Card2;
    private javax.swing.JButton Card20;
    private javax.swing.JButton Card21;
    private javax.swing.JButton Card22;
    private javax.swing.JButton Card23;
    private javax.swing.JButton Card24;
    private javax.swing.JButton Card3;
    private javax.swing.JButton Card4;
    private javax.swing.JButton Card5;
    private javax.swing.JButton Card6;
    private javax.swing.JButton Card7;
    private javax.swing.JButton Card8;
    private javax.swing.JButton Card9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btuGuessAgain;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JTextField txtInstruction;
    // End of variables declaration//GEN-END:variables
}
