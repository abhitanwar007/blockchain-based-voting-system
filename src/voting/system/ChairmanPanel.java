
package voting.system;

import java.awt.Toolkit;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import voting.ballot.Ballot;

public class ChairmanPanel extends javax.swing.JFrame {

	private List<byte[]> candidates;
	protected static BigInteger GAS_PRICE, GAS_LIMIT;
	private String PRIVATE_KEY;
	private String CONTRACT_ADDRESS;

	/**
	 * Creates new form ChairmanPanel
	 */
	public ChairmanPanel() {
		initComponents();
		setIcon();
		candidates = new ArrayList<>();
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCandidates = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        btnDeploy = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtLimit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chairman Panel");
        setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        setLocationByPlatform(true);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Provide all candidate names (separated by ,)");

        txtCandidates.setColumns(20);
        txtCandidates.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCandidates.setRows(5);
        txtCandidates.setText("Enter candidate names here");
        jScrollPane1.setViewportView(txtCandidates);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Private Key");

        txtKey.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtKey.setText("7f0bec81ff571916e7296dbc26ba0b76f6b17ec1695e352370d8fd64f5d074cf");

        btnDeploy.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDeploy.setText("Deploy");
        btnDeploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeployActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Gas Price");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Gas Limit");

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPrice.setText("20000000000");

        txtLimit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLimit.setText("6721975");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeploy)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLimit)
                            .addComponent(txtKey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                            .addComponent(txtPrice))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnDeploy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
		System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeployActionPerformed
        deploy();
    }//GEN-LAST:event_btnDeployActionPerformed

	private void deploy() {
		PRIVATE_KEY = txtKey.getText();
		GAS_LIMIT = new BigInteger(txtLimit.getText());
		GAS_PRICE = new BigInteger(txtPrice.getText());
		StringTokenizer candidateList = new StringTokenizer(txtCandidates.getText(), ",");
		while (candidateList.hasMoreTokens()) {
			candidates.add(stringToBytes32(candidateList.nextToken()));
		}

		Credentials credentials = Credentials.create(PRIVATE_KEY);
		Web3j web3j = Web3j.build(new HttpService());
		try {
			Ballot ballot = deployContract(web3j, credentials);
			CONTRACT_ADDRESS = ballot.getContractAddress();
			System.out.println("Contract Deployed at address: " + CONTRACT_ADDRESS+"\n\tInform this to every voter.");
			ManageElection.main(ballot, candidates.size());
			setVisible(false);
		} catch (Exception ex) {
			Logger.getLogger(ChairmanPanel.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private Ballot deployContract(Web3j web3j, Credentials credentials) throws Exception {
		return Ballot.deploy(web3j, credentials, GAS_PRICE, GAS_LIMIT, candidates)
				.send();
	}

	public byte[] stringToBytes32(String string) {
		byte[] byteValue = string.getBytes();
		byte[] byteValueLen32 = new byte[32];
                Arrays.fill(byteValueLen32, (byte) 32); // fill with spaces
		System.arraycopy(byteValue, 0, byteValueLen32, 0, byteValue.length);
		return byteValueLen32;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		
		try {
//			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					javax.swing.UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}

			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ChairmanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ChairmanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ChairmanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ChairmanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new ChairmanPanel().setVisible(true);
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeploy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCandidates;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtLimit;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
