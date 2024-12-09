package java_database.view;

import java_database.model.RoomDao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddRoomDialog extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JTextField levelField;
    private JTextField roomCategoryIdField;
    private JTextField areaField;
    private JTextField priceField;
    private JCheckBox reservedField;

    private JCheckBox onSaleField;
    private Hotel hotel;

    /**
     * Create the dialog.
     */
    public AddRoomDialog(Hotel hotel) {
        this.hotel = hotel;
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        GridBagLayout gbl_contentPanel = new GridBagLayout();
        gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
        gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
        gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPanel.setLayout(gbl_contentPanel);
        {
            JLabel lblNewLabel = new JLabel("Level");
            GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
            gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
            gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewLabel.gridx = 0;
            gbc_lblNewLabel.gridy = 0;
            contentPanel.add(lblNewLabel, gbc_lblNewLabel);
        }
        {
            levelField = new JTextField();
            GridBagConstraints gbc_levelField = new GridBagConstraints();
            gbc_levelField.insets = new Insets(0, 0, 5, 0);
            gbc_levelField.fill = GridBagConstraints.HORIZONTAL;
            gbc_levelField.gridx = 1;
            gbc_levelField.gridy = 0;
            contentPanel.add(levelField, gbc_levelField);
            levelField.setColumns(10);
        }
        {
            JLabel lblNewLabel_1 = new JLabel("RoomCategory Id");
            GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
            gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
            gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewLabel_1.gridx = 0;
            gbc_lblNewLabel_1.gridy = 1;
            contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
        }
        {
            roomCategoryIdField = new JTextField();
            GridBagConstraints gbc_roomCategoryIdField = new GridBagConstraints();
            gbc_roomCategoryIdField.insets = new Insets(0, 0, 5, 0);
            gbc_roomCategoryIdField.fill = GridBagConstraints.HORIZONTAL;
            gbc_roomCategoryIdField.gridx = 1;
            gbc_roomCategoryIdField.gridy = 1;
            contentPanel.add(roomCategoryIdField, gbc_roomCategoryIdField);
            roomCategoryIdField.setColumns(10);
        }
        {
            JLabel lblNewLabel_2 = new JLabel("Area");
            GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
            gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
            gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewLabel_2.gridx = 0;
            gbc_lblNewLabel_2.gridy = 2;
            contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
        }
        {
            areaField = new JTextField();
            GridBagConstraints gbc_areaField = new GridBagConstraints();
            gbc_areaField.insets = new Insets(0, 0, 5, 0);
            gbc_areaField.fill = GridBagConstraints.HORIZONTAL;
            gbc_areaField.gridx = 1;
            gbc_areaField.gridy = 2;
            contentPanel.add(areaField, gbc_areaField);
            areaField.setColumns(10);
        }
        {
            JLabel lblNewLabel_3 = new JLabel("Price");
            GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
            gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
            gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewLabel_3.gridx = 0;
            gbc_lblNewLabel_3.gridy = 3;
            contentPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
        }
        {
            priceField = new JTextField();
            GridBagConstraints gbc_priceField = new GridBagConstraints();
            gbc_priceField.insets = new Insets(0, 0, 5, 0);
            gbc_priceField.fill = GridBagConstraints.HORIZONTAL;
            gbc_priceField.gridx = 1;
            gbc_priceField.gridy = 3;
            contentPanel.add(priceField, gbc_priceField);
            priceField.setColumns(10);
        }
        {
            JLabel lblNewLabel_4 = new JLabel("Reserved");
            GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
            gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewLabel_4.gridx = 0;
            gbc_lblNewLabel_4.gridy = 4;
            contentPanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
        }
        {
            reservedField = new JCheckBox("");
            GridBagConstraints gbc_reservedField = new GridBagConstraints();
            gbc_reservedField.insets = new Insets(0, 0, 5, 0);
            gbc_reservedField.gridx = 1;
            gbc_reservedField.gridy = 4;
            contentPanel.add(reservedField, gbc_reservedField);
        }
        {
            JLabel lblNewLabel_5 = new JLabel("On Sale");
            GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
            gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
            gbc_lblNewLabel_5.gridx = 0;
            gbc_lblNewLabel_5.gridy = 5;
            contentPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
        }
        {
            onSaleField = new JCheckBox("");
            GridBagConstraints gbc_onSaleField = new GridBagConstraints();
            gbc_onSaleField.gridx = 1;
            gbc_onSaleField.gridy = 5;
            contentPanel.add(onSaleField, gbc_onSaleField);
        }
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("OK");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        RoomDao dao = new RoomDao(
                                Integer.parseInt(levelField.getText()),
                                Integer.parseInt(roomCategoryIdField.getText()),
                                Double.parseDouble(areaField.getText()),
                                Integer.parseInt(priceField.getText()),
                                reservedField.isSelected(),
                                onSaleField.isSelected()
                        );

                        hotel.addRoom(dao);

                        AddRoomDialog.this.dispose();
                    }
                });
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    }
                });
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
            }
        }
    }

}
