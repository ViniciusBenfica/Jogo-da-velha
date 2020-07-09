/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author vinic
 */
public class Jogo extends javax.swing.JFrame {
public boolean jogador1 = true;
public boolean jogador2 = true;
public int contpos = 0;
public int k = 0, i = 0;
int op;
public String linha1,linha2,linha3,coluna1,coluna2,coluna3, diagonal1,diagonal2;
String[][]posvetor = new String[3][3];
    public Jogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnreiniciar = new javax.swing.JButton();
        txtvisor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnreiniciar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnreiniciar.setText("REINICIAR");
        btnreiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreiniciarActionPerformed(evt);
            }
        });

        txtvisor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtvisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnreiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnreiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void verificaJogadorDaVez(){
        if(jogador1 && jogador2){
            this.op = 1;
            jogador1 = false;
            jogador2 = true;
            txtvisor.setText("Vez do jogador O");
        }else if(jogador1 && jogador2 == false){
            this.op = 1;
            jogador1 = false;
            jogador2 = true;
            txtvisor.setText("Vez do jogador O");
        }else{
            this.op = 2;
            jogador1 = true;
            jogador2 = false;
            txtvisor.setText("Vez do jogador X");
        }
    }
    public void limpaPosicoes(){
        for(i = 0; i < 3; i++){
            for(k = 0; k < 3; k++){
                posvetor[i][k]="";
            }
        }
    }
    
    public void DesativaBotoes(){
     btn1.setEnabled(false);
     btn2.setEnabled(false);
     btn3.setEnabled(false);
     btn4.setEnabled(false);
     btn5.setEnabled(false);
     btn6.setEnabled(false);
     btn7.setEnabled(false);
     btn8.setEnabled(false);
     btn9.setEnabled(false);
     
    }
    public void verificaPos(){
        contpos = 0;
         for(i = 0; i < 3; i++){
            for(k = 0; k < 3; k++){
               if(posvetor[i][k] == "X" || posvetor[i][k] == "O"){
                   contpos+=1;
               }
            }
        }
    }
    public void VerificaVencedor(){
        linha1 = posvetor[0][0] + posvetor[0][1] + posvetor[0][2];
        linha2 = posvetor[1][0] + posvetor[1][1] + posvetor[1][2];
        linha3 = posvetor[2][0] + posvetor[2][1] + posvetor[2][2];
        
        coluna1 = posvetor[0][0] + posvetor[1][0] + posvetor[2][0];
        coluna2 = posvetor[0][1] + posvetor[1][1] + posvetor[2][1];
        coluna3 = posvetor[0][2] + posvetor[1][2] + posvetor[2][2];
        
        diagonal1 = posvetor[0][0] + posvetor[1][1] + posvetor[2][2];
        diagonal2 = posvetor[0][2] + posvetor[1][1] + posvetor[2][0];
        
        if(linha1.equals("XXX") || linha2.equals("XXX") || linha3.equals("XXX") || coluna1.equals("XXX") || coluna2.equals("XXX") || coluna3.equals("XXX") || diagonal1.equals("XXX") || diagonal2.equals("XXX")){
            txtvisor.setText("O vencedor é o X");
            DesativaBotoes();
            
        }else if(linha1.equals("OOO") || linha2.equals("OOO") || linha3.equals("OOO") || coluna1.equals("OOO") || coluna2.equals("OOO") || coluna3.equals("OOO") || diagonal1.equals("OOO") || diagonal2.equals("OOO")){
            txtvisor.setText("O vencedor é o O");
            DesativaBotoes();
        }else if(contpos == 9){
            txtvisor.setText("Não houve Vencedor"); 
        }
    }
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // BOTAO 1
        verificaJogadorDaVez();
        if(op == 1){
            btn1.setText("X");
            posvetor[0][0] = "X";
        }else{
            btn1.setText("O");
            posvetor[0][0] = "O";
        }
        btn1.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // BOTAO 2
         verificaJogadorDaVez();
        if(op == 1){
            btn2.setText("X");
            posvetor[0][1] = "X";
        }else{
            btn2.setText("O");
            posvetor[0][1] = "O";
        }
        btn2.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // BOTAO 3
        verificaJogadorDaVez();
        if(op == 1){
            btn3.setText("X");
            posvetor[0][2] = "X";
        }else{
            btn3.setText("O");
            posvetor[0][2] = "O";
        }
        btn3.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // BOTAO 4
        verificaJogadorDaVez();
        if(op == 1){
            btn4.setText("X");
            posvetor[1][0] = "X";
        }else{
            btn4.setText("O");
            posvetor[1][0] = "O";
        }
        btn4.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       // BOTAO 5
        verificaJogadorDaVez();
        if(op == 1){
            btn5.setText("X");
            posvetor[1][1] = "X";
        }else{
            btn5.setText("O");
            posvetor[1][1] = "O";
        }
        btn5.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // BOTAO 6
        verificaJogadorDaVez();
        if(op == 1){
            btn6.setText("X");
            posvetor[1][2] = "X";
        }else{
            btn6.setText("O");
            posvetor[1][2] = "O";
        }
        btn6.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // BOTAO 7
        verificaJogadorDaVez();
        if(op == 1){
            btn7.setText("X");
            posvetor[2][0] = "X";
        }else{
            btn7.setText("O");
            posvetor[2][0] = "O";
        }
        btn7.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // BOTAO 8
        verificaJogadorDaVez();
        if(op == 1){
            btn8.setText("X");
            posvetor[2][1] = "X";
        }else{
            btn8.setText("O");
            posvetor[2][1] = "O";
        }
        btn8.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // BOTAO 9
        verificaJogadorDaVez();
        if(op == 1){
            btn9.setText("X");
            posvetor[2][2] = "X";
        }else{
            btn9.setText("O");
            posvetor[2][2] = "O";
        }
        btn9.setEnabled(false);
        verificaPos();
        VerificaVencedor();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnreiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreiniciarActionPerformed
        // Botao reiniciar
        btn1.setText("");
        btn1.setEnabled(true);
        
        btn2.setText("");
        btn2.setEnabled(true);
        
        btn3.setText("");
        btn3.setEnabled(true);
        
        btn4.setText("");
        btn4.setEnabled(true);
        
        btn5.setText("");
        btn5.setEnabled(true);
        
        btn6.setText("");
        btn6.setEnabled(true);
        
        btn7.setText("");
        btn7.setEnabled(true);
        
        btn8.setText("");
        btn8.setEnabled(true);
        
        btn9.setText("");
        btn9.setEnabled(true);
        limpaPosicoes();
        txtvisor.setText("");
        jogador1 = true;
        jogador2 = true;
    }//GEN-LAST:event_btnreiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnreiniciar;
    private javax.swing.JTextField txtvisor;
    // End of variables declaration//GEN-END:variables
}
