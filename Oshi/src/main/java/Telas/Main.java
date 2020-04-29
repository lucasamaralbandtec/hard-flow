package Telas;
import CapturarDados.InfoCPU;
import CapturarDados.InfoDisco;
import CapturarDados.InfoRAM;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class Main extends javax.swing.JFrame {
    private  InfoCPU cpu = new InfoCPU();
    private InfoRAM  ram = new InfoRAM();
    private InfoDisco disco = new InfoDisco();
    
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        long TEMPO = (1000 * 1);
    
        Timer timer = null;
    
        if(timer == null)
        {
            timer = new Timer();
        
            TimerTask tarefa = new TimerTask(){
                public void run(){
                
                    //porcentagemRAM();
                    //porcentagemCPU();
                    //discoLivre();
                }
        
            };
            timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);
        }   
    }
    
    private void porcentagemRAM()
    {
        Double capturaRam = ram.getPorcentagemRam();
        
    }

    private void porcentagemCPU()
    {
        Double cpuPorcentagem = cpu.getPorcentagemCPU();
        
    }  
    
    private void discoLivre()
    {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        painel_logo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_logs = new javax.swing.JLabel();
        btn_processos = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        painel_logs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        painel_processos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        header = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        painel_logo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log35.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("HardFlow");

        btn_logs.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_logs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_logs.setText("Logs");
        btn_logs.setOpaque(true);
        btn_logs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logsMouseClicked(evt);
            }
        });

        btn_processos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_processos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_processos.setText("Processos");
        btn_processos.setOpaque(true);
        btn_processos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_processosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painel_logoLayout = new javax.swing.GroupLayout(painel_logo);
        painel_logo.setLayout(painel_logoLayout);
        painel_logoLayout.setHorizontalGroup(
            painel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_logoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painel_logoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_processos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_logs, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painel_logoLayout.setVerticalGroup(
            painel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_logoLayout.createSequentialGroup()
                .addGroup(painel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(painel_logoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_logoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(painel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_logs)
                    .addComponent(btn_processos)))
        );

        home.setBackground(new java.awt.Color(255, 255, 255));

        painel_logs.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout painel_logsLayout = new javax.swing.GroupLayout(painel_logs);
        painel_logs.setLayout(painel_logsLayout);
        painel_logsLayout.setHorizontalGroup(
            painel_logsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_logsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        painel_logsLayout.setVerticalGroup(
            painel_logsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_logsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        header.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        header.setForeground(new java.awt.Color(51, 51, 51));
        header.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"CPU", null},
                {"DISCO", null},
                {"RAM", null},
                {"TEMPERATURA", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Status"
            }
        ));
        header.setGridColor(new java.awt.Color(255, 255, 255));
        header.setRowHeight(20);
        header.setSelectionBackground(new java.awt.Color(54, 185, 204));
        jScrollPane1.setViewportView(header);

        javax.swing.GroupLayout painel_processosLayout = new javax.swing.GroupLayout(painel_processos);
        painel_processos.setLayout(painel_processosLayout);
        painel_processosLayout.setHorizontalGroup(
            painel_processosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        painel_processosLayout.setVerticalGroup(
            painel_processosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_processos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(painel_logs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_processos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(painel_logs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painel_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_logsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logsMouseClicked
        setLblColor(btn_logs);
        resertlblColor(btn_processos);
        painel_logs.setVisible(true);
        painel_processos.setVisible(false);
    }//GEN-LAST:event_btn_logsMouseClicked

    private void btn_processosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_processosMouseClicked
        setLblColor(btn_processos);
        resertlblColor(btn_logs);
        painel_processos.setVisible(true);
        painel_logs.setVisible(false);
    }//GEN-LAST:event_btn_processosMouseClicked

    public void setLblColor(JLabel lbl){
        lbl.setBackground(new Color(60,63,65));
    }
    
    public void resertlblColor(JLabel lbl){
        lbl.setBackground(new Color(255,255,255));
    }
            
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_logs;
    private javax.swing.JLabel btn_processos;
    private javax.swing.JTable header;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel painel_logo;
    private javax.swing.JPanel painel_logs;
    private javax.swing.JPanel painel_processos;
    // End of variables declaration//GEN-END:variables
}
