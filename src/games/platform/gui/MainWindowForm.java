package games.platform.gui;

import games.platform.crud.gui.ClientForm;
import games.platform.crud.gui.GameForm;
import games.platform.crud.gui.PublisherForm;
import games.platform.models.Client;
import games.platform.models.Game;
import games.platform.models.User;
import games.platform.models.Publisher;
import games.platform.utils.UserConnected;
import games.platform.xml.gui.AddCashFromXMLForm;
import games.platform.xml.gui.BuysToXMLForm;

public class MainWindowForm extends javax.swing.JFrame {

    private User userLogged;

    public MainWindowForm() {
        initComponents();
        boolean hasUserLogged = UserConnected.hasUserConnected();
        if (!hasUserLogged) {
            System.exit(0);
        }
        userLoggedActions();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clientNameLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        gamesMenu = new javax.swing.JMenu();
        gamesMenuItem = new javax.swing.JMenuItem();
        gameCreateMenuItem = new javax.swing.JMenuItem();
        storeMenuItem = new javax.swing.JMenuItem();
        publishersMenu = new javax.swing.JMenu();
        publishersListMenuItem = new javax.swing.JMenuItem();
        createPublisherMenuItem = new javax.swing.JMenuItem();
        usersMenu = new javax.swing.JMenu();
        clientsMenuItem = new javax.swing.JMenuItem();
        clientsWithGamesMenuItem = new javax.swing.JMenuItem();
        createClientMenuItem = new javax.swing.JMenuItem();
        xmlMenu = new javax.swing.JMenu();
        buysToXMLMenuItem = new javax.swing.JMenuItem();
        addCashFromFileMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plataforma de jogos");
        setResizable(false);

        jLabel1.setText("Usuário logado:");

        jLabel2.setText("Nome:");

        mainPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainPanel.setLayer(usernameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainPanel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainPanel.setLayer(clientNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(459, Short.MAX_VALUE))
        );

        gamesMenu.setMnemonic('f');
        gamesMenu.setText("Games");

        gamesMenuItem.setText("List");
        gamesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesMenuItemActionPerformed(evt);
            }
        });
        gamesMenu.add(gamesMenuItem);

        gameCreateMenuItem.setText("Create");
        gameCreateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameCreateMenuItemActionPerformed(evt);
            }
        });
        gamesMenu.add(gameCreateMenuItem);

        storeMenuItem.setText("Store");
        storeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeMenuItemActionPerformed(evt);
            }
        });
        gamesMenu.add(storeMenuItem);

        menuBar.add(gamesMenu);

        publishersMenu.setMnemonic('e');
        publishersMenu.setText("Publishers");

        publishersListMenuItem.setText("List");
        publishersListMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishersMenuItemActionPerformed(evt);
            }
        });
        publishersMenu.add(publishersListMenuItem);

        createPublisherMenuItem.setText("Create");
        createPublisherMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPublisherMenuItemActionPerformed(evt);
            }
        });
        publishersMenu.add(createPublisherMenuItem);

        menuBar.add(publishersMenu);

        usersMenu.setMnemonic('h');
        usersMenu.setText("Users Profile");

        clientsMenuItem.setText("List");
        clientsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsMenuItemActionPerformed(evt);
            }
        });
        usersMenu.add(clientsMenuItem);

        clientsWithGamesMenuItem.setLabel("List with Games");
        clientsWithGamesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsWithGamesMenuItemActionPerformed(evt);
            }
        });
        usersMenu.add(clientsWithGamesMenuItem);

        createClientMenuItem.setText("Create");
        createClientMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClientMenuItemActionPerformed(evt);
            }
        });
        usersMenu.add(createClientMenuItem);

        menuBar.add(usersMenu);

        xmlMenu.setText("XML");

        buysToXMLMenuItem.setText("Buys to XML");
        buysToXMLMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buysToXMLMenuItemActionPerformed(evt);
            }
        });
        xmlMenu.add(buysToXMLMenuItem);

        addCashFromFileMenu.setText("Add cash from File");
        addCashFromFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCashFromFileMenuActionPerformed(evt);
            }
        });
        xmlMenu.add(addCashFromFileMenu);

        menuBar.add(xmlMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gamesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesMenuItemActionPerformed
        GamesListForm gamesListForm = new GamesListForm(mainPanel);
        mainPanel.add(gamesListForm);
        mainPanel.setVisible(true);
        gamesListForm.setVisible(true);
    }//GEN-LAST:event_gamesMenuItemActionPerformed

    private void clientsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsMenuItemActionPerformed
        ClientsListForm clientsListForm = new ClientsListForm(mainPanel);
        mainPanel.add(clientsListForm);
        mainPanel.setVisible(true);
        clientsListForm.setVisible(true);
    }//GEN-LAST:event_clientsMenuItemActionPerformed

    private void publishersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishersMenuItemActionPerformed
        PublishListForm publisherListForm = new PublishListForm(mainPanel);
        mainPanel.add(publisherListForm);
        mainPanel.setVisible(true);
        publisherListForm.setVisible(true);
    }//GEN-LAST:event_publishersMenuItemActionPerformed

    private void clientsWithGamesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsWithGamesMenuItemActionPerformed
        ClientsWithGamesListForm clientsWithGamesListForm = new ClientsWithGamesListForm();
        mainPanel.add(clientsWithGamesListForm);
        mainPanel.setVisible(true);
        clientsWithGamesListForm.setVisible(true);
    }//GEN-LAST:event_clientsWithGamesMenuItemActionPerformed

    private void storeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeMenuItemActionPerformed
        StoreForm storeForm = new StoreForm();
        mainPanel.add(storeForm);
        mainPanel.setVisible(true);
        storeForm.setVisible(true);
    }//GEN-LAST:event_storeMenuItemActionPerformed

    private void createClientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClientMenuItemActionPerformed
        ClientForm clientForm = new ClientForm(new Client(0, "", 0), true);
        mainPanel.add(clientForm);
        mainPanel.setVisible(true);
        clientForm.setVisible(true);
    }//GEN-LAST:event_createClientMenuItemActionPerformed

    private void createPublisherMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPublisherMenuItemActionPerformed
        PublisherForm publisherForm = new PublisherForm(new Publisher(0, ""), true);
        mainPanel.add(publisherForm);
        mainPanel.setVisible(true);
        publisherForm.setVisible(true);
    }//GEN-LAST:event_createPublisherMenuItemActionPerformed

    private void gameCreateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameCreateMenuItemActionPerformed
        GameForm gameForm = new GameForm(new Game(0, "", "", null, 0, 0, ""), true);
        mainPanel.add(gameForm);
        mainPanel.setVisible(true);
        gameForm.setVisible(true);
    }//GEN-LAST:event_gameCreateMenuItemActionPerformed

    private void buysToXMLMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buysToXMLMenuItemActionPerformed
        BuysToXMLForm buysToXMLForm = new BuysToXMLForm();
        mainPanel.add(buysToXMLForm);
        mainPanel.setVisible(true);
        buysToXMLForm.setVisible(true);
    }//GEN-LAST:event_buysToXMLMenuItemActionPerformed

    private void addCashFromFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCashFromFileMenuActionPerformed
        AddCashFromXMLForm addCashFromXMLForm = new AddCashFromXMLForm();
        mainPanel.add(addCashFromXMLForm);
        mainPanel.setVisible(true);
        addCashFromXMLForm.setVisible(true);
    }//GEN-LAST:event_addCashFromFileMenuActionPerformed

    private void userLoggedActions(){
        userLogged = UserConnected.getUser();
        usernameLabel.setText(userLogged.getUsername());
        clientNameLabel.setText(userLogged.getClient().getName());
        showAvailableItens();
    }
    
    private void showAvailableItens() {
        if (!userLogged.isAdm()) {
            gameCreateMenuItem.setVisible(false);
            createPublisherMenuItem.setVisible(false);
            usersMenu.setVisible(false);
            xmlMenu.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCashFromFileMenu;
    private javax.swing.JMenuItem buysToXMLMenuItem;
    private javax.swing.JLabel clientNameLabel;
    private javax.swing.JMenuItem clientsMenuItem;
    private javax.swing.JMenuItem clientsWithGamesMenuItem;
    private javax.swing.JMenuItem createClientMenuItem;
    private javax.swing.JMenuItem createPublisherMenuItem;
    private javax.swing.JMenuItem gameCreateMenuItem;
    private javax.swing.JMenu gamesMenu;
    private javax.swing.JMenuItem gamesMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JDesktopPane mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem publishersListMenuItem;
    private javax.swing.JMenu publishersMenu;
    private javax.swing.JMenuItem storeMenuItem;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JMenu usersMenu;
    private javax.swing.JMenu xmlMenu;
    // End of variables declaration//GEN-END:variables

}
