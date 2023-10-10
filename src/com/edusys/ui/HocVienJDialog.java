/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.edusys.ui;

import com.edusys.dao.ChuyenDeDAO;
import com.edusys.dao.HocVienDAO;
import com.edusys.dao.KhoaHocDAO;
import com.edusys.dao.NguoiHocDAO;
import com.edusys.entity.ChuyenDe;
import com.edusys.entity.HocVien;
import com.edusys.entity.KhoaHoc;
import com.edusys.entity.NguoiHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class HocVienJDialog extends javax.swing.JDialog {

    /**
     * Creates new form HocVienJDialog
     */
    public HocVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbbChuyenDe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbbKhoaHoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnXoaKhoiKhoaHoc = new javax.swing.JButton();
        btnCapNhatDiem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        btnThemVaoKhoaHoc = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Chuyên đề");

        cbbChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbChuyenDeMouseClicked(evt);
            }
        });
        cbbChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChuyenDeActionPerformed(evt);
            }
        });

        jLabel2.setText("Khoá học");

        cbbKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ HỌC VIÊN", "MÃ NGƯỜI HỌC", "HỌ TÊN", "ĐIỂM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHocVien);

        jLabel3.setText("HỌC VIÊN");

        btnXoaKhoiKhoaHoc.setText("XOÁ KHỎI KHOÁ HỌC");
        btnXoaKhoiKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhoiKhoaHocActionPerformed(evt);
            }
        });

        btnCapNhatDiem.setText("CẬP NHẬT ĐIỂM");
        btnCapNhatDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatDiemActionPerformed(evt);
            }
        });

        jLabel4.setText("NGƯỜI HỌC");

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NH", "HỌ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNguoiHoc);

        btnThemVaoKhoaHoc.setText("THÊM VÀO KHOÁ HỌC");
        btnThemVaoKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoKhoaHocActionPerformed(evt);
            }
        });

        jLabel5.setText("Tìm kiếm");

        jButton1.setText("Tìm kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbbChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(btnThemVaoKhoaHoc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoaKhoiKhoaHoc)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhatDiem))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(401, 401, 401)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cbbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaKhoiKhoaHoc)
                    .addComponent(btnCapNhatDiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemVaoKhoaHoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaKhoiKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhoiKhoaHocActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaKhoiKhoaHocActionPerformed

    private void btnCapNhatDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatDiemActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnCapNhatDiemActionPerformed

    private void btnThemVaoKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoKhoaHocActionPerformed
        // TODO add your handling code here:
        this.add();
    }//GEN-LAST:event_btnThemVaoKhoaHocActionPerformed

    private void cbbChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbChuyenDeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbbChuyenDeActionPerformed

    private void cbbChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbChuyenDeMouseClicked
        // TODO add your handling code here:
        cbbChuyenDe.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    fillComboBoxKhoaHoc();
                }
            }
        });
    }//GEN-LAST:event_cbbChuyenDeMouseClicked

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
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HocVienJDialog dialog = new HocVienJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatDiem;
    private javax.swing.JButton btnThemVaoKhoaHoc;
    private javax.swing.JButton btnXoaKhoiKhoaHoc;
    private javax.swing.JComboBox<String> cbbChuyenDe;
    private javax.swing.JComboBox<String> cbbKhoaHoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private ChuyenDeDAO cddao = new ChuyenDeDAO();
    private KhoaHocDAO khdao = new KhoaHocDAO();
    private HocVienDAO hvdao = new HocVienDAO();
    private NguoiHocDAO nhdao = new NguoiHocDAO();
    private int row = -1;

    private void init() {
        this.setLocationRelativeTo(null);
        this.fillComboBoxChuyenDe();
    }

    private void fillComboBoxChuyenDe() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbbChuyenDe.getModel();
            model.removeAllElements();
            List<ChuyenDe> list = cddao.selectAll();
            for (ChuyenDe cd : list) {
                model.addElement(cd);
            }
            this.fillComboBoxKhoaHoc();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void fillComboBoxKhoaHoc() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbbKhoaHoc.getModel();
            model.removeAllElements();
            ChuyenDe chuyenDe = (ChuyenDe) cbbChuyenDe.getSelectedItem();
            if (chuyenDe != null) {
                List<KhoaHoc> list = khdao.selectByChuyenDe(chuyenDe.getMaCD());
                for (KhoaHoc kh : list) {
                    model.addElement(kh);
                }
            }
            this.fillTableHocVien();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void fillTableHocVien() {
        DefaultTableModel model = (DefaultTableModel) tblHocVien.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cbbKhoaHoc.getSelectedItem();
        if (khoaHoc != null) {
            List<HocVien> list = hvdao.selectByKhoaHoc(khoaHoc.getMaKH());
            for (int i = 0; i < list.size(); i++) {
                HocVien hv = list.get(i);
                String hoTen = nhdao.selectByID(hv.getMaNH()).getHoTen();
                model.addRow(new Object[]{
                    i + 1,
                    hv.getMaHV(),
                    hv.getMaNH(),
                    hoTen,
                    hv.getDiem()
                });
            }
        }
        this.fillTableNguoiHoc();
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cbbKhoaHoc.getSelectedItem();
        if (khoaHoc != null) {
            String keyWord = txtSearch.getText();
            List<NguoiHoc> list = nhdao.selectNotInCourse(khoaHoc.getMaKH(), keyWord);
            for (NguoiHoc nh : list) {
                model.addRow(new Object[]{
                    nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh() == true ? "Nam" : "Nữ",
                    nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()
                });
            }
        }
    }

    private void add() {
        KhoaHoc khoaHoc = (KhoaHoc) cbbKhoaHoc.getSelectedItem();
        List<Integer> selectedRows = new ArrayList<>();
        for (int row : tblNguoiHoc.getSelectedRows()) {
            HocVien hv = new HocVien();
            hv.setMaKH(khoaHoc.getMaKH());
            hv.setDiem(0);
            hv.setMaNH((String) tblNguoiHoc.getValueAt(row, 0));
            hvdao.insert(hv);
            selectedRows.add(row);
        }

        // Xóa người học khi chuyển thành học viên
        DefaultTableModel modelNguoiHoc = (DefaultTableModel) tblNguoiHoc.getModel();
        for (int i = selectedRows.size() - 1; i >= 0; i--) {
            modelNguoiHoc.removeRow(selectedRows.get(i));
        }

        this.fillTableHocVien();
        //this.tabs.setSelectedIndex(0);
    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa học viên này!");
            return;
        } else {
            try {
                if (MsgBox.confirm(this, "Bạn thực sự muốn xóa học viên này?")) {
                    DefaultTableModel modelNguoiHoc = (DefaultTableModel) tblNguoiHoc.getModel();
                    for (int row : tblHocVien.getSelectedRows()) {
                        Integer maHV = (Integer) tblHocVien.getValueAt(row, 1);
                        HocVien hv = hvdao.selectByID(maHV);
                        hvdao.delete(maHV);

                        // Thêm lại người học được xóa vào bảng người học
                        NguoiHoc nh = nhdao.selectByID(hv.getMaNH());
                        modelNguoiHoc.addRow(new Object[]{
                            nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh() == true ? "Nam" : "Nữ",
                            nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()
                        });
                    }
                    this.fillTableHocVien();
                    MsgBox.alert(this, "Xóa thành công!");
                }
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }

    private void update() {
        for (int i = 0; i < tblHocVien.getRowCount(); i++) {
            int maHV = (Integer) tblHocVien.getValueAt(i, 1);
            HocVien hv = hvdao.selectByID(maHV);

            try {
                hv.setDiem(Double.parseDouble(tblHocVien.getValueAt(i, 4).toString()));
                hvdao.update(hv);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return;
            }
        }
        MsgBox.alert(this, "Cập nhập thành công!");
    }

}
