/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package fixture.view;

import fixture.controller.GrupoController;
import fixture.model.Fase;
import fixture.model.Grupo;
import fixture.model.Partido;
import fixture.repository.GrupoRepository;
import fixture.repository.PartidoRepository;
import java.util.ArrayList;

/**
 *
 * @author abreg
 */
public class GrupoTab extends javax.swing.JPanel {
    
    private char grupoLetra;
    private Grupo grupo;
    private ArrayList<Partido> partidosGrupo;
    
    GrupoRepository grupoRepository = new GrupoRepository();
    PartidoRepository partidoRepository = new PartidoRepository();
    
    private void fetchPartidos(){
        partidosGrupo = partidoRepository.sortByDate(partidoRepository.findBy(Fase.DE_GRUPOS, grupo));
    }
    
    /**
     *
     * @param grupoLetra
     */
    public GrupoTab(char grupoLetra) {
        this.grupoLetra = grupoLetra;
        this.grupo = grupoRepository.get(grupoLetra);
        fetchPartidos();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedorGrupoA = new javax.swing.JPanel();
        tituloGrupoA = new javax.swing.JLabel();
        contenedorPartidosGrupoA = new javax.swing.JPanel();

        panelContenedorGrupoA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        panelContenedorGrupoA.setLayout(new java.awt.BorderLayout());

        tituloGrupoA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloGrupoA.setForeground(new java.awt.Color(154, 16, 50));
        tituloGrupoA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloGrupoA.setText("GRUPO A");
        panelContenedorGrupoA.add(tituloGrupoA, java.awt.BorderLayout.NORTH);

        contenedorPartidosGrupoA.setLayout(new java.awt.GridLayout(6, 1, 0, 2));
        panelContenedorGrupoA.add(contenedorPartidosGrupoA, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorGrupoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorGrupoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPartidosGrupoA;
    private javax.swing.JPanel panelContenedorGrupoA;
    private javax.swing.JLabel tituloGrupoA;
    // End of variables declaration//GEN-END:variables
}
