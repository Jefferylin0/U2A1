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
    ImageIcon a = new ImageIcon("mango.png");
    ImageIcon b = new ImageIcon("strawberry.png");
    ImageIcon c = new ImageIcon("grapes.png");
    ImageIcon d = new ImageIcon("watermelon.png");
    ImageIcon e = new ImageIcon("raspberry.png");
    ImageIcon f = new ImageIcon("banana.png");
    ImageIcon g = new ImageIcon("blueberry.png");
    ImageIcon h = new ImageIcon("orange.png");
    ImageIcon i = new ImageIcon("apple.png");
    ImageIcon j = new ImageIcon("pear.png");
    ImageIcon k = new ImageIcon("pineapple.png");
    ImageIcon l = new ImageIcon("kiwi.png");
    ImageIcon back = new ImageIcon("cardback.png");
    ImageIcon done = new ImageIcon("done.png");
    ImageIcon[] icons = {a, b, c, d, e, f, g, h, i, j, k, l};
    javax.swing.JButton[] buttons = new javax.swing.JButton[24];
    int count, c1, c2, card1, card2;
    int cardsLeft = 24;
    int[] change = new int[24];

    /**
     * Creates new form MatchingGame
     */
    public MatchingGame() {
        initComponents();
        buttons[0] = Card1;
        buttons[1] = Card2;
        buttons[2] = Card3;
        buttons[3] = Card4;
        buttons[4] = Card5;
        buttons[5] = Card6;
        buttons[6] = Card7;
        buttons[7] = Card8;
        buttons[8] = Card9;
        buttons[9] = Card10;
        buttons[10] = Card11;
        buttons[11] = Card12;
        buttons[12] = Card13;
        buttons[13] = Card14;
        buttons[14] = Card15;
        buttons[15] = Card16;
        buttons[16] = Card17;
        buttons[17] = Card18;
        buttons[18] = Card19;
        buttons[19] = Card20;
        buttons[20] = Card21;
        buttons[21] = Card22;
        buttons[22] = Card23;
        buttons[23] = Card24;
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
        displayBox = new javax.swing.JTextField();
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
        setResizable(false);

        mainTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(255, 0, 0));
        mainTitle.setText("Matching Game");

        Card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card1ActionPerformed(evt);
            }
        });

        Card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card2ActionPerformed(evt);
            }
        });

        Card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card3ActionPerformed(evt);
            }
        });

        Card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card4ActionPerformed(evt);
            }
        });

        Card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card5ActionPerformed(evt);
            }
        });

        Card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card6ActionPerformed(evt);
            }
        });

        Card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card7ActionPerformed(evt);
            }
        });

        Card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card8ActionPerformed(evt);
            }
        });

        Card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card9ActionPerformed(evt);
            }
        });

        Card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card10ActionPerformed(evt);
            }
        });

        Card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card11ActionPerformed(evt);
            }
        });

        Card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card12ActionPerformed(evt);
            }
        });

        Card13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card13ActionPerformed(evt);
            }
        });

        Card14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card14ActionPerformed(evt);
            }
        });

        Card15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card15ActionPerformed(evt);
            }
        });

        Card16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card16ActionPerformed(evt);
            }
        });

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btuGuessAgain.setText("Guess Again");
        btuGuessAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btuGuessAgainActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        displayBox.setEditable(false);
        displayBox.setText("Click the Play button to start.  Make sure click Guess Again after each guess.");

        Card17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card17ActionPerformed(evt);
            }
        });

        Card18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card18ActionPerformed(evt);
            }
        });

        Card19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card19ActionPerformed(evt);
            }
        });

        Card20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card20ActionPerformed(evt);
            }
        });

        Card21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card21ActionPerformed(evt);
            }
        });

        Card22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card22ActionPerformed(evt);
            }
        });

        Card23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card23ActionPerformed(evt);
            }
        });

        Card24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Card24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(mainTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Card17, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(Card21, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Card5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Card18, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(Card22, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Card9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(Card19, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(Card23, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Card13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Card14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Card15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(Card16, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(Card20, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(Card24, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnPlay)
                        .addGap(35, 35, 35)
                        .addComponent(btuGuessAgain)
                        .addGap(179, 179, 179)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(displayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTitle)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Card3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Card4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Card17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Card21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Card18, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Card22, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Card5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Card19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Card23, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Card9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Card15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Card16, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Card20, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Card24, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Card13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Card14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlay)
                    .addComponent(btuGuessAgain)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(displayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit the application.
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed

        /** Set change array */
        for (int z = 0; z <= 23; z++) {
            change[z] = 1;
        }
        
        /** Assign cards at random */
        String temp;
        for (int x = 0; x <= 11; x++) {
            for (int y = 1; y <= 2; y++) {
                temp = Integer.toString(x);
                set.add(temp);
            }
        }
        
        for (int x=0; x <= 23; x++) {
            double index = Math.floor(Math.random()*(24-x));
            int index1 = (int)index;
            cards.add(set.get(index1));
            set.remove(set.get(index1));
        }
    }//GEN-LAST:event_btnPlayActionPerformed
    
    public void calculations(String temp, int i) {
        int index = Integer.parseInt(temp);
        if (!(change[i] == 2)) {
            if (count < 2) {
                if (!(card1 == i)) {
                    count++;
                    if (count == 1) {
                        c1 = index;
                        change[i] = 0;
                        card1 = i;
                    } else if (count == 2) {
                        c2 = index;
                        change[i] = 0;
                    }
                    buttons[i].setIcon(icons[index]);
                }
            }
        }
        System.out.println(count);
    }
    private void Card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card1ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(0);
        calculations(temp, 0);
    }//GEN-LAST:event_Card1ActionPerformed

    private void Card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card2ActionPerformed
        // TODO add your handling code here:      
        String temp = cards.get(1);
        calculations(temp, 1);
    }//GEN-LAST:event_Card2ActionPerformed

    private void Card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card3ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(2);
        calculations(temp, 2);
    }//GEN-LAST:event_Card3ActionPerformed

    private void Card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card5ActionPerformed
        // TODO add your handling code here:       
        String temp = cards.get(4);
        calculations(temp, 4);
    }//GEN-LAST:event_Card5ActionPerformed

    private void Card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card4ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(3);
        calculations(temp, 3);
    }//GEN-LAST:event_Card4ActionPerformed

    private void Card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card6ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(5);
        calculations(temp, 5);
    }//GEN-LAST:event_Card6ActionPerformed

    private void Card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card7ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(6);
        calculations(temp, 6); 
    }//GEN-LAST:event_Card7ActionPerformed

    private void Card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card8ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(7);
        calculations(temp, 7);  
    }//GEN-LAST:event_Card8ActionPerformed

    private void Card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card9ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(8);
        calculations(temp, 8);
    }//GEN-LAST:event_Card9ActionPerformed

    private void Card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card10ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(9);
        calculations(temp, 9);
    }//GEN-LAST:event_Card10ActionPerformed

    private void Card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card11ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(10);
        calculations(temp, 10);
    }//GEN-LAST:event_Card11ActionPerformed

    private void Card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card12ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(11);
        calculations(temp, 11);
    }//GEN-LAST:event_Card12ActionPerformed

    private void Card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card13ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(12);
        calculations(temp, 12);
    }//GEN-LAST:event_Card13ActionPerformed

    private void Card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card14ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(13);
        calculations(temp, 13);
    }//GEN-LAST:event_Card14ActionPerformed

    private void Card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card15ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(14);
        calculations(temp, 14);
    }//GEN-LAST:event_Card15ActionPerformed

    private void Card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card16ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(15);
        calculations(temp, 15);
    }//GEN-LAST:event_Card16ActionPerformed
     
    private void btuGuessAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btuGuessAgainActionPerformed
        // TODO add your handling code here:
        
        count = 0;
        if (c1 == c2) {
            for (int y = 1; y <= 2; y++) {
                for (int i = 0; i<24; i++) {
                    if (change[i] == 0) {
                        buttons[i].setIcon(done);
                        change[i] = 2;
                    }
                }
            }
        }
        else {
            for (int z = 1; z <= 2; z++) {
                for (int o = 0; o<24; o++) {
                    if (change[o] == 0) {
                        buttons[o].setIcon(back);
                        change[o] = 1;
                    }
                }                    
            }
        }                        
    }//GEN-LAST:event_btuGuessAgainActionPerformed

    private void Card17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card17ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(16);
        calculations(temp, 16);
    }//GEN-LAST:event_Card17ActionPerformed

    private void Card18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card18ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(17);
        calculations(temp, 17);
    }//GEN-LAST:event_Card18ActionPerformed

    private void Card19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card19ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(18);
        calculations(temp, 18);
    }//GEN-LAST:event_Card19ActionPerformed

    private void Card20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card20ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(19);
        calculations(temp, 19);
    }//GEN-LAST:event_Card20ActionPerformed

    private void Card21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card21ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(20);
        calculations(temp, 20);
    }//GEN-LAST:event_Card21ActionPerformed

    private void Card22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card22ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(21);
        calculations(temp, 21);
    }//GEN-LAST:event_Card22ActionPerformed

    private void Card23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card23ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(22);
        calculations(temp, 22);
    }//GEN-LAST:event_Card23ActionPerformed

    private void Card24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Card24ActionPerformed
        // TODO add your handling code here:
        String temp = cards.get(23);
        calculations(temp, 23);
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
    private javax.swing.JTextField displayBox;
    private javax.swing.JLabel mainTitle;
    // End of variables declaration//GEN-END:variables
}
