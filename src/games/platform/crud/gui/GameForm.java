package games.platform.crud.gui;

import games.platform.connection.DataBase;
import games.platform.fitters.PublishersFitter;
import games.platform.logger.AppLogger;
import games.platform.models.Publisher;
import games.platform.models.Game;
import games.platform.utils.DbGlobal;
import games.platform.utils.LoggerGlobal;
import java.util.ArrayList;
import java.util.Date;

import java.sql.SQLException;

public class GameForm extends javax.swing.JInternalFrame {
    
    DataBase db;
    
    private final String baseGameIdText = "ID do Jogo: ";
    private final Game game;
    private final boolean newGame;
    
    private ArrayList<Publisher> publishers;
    private Publisher selectedPublisher;

    public GameForm(Game game, boolean newGame) {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.game = game;
        this.newGame = newGame;
        db = DbGlobal.getDb();

        initComponents();
        populateFields();
    }

    public void populateComboBoxes() {
        try {
            this.publishers = PublishersFitter.getAllPublishers(db.getConnection());
            this.publishers.forEach((client) -> publishersComboBox.addItem(client.getName()));
        } catch (SQLException e) {
            LoggerGlobal.getLogger().addLog(AppLogger.getSevereLevel(), "Ocorreu um erro: " + e.getMessage());
        }        
    }
    
    private void populateFields() {
        if (!newGame) {
            gameIdLabel.setText(baseGameIdText + game.getId());
            updateButton.setText("Atualizar");
        } else {
            updateButton.setText("Inserir");
        }
        gameNameField.setText(game.getName());
        gamePriceField.setText(String.valueOf(game.getPrice()));
        gameDescriptionField.setText(game.getDescription());
        gameReleaseDateField.setValue(game.getReleaseDate());
        gamePublisherNameField.setText(game.getPublisherName());
        publishersComboBox.setVisible(newGame);
        populateComboBoxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameIdLabel = new javax.swing.JLabel();
        gameNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gamePriceField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        priceErrorLabel = new javax.swing.JLabel();
        nameErrorLabel = new javax.swing.JLabel();
        responseLabel = new javax.swing.JLabel();
        gameDescriptionField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateErrorLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gameReleaseDateField = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        gamePublisherNameField = new javax.swing.JTextField();
        publishersComboBox = new javax.swing.JComboBox<>();
        descriptionErrorLabel = new javax.swing.JLabel();

        setBorder(null);
        setMaximizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(850, 509));

        jLabel1.setText("Nome do Jogo");

        jLabel2.setText("Preço do jogo");

        updateButton.setText("Atualizar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        priceErrorLabel.setForeground(new java.awt.Color(229, 57, 53));

        nameErrorLabel.setForeground(new java.awt.Color(229, 57, 53));

        responseLabel.setForeground(new java.awt.Color(56, 142, 60));

        jLabel3.setText("Descricao do Jogo");

        dateErrorLabel.setForeground(new java.awt.Color(229, 57, 53));

        jLabel4.setText("Data de lançamento (dia/mês/ano)");

        gameReleaseDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel5.setText("Editora");

        gamePublisherNameField.setEditable(false);
        gamePublisherNameField.setBackground(new java.awt.Color(247, 247, 247));

        publishersComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishersComboBoxActionPerformed(evt);
            }
        });

        descriptionErrorLabel.setForeground(new java.awt.Color(229, 57, 53));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(gameReleaseDateField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(dateErrorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(responseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(gamePublisherNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(publishersComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(gameDescriptionField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(gameIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gameNameField)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priceErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gamePriceField)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                    .addComponent(descriptionErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(gameIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gamePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gameReleaseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gamePublisherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publishersComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(responseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        nameErrorLabel.setText("");
        priceErrorLabel.setText("");

        String newName = gameNameField.getText();
        String newDescription = gameDescriptionField.getText();
        float newPrice = 0;
        Date newDate = (Date) gameReleaseDateField.getValue();

        if (newName.length() > 50) {
            nameErrorLabel.setText("Caracteres máximos 50.");
            return;
        } else if (newName.length() < 1) {
            nameErrorLabel.setText("Caracteres mínimos 1.");
            return;
        }

        try {
            newPrice = Float.valueOf(gamePriceField.getText());
        } catch (NumberFormatException ex) {
            priceErrorLabel.setText("Erro ao transformar em float");
            return;
        }
        
        if (newDescription.length() < 1) {
            descriptionErrorLabel.setText("Caracteres mínimos 1.");
            return;
        }
        
        if (newDate == null || !(newDate instanceof Date)) {
            dateErrorLabel.setText("Erro ao transformar em Date (dd/MM/yyyy)");
            return;
        }

        game.setName(newName);
        game.setDescription(newDescription);
        game.setPrice(newPrice);
        game.setReleaseDate(newDate);
        String response;
        if (newGame) {
            game.setPublisherId(selectedPublisher.getId());
            response = games.platform.crud.models.Game.createGame(game, DbGlobal.getDb().getConnection());
        } else {
            response = games.platform.crud.models.Game.updateGame(game, DbGlobal.getDb().getConnection());
        }
        responseLabel.setText(response);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void publishersComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishersComboBoxActionPerformed
        int selectedItem = publishersComboBox.getSelectedIndex();
        this.selectedPublisher = this.publishers.get(selectedItem);
        gamePublisherNameField.setText(selectedPublisher.getName());
    }//GEN-LAST:event_publishersComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateErrorLabel;
    private javax.swing.JLabel descriptionErrorLabel;
    private javax.swing.JTextField gameDescriptionField;
    private javax.swing.JLabel gameIdLabel;
    private javax.swing.JTextField gameNameField;
    private javax.swing.JTextField gamePriceField;
    private javax.swing.JTextField gamePublisherNameField;
    private javax.swing.JFormattedTextField gameReleaseDateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JLabel priceErrorLabel;
    private javax.swing.JComboBox<String> publishersComboBox;
    private javax.swing.JLabel responseLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
