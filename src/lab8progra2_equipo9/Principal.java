package lab8progra2_equipo9;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        
        initComponents();
        UNO.setVisible(true);
        UNO.setSize(808, 589);
        UNO.setLocationRelativeTo(this);
        vivos.add(nuevo);
        listartable(vivos, tabla_lista);
        listartableUniversos(UU,TABLEU);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UNO = new javax.swing.JFrame();
        UNOmenu = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        BridgeADD = new java.awt.Button();
        BridgeMOD = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        BridgeADDUNI = new java.awt.Button();
        button4 = new java.awt.Button();
        DOSAdd = new javax.swing.JFrame();
        NombreSV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDSV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SpinnerNivelesPoder = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        SpinnerAñosSV = new javax.swing.JSpinner();
        choice1 = new java.awt.Choice();
        jLabel5 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        button5 = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        Universce = new javax.swing.JComboBox<>();
        TRESMOD = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_lista = new javax.swing.JTable();
        button1 = new java.awt.Button();
        TRESCONUNO = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        NombreSV1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        IDSV1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Universce1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        jLabel13 = new javax.swing.JLabel();
        SpinnerAñosSV1 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        SpinnerNivelesPoder1 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        POPSubMenuUNI = new java.awt.PopupMenu();
        MODUniverso = new java.awt.MenuItem();
        POPSubMenuUNI1 = new java.awt.PopupMenu();
        MODUniverso1 = new java.awt.MenuItem();
        DELETEUniverso = new java.awt.MenuItem();
        listar_universo = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLEU = new javax.swing.JTable();
        regresar = new java.awt.Button();

        jInternalFrame1.setVisible(true);

        BridgeADD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BridgeADD.setLabel("Agregar seres vivos");
        BridgeADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BridgeADDActionPerformed(evt);
            }
        });

        BridgeMOD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BridgeMOD.setLabel("MOD Seres vivos");
        BridgeMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BridgeMODActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button2.setLabel("Eliminar Seres Vivos");

        button3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button3.setLabel("Ver Base de datos");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BridgeADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BridgeMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(BridgeADD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(BridgeMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        UNOmenu.addTab("Seres Vivos", jInternalFrame1);

        jInternalFrame2.setVisible(true);

        BridgeADDUNI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BridgeADDUNI.setLabel("Agregar Universos");
        BridgeADDUNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BridgeADDUNIActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button4.setLabel("Eliminar / Listar / MOD Universos ");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BridgeADDUNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(BridgeADDUNI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        UNOmenu.addTab("Universos", jInternalFrame2);

        javax.swing.GroupLayout UNOLayout = new javax.swing.GroupLayout(UNO.getContentPane());
        UNO.getContentPane().setLayout(UNOLayout);
        UNOLayout.setHorizontalGroup(
            UNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(UNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UNOLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(UNOmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        UNOLayout.setVerticalGroup(
            UNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
            .addGroup(UNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UNOLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(UNOmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        NombreSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreSVActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Agregar Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Agregar ID");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Agregar Nivel de poder");

        SpinnerNivelesPoder.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Agregar Años");

        SpinnerAñosSV.setModel(new javax.swing.SpinnerNumberModel(1, 0, 10000, 1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Elija Raza ");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label1.setText("Agregar Seres Vivos");

        button5.setLabel("button5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Elija Universo ");

        Universce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout DOSAddLayout = new javax.swing.GroupLayout(DOSAdd.getContentPane());
        DOSAdd.getContentPane().setLayout(DOSAddLayout);
        DOSAddLayout.setHorizontalGroup(
            DOSAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DOSAddLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(DOSAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DOSAddLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DOSAddLayout.createSequentialGroup()
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DOSAddLayout.createSequentialGroup()
                        .addGroup(DOSAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Universce, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SpinnerAñosSV)
                            .addGroup(DOSAddLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(DOSAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IDSV)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NombreSV)
                                    .addComponent(SpinnerNivelesPoder)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DOSAddLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(86, 86, 86))))
        );
        DOSAddLayout.setVerticalGroup(
            DOSAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DOSAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(SpinnerNivelesPoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(SpinnerAñosSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(22, 22, 22)
                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(Universce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        TRESMOD.setPreferredSize(new java.awt.Dimension(900, 630));

        tabla_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ID", "Poder", "Años", "Universo de pertenencia", "Raza"
            }
        ));
        tabla_lista.setToolTipText("");
        jScrollPane1.setViewportView(tabla_lista);

        button1.setLabel("MOD");

        javax.swing.GroupLayout TRESMODLayout = new javax.swing.GroupLayout(TRESMOD.getContentPane());
        TRESMOD.getContentPane().setLayout(TRESMODLayout);
        TRESMODLayout.setHorizontalGroup(
            TRESMODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRESMODLayout.createSequentialGroup()
                .addGroup(TRESMODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TRESMODLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TRESMODLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        TRESMODLayout.setVerticalGroup(
            TRESMODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRESMODLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Agregar Nombre");

        NombreSV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreSV1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Agregar ID");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("MOD Seres Vivos");

        Universce1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Universce1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Universce1MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Elija Universo ");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Elija Raza ");

        SpinnerAñosSV1.setModel(new javax.swing.SpinnerNumberModel(1, 0, 10000, 1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Agregar Años");

        SpinnerNivelesPoder1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Agregar Nivel de poder");

        javax.swing.GroupLayout TRESCONUNOLayout = new javax.swing.GroupLayout(TRESCONUNO.getContentPane());
        TRESCONUNO.getContentPane().setLayout(TRESCONUNOLayout);
        TRESCONUNOLayout.setHorizontalGroup(
            TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRESCONUNOLayout.createSequentialGroup()
                .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TRESCONUNOLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(IDSV1)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NombreSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Universce1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SpinnerAñosSV1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SpinnerNivelesPoder1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))
                    .addGroup(TRESCONUNOLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel9)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        TRESCONUNOLayout.setVerticalGroup(
            TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRESCONUNOLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreSV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerNivelesPoder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDSV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerAñosSV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TRESCONUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TRESCONUNOLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(22, 22, 22)
                        .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TRESCONUNOLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(Universce1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        POPSubMenuUNI.setLabel("popupMenu1");
        POPSubMenuUNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POPSubMenuUNIActionPerformed(evt);
            }
        });

        MODUniverso.setLabel("MOD Nombre");
        POPSubMenuUNI.add(MODUniverso);

        POPSubMenuUNI1.setLabel("popupMenu1");
        POPSubMenuUNI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POPSubMenuUNI1ActionPerformed(evt);
            }
        });

        MODUniverso1.setLabel("MOD Nombre");
        MODUniverso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODUniverso1ActionPerformed(evt);
            }
        });
        POPSubMenuUNI1.add(MODUniverso1);

        DELETEUniverso.setLabel("menuItem1");
        POPSubMenuUNI1.add(DELETEUniverso);

        TABLEU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Universo"
            }
        ));
        jScrollPane2.setViewportView(TABLEU);

        regresar.setLabel("regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listar_universoLayout = new javax.swing.GroupLayout(listar_universo.getContentPane());
        listar_universo.getContentPane().setLayout(listar_universoLayout);
        listar_universoLayout.setHorizontalGroup(
            listar_universoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listar_universoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(listar_universoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        listar_universoLayout.setVerticalGroup(
            listar_universoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listar_universoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreSVActionPerformed

    private void BridgeADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BridgeADDActionPerformed
        UNO.setVisible(false);
        DOSAdd.setVisible(true);
        DOSAdd.setSize(302, 690);
        DOSAdd.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_BridgeADDActionPerformed

    private void BridgeMODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BridgeMODActionPerformed
        UNO.setVisible(false);
        TRESMOD.setVisible(true);
        TRESMOD.setSize(900, 630);
        TRESMOD.setLocationRelativeTo(this);
    }//GEN-LAST:event_BridgeMODActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        SeresVivos nuevo = new SeresVivos(NombreSV.getText(), choice1.getSelectedItem(), Universce.getName(), (int) SpinnerNivelesPoder.getValue(), Integer.parseInt(IDSV.getText()), (int) SpinnerAñosSV.getValue());
        listartable(vivos, tabla_lista);
        limpiartable(tabla_lista);
    }//GEN-LAST:event_button5ActionPerformed

    private void NombreSV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreSV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreSV1ActionPerformed

    private void Universce1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Universce1MousePressed
        if (evt.getButton() == 3) {
            POPSubMenuUNI.show(TRESCONUNO, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_Universce1MousePressed

    private void POPSubMenuUNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POPSubMenuUNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_POPSubMenuUNIActionPerformed

    private void BridgeADDUNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BridgeADDUNIActionPerformed
        
        String nombre = JOptionPane.showInputDialog(TRESCONUNO, "Ingrese el nombre ");
        if(Verificar(nombre)){
            Universo u = new Universo(nombre);
            UU.add(u);
         JOptionPane.showMessageDialog(UNO, "Universo agregado");   
        }
            limpiartable(TABLEU);
            listartableUniversos(UU,TABLEU);
        
    }//GEN-LAST:event_BridgeADDUNIActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        UNO.setVisible(false);
        listar_universo.setVisible(true);
        listar_universo.setSize(900, 630);
        listar_universo.setLocationRelativeTo(this);
    }//GEN-LAST:event_button4ActionPerformed

    private void POPSubMenuUNI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POPSubMenuUNI1ActionPerformed
        
    }//GEN-LAST:event_POPSubMenuUNI1ActionPerformed

    private void MODUniverso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODUniverso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODUniverso1ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        listar_universo.setVisible(false);
        UNO.setVisible(true);
        UNO.setSize(900, 630);
        UNO.setLocationRelativeTo(this);
    }//GEN-LAST:event_regresarActionPerformed
    public void listartableUniversos(ArrayList<Universo> lista, JTable TABLau) {
        DefaultTableModel modelo = (DefaultTableModel) TABLau.getModel();
        Object[] ob = new Object[1];
        for (int i = 0; i < lista.size(); i++) {
            
            ob[0] = lista.get(i).getNombre();
            modelo.addRow(ob);
            
        }
    }

    public boolean Verificar(String conter) {
        boolean retorno = true;
        for (int i = 0; i < UU.size(); i++) {
            if (conter.toLowerCase().equals(UU.get(i).getNombre().toLowerCase())) {
                JOptionPane.showMessageDialog(this, "El universo ya existe");
                retorno = false;
            } else {
                retorno = true;
            }
        }
        return retorno;
    }

    public void listartable(ArrayList<SeresVivos> lista, JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getNombre();
            ob[1] = lista.get(i).getId();
            ob[2] = lista.get(i).getPoder();
            ob[3] = lista.get(i).getAnnios();
            ob[4] = lista.get(i).getUniverso();
            ob[5] = lista.get(i).getRaza();
            modelo.addRow(ob);
            
        }
    }
    public void limpiartable(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BridgeADD;
    private java.awt.Button BridgeADDUNI;
    private java.awt.Button BridgeMOD;
    private java.awt.MenuItem DELETEUniverso;
    private javax.swing.JFrame DOSAdd;
    private javax.swing.JTextField IDSV;
    private javax.swing.JTextField IDSV1;
    private java.awt.MenuItem MODUniverso;
    private java.awt.MenuItem MODUniverso1;
    private javax.swing.JTextField NombreSV;
    private javax.swing.JTextField NombreSV1;
    private java.awt.PopupMenu POPSubMenuUNI;
    private java.awt.PopupMenu POPSubMenuUNI1;
    private javax.swing.JSpinner SpinnerAñosSV;
    private javax.swing.JSpinner SpinnerAñosSV1;
    private javax.swing.JSpinner SpinnerNivelesPoder;
    private javax.swing.JSpinner SpinnerNivelesPoder1;
    private javax.swing.JTable TABLEU;
    private javax.swing.JFrame TRESCONUNO;
    private javax.swing.JFrame TRESMOD;
    private javax.swing.JFrame UNO;
    private javax.swing.JTabbedPane UNOmenu;
    private javax.swing.JComboBox<String> Universce;
    private javax.swing.JComboBox<String> Universce1;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Choice choice1;
    private java.awt.Choice choice2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JFrame listar_universo;
    private java.awt.Button regresar;
    private javax.swing.JTable tabla_lista;
    // End of variables declaration//GEN-END:variables
SeresVivos nuevo = new SeresVivos("Nuila", "nose", "este", 2, 123, 23);
    static ArrayList<SeresVivos> vivos = new ArrayList();
    static ArrayList<Universo> UU = new ArrayList();
}
