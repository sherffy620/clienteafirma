/*
 * Este fichero forma parte del Cliente @firma.
 * El Cliente @firma es un applet de libre distribuci�n cuyo c�digo fuente puede ser consultado
 * y descargado desde www.ctt.map.es.
 * Copyright 2009,2010 Ministerio de la Presidencia, Gobierno de Espa�a (opcional: correo de contacto)
 * Este fichero se distribuye bajo las licencias EUPL versi�n 1.1  y GPL versi�n 3  seg�n las
 * condiciones que figuran en el fichero 'licence' que se acompa�a.  Si se   distribuyera este
 * fichero individualmente, deben incluirse aqu� las condiciones expresadas all�.
 */
package es.gob.afirma.ui.utils;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.Serializable;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 * 
 * @author A171648
 *
 * Componente para generar una barra de estado
 * 
 */
 public class JStatusBar extends JComponent implements Serializable {

	 private static final long serialVersionUID = 1L;
	 private Integer leftMargin = 0;
	 
	 /**
	  * Genera una barra de estado
	  */
	 public JStatusBar() {
		 setPreferredSize(new Dimension(10, 20));
		 setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		 setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),BorderFactory.createEmptyBorder(0, leftMargin, 0, 0)));	
	 }

	 /**
	  * Define la lontigud de la etiqueta
	  * @param width	Ancho de la etiqueta
	  */
	 public void setLabelWidth(int width) {
		 JLabel etiqueta = new JLabel();
		 etiqueta.setPreferredSize(new Dimension(width, getPreferredSize().height));
		 add(etiqueta);
	 }

	 /**
	  * Modifica el texto de la barra de estado
	  * @param status	Nuevo texto para la barra de estado
	  */
	 public void setStatus(String status) {
		 JLabel lb = (JLabel) getComponent(0);
		 lb.setText(status);
	 }

	 /**
	  * Devuelve el valor de la barra de estado
	  * @return		Valor de la barra de estado
	  */
	 public String getStatus() {
		 JLabel lb = (JLabel) getComponent(0);
		 if (lb.getText() != null)
			 return lb.getText();
		 else
			 return null;
	 }
	 
	 /**
	  * Establece el margen izquierdo del texto
	  * @param leftMargin	Margen izquierdo
	  */
	 public void setLeftMargin(Integer leftMargin) {
		 setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(),BorderFactory.createEmptyBorder(0, leftMargin, 0, 0)));
	 }
 }