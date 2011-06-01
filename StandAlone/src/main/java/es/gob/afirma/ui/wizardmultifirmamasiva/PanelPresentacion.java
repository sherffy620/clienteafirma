/*
 * Este fichero forma parte del Cliente @firma.
 * El Cliente @firma es un applet de libre distribuci�n cuyo c�digo fuente puede ser consultado
 * y descargado desde www.ctt.map.es.
 * Copyright 2009,2010 Ministerio de la Presidencia, Gobierno de Espa�a (opcional: correo de contacto)
 * Este fichero se distribuye bajo las licencias EUPL versi�n 1.1  y GPL versi�n 3  seg�n las
 * condiciones que figuran en el fichero 'licence' que se acompa�a.  Si se   distribuyera este
 * fichero individualmente, deben incluirse aqu� las condiciones expresadas all�.
 */
package es.gob.afirma.ui.wizardmultifirmamasiva;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.JPanel;

import es.gob.afirma.ui.utils.Messages;
import es.gob.afirma.ui.wizardUtils.BotoneraInferior;
import es.gob.afirma.ui.wizardUtils.ImagenLateral;
import es.gob.afirma.ui.wizardUtils.JDialogWizard;
import es.gob.afirma.ui.wizardUtils.PanelesTexto;

/**
 *
 * Panel explicativo de presentacion
 */
class PanelPresentacion extends JDialogWizard {

	private static final long serialVersionUID = 1L;
	
	/**
     * Guarda todas las ventanas del asistente para poder controlar la botonera
     * @param ventanas	Listado con todas las paginas del asistente
     */
    void setVentanas(List<JDialogWizard> ventanas) {
    	BotoneraInferior botonera = new BotoneraInferior(ventanas, 0);
    	getContentPane().add(botonera, BorderLayout.PAGE_END);
    }
	
    PanelPresentacion() {
        initComponents();
    }
    
    /**
     * Inicializacion de los componentes
     */
    private void initComponents() {
    	// Titulo de la ventana
    	setTitulo(Messages.getString("Wizard.multifirma.titulo.ventana"));
    	
    	// Panel con la imagen lateral
        ImagenLateral panelIzdo = new ImagenLateral();
        getContentPane().add(panelIzdo, BorderLayout.WEST);
        
        // Panel con el contenido
        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.WHITE);
        panelCentral.setLayout(new GridBagLayout());

        // Configuramos el layout
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(20, 20, 0, 20);
		c.weightx = 1.0;
		c.gridx = 0;
        
        // Panel con el texto "Bienvenido al asistente..."
        panelCentral.add(PanelesTexto.generarPanelTexto(
        		"Wizard.multifirma.presentacion.parte1", true), c);
    	
        // Panel con el texto "La contrafirma es el..."
        panelCentral.add(PanelesTexto.generarPanelTexto(
        		"Wizard.multifirma.presentacion.parte2", true), c);
        
        // Panel con el texto "Para el proceso..."
        panelCentral.add(PanelesTexto.generarPanelTexto(
        		"Wizard.multifirma.presentacion.parte3", true), c);
        
        c.weighty = 1.0;
        
        // Panel con el texto "Los formatos PDF..."
        panelCentral.add(PanelesTexto.generarPanelTexto(
        		"Wizard.multifirma.presentacion.parte4", true), c);

        getContentPane().add(panelCentral, BorderLayout.CENTER);
    }
}
