
package voting.voter;

import java.awt.Toolkit;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import voting.ballot.Ballot;

public class Vote extends javax.swing.JFrame {

	private Ballot ballot = null;

	/**
	 * Creates new form Vote
	 */
	public Vote() {
		setIcon();
		initComponents();
	}

	private void setIcon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/icon.png")));
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        txtLabel = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnVote = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtLimit = new javax.swing.JTextField();
        btnDelegate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enter details");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Private Key");

        txtKey.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtKey.setText("7094d1ede2b29922bdbcdfde87817382963f42354686218fa76bbf54e181d4be");

        txtLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLabel.setText("Contract Address");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtAddress.setText("0x986ac42aeae2015623262f6bd0efa66bacbdd4e3");

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnVote.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnVote.setText("Vote");
        btnVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Gas price");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Gas limit");

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPrice.setText("20000000000");

        txtLimit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLimit.setText("6721975");

        btnDelegate.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDelegate.setText("Delegate your Vote");
        btnDelegate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelegateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelegate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVote, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLabel)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKey, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(txtPrice)
                            .addComponent(txtLimit))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabel)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnVote)
                    .addComponent(btnDelegate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
		// TODO add your handling code here:
		dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoteActionPerformed
		String key = txtKey.getText(), address = txtAddress.getText();
		Credentials credentials = Credentials.create(key);
		Web3j web3j = Web3j.build(new HttpService());
		ballot = Ballot.load(address, web3j, credentials, new BigInteger(txtPrice.getText()), new BigInteger(txtLimit.getText()));
		try {
			if (!ballot.inProgress().send()) {
				JOptionPane.showMessageDialog(null, "Election has ended.", "Task failed", JOptionPane.ERROR_MESSAGE);
			} else {
				if (!checkVoted(credentials.getAddress())) {
					VoteHelper.main(ballot);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "You have already voted/ delegated", "Task failed", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			}
		} catch (Exception ex) {
			Logger.getLogger(Vote.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Election has ended.", "Task failed", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_btnVoteActionPerformed

    private void btnDelegateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelegateActionPerformed
		String key = txtKey.getText(), address = txtAddress.getText();
		Credentials credentials = Credentials.create(key);
		Web3j web3j = Web3j.build(new HttpService());
		ballot = Ballot.load(address, web3j, credentials, new BigInteger(txtPrice.getText()), new BigInteger(txtLimit.getText()));
		try {
			if (!ballot.inProgress().send()) {
				JOptionPane.showMessageDialog(null, "Election has ended.", "Task failed", JOptionPane.ERROR_MESSAGE);
			} else {
				if (!checkVoted(credentials.getAddress())) {
					Delegator.main(ballot);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "You have already voted/ delegated", "Task failed", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			}
		} catch (Exception ex) {
			Logger.getLogger(Vote.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Election has ended.", "Task failed", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_btnDelegateActionPerformed

	private boolean checkVoted(String addr) {
		try {
			if (ballot.voters(addr).send().getValue2()) {
				return true;
			}
		} catch (Exception ex) {
			Logger.getLogger(Vote.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
	
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new Vote().setVisible(true);
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelegate;
    private javax.swing.JButton btnVote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtKey;
    private javax.swing.JLabel txtLabel;
    private javax.swing.JTextField txtLimit;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
