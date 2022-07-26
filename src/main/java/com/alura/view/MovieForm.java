package com.alura.view;

import com.alura.model.Movie;
import com.alura.model.Sticker;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MovieForm extends javax.swing.JFrame {

    private final Movie MOVIE;

    public MovieForm(Movie movie) {
        initComponents();

        this.MOVIE = movie;

        this.setTitle("Movie");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.setTextLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblRank = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblImdbRating = new javax.swing.JLabel();
        lblImdbRatingCount = new javax.swing.JLabel();
        lblRateThisMovie = new javax.swing.JLabel();
        cbxRate = new javax.swing.JComboBox<>();
        btnRate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(44, 51, 51));

        lblTitle.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(251, 171, 96));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");

        lblSubTitle.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lblSubTitle.setForeground(new java.awt.Color(251, 171, 96));
        lblSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle.setText("SubTitle");

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRank.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblRank.setForeground(new java.awt.Color(251, 171, 96));
        lblRank.setText("Rank");

        lblYear.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblYear.setForeground(new java.awt.Color(251, 171, 96));
        lblYear.setText("Year");

        lblImdbRating.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblImdbRating.setForeground(new java.awt.Color(251, 171, 96));
        lblImdbRating.setText("Imdb Rating");

        lblImdbRatingCount.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblImdbRatingCount.setForeground(new java.awt.Color(251, 171, 96));
        lblImdbRatingCount.setText("Imdb Rating Count");

        lblRateThisMovie.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblRateThisMovie.setForeground(new java.awt.Color(251, 171, 96));
        lblRateThisMovie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRateThisMovie.setText("Rate this movie and claim your Sticker!");

        cbxRate.setBackground(new java.awt.Color(44, 51, 51));
        cbxRate.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        cbxRate.setForeground(new java.awt.Color(251, 171, 96));
        cbxRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Very Bad", "Bad", "Okay", "Good", "Masterpiece" }));
        cbxRate.setSelectedIndex(2);

        btnRate.setBackground(new java.awt.Color(44, 51, 51));
        btnRate.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnRate.setForeground(new java.awt.Color(251, 171, 96));
        btnRate.setText("Rate!");
        btnRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImdbRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImdbRatingCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(cbxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnRate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addComponent(lblRateThisMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubTitle)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblRank)
                        .addGap(18, 18, 18)
                        .addComponent(lblYear)
                        .addGap(18, 18, 18)
                        .addComponent(lblImdbRating)
                        .addGap(18, 18, 18)
                        .addComponent(lblImdbRatingCount)))
                .addGap(18, 18, 18)
                .addComponent(lblRateThisMovie)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRate))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateActionPerformed
        int rating = cbxRate.getSelectedIndex() + 1;
        
        new Sticker(MOVIE.getLargeImage(), MOVIE.getId(), rating).generate();

        JOptionPane.showMessageDialog(null, "Your new sticker has been generated!");
    }//GEN-LAST:event_btnRateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRate;
    private javax.swing.JComboBox<String> cbxRate;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImdbRating;
    private javax.swing.JLabel lblImdbRatingCount;
    private javax.swing.JLabel lblRank;
    private javax.swing.JLabel lblRateThisMovie;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private void setTextLabels() {
        try {
            var url = new URL(MOVIE.getImage());
            var image = ImageIO.read(url);
            lblImage.setIcon(new ImageIcon(image));

            String[] title = MOVIE.getTitle().split(":");
            lblTitle.setText(title[0]);
            lblSubTitle.setText(title.length > 1 ? title[1] : " ");

            lblRank.setText("Rank: " + MOVIE.getRank());
            lblYear.setText("Year: " + MOVIE.getYear());
            lblImdbRating.setText("Imdb Rating: " + MOVIE.getRating());
            lblImdbRatingCount.setText("Imdb Rating Count: " + MOVIE.getRatingCount());

        } catch (IOException ex) {
            System.out.println("Oops! " + ex.getMessage());
            this.dispose();
        }
    }
}
