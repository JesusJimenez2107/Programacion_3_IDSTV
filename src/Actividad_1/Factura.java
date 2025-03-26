package Actividad_1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Factura extends JFrame {
	private JPanel mainPanel, clientePanel, facturaPanel, productosPanel, totalPanel;
    private JTextField documentoField, nombreField, direccionField, telefonoField, facturaField, fechaField;
    private JTable productosTable;
    private JTextField subtotalField, descuentoField, valorDescField, ivaField, totalField;

public Factura() {
setTitle("Factura");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(800, 600);
setLocationRelativeTo(null);

//Creación del panel principal
mainPanel = new JPanel(new BorderLayout(20, 20));
mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

// Panel de datos del cliente
clientePanel = new JPanel(new GridLayout(2, 4, 10, 10));
clientePanel.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
clientePanel.add(new JLabel("Documento:"));
documentoField = new JTextField();
clientePanel.add(documentoField);
clientePanel.add(new JLabel("Nombres:"));
nombreField = new JTextField();
clientePanel.add(nombreField);
clientePanel.add(new JLabel("Dirección:"));
direccionField = new JTextField();
clientePanel.add(direccionField);
clientePanel.add(new JLabel("Teléfono:"));
telefonoField = new JTextField();
clientePanel.add(telefonoField);

// Panel de datos de la factura
facturaPanel = new JPanel(new GridLayout(2, 2, 10, 10));
facturaPanel.setBorder(BorderFactory.createTitledBorder("Datos de factura"));
facturaPanel.add(new JLabel("Nº Factura:"));
facturaField = new JTextField();
facturaPanel.add(facturaField);
facturaPanel.add(new JLabel("Fecha:"));
fechaField = new JTextField();
facturaPanel.add(fechaField);

//Panel de productos
productosPanel = new JPanel(new BorderLayout(10, 10));
productosPanel.setBorder(BorderFactory.createTitledBorder("Ver listado de facturas"));
String[] columnNames = {"Producto", "Cantidad", "Valor", "Sub Total"};
DefaultTableModel model = new DefaultTableModel(columnNames, 0);
model.addRow(new Object[]{"Agua", "2", "500", "1000.0"});
model.addRow(new Object[]{"Cereal", "5", "1000", "5000.0"});
model.addRow(new Object[]{"Leche", "2", "300", "600.0"});
productosTable = new JTable(model);
productosTable.setFillsViewportHeight(true);
JScrollPane scrollPane = new JScrollPane(productosTable);
productosPanel.add(scrollPane, BorderLayout.CENTER);
JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
JButton addButton = new JButton("+");
JButton deleteButton = new JButton("x");
buttonsPanel.add(addButton);
buttonsPanel.add(deleteButton);
productosPanel.add(buttonsPanel, BorderLayout.SOUTH);

//Panel de totales
totalPanel = new JPanel(new GridLayout(5, 2, 10, 10));
totalPanel.setBorder(BorderFactory.createTitledBorder(""));
totalPanel.add(new JLabel("SubTotal:"));
subtotalField = new JTextField("6600.0");
subtotalField.setEditable(false);
totalPanel.add(subtotalField);
totalPanel.add(new JLabel("% Descuento:"));
descuentoField = new JTextField("5");
descuentoField.setEditable(false);
totalPanel.add(descuentoField);
totalPanel.add(new JLabel("Valor descontado:"));
JTextField descuentoValorField = new JTextField("330.0");
descuentoValorField.setEditable(false);
totalPanel.add(descuentoValorField);
totalPanel.add(new JLabel("IVA 19%:"));
ivaField = new JTextField("1254.0");
ivaField.setEditable(false);
totalPanel.add(ivaField);
totalPanel.add(new JLabel("Total Factura:"));
totalField = new JTextField("7524.0");
totalField.setEditable(false);
totalPanel.add(totalField);

mainPanel.add(clientePanel, BorderLayout.NORTH);
mainPanel.add(facturaPanel, BorderLayout.CENTER);
mainPanel.add(productosPanel, BorderLayout.WEST);
mainPanel.add(totalPanel, BorderLayout.EAST);

add(mainPanel);

}

public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new Factura().setVisible(true);
        }
    });
}

}
