
package granproyecto;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.text.NumberFormatter;

public class Empresa1 <T> extends javax.swing.JFrame {
    Empresa empresas=new Empresa();
    String estadoAlarma="",estadoGarita="",estadoCerca="",estadoMuro="";
    boolean AlarmaExiste,garitaIluminada,garitaPersonal,cercaPoseeCorriente;
    Lista<Alarma> alarmas=new Lista<Alarma>();
    Lista<Garita> garitas=new Lista<Garita>();
    Lista<Cerca> cercas=new Lista<Cerca>();
    Lista<Muro> muros=new Lista<Muro>();
    Lista<Cordon> cordones=new Lista<Cordon>();
    
// El código se puede SUPER QUE MEJORAR pero me ABURRI
    
// Dudas que quedan para la posteridad
// No se por que cuando añado alguna cosa y salgo hasta que no vuelvo a seleccionar algo en boton permanece desactivado
// No se por que el todos los botones de borrar datos de borran todos los datos exceptop el ultimo o el primero no recuerdo
    
    
// Como evitar que al ampliar la pantalla se reubiquen las cosas sin usar    this.setResizable(false)

    
    public Empresa1() {
        
        
        empresas.alarmas=alarmas;
        empresas.garitas=garitas;
        empresas.cercas=cercas;
        empresas.muros=muros;
        empresas.cordones=cordones;
        
       
        
        initComponents();
        // Boton Garitas Fichero desactivado
          GaritasEnFicheroBoton.setEnabled(false);
        
        setLocationRelativeTo(this);// Poner la ventana en el centro
        this.AlarmaEscritorio.setLocationRelativeTo(this);
        this.GaritaEscritorio.setLocationRelativeTo(this);
        this.EscojerCercaOMuro.setLocationRelativeTo(this);
        this.CercaNueva.setLocationRelativeTo(this);
        this.MuroNuevoEscritorio.setLocationRelativeTo(this);
        this.AlarmasNoExisten.setLocationRelativeTo(this);
        this.AlarmasNecesitanReparacion.setLocationRelativeTo(this);
        this.GaritasSinLuzEscritorio.setLocationRelativeTo(this);
        this.GaritasNoCubiertasEscritorio.setLocationRelativeTo(this);
        this.GaritasNecesitanReparacionEscritorio.setLocationRelativeTo(this);
        this.CordonAlturaYPerimetroEscritorio.setLocationRelativeTo(this);
        this.CordonesNecesitanReparacionEscritorio.setLocationRelativeTo(this);
        this.GaritasYFicherosEscritorio.setLocationRelativeTo(this);
        this.DatosDeGaritasTXTEscritorio.setLocationRelativeTo(this);
        
       // this.setResizable(false);  // Esto es para que la ventana no pueda aumentar de tamaño
        
        
       // CercaNuevaPanel.setFocusable(true);// Para poder usar el teclado en la ventana
       // CercaNueva.setFocusable(true);
        
        // Añadiendo la imagen donde yo quiero en la dirección que yo quiero 
       // ImageIcon imagen=new ImageIcon("C:\\Users\\Emanuel\\Documents\\NetBeansProjects\\granProyecto\\src\\Fondo\\CachedImage_1920_1080_POS4.jpg");
       
       // Con esta dirección aunque se cambie de PC el proyecto va seguir mostrando la foto
        ImageIcon imagen=new ImageIcon("CachedImage_1920_1080_POS4.jpg");
        
        Imagen.setIcon(imagen);
        Imagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(814, 530, Image.SCALE_DEFAULT)));
        Panel.add(Imagen);
        
        
      
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlarmaEscritorio = new javax.swing.JFrame();
        AlarmaNueva = new javax.swing.JPanel();
        AlarmaInfoExiste = new javax.swing.JLabel();
        AlarmaInfoEstadoAlarma = new javax.swing.JLabel();
        AlarmaEstado = new javax.swing.JComboBox<>();
        AlarmaBotonAceptar = new javax.swing.JButton();
        AlarmaNumPlantilla = new javax.swing.JTextField();
        AlarmaExisteSi = new javax.swing.JRadioButton();
        AlarmaExisteNo = new javax.swing.JRadioButton();
        AlarmaInfoPlantila = new javax.swing.JLabel();
        GaritaEscritorio = new javax.swing.JFrame();
        GaritaNueva = new javax.swing.JPanel();
        GaritaInfoEstado = new javax.swing.JLabel();
        GaritaEstado = new javax.swing.JComboBox<>();
        GaritaInfoPersonal = new javax.swing.JLabel();
        GaritaPersonalSi = new javax.swing.JRadioButton();
        GaritaPersonalNo = new javax.swing.JRadioButton();
        GaritaInfoEstaIluminada = new javax.swing.JLabel();
        GaritaEstaIluminadaSi = new javax.swing.JRadioButton();
        GaritaEstaIliminadaNo = new javax.swing.JRadioButton();
        GaritaInfoNumeracion = new javax.swing.JLabel();
        GaritaNumeracion = new javax.swing.JTextField();
        GaritaBotonAceptar = new javax.swing.JButton();
        GaritaPersonalSioNo = new javax.swing.ButtonGroup();
        GaritaIluminadaSioNo = new javax.swing.ButtonGroup();
        EscojerCercaOMuro = new javax.swing.JFrame();
        EscojerCercaOMuroPanel = new javax.swing.JPanel();
        EscogerInfo = new javax.swing.JLabel();
        EscojerCerca = new javax.swing.JButton();
        EscojerMuro = new javax.swing.JButton();
        CercaNueva = new javax.swing.JFrame();
        CercaNuevaPanel = new javax.swing.JPanel();
        CercaInfoEstado = new javax.swing.JLabel();
        CercaEstado = new javax.swing.JComboBox<>();
        CercaInfoAltura = new javax.swing.JLabel();
        CercaAlturaM = new javax.swing.JTextField();
        CercaInfoPerimetro = new javax.swing.JLabel();
        CercaPerimetroM = new javax.swing.JTextField();
        CercaInfoCorriente = new javax.swing.JLabel();
        CercaCorrieteSi = new javax.swing.JRadioButton();
        CeracaCorrieteNo = new javax.swing.JRadioButton();
        CercaInfoTipoAlambre = new javax.swing.JLabel();
        CercaTipoAlambre = new javax.swing.JTextField();
        CercaAceptar = new javax.swing.JButton();
        CercaCorrienteSioNo = new javax.swing.ButtonGroup();
        MuroNuevoEscritorio = new javax.swing.JFrame();
        MuroNuevoPanel = new javax.swing.JPanel();
        MuroInfoEstado = new javax.swing.JLabel();
        MuroEstado = new javax.swing.JComboBox<>();
        MuroInfoAltura = new javax.swing.JLabel();
        MuroAlturaM = new javax.swing.JTextField();
        MuroInfoPerimetroM = new javax.swing.JLabel();
        MuroPerimetroM = new javax.swing.JTextField();
        MuroInfoMaterial = new javax.swing.JLabel();
        MuroMaterialFabricacion = new javax.swing.JTextField();
        MuroGrosorCM = new javax.swing.JTextField();
        MuroBotonAceptar = new javax.swing.JButton();
        MuroInfoGrosor = new javax.swing.JLabel();
        AlarmasNoExisten = new javax.swing.JFrame();
        AlarmasNoExistenPanel = new javax.swing.JPanel();
        AlarmasNoExistenVisual = new javax.swing.JScrollPane();
        AlarmasNoExistenTextoMostrar = new javax.swing.JTextArea();
        AlarmaNoExistenBorrarDatos = new javax.swing.JButton();
        AlarmaNoExistenAceptar = new javax.swing.JButton();
        AlarmaExistenSioNo = new javax.swing.ButtonGroup();
        AlarmasNecesitanReparacion = new javax.swing.JFrame();
        AlarmasNecesitanReparacionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlarmasNecesitanReparacionTexto = new javax.swing.JTextArea();
        AlarmasNecesitanReparacionBorrar = new javax.swing.JButton();
        AlarmasNecesitanReparacionAceptar = new javax.swing.JButton();
        GaritasSinLuzEscritorio = new javax.swing.JFrame();
        GaritasSinLuzPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        GaritasSinLuzTexto = new javax.swing.JTextArea();
        GaritasSinLuzBorrarDatos = new javax.swing.JButton();
        GaritasSinLuzAceptar = new javax.swing.JButton();
        GaritasNoCubiertasEscritorio = new javax.swing.JFrame();
        GaritasNoCubiertas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GaritasNoCubiertasTexto = new javax.swing.JTextArea();
        GaritasNoCubiertasBorrarDatos = new javax.swing.JButton();
        GaritasNoCubiertasAceptar = new javax.swing.JButton();
        GaritasNecesitanReparacionEscritorio = new javax.swing.JFrame();
        GaritasNecesitanReparacion = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        GaritasNecesitanReparacionTexto = new javax.swing.JTextArea();
        GaritasNecesitanReparacionBorrardatos = new javax.swing.JButton();
        GaritasNecesitanReparacionAceptar = new javax.swing.JButton();
        CordonAlturaYPerimetroEscritorio = new javax.swing.JFrame();
        CordonAlturaYPerimetro = new javax.swing.JPanel();
        CordonABuscarInfo = new javax.swing.JLabel();
        CordonABuscarTexto = new javax.swing.JTextField();
        CordonABuscarBuscar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        CordonABuscarAreaDeTexto = new javax.swing.JTextArea();
        CordonABuscarAceptar = new javax.swing.JButton();
        CordonesNecesitanReparacionEscritorio = new javax.swing.JFrame();
        CordonesNecesitanReparacion = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        CordonesNecesitanReparacionTexto = new javax.swing.JTextArea();
        CordonesNecesitanReparacionAceptar = new javax.swing.JButton();
        GaritasYFicherosEscritorio = new javax.swing.JFrame();
        GaritasYFicheros = new javax.swing.JPanel();
        CrearArchivoTXTBoton = new javax.swing.JButton();
        ConsultarArchivoTXTBoton = new javax.swing.JButton();
        BorrarArchivoTXTBoton = new javax.swing.JButton();
        BorrarYCrearTXT = new javax.swing.JButton();
        DatosDeGaritasTXTEscritorio = new javax.swing.JFrame();
        DatosDeGaritasTXT = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        DatosDeGaritasTXTTexto = new javax.swing.JTextArea();
        DatosDeGaritasTXTBotonAceptar = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        InformacionTextoGrande = new javax.swing.JLabel();
        Operaciones = new javax.swing.JComboBox<>();
        NuevoCordon = new javax.swing.JButton();
        NuevaGarita = new javax.swing.JButton();
        NuevaCamara = new javax.swing.JButton();
        GaritasEnFicheroBoton = new javax.swing.JButton();

        AlarmaEscritorio.setTitle("Nueva Alarma");
        AlarmaEscritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AlarmaEscritorio.setSize(new java.awt.Dimension(383, 438));
        AlarmaEscritorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AlarmaEscritorioKeyReleased(evt);
            }
        });

        AlarmaNueva.setPreferredSize(new java.awt.Dimension(383, 438));
        AlarmaNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AlarmaNuevaKeyReleased(evt);
            }
        });

        AlarmaInfoExiste.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AlarmaInfoExiste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlarmaInfoExiste.setText("¿ Existe la Alarma ?");

        AlarmaInfoEstadoAlarma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AlarmaInfoEstadoAlarma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlarmaInfoEstadoAlarma.setText("Estado de la Alarma");

        AlarmaEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AlarmaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Bien", "Regular", "Mal" }));
        AlarmaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmaEstadoActionPerformed(evt);
            }
        });
        AlarmaEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlarmaEstadoKeyPressed(evt);
            }
        });

        AlarmaBotonAceptar.setBackground(new java.awt.Color(0, 0, 255));
        AlarmaBotonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AlarmaBotonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        AlarmaBotonAceptar.setText("Aceptar");
        AlarmaBotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmaBotonAceptarActionPerformed(evt);
            }
        });
        AlarmaBotonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlarmaBotonAceptarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AlarmaBotonAceptarKeyReleased(evt);
            }
        });

        AlarmaNumPlantilla.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AlarmaNumPlantilla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AlarmaNumPlantillaFocusLost(evt);
            }
        });
        AlarmaNumPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmaNumPlantillaActionPerformed(evt);
            }
        });
        AlarmaNumPlantilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlarmaNumPlantillaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AlarmaNumPlantillaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AlarmaNumPlantillaKeyTyped(evt);
            }
        });

        AlarmaExistenSioNo.add(AlarmaExisteSi);
        AlarmaExisteSi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AlarmaExisteSi.setText("Si");
        AlarmaExisteSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmaExisteSiActionPerformed(evt);
            }
        });
        AlarmaExisteSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlarmaExisteSiKeyPressed(evt);
            }
        });

        AlarmaExistenSioNo.add(AlarmaExisteNo);
        AlarmaExisteNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AlarmaExisteNo.setText("No");
        AlarmaExisteNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmaExisteNoActionPerformed(evt);
            }
        });
        AlarmaExisteNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AlarmaExisteNoKeyPressed(evt);
            }
        });

        AlarmaInfoPlantila.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AlarmaInfoPlantila.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlarmaInfoPlantila.setText("Número de Plantilla");

        javax.swing.GroupLayout AlarmaNuevaLayout = new javax.swing.GroupLayout(AlarmaNueva);
        AlarmaNueva.setLayout(AlarmaNuevaLayout);
        AlarmaNuevaLayout.setHorizontalGroup(
            AlarmaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmaNuevaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(AlarmaInfoEstadoAlarma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmaNuevaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AlarmaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmaNuevaLayout.createSequentialGroup()
                        .addComponent(AlarmaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmaNuevaLayout.createSequentialGroup()
                        .addComponent(AlarmaBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
            .addGroup(AlarmaNuevaLayout.createSequentialGroup()
                .addGroup(AlarmaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlarmaNuevaLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(AlarmaExisteSi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(AlarmaExisteNo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AlarmaNuevaLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(AlarmaInfoExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AlarmaNuevaLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(AlarmaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AlarmaInfoPlantila, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(AlarmaNumPlantilla))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        AlarmaNuevaLayout.setVerticalGroup(
            AlarmaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmaNuevaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AlarmaInfoPlantila)
                .addGap(28, 28, 28)
                .addComponent(AlarmaNumPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(AlarmaInfoExiste)
                .addGap(27, 27, 27)
                .addGroup(AlarmaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlarmaExisteSi)
                    .addComponent(AlarmaExisteNo))
                .addGap(18, 18, 18)
                .addComponent(AlarmaInfoEstadoAlarma)
                .addGap(18, 18, 18)
                .addComponent(AlarmaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AlarmaBotonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout AlarmaEscritorioLayout = new javax.swing.GroupLayout(AlarmaEscritorio.getContentPane());
        AlarmaEscritorio.getContentPane().setLayout(AlarmaEscritorioLayout);
        AlarmaEscritorioLayout.setHorizontalGroup(
            AlarmaEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmaEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlarmaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
        );
        AlarmaEscritorioLayout.setVerticalGroup(
            AlarmaEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmaEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlarmaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        GaritaEscritorio.setTitle("Nueva Garita");
        GaritaEscritorio.setSize(new java.awt.Dimension(599, 453));

        GaritaInfoEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GaritaInfoEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GaritaInfoEstado.setText("Estado De la Garita");

        GaritaEstado.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        GaritaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Bien", "Regular", "Mal" }));
        GaritaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritaEstadoActionPerformed(evt);
            }
        });
        GaritaEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GaritaEstadoKeyPressed(evt);
            }
        });

        GaritaInfoPersonal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GaritaInfoPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GaritaInfoPersonal.setText("¿ Presenta Personal ?");

        GaritaPersonalSioNo.add(GaritaPersonalSi);
        GaritaPersonalSi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        GaritaPersonalSi.setText("Si");
        GaritaPersonalSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritaPersonalSiActionPerformed(evt);
            }
        });
        GaritaPersonalSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GaritaPersonalSiKeyPressed(evt);
            }
        });

        GaritaPersonalSioNo.add(GaritaPersonalNo);
        GaritaPersonalNo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        GaritaPersonalNo.setText("No");
        GaritaPersonalNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritaPersonalNoActionPerformed(evt);
            }
        });
        GaritaPersonalNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GaritaPersonalNoKeyPressed(evt);
            }
        });

        GaritaInfoEstaIluminada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GaritaInfoEstaIluminada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GaritaInfoEstaIluminada.setText("¿ Esta iluminada ?");

        GaritaIluminadaSioNo.add(GaritaEstaIluminadaSi);
        GaritaEstaIluminadaSi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        GaritaEstaIluminadaSi.setText("Si");
        GaritaEstaIluminadaSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritaEstaIluminadaSiActionPerformed(evt);
            }
        });
        GaritaEstaIluminadaSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GaritaEstaIluminadaSiKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GaritaEstaIluminadaSiKeyReleased(evt);
            }
        });

        GaritaIluminadaSioNo.add(GaritaEstaIliminadaNo);
        GaritaEstaIliminadaNo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        GaritaEstaIliminadaNo.setText("No");
        GaritaEstaIliminadaNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritaEstaIliminadaNoActionPerformed(evt);
            }
        });
        GaritaEstaIliminadaNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GaritaEstaIliminadaNoKeyPressed(evt);
            }
        });

        GaritaInfoNumeracion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GaritaInfoNumeracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GaritaInfoNumeracion.setText("Número de Plantilla");

        GaritaNumeracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GaritaNumeracion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        GaritaNumeracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritaNumeracionActionPerformed(evt);
            }
        });
        GaritaNumeracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GaritaNumeracionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GaritaNumeracionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GaritaNumeracionKeyTyped(evt);
            }
        });

        GaritaBotonAceptar.setBackground(new java.awt.Color(0, 204, 51));
        GaritaBotonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GaritaBotonAceptar.setText("Aceptar");
        GaritaBotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritaBotonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GaritaNuevaLayout = new javax.swing.GroupLayout(GaritaNueva);
        GaritaNueva.setLayout(GaritaNuevaLayout);
        GaritaNuevaLayout.setHorizontalGroup(
            GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GaritaNuevaLayout.createSequentialGroup()
                .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GaritaNuevaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(GaritaEstaIluminadaSi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(GaritaEstaIliminadaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, GaritaNuevaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GaritaInfoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(GaritaInfoEstaIluminada, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GaritaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(GaritaNuevaLayout.createSequentialGroup()
                            .addComponent(GaritaInfoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66))
                        .addGroup(GaritaNuevaLayout.createSequentialGroup()
                            .addComponent(GaritaPersonalSi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GaritaPersonalNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GaritaNuevaLayout.createSequentialGroup()
                        .addComponent(GaritaInfoNumeracion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GaritaNuevaLayout.createSequentialGroup()
                        .addComponent(GaritaNumeracion, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GaritaNuevaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GaritaBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        GaritaNuevaLayout.setVerticalGroup(
            GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritaNuevaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GaritaInfoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GaritaInfoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GaritaNuevaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GaritaPersonalSi)
                            .addComponent(GaritaPersonalNo)))
                    .addComponent(GaritaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GaritaInfoEstaIluminada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GaritaInfoNumeracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GaritaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GaritaEstaIluminadaSi)
                        .addComponent(GaritaEstaIliminadaNo))
                    .addComponent(GaritaNumeracion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(GaritaBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout GaritaEscritorioLayout = new javax.swing.GroupLayout(GaritaEscritorio.getContentPane());
        GaritaEscritorio.getContentPane().setLayout(GaritaEscritorioLayout);
        GaritaEscritorioLayout.setHorizontalGroup(
            GaritaEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritaEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        GaritaEscritorioLayout.setVerticalGroup(
            GaritaEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritaEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritaNueva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        EscojerCercaOMuro.setTitle("OPCIÓN");
        EscojerCercaOMuro.setSize(new java.awt.Dimension(523, 289));

        EscogerInfo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EscogerInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EscogerInfo.setText("¿ Que tipo de Nuevo Cordón desea Añadir ?");

        EscojerCerca.setBackground(new java.awt.Color(255, 0, 51));
        EscojerCerca.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        EscojerCerca.setText("Cerca");
        EscojerCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscojerCercaActionPerformed(evt);
            }
        });

        EscojerMuro.setBackground(new java.awt.Color(102, 102, 102));
        EscojerMuro.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        EscojerMuro.setText("Muro");
        EscojerMuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscojerMuroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EscojerCercaOMuroPanelLayout = new javax.swing.GroupLayout(EscojerCercaOMuroPanel);
        EscojerCercaOMuroPanel.setLayout(EscojerCercaOMuroPanelLayout);
        EscojerCercaOMuroPanelLayout.setHorizontalGroup(
            EscojerCercaOMuroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscojerCercaOMuroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscogerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(EscojerCercaOMuroPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(EscojerCerca, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EscojerMuro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        EscojerCercaOMuroPanelLayout.setVerticalGroup(
            EscojerCercaOMuroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscojerCercaOMuroPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(EscogerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(EscojerCercaOMuroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EscojerCerca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EscojerMuro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout EscojerCercaOMuroLayout = new javax.swing.GroupLayout(EscojerCercaOMuro.getContentPane());
        EscojerCercaOMuro.getContentPane().setLayout(EscojerCercaOMuroLayout);
        EscojerCercaOMuroLayout.setHorizontalGroup(
            EscojerCercaOMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscojerCercaOMuroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscojerCercaOMuroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EscojerCercaOMuroLayout.setVerticalGroup(
            EscojerCercaOMuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscojerCercaOMuroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscojerCercaOMuroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        CercaNueva.setTitle("Nueva Cerca");
        CercaNueva.setSize(new java.awt.Dimension(675, 435));
        CercaNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CercaNuevaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CercaNuevaKeyReleased(evt);
            }
        });

        CercaNuevaPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CercaNuevaPanelKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CercaNuevaPanelKeyReleased(evt);
            }
        });

        CercaInfoEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CercaInfoEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CercaInfoEstado.setText("Estado Cerca");

        CercaEstado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CercaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Bien", "Regular", "Mal" }));
        CercaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercaEstadoActionPerformed(evt);
            }
        });
        CercaEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CercaEstadoKeyPressed(evt);
            }
        });

        CercaInfoAltura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CercaInfoAltura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CercaInfoAltura.setText("Altura de la Cerca (m)");

        CercaAlturaM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CercaAlturaM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CercaAlturaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercaAlturaMActionPerformed(evt);
            }
        });
        CercaAlturaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CercaAlturaMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CercaAlturaMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CercaAlturaMKeyTyped(evt);
            }
        });

        CercaInfoPerimetro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CercaInfoPerimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CercaInfoPerimetro.setText("Perímetro de la Cerca (m)");

        CercaPerimetroM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CercaPerimetroM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CercaPerimetroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercaPerimetroMActionPerformed(evt);
            }
        });
        CercaPerimetroM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CercaPerimetroMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CercaPerimetroMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CercaPerimetroMKeyTyped(evt);
            }
        });

        CercaInfoCorriente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CercaInfoCorriente.setText("¿ Posee Corriente ?");

        CercaCorrienteSioNo.add(CercaCorrieteSi);
        CercaCorrieteSi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CercaCorrieteSi.setText("Si");
        CercaCorrieteSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercaCorrieteSiActionPerformed(evt);
            }
        });
        CercaCorrieteSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CercaCorrieteSiKeyPressed(evt);
            }
        });

        CercaCorrienteSioNo.add(CeracaCorrieteNo);
        CeracaCorrieteNo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CeracaCorrieteNo.setText("No");
        CeracaCorrieteNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeracaCorrieteNoActionPerformed(evt);
            }
        });
        CeracaCorrieteNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CeracaCorrieteNoKeyPressed(evt);
            }
        });

        CercaInfoTipoAlambre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CercaInfoTipoAlambre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CercaInfoTipoAlambre.setText("Tipo de Alambre");

        CercaTipoAlambre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CercaTipoAlambre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CercaTipoAlambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercaTipoAlambreActionPerformed(evt);
            }
        });
        CercaTipoAlambre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CercaTipoAlambreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CercaTipoAlambreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CercaTipoAlambreKeyTyped(evt);
            }
        });

        CercaAceptar.setBackground(new java.awt.Color(0, 102, 102));
        CercaAceptar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        CercaAceptar.setText("Aceptar");
        CercaAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercaAceptarActionPerformed(evt);
            }
        });
        CercaAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CercaAceptarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CercaAceptarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout CercaNuevaPanelLayout = new javax.swing.GroupLayout(CercaNuevaPanel);
        CercaNuevaPanel.setLayout(CercaNuevaPanelLayout);
        CercaNuevaPanelLayout.setHorizontalGroup(
            CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                        .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                                .addComponent(CercaInfoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CercaNuevaPanelLayout.createSequentialGroup()
                                .addComponent(CercaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CercaInfoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CercaAlturaM, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CercaPerimetroM, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CercaInfoPerimetro))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                        .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CeracaCorrieteNo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CercaCorrieteSi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(CercaInfoCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CercaTipoAlambre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(CercaInfoTipoAlambre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CercaNuevaPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CercaAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))))))
        );
        CercaNuevaPanelLayout.setVerticalGroup(
            CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CercaInfoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CercaInfoAltura)
                    .addComponent(CercaInfoPerimetro))
                .addGap(18, 18, 18)
                .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CercaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CercaAlturaM)
                    .addComponent(CercaPerimetroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(CercaInfoTipoAlambre)
                        .addGap(18, 18, 18)
                        .addComponent(CercaTipoAlambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CercaNuevaPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CercaInfoCorriente)
                        .addGap(29, 29, 29)))
                .addGroup(CercaNuevaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                        .addComponent(CercaCorrieteSi)
                        .addGap(7, 7, 7)
                        .addComponent(CeracaCorrieteNo))
                    .addGroup(CercaNuevaPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CercaAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CercaNuevaLayout = new javax.swing.GroupLayout(CercaNueva.getContentPane());
        CercaNueva.getContentPane().setLayout(CercaNuevaLayout);
        CercaNuevaLayout.setHorizontalGroup(
            CercaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CercaNuevaLayout.createSequentialGroup()
                .addComponent(CercaNuevaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CercaNuevaLayout.setVerticalGroup(
            CercaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CercaNuevaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CercaNuevaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MuroNuevoEscritorio.setTitle("Nuevo Muro");
        MuroNuevoEscritorio.setSize(new java.awt.Dimension(675, 435));

        MuroInfoEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroInfoEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MuroInfoEstado.setText("Estado Muro");

        MuroEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Bien", "Regular", "Mal" }));
        MuroEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuroEstadoActionPerformed(evt);
            }
        });
        MuroEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MuroEstadoKeyPressed(evt);
            }
        });

        MuroInfoAltura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroInfoAltura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MuroInfoAltura.setText("Altura Muro (m)");

        MuroAlturaM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroAlturaM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MuroAlturaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuroAlturaMActionPerformed(evt);
            }
        });
        MuroAlturaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MuroAlturaMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MuroAlturaMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MuroAlturaMKeyTyped(evt);
            }
        });

        MuroInfoPerimetroM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroInfoPerimetroM.setText("Perímetro Muro (m)");

        MuroPerimetroM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroPerimetroM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MuroPerimetroM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuroPerimetroMActionPerformed(evt);
            }
        });
        MuroPerimetroM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MuroPerimetroMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MuroPerimetroMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MuroPerimetroMKeyTyped(evt);
            }
        });

        MuroInfoMaterial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroInfoMaterial.setText("Material de Fabricación");

        MuroMaterialFabricacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroMaterialFabricacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MuroMaterialFabricacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuroMaterialFabricacionActionPerformed(evt);
            }
        });
        MuroMaterialFabricacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MuroMaterialFabricacionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MuroMaterialFabricacionKeyReleased(evt);
            }
        });

        MuroGrosorCM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroGrosorCM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MuroGrosorCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuroGrosorCMActionPerformed(evt);
            }
        });
        MuroGrosorCM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MuroGrosorCMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MuroGrosorCMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MuroGrosorCMKeyTyped(evt);
            }
        });

        MuroBotonAceptar.setBackground(new java.awt.Color(204, 204, 0));
        MuroBotonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        MuroBotonAceptar.setText("Aceptar");
        MuroBotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuroBotonAceptarActionPerformed(evt);
            }
        });

        MuroInfoGrosor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MuroInfoGrosor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MuroInfoGrosor.setText("Grosor del Muro (cm)");

        javax.swing.GroupLayout MuroNuevoPanelLayout = new javax.swing.GroupLayout(MuroNuevoPanel);
        MuroNuevoPanel.setLayout(MuroNuevoPanelLayout);
        MuroNuevoPanelLayout.setHorizontalGroup(
            MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MuroNuevoPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MuroNuevoPanelLayout.createSequentialGroup()
                        .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MuroInfoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MuroNuevoPanelLayout.createSequentialGroup()
                                .addComponent(MuroEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MuroInfoAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MuroAlturaM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MuroPerimetroM, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MuroInfoPerimetroM, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MuroNuevoPanelLayout.createSequentialGroup()
                        .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MuroMaterialFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MuroInfoMaterial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MuroGrosorCM)
                            .addComponent(MuroInfoGrosor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(91, 91, 91))
            .addGroup(MuroNuevoPanelLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(MuroBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MuroNuevoPanelLayout.setVerticalGroup(
            MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MuroNuevoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MuroInfoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MuroInfoAltura)
                    .addComponent(MuroInfoPerimetroM))
                .addGap(18, 18, 18)
                .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MuroEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MuroAlturaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MuroPerimetroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MuroInfoMaterial)
                    .addComponent(MuroInfoGrosor))
                .addGap(29, 29, 29)
                .addGroup(MuroNuevoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MuroMaterialFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MuroGrosorCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(MuroBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MuroNuevoEscritorioLayout = new javax.swing.GroupLayout(MuroNuevoEscritorio.getContentPane());
        MuroNuevoEscritorio.getContentPane().setLayout(MuroNuevoEscritorioLayout);
        MuroNuevoEscritorioLayout.setHorizontalGroup(
            MuroNuevoEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MuroNuevoEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MuroNuevoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MuroNuevoEscritorioLayout.setVerticalGroup(
            MuroNuevoEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MuroNuevoEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MuroNuevoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        AlarmasNoExisten.setTitle("Alarmas que no Existen ( Solo estan en la plantilla )");
        AlarmasNoExisten.setSize(new java.awt.Dimension(582, 352));

        AlarmasNoExistenPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AlarmasNoExistenVisual.setToolTipText("");

        AlarmasNoExistenTextoMostrar.setEditable(false);
        AlarmasNoExistenTextoMostrar.setColumns(20);
        AlarmasNoExistenTextoMostrar.setRows(5);
        AlarmasNoExistenTextoMostrar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                AlarmasNoExistenTextoMostrarComponentAdded(evt);
            }
        });
        AlarmasNoExistenTextoMostrar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                AlarmasNoExistenTextoMostrarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        AlarmasNoExistenVisual.setViewportView(AlarmasNoExistenTextoMostrar);

        AlarmaNoExistenBorrarDatos.setBackground(new java.awt.Color(255, 0, 51));
        AlarmaNoExistenBorrarDatos.setText("Borrar Datos");
        AlarmaNoExistenBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmaNoExistenBorrarDatosActionPerformed(evt);
            }
        });

        AlarmaNoExistenAceptar.setBackground(new java.awt.Color(204, 0, 204));
        AlarmaNoExistenAceptar.setText("Aceptar");
        AlarmaNoExistenAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmaNoExistenAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlarmasNoExistenPanelLayout = new javax.swing.GroupLayout(AlarmasNoExistenPanel);
        AlarmasNoExistenPanel.setLayout(AlarmasNoExistenPanelLayout);
        AlarmasNoExistenPanelLayout.setHorizontalGroup(
            AlarmasNoExistenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmasNoExistenPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(AlarmasNoExistenVisual, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(AlarmasNoExistenPanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(AlarmaNoExistenBorrarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AlarmaNoExistenAceptar)
                .addGap(143, 143, 143))
        );
        AlarmasNoExistenPanelLayout.setVerticalGroup(
            AlarmasNoExistenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmasNoExistenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlarmasNoExistenVisual, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AlarmasNoExistenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlarmaNoExistenBorrarDatos)
                    .addComponent(AlarmaNoExistenAceptar))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AlarmasNoExistenLayout = new javax.swing.GroupLayout(AlarmasNoExisten.getContentPane());
        AlarmasNoExisten.getContentPane().setLayout(AlarmasNoExistenLayout);
        AlarmasNoExistenLayout.setHorizontalGroup(
            AlarmasNoExistenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmasNoExistenLayout.createSequentialGroup()
                .addComponent(AlarmasNoExistenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AlarmasNoExistenLayout.setVerticalGroup(
            AlarmasNoExistenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmasNoExistenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlarmasNoExistenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        AlarmasNecesitanReparacion.setTitle("Alarmas que por su estado ( MAL ) necesitan reparación");
        AlarmasNecesitanReparacion.setSize(new java.awt.Dimension(573, 392));

        AlarmasNecesitanReparacionTexto.setEditable(false);
        AlarmasNecesitanReparacionTexto.setColumns(20);
        AlarmasNecesitanReparacionTexto.setRows(5);
        jScrollPane1.setViewportView(AlarmasNecesitanReparacionTexto);

        AlarmasNecesitanReparacionBorrar.setBackground(new java.awt.Color(255, 51, 102));
        AlarmasNecesitanReparacionBorrar.setText("Borrar Datos");
        AlarmasNecesitanReparacionBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmasNecesitanReparacionBorrarActionPerformed(evt);
            }
        });

        AlarmasNecesitanReparacionAceptar.setBackground(new java.awt.Color(255, 255, 0));
        AlarmasNecesitanReparacionAceptar.setText("Aceptar");
        AlarmasNecesitanReparacionAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmasNecesitanReparacionAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlarmasNecesitanReparacionPanelLayout = new javax.swing.GroupLayout(AlarmasNecesitanReparacionPanel);
        AlarmasNecesitanReparacionPanel.setLayout(AlarmasNecesitanReparacionPanelLayout);
        AlarmasNecesitanReparacionPanelLayout.setHorizontalGroup(
            AlarmasNecesitanReparacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmasNecesitanReparacionPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(AlarmasNecesitanReparacionPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(AlarmasNecesitanReparacionBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AlarmasNecesitanReparacionAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        AlarmasNecesitanReparacionPanelLayout.setVerticalGroup(
            AlarmasNecesitanReparacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmasNecesitanReparacionPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(AlarmasNecesitanReparacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlarmasNecesitanReparacionBorrar)
                    .addComponent(AlarmasNecesitanReparacionAceptar))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AlarmasNecesitanReparacionLayout = new javax.swing.GroupLayout(AlarmasNecesitanReparacion.getContentPane());
        AlarmasNecesitanReparacion.getContentPane().setLayout(AlarmasNecesitanReparacionLayout);
        AlarmasNecesitanReparacionLayout.setHorizontalGroup(
            AlarmasNecesitanReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmasNecesitanReparacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlarmasNecesitanReparacionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AlarmasNecesitanReparacionLayout.setVerticalGroup(
            AlarmasNecesitanReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmasNecesitanReparacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlarmasNecesitanReparacionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GaritasSinLuzEscritorio.setTitle("Garitas que no poseen Iluminación");
        GaritasSinLuzEscritorio.setSize(new java.awt.Dimension(601, 382));

        GaritasSinLuzTexto.setEditable(false);
        GaritasSinLuzTexto.setColumns(20);
        GaritasSinLuzTexto.setRows(5);
        jScrollPane2.setViewportView(GaritasSinLuzTexto);

        GaritasSinLuzBorrarDatos.setBackground(new java.awt.Color(255, 0, 0));
        GaritasSinLuzBorrarDatos.setText("Borrar Datos");
        GaritasSinLuzBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritasSinLuzBorrarDatosActionPerformed(evt);
            }
        });

        GaritasSinLuzAceptar.setBackground(new java.awt.Color(0, 51, 255));
        GaritasSinLuzAceptar.setText("Aceptar");
        GaritasSinLuzAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritasSinLuzAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GaritasSinLuzPanelLayout = new javax.swing.GroupLayout(GaritasSinLuzPanel);
        GaritasSinLuzPanel.setLayout(GaritasSinLuzPanelLayout);
        GaritasSinLuzPanelLayout.setHorizontalGroup(
            GaritasSinLuzPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasSinLuzPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(GaritasSinLuzBorrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GaritasSinLuzAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(GaritasSinLuzPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        GaritasSinLuzPanelLayout.setVerticalGroup(
            GaritasSinLuzPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasSinLuzPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(GaritasSinLuzPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GaritasSinLuzBorrarDatos)
                    .addComponent(GaritasSinLuzAceptar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GaritasSinLuzEscritorioLayout = new javax.swing.GroupLayout(GaritasSinLuzEscritorio.getContentPane());
        GaritasSinLuzEscritorio.getContentPane().setLayout(GaritasSinLuzEscritorioLayout);
        GaritasSinLuzEscritorioLayout.setHorizontalGroup(
            GaritasSinLuzEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasSinLuzEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritasSinLuzPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        GaritasSinLuzEscritorioLayout.setVerticalGroup(
            GaritasSinLuzEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasSinLuzEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritasSinLuzPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GaritasNoCubiertasEscritorio.setTitle("Garitas Carentes de Personal");
        GaritasNoCubiertasEscritorio.setSize(new java.awt.Dimension(553, 373));

        GaritasNoCubiertasTexto.setEditable(false);
        GaritasNoCubiertasTexto.setColumns(20);
        GaritasNoCubiertasTexto.setRows(5);
        jScrollPane3.setViewportView(GaritasNoCubiertasTexto);

        javax.swing.GroupLayout GaritasNoCubiertasLayout = new javax.swing.GroupLayout(GaritasNoCubiertas);
        GaritasNoCubiertas.setLayout(GaritasNoCubiertasLayout);
        GaritasNoCubiertasLayout.setHorizontalGroup(
            GaritasNoCubiertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GaritasNoCubiertasLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        GaritasNoCubiertasLayout.setVerticalGroup(
            GaritasNoCubiertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasNoCubiertasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        GaritasNoCubiertasBorrarDatos.setBackground(new java.awt.Color(204, 0, 0));
        GaritasNoCubiertasBorrarDatos.setText("Borrar Datos");
        GaritasNoCubiertasBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritasNoCubiertasBorrarDatosActionPerformed(evt);
            }
        });

        GaritasNoCubiertasAceptar.setBackground(new java.awt.Color(51, 255, 255));
        GaritasNoCubiertasAceptar.setText("Aceptar");
        GaritasNoCubiertasAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritasNoCubiertasAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GaritasNoCubiertasEscritorioLayout = new javax.swing.GroupLayout(GaritasNoCubiertasEscritorio.getContentPane());
        GaritasNoCubiertasEscritorio.getContentPane().setLayout(GaritasNoCubiertasEscritorioLayout);
        GaritasNoCubiertasEscritorioLayout.setHorizontalGroup(
            GaritasNoCubiertasEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasNoCubiertasEscritorioLayout.createSequentialGroup()
                .addGroup(GaritasNoCubiertasEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GaritasNoCubiertasEscritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GaritasNoCubiertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GaritasNoCubiertasEscritorioLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(GaritasNoCubiertasBorrarDatos)
                        .addGap(145, 145, 145)
                        .addComponent(GaritasNoCubiertasAceptar)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        GaritasNoCubiertasEscritorioLayout.setVerticalGroup(
            GaritasNoCubiertasEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasNoCubiertasEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritasNoCubiertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(GaritasNoCubiertasEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GaritasNoCubiertasBorrarDatos)
                    .addComponent(GaritasNoCubiertasAceptar))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        GaritasNecesitanReparacionEscritorio.setTitle("Garitas que por si estado ( MAL ) necesitan Reparación");
        GaritasNecesitanReparacionEscritorio.setSize(new java.awt.Dimension(644, 334));

        GaritasNecesitanReparacionTexto.setEditable(false);
        GaritasNecesitanReparacionTexto.setColumns(20);
        GaritasNecesitanReparacionTexto.setRows(5);
        jScrollPane4.setViewportView(GaritasNecesitanReparacionTexto);

        GaritasNecesitanReparacionBorrardatos.setBackground(new java.awt.Color(255, 51, 0));
        GaritasNecesitanReparacionBorrardatos.setText("Borrar Datos");
        GaritasNecesitanReparacionBorrardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritasNecesitanReparacionBorrardatosActionPerformed(evt);
            }
        });

        GaritasNecesitanReparacionAceptar.setBackground(new java.awt.Color(153, 255, 153));
        GaritasNecesitanReparacionAceptar.setText("Aceptar");
        GaritasNecesitanReparacionAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritasNecesitanReparacionAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GaritasNecesitanReparacionLayout = new javax.swing.GroupLayout(GaritasNecesitanReparacion);
        GaritasNecesitanReparacion.setLayout(GaritasNecesitanReparacionLayout);
        GaritasNecesitanReparacionLayout.setHorizontalGroup(
            GaritasNecesitanReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasNecesitanReparacionLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(GaritasNecesitanReparacionBorrardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GaritasNecesitanReparacionAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(GaritasNecesitanReparacionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        GaritasNecesitanReparacionLayout.setVerticalGroup(
            GaritasNecesitanReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasNecesitanReparacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(GaritasNecesitanReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GaritasNecesitanReparacionBorrardatos)
                    .addComponent(GaritasNecesitanReparacionAceptar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout GaritasNecesitanReparacionEscritorioLayout = new javax.swing.GroupLayout(GaritasNecesitanReparacionEscritorio.getContentPane());
        GaritasNecesitanReparacionEscritorio.getContentPane().setLayout(GaritasNecesitanReparacionEscritorioLayout);
        GaritasNecesitanReparacionEscritorioLayout.setHorizontalGroup(
            GaritasNecesitanReparacionEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GaritasNecesitanReparacionEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritasNecesitanReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        GaritasNecesitanReparacionEscritorioLayout.setVerticalGroup(
            GaritasNecesitanReparacionEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasNecesitanReparacionEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritasNecesitanReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        CordonAlturaYPerimetroEscritorio.setTitle("Conocer la altura y el perimetro del Cordón de Seguridad qué se seleccione");
        CordonAlturaYPerimetroEscritorio.setSize(new java.awt.Dimension(731, 320));

        CordonABuscarInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CordonABuscarInfo.setText("Introduzca el número del Cordón a Buscar >>>>");

        CordonABuscarTexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CordonABuscarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CordonABuscarTextoActionPerformed(evt);
            }
        });
        CordonABuscarTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CordonABuscarTextoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CordonABuscarTextoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CordonABuscarTextoKeyTyped(evt);
            }
        });

        CordonABuscarBuscar.setBackground(new java.awt.Color(51, 204, 0));
        CordonABuscarBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CordonABuscarBuscar.setText("Buscar");
        CordonABuscarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CordonABuscarBuscarActionPerformed(evt);
            }
        });

        CordonABuscarAreaDeTexto.setEditable(false);
        CordonABuscarAreaDeTexto.setColumns(20);
        CordonABuscarAreaDeTexto.setRows(5);
        jScrollPane5.setViewportView(CordonABuscarAreaDeTexto);

        CordonABuscarAceptar.setBackground(new java.awt.Color(51, 0, 204));
        CordonABuscarAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CordonABuscarAceptar.setText("Aceptar");
        CordonABuscarAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CordonABuscarAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CordonAlturaYPerimetroLayout = new javax.swing.GroupLayout(CordonAlturaYPerimetro);
        CordonAlturaYPerimetro.setLayout(CordonAlturaYPerimetroLayout);
        CordonAlturaYPerimetroLayout.setHorizontalGroup(
            CordonAlturaYPerimetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CordonAlturaYPerimetroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CordonAlturaYPerimetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CordonAlturaYPerimetroLayout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(CordonABuscarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CordonABuscarTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CordonABuscarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CordonAlturaYPerimetroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CordonABuscarAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        CordonAlturaYPerimetroLayout.setVerticalGroup(
            CordonAlturaYPerimetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CordonAlturaYPerimetroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(CordonAlturaYPerimetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CordonABuscarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CordonABuscarTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CordonABuscarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CordonABuscarAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CordonAlturaYPerimetroEscritorioLayout = new javax.swing.GroupLayout(CordonAlturaYPerimetroEscritorio.getContentPane());
        CordonAlturaYPerimetroEscritorio.getContentPane().setLayout(CordonAlturaYPerimetroEscritorioLayout);
        CordonAlturaYPerimetroEscritorioLayout.setHorizontalGroup(
            CordonAlturaYPerimetroEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CordonAlturaYPerimetroEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CordonAlturaYPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CordonAlturaYPerimetroEscritorioLayout.setVerticalGroup(
            CordonAlturaYPerimetroEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CordonAlturaYPerimetroEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CordonAlturaYPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        CordonesNecesitanReparacionEscritorio.setTitle("Cordones que necesitan Reparación tanto Cercas como Muros");
        CordonesNecesitanReparacionEscritorio.setSize(new java.awt.Dimension(572, 300));

        CordonesNecesitanReparacionTexto.setEditable(false);
        CordonesNecesitanReparacionTexto.setColumns(20);
        CordonesNecesitanReparacionTexto.setRows(5);
        jScrollPane6.setViewportView(CordonesNecesitanReparacionTexto);

        CordonesNecesitanReparacionAceptar.setBackground(new java.awt.Color(51, 204, 0));
        CordonesNecesitanReparacionAceptar.setText("Aceptar");
        CordonesNecesitanReparacionAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CordonesNecesitanReparacionAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CordonesNecesitanReparacionLayout = new javax.swing.GroupLayout(CordonesNecesitanReparacion);
        CordonesNecesitanReparacion.setLayout(CordonesNecesitanReparacionLayout);
        CordonesNecesitanReparacionLayout.setHorizontalGroup(
            CordonesNecesitanReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CordonesNecesitanReparacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CordonesNecesitanReparacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CordonesNecesitanReparacionAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        CordonesNecesitanReparacionLayout.setVerticalGroup(
            CordonesNecesitanReparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CordonesNecesitanReparacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CordonesNecesitanReparacionAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CordonesNecesitanReparacionEscritorioLayout = new javax.swing.GroupLayout(CordonesNecesitanReparacionEscritorio.getContentPane());
        CordonesNecesitanReparacionEscritorio.getContentPane().setLayout(CordonesNecesitanReparacionEscritorioLayout);
        CordonesNecesitanReparacionEscritorioLayout.setHorizontalGroup(
            CordonesNecesitanReparacionEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CordonesNecesitanReparacionEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CordonesNecesitanReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CordonesNecesitanReparacionEscritorioLayout.setVerticalGroup(
            CordonesNecesitanReparacionEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CordonesNecesitanReparacionEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CordonesNecesitanReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GaritasYFicherosEscritorio.setTitle("Garitas asociadas a ficheros");
        GaritasYFicherosEscritorio.setSize(new java.awt.Dimension(493, 175));

        CrearArchivoTXTBoton.setBackground(new java.awt.Color(0, 153, 0));
        CrearArchivoTXTBoton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CrearArchivoTXTBoton.setText("Crear Archivo");
        CrearArchivoTXTBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearArchivoTXTBotonActionPerformed(evt);
            }
        });

        ConsultarArchivoTXTBoton.setBackground(new java.awt.Color(0, 0, 204));
        ConsultarArchivoTXTBoton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConsultarArchivoTXTBoton.setText("Consultar Archivo");
        ConsultarArchivoTXTBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarArchivoTXTBotonActionPerformed(evt);
            }
        });

        BorrarArchivoTXTBoton.setBackground(new java.awt.Color(255, 0, 0));
        BorrarArchivoTXTBoton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BorrarArchivoTXTBoton.setText("Borrar Archivo");
        BorrarArchivoTXTBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarArchivoTXTBotonActionPerformed(evt);
            }
        });

        BorrarYCrearTXT.setBackground(new java.awt.Color(204, 204, 0));
        BorrarYCrearTXT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BorrarYCrearTXT.setText("Borrar Y Crear");
        BorrarYCrearTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarYCrearTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GaritasYFicherosLayout = new javax.swing.GroupLayout(GaritasYFicheros);
        GaritasYFicheros.setLayout(GaritasYFicherosLayout);
        GaritasYFicherosLayout.setHorizontalGroup(
            GaritasYFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasYFicherosLayout.createSequentialGroup()
                .addComponent(CrearArchivoTXTBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultarArchivoTXTBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorrarYCrearTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorrarArchivoTXTBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GaritasYFicherosLayout.setVerticalGroup(
            GaritasYFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasYFicherosLayout.createSequentialGroup()
                .addGroup(GaritasYFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BorrarYCrearTXT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(CrearArchivoTXTBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConsultarArchivoTXTBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorrarArchivoTXTBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GaritasYFicherosEscritorioLayout = new javax.swing.GroupLayout(GaritasYFicherosEscritorio.getContentPane());
        GaritasYFicherosEscritorio.getContentPane().setLayout(GaritasYFicherosEscritorioLayout);
        GaritasYFicherosEscritorioLayout.setHorizontalGroup(
            GaritasYFicherosEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GaritasYFicherosEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritasYFicheros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        GaritasYFicherosEscritorioLayout.setVerticalGroup(
            GaritasYFicherosEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GaritasYFicherosEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GaritasYFicheros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        DatosDeGaritasTXTEscritorio.setTitle("Información de Garitas en el TXT");
        DatosDeGaritasTXTEscritorio.setSize(new java.awt.Dimension(407, 340));

        DatosDeGaritasTXTTexto.setColumns(20);
        DatosDeGaritasTXTTexto.setRows(5);
        jScrollPane7.setViewportView(DatosDeGaritasTXTTexto);

        DatosDeGaritasTXTBotonAceptar.setBackground(new java.awt.Color(153, 255, 153));
        DatosDeGaritasTXTBotonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DatosDeGaritasTXTBotonAceptar.setText("Aceptar");
        DatosDeGaritasTXTBotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosDeGaritasTXTBotonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosDeGaritasTXTLayout = new javax.swing.GroupLayout(DatosDeGaritasTXT);
        DatosDeGaritasTXT.setLayout(DatosDeGaritasTXTLayout);
        DatosDeGaritasTXTLayout.setHorizontalGroup(
            DatosDeGaritasTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosDeGaritasTXTLayout.createSequentialGroup()
                .addGroup(DatosDeGaritasTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosDeGaritasTXTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DatosDeGaritasTXTLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(DatosDeGaritasTXTBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        DatosDeGaritasTXTLayout.setVerticalGroup(
            DatosDeGaritasTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosDeGaritasTXTLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DatosDeGaritasTXTBotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DatosDeGaritasTXTEscritorioLayout = new javax.swing.GroupLayout(DatosDeGaritasTXTEscritorio.getContentPane());
        DatosDeGaritasTXTEscritorio.getContentPane().setLayout(DatosDeGaritasTXTEscritorioLayout);
        DatosDeGaritasTXTEscritorioLayout.setHorizontalGroup(
            DatosDeGaritasTXTEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosDeGaritasTXTEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosDeGaritasTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DatosDeGaritasTXTEscritorioLayout.setVerticalGroup(
            DatosDeGaritasTXTEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosDeGaritasTXTEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatosDeGaritasTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seguridad y Vigilancia");
        setLocation(new java.awt.Point(0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        InformacionTextoGrande.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        InformacionTextoGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InformacionTextoGrande.setText("Sistema de Seguridad Empresarial Interno");

        Operaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operaciones", "Cercas con Corriente y Mu +40cm", "Alt y Pe del Cordón", "Cordones Nece Reparación", "Garitas Nece Reparación", "Garitas Sin Luz", "Garitas No Cubiertas", "Total de Alarmas Necesarias", "Alarmas Nece Reparación", "Alarmas No Existen" }));
        Operaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperacionesMouseClicked(evt);
            }
        });
        Operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionesActionPerformed(evt);
            }
        });

        NuevoCordon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NuevoCordon.setText("Nuevo Cordón de Seguridad");
        NuevoCordon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoCordonActionPerformed(evt);
            }
        });

        NuevaGarita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NuevaGarita.setText("Nueva Garita");
        NuevaGarita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaGaritaActionPerformed(evt);
            }
        });

        NuevaCamara.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NuevaCamara.setText("Nueva Alarma De Seguridad");
        NuevaCamara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaCamaraMouseClicked(evt);
            }
        });
        NuevaCamara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaCamaraActionPerformed(evt);
            }
        });

        GaritasEnFicheroBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GaritasEnFicheroBoton.setText("Garitas en Fichero");
        GaritasEnFicheroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaritasEnFicheroBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InformacionTextoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(NuevoCordon, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(NuevaGarita, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(NuevaCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(GaritasEnFicheroBoton)
                        .addGap(346, 346, 346)
                        .addComponent(Operaciones, 0, 256, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(InformacionTextoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GaritasEnFicheroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevoCordon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaGarita, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaGaritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaGaritaActionPerformed
     GaritaEscritorio.setVisible(true);
     GaritaBotonAceptar.setEnabled(false);
     
    }//GEN-LAST:event_NuevaGaritaActionPerformed

    private void OperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionesActionPerformed
        if(Operaciones.getSelectedItem().equals("Alarmas No Existen")){
            
            AlarmasNoExisten.setVisible(true);
            if(empresas.alarmas.getLongitud()==0){
                AlarmasNoExistenTextoMostrar.setText("Aun no se han agregado alarmas para consultar estos datos");
              
            } else {
                int cantAlNoExisten=0;
                AlarmasNoExistenTextoMostrar.setText(null);
                
                for (int i = 0; i <empresas.alarmas.getLongitud(); i++) {
                    try {
                        if(!empresas.alarmas.Obtener(i).getExisteAlarma()){
                            cantAlNoExisten++;
                      AlarmasNoExistenTextoMostrar.setText("Hay un total de: ("+cantAlNoExisten+") Alarmas inexistentes\n");
                        } } catch (Exception ex) {
                        Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                cantAlNoExisten=0;
                for (int i = 0; i <empresas.alarmas.getLongitud(); i++) {
                   
                    try {
                        if(!empresas.alarmas.Obtener(i).getExisteAlarma()){
                            AlarmasNoExistenTextoMostrar.append(
                                     "# Plantilla: "+(((Alarma)empresas.alarmas.Obtener(i)).getPlantillaAlarma())
                                   + ", Estado: "+(((Alarma)empresas.alarmas.Obtener(i)).getEstadoAlarma())+"\n");
                            cantAlNoExisten++;
                        } else if(i==empresas.alarmas.getLongitud()-1 && cantAlNoExisten==0){
                          AlarmasNoExistenTextoMostrar.append("De las Alarmas agregadas todas existen");
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
            
        } else if(Operaciones.getSelectedItem().equals("Alarmas Nece Reparación")){
               AlarmasNecesitanReparacion.setVisible(true);
               if(empresas.alarmas.getLongitud()==0){
                 AlarmasNecesitanReparacionTexto.setText("Aun no se han agregado alarmas para consultar estos datos ");
               } else {
                   int cantAlNeRepa=0;
                   String existen="";
                 AlarmasNecesitanReparacionTexto.setText(null);
                 
                 for (int i = 0; i <empresas.alarmas.getLongitud(); i++) {
                    try {
                        if(!empresas.alarmas.Obtener(i).getExisteAlarma()){
                            cantAlNeRepa++;
                AlarmasNecesitanReparacionTexto.setText("Hay un total de: ("+cantAlNeRepa+") Alarmas que necesitan reparación\n");
                        } } catch (Exception ex) {
                        Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                cantAlNeRepa=0;
                 
                   for (int i = 0; i <empresas.alarmas.getLongitud(); i++) {
                     try {
                         if((((Alarma)empresas.alarmas.Obtener(i))).getExisteAlarma()==true){
                           existen="Si";
                         } else {
                            existen="No";
                         }
                         
                         if(empresas.alarmas.Obtener(i).getEstadoAlarma().equals("Mal")){
                      AlarmasNecesitanReparacionTexto.append(
                                 "# Pantilla: "+(((Alarma)empresas.alarmas.Obtener(i))).getPlantillaAlarma()
                               + ", Existencia: "+existen+"\n");
                      cantAlNeRepa++;
                         } else if(i==empresas.alarmas.getLongitud()-1 && cantAlNeRepa==0){
                           AlarmasNecesitanReparacionTexto.append("Todas las alarmas agregadas hasta ahora poseen estado Bien o Regular");
                         }
                     } catch (Exception ex) {
                         Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                     }
                   }
               }
        } else if(Operaciones.getSelectedItem().equals("Garitas Sin Luz")){
            GaritasSinLuzEscritorio.setVisible(true);
            if(empresas.garitas.getLongitud()==0){
              GaritasSinLuzTexto.setText("Aun no se han agregado garitas para poder consultar datos sobre ellas");
            } else {
              int cantGaSinLuz=0;
              String personal="";
              GaritasSinLuzTexto.setText(null);
              
                for (int i = 0; i <empresas.garitas.getLongitud(); i++) {
                  try {
                      if(!empresas.garitas.Obtener(i).getIluminadaGarita()){
                          cantGaSinLuz++;
                          GaritasSinLuzTexto.setText("Hay un total de: ("+cantGaSinLuz+") Garitas sin luz\n");
                      }
                  } catch (Exception ex) {
                      Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                  }
                }
              
                cantGaSinLuz=0;
                for (int i = 0; i <empresas.garitas.getLongitud(); i++) {
                  try {
                      if(empresas.garitas.Obtener(i).getPresentaPersonal()==true){
                        personal="Si";
                      } else {
                        personal="No";
                      }
                      
                      if(!empresas.garitas.Obtener(i).getIluminadaGarita()){
                          GaritasSinLuzTexto.append(
                                  "# Plantilla: "+empresas.garitas.Obtener(i).getNumeracion()
                                 +", Estado: "+empresas.garitas.Obtener(i).getEstadoGarita()
                                 +", Personal: "+personal+"\n");
                          cantGaSinLuz++;
                      } else if(i==empresas.garitas.getLongitud()-1 && cantGaSinLuz==0){
                        GaritasSinLuzTexto.append("Todas las garitas agregadas hasta ahora poseen iluminación ");
                      }
                  } catch (Exception ex) {
                      Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                  }
                }
            }
        } else if(Operaciones.getSelectedItem().equals("Total de Alarmas Necesarias")){
          if(empresas.garitas.getLongitud()!=0){
            JOptionPane.showMessageDialog(null,"Es necesario instalar un total de ("+(empresas.garitas.getLongitud()-empresas.alarmas.getLongitud())+") Alarmas");
          } else {
             JOptionPane.showMessageDialog(null, "Aun no se han añadido los datos necesarios "
                                           + "para el servicio solicitado ");
          }
          
        } else if(Operaciones.getSelectedItem().equals("Garitas No Cubiertas")){
           GaritasNoCubiertasEscritorio.setVisible(true);
           if(empresas.garitas.getLongitud()==0){
             GaritasNoCubiertasTexto.setText("Aún no se han agregado datos de garitas para solicitar este servicio ");
           } else {
               GaritasNoCubiertasTexto.setText(null);
               int cantGaNoCub=0;
               String iluminacion="";
               for (int i = 0; i <empresas.garitas.getLongitud(); i++) {
                   try {
                       if(!empresas.garitas.Obtener(i).getPresentaPersonal()){
                           cantGaNoCub++;
                       }
                   } catch (Exception ex) {
                       Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
               
               GaritasNoCubiertasTexto.setText("Hay un total de "+cantGaNoCub+" garitas sin personal\n ");
               
               cantGaNoCub=0;
               for (int i = 0; i <empresas.garitas.getLongitud(); i++) {
                   try {
                       if(empresas.garitas.Obtener(i).getIluminadaGarita()){
                         iluminacion="Si";
                       } else {
                         iluminacion="No";
                       }
                       if(!empresas.garitas.Obtener(i).getPresentaPersonal()){
                           GaritasNoCubiertasTexto.append(
                                   "# Plantilla: "+empresas.garitas.Obtener(i).getNumeracion()
                                  +", Iluminación: "+iluminacion
                                  +", Estado: "+empresas.garitas.Obtener(i).getEstadoGarita()+"\n");
                           cantGaNoCub++;
                       } else if(i==empresas.garitas.getLongitud()-1 && cantGaNoCub==0){
                         GaritasNoCubiertasTexto.append("Todas las garitas agregadas hasta ahora poseen Personal");
                       }
                   } catch (Exception ex) {
                       Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
           }
        } else if(Operaciones.getSelectedItem().equals("Garitas Nece Reparación")){
          GaritasNecesitanReparacionEscritorio.setVisible(true);
          if(empresas.garitas.getLongitud()==0){
            GaritasNecesitanReparacionTexto.setText("Aun no se han agregado datos de garitas para consultar esta opción ");
          } else {
              GaritasNecesitanReparacionTexto.setText(null);
              int cantGaNeceRep=0;
              String iluminada="", personal="";
              
              for (int i = 0; i <empresas.garitas.getLongitud(); i++) {
                  try {
                      if(empresas.garitas.Obtener(i).getEstadoGarita().equals("Mal")){
                          cantGaNeceRep++;
                      }
                  } catch (Exception ex) {
                      Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
              
              GaritasNecesitanReparacionTexto.setText("Hay un total de "+cantGaNeceRep+" garitas en total que necesitan reparación\n ");
              
              cantGaNeceRep=0;
              for (int i = 0; i <empresas.garitas.getLongitud(); i++) {
                  try {
                      
                      if(empresas.garitas.Obtener(i).getIluminadaGarita()){
                        iluminada="Si";
                      } else {
                        iluminada="No";
                      }
                      if(empresas.garitas.Obtener(i).getPresentaPersonal()){
                        personal="Si";
                      } else {
                        personal="No";
                      }
                      
                      if(empresas.garitas.Obtener(i).getEstadoGarita().equals("Mal")){
                          GaritasNecesitanReparacionTexto.append("# Plantilla: "+empresas.garitas.Obtener(i).getNumeracion()
                                                                +", Iluminación: "+iluminada
                                                                +", Personal: "+personal+"\n");
                          cantGaNeceRep++;
                      } else if(i==empresas.garitas.getLongitud()-1 && cantGaNeceRep==0){
                        GaritasNecesitanReparacionTexto.append("Todas lasgaritas agregadas hasta ahora poseen estado Bien o Regular,"
                                                             + " No necesitan Reparacion");
                      }
                  } catch (Exception ex) {
                      Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
              
          }
        } else if(Operaciones.getSelectedItem().equals("Cercas con Corriente y Mu +40cm")){
          int cantCerSinCo=0;
          int cantMurMas40=0;
            if(cercas.getLongitud()==0 && muros.getLongitud()==0){
              JOptionPane.showMessageDialog(null, "Aún no hay Cercas ni Muros agregados para esta acción");
            } else if(cercas.getLongitud()!=0 && muros.getLongitud()==0){
                for (int i = 0; i <cercas.getLongitud(); i++) {
                    try {
                        if(!cercas.Obtener(i).getCorrienteCerca()){
                            cantCerSinCo++;
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                JOptionPane.showMessageDialog(null, "Hay un total de ("+cantCerSinCo
                                              +") Cercas sin corriente pero aún no se han agregado Muros");
            } else if(cercas.getLongitud()==0 && muros.getLongitud()!=0){
                for (int i = 0; i <muros.getLongitud(); i++) {
                    try {
                        if(muros.Obtener(i).getGrosorMuro()>40){
                            cantMurMas40++;
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                JOptionPane.showMessageDialog(null, "Hay un total de ("+cantMurMas40
                                   +") de Muros con grosor superior a los 40 CM y pero aún no se han agregado Cercas");
            } else if(cercas.getLongitud()!=0 && muros.getLongitud()!=0){
              for (int i = 0; i <cercas.getLongitud(); i++) {
                    try {
                        if(!cercas.Obtener(i).getCorrienteCerca()){
                            cantCerSinCo++;
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
              
              for (int i = 0; i <muros.getLongitud(); i++) {
                    try {
                        if(muros.Obtener(i).getGrosorMuro()>40){
                            cantMurMas40++;
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
              JOptionPane.showMessageDialog(null, "Hay un total de ("+cantCerSinCo
                      +") Cercas sin corriente y ("+cantMurMas40+") Muros con más de 40 CM de grosor");
            }
            
        } else if(Operaciones.getSelectedItem().equals("Alt y Pe del Cordón")){
            CordonABuscarBuscar.setEnabled(false);
            CordonAlturaYPerimetroEscritorio.setVisible(true);
        } else if(Operaciones.getSelectedItem().equals("Cordones Nece Reparación")){
            if(empresas.cordones.getLongitud()==0){
              JOptionPane.showMessageDialog(null,"No se han agregado Cordones de Seguiridad no puede acceder aquí ");
            } else {
                int cantCorNeRepa=0;
            CordonesNecesitanReparacionEscritorio.setVisible(true);
            CordonesNecesitanReparacionTexto.setText(null);
                for (int i = 0; i <empresas.cordones.getLongitud(); i++) {
                try {
                    if(empresas.cordones.Obtener(i).getEstadoCord().equals("Mal")){
                       
                        CordonesNecesitanReparacionTexto.append("Cordón # ("+(i+1)+") en agregarse "
                                +", con altura de: ("+empresas.cordones.Obtener(i).getAlturaCord()
                                +") metros , y un perímetro de: ("+empresas.cordones.Obtener(i).getPerimetroCord()+") metros \n");
                      cantCorNeRepa++;
                    } else if(i==empresas.cordones.getLongitud()-1 && cantCorNeRepa==0){
                      CordonesNecesitanReparacionTexto.setText("Los cordones agregados hasta ahora no necesitan reparación\n");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
        }
    }//GEN-LAST:event_OperacionesActionPerformed

    private void NuevaCamaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaCamaraActionPerformed
        
        AlarmaEscritorio.setVisible(true);
        AlarmaBotonAceptar.setEnabled(false);
    }//GEN-LAST:event_NuevaCamaraActionPerformed

    private void NuevaCamaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaCamaraMouseClicked
             
    }//GEN-LAST:event_NuevaCamaraMouseClicked

    private void AlarmaBotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmaBotonAceptarActionPerformed
        
        Integer AlarmaNumeroPlantillaNumero=Integer.parseInt(AlarmaNumPlantilla.getText());
        int verificarSiExisteNumeroPlantilla=0;
        for (int i = 0; i <alarmas.getLongitud(); i++) {
            try {
                if(alarmas.Obtener(i).getPlantillaAlarma()==AlarmaNumeroPlantillaNumero){
                    verificarSiExisteNumeroPlantilla++;
                }
            } catch (Exception ex) {
                Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(verificarSiExisteNumeroPlantilla!=0){
        JOptionPane.showMessageDialog(null, "Ya hay una cerca con ese número de plantilla por favor rectifique");
        } else {
        int alarmasSinEstado=AlarmaEstado.getSelectedIndex(); 
          if(alarmasSinEstado==0){
             estadoAlarma="No disponible";
          }
        
        
        Alarma nueva=new Alarma(AlarmaNumeroPlantillaNumero,AlarmaExiste,estadoAlarma);
        alarmas.add(nueva);
        JOptionPane.showMessageDialog(null, "Alarma añadida con exito");
       AlarmaEscritorio.setVisible(false);
    }
       
    }//GEN-LAST:event_AlarmaBotonAceptarActionPerformed

    private void AlarmaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmaEstadoActionPerformed
        ActivarBotonAlarma();
        if(AlarmaEstado.getSelectedItem().equals("Bien")){
            estadoAlarma="Bien";
        } else if(AlarmaEstado.getSelectedItem().equals("Regular")){
            estadoAlarma="Regular";
        } else if(AlarmaEstado.getSelectedItem().equals("Mal")){
            estadoAlarma="Mal";
        }
    }//GEN-LAST:event_AlarmaEstadoActionPerformed

    private void GaritaPersonalNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritaPersonalNoActionPerformed
        ActivarBotonGarita();
        garitaPersonal=false;
    }//GEN-LAST:event_GaritaPersonalNoActionPerformed

    private void GaritaNumeracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritaNumeracionActionPerformed
        ActivarBotonGarita();
    }//GEN-LAST:event_GaritaNumeracionActionPerformed

    private void EscojerCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscojerCercaActionPerformed
        CercaAceptar.setEnabled(false);
        CercaNueva.setVisible(true);
    }//GEN-LAST:event_EscojerCercaActionPerformed

    private void NuevoCordonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoCordonActionPerformed
        EscojerCercaOMuro.setVisible(true);
    }//GEN-LAST:event_NuevoCordonActionPerformed

    private void CercaAlturaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercaAlturaMActionPerformed
        ActivarBotonCerca();
    }//GEN-LAST:event_CercaAlturaMActionPerformed

    private void CercaPerimetroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercaPerimetroMActionPerformed
        ActivarBotonCerca();
    }//GEN-LAST:event_CercaPerimetroMActionPerformed

    private void CercaCorrieteSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercaCorrieteSiActionPerformed
        ActivarBotonCerca();
        cercaPoseeCorriente=true;
    }//GEN-LAST:event_CercaCorrieteSiActionPerformed

    private void CercaTipoAlambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercaTipoAlambreActionPerformed
        ActivarBotonCerca();
    }//GEN-LAST:event_CercaTipoAlambreActionPerformed

    private void CercaAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercaAceptarActionPerformed
        String cercaTipoAlambre="";
        Double cercaPerimetro=Double.parseDouble(CercaPerimetroM.getText());
        Double cercaAltura=Double.parseDouble(CercaAlturaM.getText());
        cercaTipoAlambre=CercaTipoAlambre.getText();
        
        if(cercaTipoAlambre.equals("")){
            
            int condicion=0;
            
            do{
          String opcion=JOptionPane.showInputDialog("¿Desea agregar una Cerca sin especificar el tipo de ALAMBRE? \n (1) Si \n (2) No");
             if(opcion==null){
                 // Cierra toda la interface grafica de Java
                 System.exit(0);
            } else if(opcion.equals("")){
              condicion=10;
              JOptionPane.showMessageDialog(null, "Debe escojer opción (1) o (2)");
            } else if(opcion.equals("1")){
              condicion=1;
            } else if(opcion.equals("2")){
              condicion=2;
            } else {
              JOptionPane.showMessageDialog(null, "Debe escojer opción (1) o (2)");
              condicion=10;
            }
            } while(condicion==10);
               switch(condicion){
                 case 1: cercaTipoAlambre="No especificado";
                         break;
                 case 2: String tipoDeAlambre=JOptionPane.showInputDialog("Ingrese el tipo de ALAMBRE que posee la Cerca");
                         cercaTipoAlambre=tipoDeAlambre;
                         break;
             }
        
        }
        
        Cerca nueva=new Cerca(cercaTipoAlambre,cercaPoseeCorriente,cercaPerimetro,cercaAltura,estadoCerca); 
        cercas.add(nueva);
        Cordon nuevoCordon=new Cordon(cercaPerimetro,cercaAltura,estadoCerca);
        cordones.add(nuevoCordon);
        JOptionPane.showMessageDialog(null, "Nueva Cerca Añadida con Exito");
        CercaNueva.setVisible(false);
        EscojerCercaOMuro.setVisible(false);
    }//GEN-LAST:event_CercaAceptarActionPerformed

    private void CercaNuevaPanelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaNuevaPanelKeyReleased
       if(evt.getKeyChar()=='\n'){
       CercaAceptar.doClick();
       }
    }//GEN-LAST:event_CercaNuevaPanelKeyReleased

    private void CercaNuevaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaNuevaKeyReleased
        System.out.println("hola de JFrame");    
        if(evt.getKeyChar()=='\n'){
       CercaAceptar.doClick();
       }
    }//GEN-LAST:event_CercaNuevaKeyReleased

    private void CercaNuevaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaNuevaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CercaNuevaKeyPressed

    private void CercaNuevaPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaNuevaPanelKeyPressed
     
    }//GEN-LAST:event_CercaNuevaPanelKeyPressed

    private void CercaAceptarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaAceptarKeyReleased
       
    }//GEN-LAST:event_CercaAceptarKeyReleased

    private void CercaAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaAceptarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CercaAceptarKeyPressed

    private void EscojerMuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscojerMuroActionPerformed
        MuroBotonAceptar.setEnabled(false);
        MuroNuevoEscritorio.setVisible(true);
    }//GEN-LAST:event_EscojerMuroActionPerformed

    private void MuroAlturaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuroAlturaMActionPerformed
        
    }//GEN-LAST:event_MuroAlturaMActionPerformed

    private void MuroMaterialFabricacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuroMaterialFabricacionActionPerformed
       
    }//GEN-LAST:event_MuroMaterialFabricacionActionPerformed

    private void AlarmaExisteNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmaExisteNoActionPerformed
              estadoAlarma="No disponible";
              ActivarBotonAlarma();
              AlarmaExiste=false;
              AlarmaEstado.setEnabled(false);
    }//GEN-LAST:event_AlarmaExisteNoActionPerformed

    private void AlarmaNumPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmaNumPlantillaActionPerformed
       ActivarBotonAlarma();
    }//GEN-LAST:event_AlarmaNumPlantillaActionPerformed

    private void OperacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperacionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OperacionesMouseClicked

    private void AlarmaExisteSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmaExisteSiActionPerformed
            ActivarBotonAlarma();
               AlarmaExiste=true;
               AlarmaEstado.setEnabled(true);
              
    }//GEN-LAST:event_AlarmaExisteSiActionPerformed

    private void AlarmasNoExistenTextoMostrarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_AlarmasNoExistenTextoMostrarComponentAdded
       
    }//GEN-LAST:event_AlarmasNoExistenTextoMostrarComponentAdded

    private void AlarmasNoExistenTextoMostrarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AlarmasNoExistenTextoMostrarAncestorAdded
        
    }//GEN-LAST:event_AlarmasNoExistenTextoMostrarAncestorAdded

    private void AlarmaNoExistenBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmaNoExistenBorrarDatosActionPerformed
        if(alarmas.getLongitud()!=0){
            for (int i = 0; i <alarmas.getLongitud(); i++) {
                try {
                   if(!alarmas.Obtener(i).getExisteAlarma()){
                     alarmas.Eliminar(i);
                   }
                } catch (Exception ex) {
                    Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "Todos los datos de alarmas Inexistentes "
                                           + "\n agregados han sido borrados con exito");
            AlarmasNoExisten.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos que borrar");
            AlarmasNoExisten.setVisible(false);
        }
    }//GEN-LAST:event_AlarmaNoExistenBorrarDatosActionPerformed

    private void AlarmaNoExistenAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmaNoExistenAceptarActionPerformed
        AlarmasNoExisten.setVisible(false);
    }//GEN-LAST:event_AlarmaNoExistenAceptarActionPerformed

    private void AlarmasNecesitanReparacionAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmasNecesitanReparacionAceptarActionPerformed
          AlarmasNecesitanReparacion.setVisible(false);
    }//GEN-LAST:event_AlarmasNecesitanReparacionAceptarActionPerformed

    private void AlarmasNecesitanReparacionBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmasNecesitanReparacionBorrarActionPerformed
        if(alarmas.getLongitud()!=0){
            for (int i = 0; i <alarmas.getLongitud();i++) {
                try {
                   if(alarmas.Obtener(i).getEstadoAlarma().equals("Mal")){
                     alarmas.Eliminar(i);
                   }
                } catch (Exception ex) {
                    Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "Todos los datos de alarmas que necesitan Reparación "
                                                           + "\n agregados han sido borrados con exito");
            AlarmasNecesitanReparacion.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos que borrar");
            AlarmasNecesitanReparacion.setVisible(false);
        }
    }//GEN-LAST:event_AlarmasNecesitanReparacionBorrarActionPerformed

    private void GaritaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritaEstadoActionPerformed
           ActivarBotonGarita();
        if(GaritaEstado.getSelectedItem().equals("Bien")){
               estadoGarita="Bien";
          } else if(GaritaEstado.getSelectedItem().equals("Regular")){
             estadoGarita="Regular";
          } else if(GaritaEstado.getSelectedItem().equals("Mal")){
              estadoGarita="Mal";
          }
    }//GEN-LAST:event_GaritaEstadoActionPerformed

    private void GaritaEstaIluminadaSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritaEstaIluminadaSiActionPerformed
        ActivarBotonGarita();
        garitaIluminada=true;
    }//GEN-LAST:event_GaritaEstaIluminadaSiActionPerformed

    private void GaritaEstaIliminadaNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritaEstaIliminadaNoActionPerformed
        ActivarBotonGarita();
        garitaIluminada=false;
    }//GEN-LAST:event_GaritaEstaIliminadaNoActionPerformed

    private void GaritaPersonalSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritaPersonalSiActionPerformed
       ActivarBotonGarita();
        garitaPersonal=true;
    }//GEN-LAST:event_GaritaPersonalSiActionPerformed

    private void GaritaBotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritaBotonAceptarActionPerformed
       Integer GaritaNumeroAsignado=Integer.parseInt(GaritaNumeracion.getText());
       int verificarExisteNumeroGarita=0;
       
        for (int i = 0; i <garitas.getLongitud(); i++) {
           try {
               if(garitas.Obtener(i).getNumeracion()==GaritaNumeroAsignado){
                   verificarExisteNumeroGarita++;
               }
           } catch (Exception ex) {
               Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
       if(verificarExisteNumeroGarita!=0){
       JOptionPane.showMessageDialog(null, "Ya hay una garita con ese número de plantilla , por favor rectifica");
       } else {
       Garita nueva=new Garita(GaritaNumeroAsignado,garitaIluminada,garitaPersonal,estadoGarita);
       garitas.add(nueva);
       if(garitas.getLongitud()!=0){
         GaritasEnFicheroBoton.setEnabled(true);
       }
       JOptionPane.showMessageDialog(null, "Nueva Garita agregada con Exito");
       GaritaEscritorio.setVisible(false);
       }
       
    }//GEN-LAST:event_GaritaBotonAceptarActionPerformed

    private void GaritasSinLuzBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritasSinLuzBorrarDatosActionPerformed
        if(garitas.getLongitud()!=0){
            for (int i = 0; i <garitas.getLongitud();i++) {
                try {
                   if(!garitas.Obtener(i).getIluminadaGarita()){
                     garitas.Eliminar(i);
                   }
                } catch (Exception ex) {
                    Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "Todos los datos de Garitas que necesitan Iluminación "
                                                           + "\n agregados ya han sido borrados");
            GaritasSinLuzEscritorio.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos de Garitas que borrar");
            GaritasSinLuzEscritorio.setVisible(false);
        }
    }//GEN-LAST:event_GaritasSinLuzBorrarDatosActionPerformed

    private void GaritasSinLuzAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritasSinLuzAceptarActionPerformed
        GaritasSinLuzEscritorio.setVisible(false);
    }//GEN-LAST:event_GaritasSinLuzAceptarActionPerformed

    private void GaritasNoCubiertasBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritasNoCubiertasBorrarDatosActionPerformed
       if(garitas.getLongitud()!=0){
            for (int i = 0; i <garitas.getLongitud();i++) {
                try {
                   if(!garitas.Obtener(i).getPresentaPersonal()){
                     garitas.Eliminar(i);
                   }
                } catch (Exception ex) {
                    Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "Todos los datos de Garitas que necesitan Personal "
                                                           + "\n agregados ya han sido borrados");
            GaritasNoCubiertasEscritorio.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos de Garitas que borrar");
            GaritasNoCubiertasEscritorio.setVisible(false);
        }
    }//GEN-LAST:event_GaritasNoCubiertasBorrarDatosActionPerformed

    private void GaritasNoCubiertasAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritasNoCubiertasAceptarActionPerformed
        GaritasNoCubiertasEscritorio.setVisible(false);
    }//GEN-LAST:event_GaritasNoCubiertasAceptarActionPerformed

    private void GaritasNecesitanReparacionAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritasNecesitanReparacionAceptarActionPerformed
        GaritasNecesitanReparacionEscritorio.setVisible(false);
    }//GEN-LAST:event_GaritasNecesitanReparacionAceptarActionPerformed

    private void GaritasNecesitanReparacionBorrardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritasNecesitanReparacionBorrardatosActionPerformed
        if(garitas.getLongitud()!=0){
            for (int i = 0; i <garitas.getLongitud();i++) {
                try {
                   if(garitas.Obtener(i).getEstadoGarita().equals("Mal")){
                     garitas.Eliminar(i);
                   }
                } catch (Exception ex) {
                    Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JOptionPane.showMessageDialog(null, "Todos los datos de Garitas que necesitan Reparación "
                                                           + "\n agregados ya han sido borrados");
            GaritasNecesitanReparacionEscritorio.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos de Garitas que borrar");
            GaritasNecesitanReparacionEscritorio.setVisible(false);
        }
    }//GEN-LAST:event_GaritasNecesitanReparacionBorrardatosActionPerformed

    private void CercaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercaEstadoActionPerformed
         ActivarBotonCerca();
        if(CercaEstado.getSelectedItem().equals("Bien")){
          estadoCerca="Bien";
        } else if(CercaEstado.getSelectedItem().equals("Regular")){
          estadoCerca="Regular";
        } else if(CercaEstado.getSelectedItem().equals("Mal")){
          estadoCerca="Mal";
        }
    }//GEN-LAST:event_CercaEstadoActionPerformed

    private void CeracaCorrieteNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeracaCorrieteNoActionPerformed
        ActivarBotonCerca();
        cercaPoseeCorriente=false;
    }//GEN-LAST:event_CeracaCorrieteNoActionPerformed

    private void MuroEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuroEstadoActionPerformed
          ActivarBotonMuro();
        if(MuroEstado.getSelectedItem().equals("Bien")){
          estadoMuro="Bien";
        } else if(MuroEstado.getSelectedItem().equals("Regular")){
          estadoMuro="Regular";
        } else if(MuroEstado.getSelectedItem().equals("Mal")){
          estadoMuro="Mal";
        }
    }//GEN-LAST:event_MuroEstadoActionPerformed

    private void MuroPerimetroMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuroPerimetroMActionPerformed
      
    }//GEN-LAST:event_MuroPerimetroMActionPerformed

    private void MuroGrosorCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuroGrosorCMActionPerformed
       
    }//GEN-LAST:event_MuroGrosorCMActionPerformed

    private void MuroBotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuroBotonAceptarActionPerformed
        String muroMaterial="";
        Double muroGrosor=Double.parseDouble(MuroGrosorCM.getText());
        Double muroAltura=Double.parseDouble(MuroAlturaM.getText());
        Double muroPerimetro=Double.parseDouble(MuroPerimetroM.getText());
        muroMaterial=MuroMaterialFabricacion.getText();
        
        if(muroMaterial.equals("")){
            
            int condicion=0;
            
            do{
          String opcion=JOptionPane.showInputDialog("¿Desea agregar un Muro sin especificar el tipo de MATERIAL?\n (1) Si \n (2) No");
            if(opcion==null){
                // Cierra toda la interface de Java
              System.exit(0);
              
            } else if(opcion.equals("")){
              condicion=10;
              JOptionPane.showMessageDialog(null, "Debe escojer opción (1) o (2)");
            } else if(opcion.equals("1")){
              condicion=1;
            } else if(opcion.equals("2")){
              condicion=2;
            } else {
              JOptionPane.showMessageDialog(null, "Debe escojer opción (1) o (2)");
              condicion=10;
            }
            } while(condicion==10);
               switch(condicion){
                 case 1: muroMaterial="No especificado";
                         break;
                 case 2: String tipoDeAlambre=JOptionPane.showInputDialog("Ingrese el tipo de MATERIAL que posee el Muro");
                         muroMaterial=tipoDeAlambre;
                         break;
             }
        
        }
        
        Muro nuevo=new Muro(muroGrosor,muroMaterial,muroPerimetro,muroAltura,estadoMuro);
        muros.add(nuevo);
        Cordon nuevoCordon=new Cordon(muroPerimetro,muroAltura,estadoMuro);
        cordones.add(nuevoCordon);
        JOptionPane.showMessageDialog(null, "Nuevo Muro agregado con exito");
        MuroNuevoEscritorio.setVisible(false);
        EscojerCercaOMuro.setVisible(false);
        System.out.println("material "+muroMaterial);
        System.out.println("cantidad: "+muros.getLongitud());
    }//GEN-LAST:event_MuroBotonAceptarActionPerformed

    private void CordonABuscarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CordonABuscarTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CordonABuscarTextoActionPerformed

    private void CordonABuscarAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CordonABuscarAceptarActionPerformed
       CordonAlturaYPerimetroEscritorio.setVisible(false);
    }//GEN-LAST:event_CordonABuscarAceptarActionPerformed

    private void CordonABuscarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CordonABuscarBuscarActionPerformed
        Integer CordonABuscar=Integer.parseInt(CordonABuscarTexto.getText());
        if(cordones.getLongitud()==0){
         JOptionPane.showMessageDialog(null, "Aún no se han agregado cordones para poder hacer esta acción");
        }else {
            
        for (int i = 0; i <cordones.getLongitud(); i++) {
            if(CordonABuscar-1==i){
                try {
                    CordonABuscarAreaDeTexto.append("Datos del Cordón>>> Altura: "+empresas.cordones.Obtener(i).getAlturaCord()
                    +", Perímetro : "+empresas.cordones.Obtener(i).getPerimetroCord()+"\n");
                } catch (Exception ex) {
                    Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if(i==cordones.getLongitud()-1 && CordonABuscar-1!=i){
              CordonABuscarAreaDeTexto.append("No hay ningún Cordón de Seguridad con ese número\n ");
            }
        }
    } 
        
    }//GEN-LAST:event_CordonABuscarBuscarActionPerformed

    private void CordonesNecesitanReparacionAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CordonesNecesitanReparacionAceptarActionPerformed
       CordonesNecesitanReparacionEscritorio.setVisible(false);
    }//GEN-LAST:event_CordonesNecesitanReparacionAceptarActionPerformed

    private void AlarmaNumPlantillaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AlarmaNumPlantillaFocusLost
       
    }//GEN-LAST:event_AlarmaNumPlantillaFocusLost

    private void AlarmaNumPlantillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaNumPlantillaKeyTyped
     //   ActivarBotonAlarma();
        int soloNumeros=evt.getKeyChar();
         char atras=evt.getKeyChar();
         String todoElTexto=AlarmaNumPlantilla.getText();
         int longitudTodoElTexto=todoElTexto.length();
         // Verifica que los datos del cuadro de texto esten etre 0 y 9 o se puedan dar atras (borrar)
         boolean verificar=soloNumeros >=48 && soloNumeros <=57 || atras=='\b' || atras=='\n';
         // Otra forma es crear otra variable booleana que veriique si es el numero 8 que es lo mismo que \b
         if(!verificar){
           JOptionPane.showMessageDialog(null, "Solo se permiten números enteros");
           evt.consume();
         } else if(verificar){
             if(longitudTodoElTexto==0 && atras=='\n'){
               JOptionPane.showMessageDialog(null, "Antes de continuar por favor ingrese datos en el campo");
             }
         }
         
    }//GEN-LAST:event_AlarmaNumPlantillaKeyTyped

    private void AlarmaNumPlantillaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaNumPlantillaKeyReleased
        ActivarBotonAlarma();
    }//GEN-LAST:event_AlarmaNumPlantillaKeyReleased

    private void AlarmaBotonAceptarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaBotonAceptarKeyReleased
      
    }//GEN-LAST:event_AlarmaBotonAceptarKeyReleased

    private void AlarmaNuevaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaNuevaKeyReleased
        
    }//GEN-LAST:event_AlarmaNuevaKeyReleased

    private void AlarmaEscritorioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaEscritorioKeyReleased
       
    }//GEN-LAST:event_AlarmaEscritorioKeyReleased

    private void AlarmaBotonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaBotonAceptarKeyPressed
     
    }//GEN-LAST:event_AlarmaBotonAceptarKeyPressed

    private void AlarmaNumPlantillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaNumPlantillaKeyPressed
      //  ActivarBotonAlarma();
        if(AlarmaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            AlarmaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_AlarmaNumPlantillaKeyPressed

    private void AlarmaExisteSiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaExisteSiKeyPressed
        ActivarBotonAlarma();
        if(AlarmaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
          AlarmaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_AlarmaExisteSiKeyPressed

    private void AlarmaExisteNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaExisteNoKeyPressed
        ActivarBotonAlarma();
        if(AlarmaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
          AlarmaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_AlarmaExisteNoKeyPressed

    private void AlarmaEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlarmaEstadoKeyPressed
       ActivarBotonAlarma();
        if(AlarmaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER 
           && AlarmaEstado.getSelectedIndex()!=0){
          AlarmaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_AlarmaEstadoKeyPressed

    private void GaritaNumeracionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaNumeracionKeyPressed
       if(GaritaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            GaritaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_GaritaNumeracionKeyPressed

    private void GaritaNumeracionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaNumeracionKeyReleased
       ActivarBotonGarita();
    }//GEN-LAST:event_GaritaNumeracionKeyReleased

    private void GaritaNumeracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaNumeracionKeyTyped
         int soloNumeros=evt.getKeyChar();
         char atras=evt.getKeyChar();
         String todoElTexto=GaritaNumeracion.getText();
         int longitudTodoElTexto=todoElTexto.length();
         // Verifica que los datos del cuadro de texto esten etre 0 y 9 o se puedan dar atras (borrar)
         boolean verificar=soloNumeros >=48 && soloNumeros <=57 || atras=='\b' || atras=='\n';
         // Otra forma es crear otra variable booleana que veriique si es el numero 8 que es lo mismo que \b
         if(!verificar){
           JOptionPane.showMessageDialog(null, "Solo se permiten números enteros");
           evt.consume();
         } else if(verificar){
             if(longitudTodoElTexto==0 && atras=='\n'){
               JOptionPane.showMessageDialog(null, "Antes de continuar por favor ingrese datos en el campo");
             }
         }
         
    }//GEN-LAST:event_GaritaNumeracionKeyTyped

    private void GaritaEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaEstadoKeyPressed
        if(GaritaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER 
           && GaritaEstado.getSelectedIndex()!=0){
          GaritaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_GaritaEstadoKeyPressed

    private void GaritaEstaIluminadaSiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaEstaIluminadaSiKeyPressed
      if(GaritaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
          GaritaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_GaritaEstaIluminadaSiKeyPressed

    private void GaritaEstaIluminadaSiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaEstaIluminadaSiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_GaritaEstaIluminadaSiKeyReleased

    private void GaritaEstaIliminadaNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaEstaIliminadaNoKeyPressed
        if(GaritaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
          GaritaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_GaritaEstaIliminadaNoKeyPressed

    private void GaritaPersonalSiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaPersonalSiKeyPressed
        if(GaritaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
          GaritaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_GaritaPersonalSiKeyPressed

    private void GaritaPersonalNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GaritaPersonalNoKeyPressed
       if(GaritaBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
          GaritaBotonAceptar.doClick();
        }
    }//GEN-LAST:event_GaritaPersonalNoKeyPressed

    private void CercaEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaEstadoKeyPressed
        if(CercaAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER 
           && CercaEstado.getSelectedIndex()!=0){
          CercaAceptar.doClick();
        }
    }//GEN-LAST:event_CercaEstadoKeyPressed

    private void CercaAlturaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaAlturaMKeyTyped
         int soloNumeros=evt.getKeyChar();
         char atras=evt.getKeyChar();
         String todoElTexto=CercaAlturaM.getText();
         int longitudTodoElTexto=todoElTexto.length();
         // Verifica que los datos del cuadro de texto esten etre 0 y 9 o se puedan dar atras (borrar)
         boolean verificar=soloNumeros >=48 && soloNumeros <=57 || atras=='\b' || atras=='\n' || atras=='.';
         // Otra forma es crear otra variable booleana que veriique si es el numero 8 que es lo mismo que \b
         if(!verificar){
           JOptionPane.showMessageDialog(null, "Solo se permiten números");
           evt.consume();
         } else if(verificar){
             if(longitudTodoElTexto==0 && atras=='\n'){
               JOptionPane.showMessageDialog(null, "Antes de continuar por favor ingrese datos en el campo de la Altura");
             }
         }
         
    }//GEN-LAST:event_CercaAlturaMKeyTyped

    private void CercaAlturaMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaAlturaMKeyReleased
        ActivarBotonCerca();
    }//GEN-LAST:event_CercaAlturaMKeyReleased

    private void CercaPerimetroMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaPerimetroMKeyReleased
        ActivarBotonCerca();
    }//GEN-LAST:event_CercaPerimetroMKeyReleased

    private void CercaTipoAlambreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaTipoAlambreKeyReleased
        ActivarBotonCerca();
    }//GEN-LAST:event_CercaTipoAlambreKeyReleased

    private void CercaAlturaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaAlturaMKeyPressed
       if(CercaAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            CercaAceptar.doClick();
        }
    }//GEN-LAST:event_CercaAlturaMKeyPressed

    private void CercaPerimetroMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaPerimetroMKeyPressed
        if(CercaAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            CercaAceptar.doClick();
        }
    }//GEN-LAST:event_CercaPerimetroMKeyPressed

    private void CercaCorrieteSiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaCorrieteSiKeyPressed
        if(CercaAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            CercaAceptar.doClick();
        }
    }//GEN-LAST:event_CercaCorrieteSiKeyPressed

    private void CeracaCorrieteNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CeracaCorrieteNoKeyPressed
        if(CercaAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            CercaAceptar.doClick();
        }
    }//GEN-LAST:event_CeracaCorrieteNoKeyPressed

    private void CercaTipoAlambreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaTipoAlambreKeyPressed
       if(CercaAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            CercaAceptar.doClick();
        }
    }//GEN-LAST:event_CercaTipoAlambreKeyPressed

    private void CercaTipoAlambreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaTipoAlambreKeyTyped
        // No se agrego pues se tuvo en cuenta que los datos pueden tener muchas variaciones
    }//GEN-LAST:event_CercaTipoAlambreKeyTyped

    private void CercaPerimetroMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CercaPerimetroMKeyTyped
       int soloNumeros=evt.getKeyChar();
         char atras=evt.getKeyChar();
         String todoElTexto=CercaPerimetroM.getText();
         int longitudTodoElTexto=todoElTexto.length();
         // Verifica que los datos del cuadro de texto esten etre 0 y 9 o se puedan dar atras (borrar)
         boolean verificar=soloNumeros >=48 && soloNumeros <=57 || atras=='\b' || atras=='\n' || atras=='.';
         // Otra forma es crear otra variable booleana que veriique si es el numero 8 que es lo mismo que \b
         if(!verificar){
           JOptionPane.showMessageDialog(null, "Solo se permiten números");
           evt.consume();
         } else if(verificar){
             if(longitudTodoElTexto==0 && atras=='\n'){
               JOptionPane.showMessageDialog(null, "Antes de continuar por favor ingrese datos en el campo del Perímetro");
             }
         }
         
    }//GEN-LAST:event_CercaPerimetroMKeyTyped

    private void CordonABuscarTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CordonABuscarTextoKeyPressed
       if(CordonABuscarBuscar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            CordonABuscarBuscar.doClick();
        }
       if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
         CordonABuscarAceptar.doClick();
       }
    }//GEN-LAST:event_CordonABuscarTextoKeyPressed

    private void CordonABuscarTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CordonABuscarTextoKeyReleased
        ActivarBotonBuscarCordon();
    }//GEN-LAST:event_CordonABuscarTextoKeyReleased

    private void CordonABuscarTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CordonABuscarTextoKeyTyped
       int soloNumeros=evt.getKeyChar();
         char atras=evt.getKeyChar();
         String todoElTexto=CordonABuscarTexto.getText();
         int longitudTodoElTexto=todoElTexto.length();
         // Verifica que los datos del cuadro de texto esten etre 0 y 9 o se puedan dar atras (borrar)
         boolean verificar=soloNumeros >=48 && soloNumeros <=57 || atras=='\b' || atras=='\n';
         // Otra forma es crear otra variable booleana que veriique si es el numero 8 que es lo mismo que \b
         if(!verificar){
           JOptionPane.showMessageDialog(null, "Solo se permiten números enteros");
           evt.consume();
         } else if(verificar){
             if(longitudTodoElTexto==0 && atras=='\n'){
               JOptionPane.showMessageDialog(null, "Antes de continuar por favor ingrese datos en el campo");
             }
         }
         
    }//GEN-LAST:event_CordonABuscarTextoKeyTyped

    private void MuroAlturaMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroAlturaMKeyReleased
        ActivarBotonMuro();
    }//GEN-LAST:event_MuroAlturaMKeyReleased

    private void MuroPerimetroMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroPerimetroMKeyReleased
       ActivarBotonMuro();
    }//GEN-LAST:event_MuroPerimetroMKeyReleased

    private void MuroGrosorCMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroGrosorCMKeyReleased
        ActivarBotonMuro();
    }//GEN-LAST:event_MuroGrosorCMKeyReleased

    private void MuroEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroEstadoKeyPressed
        if(MuroBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER 
           && MuroEstado.getSelectedIndex()!=0){
          MuroBotonAceptar.doClick();
        }
    }//GEN-LAST:event_MuroEstadoKeyPressed

    private void MuroAlturaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroAlturaMKeyPressed
       if(MuroBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            MuroBotonAceptar.doClick();
        }
    }//GEN-LAST:event_MuroAlturaMKeyPressed

    private void MuroPerimetroMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroPerimetroMKeyPressed
        if(MuroBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            MuroBotonAceptar.doClick();
        }
    }//GEN-LAST:event_MuroPerimetroMKeyPressed

    private void MuroGrosorCMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroGrosorCMKeyPressed
       if(MuroBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            MuroBotonAceptar.doClick();
        }
    }//GEN-LAST:event_MuroGrosorCMKeyPressed

    private void MuroMaterialFabricacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroMaterialFabricacionKeyPressed
        if(MuroBotonAceptar.isEnabled() && evt.getKeyCode()==KeyEvent.VK_ENTER){
            MuroBotonAceptar.doClick();
        }
    }//GEN-LAST:event_MuroMaterialFabricacionKeyPressed

    private void MuroMaterialFabricacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroMaterialFabricacionKeyReleased
        ActivarBotonMuro();
    }//GEN-LAST:event_MuroMaterialFabricacionKeyReleased

    private void MuroAlturaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroAlturaMKeyTyped
         int soloNumeros=evt.getKeyChar();
         char atras=evt.getKeyChar();
         String todoElTexto=MuroAlturaM.getText();
         int longitudTodoElTexto=todoElTexto.length();
         // Verifica que los datos del cuadro de texto esten etre 0 y 9 o se puedan dar atras (borrar)
         boolean verificar=soloNumeros >=48 && soloNumeros <=57 || atras=='\b' || atras=='\n' || atras=='.';
         // Otra forma es crear otra variable booleana que veriique si es el numero 8 que es lo mismo que \b
         if(!verificar){
           JOptionPane.showMessageDialog(null, "Solo se permiten números");
           evt.consume();
         } else if(verificar){
             if(longitudTodoElTexto==0 && atras=='\n'){
               JOptionPane.showMessageDialog(null, "Antes de continuar por favor ingrese datos en el campo de la Altura");
             }
         }
    }//GEN-LAST:event_MuroAlturaMKeyTyped

    private void MuroPerimetroMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroPerimetroMKeyTyped
        int soloNumeros=evt.getKeyChar();
         char atras=evt.getKeyChar();
         String todoElTexto=MuroPerimetroM.getText();
         int longitudTodoElTexto=todoElTexto.length();
         // Verifica que los datos del cuadro de texto esten etre 0 y 9 o se puedan dar atras (borrar)
         boolean verificar=soloNumeros >=48 && soloNumeros <=57 || atras=='\b' || atras=='\n' || atras=='.';
         // Otra forma es crear otra variable booleana que veriique si es el numero 8 que es lo mismo que \b
         if(!verificar){
           JOptionPane.showMessageDialog(null, "Solo se permiten números");
           evt.consume();
         } else if(verificar){
             if(longitudTodoElTexto==0 && atras=='\n'){
               JOptionPane.showMessageDialog(null, "Antes de continuar por favor ingrese datos en el campo de el Perímetro");
             }
         }
    }//GEN-LAST:event_MuroPerimetroMKeyTyped

    private void MuroGrosorCMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuroGrosorCMKeyTyped
        int soloNumeros=evt.getKeyChar();
         char atras=evt.getKeyChar();
         String todoElTexto=MuroGrosorCM.getText();
         int longitudTodoElTexto=todoElTexto.length();
         // Verifica que los datos del cuadro de texto esten etre 0 y 9 o se puedan dar atras (borrar)
         boolean verificar=soloNumeros >=48 && soloNumeros <=57 || atras=='\b' || atras=='\n' || atras=='.';
         // Otra forma es crear otra variable booleana que veriique si es el numero 8 que es lo mismo que \b
         if(!verificar){
           JOptionPane.showMessageDialog(null, "Solo se permiten números");
           evt.consume();
         } else if(verificar){
             if(longitudTodoElTexto==0 && atras=='\n'){
               JOptionPane.showMessageDialog(null, "Antes de continuar por favor ingrese datos en el campo de Grosor del Muro");
             }
         }
    }//GEN-LAST:event_MuroGrosorCMKeyTyped

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
      
    }//GEN-LAST:event_formComponentHidden

    private void GaritasEnFicheroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaritasEnFicheroBotonActionPerformed
        GaritasYFicherosEscritorio.setVisible(true);
    }//GEN-LAST:event_GaritasEnFicheroBotonActionPerformed

    private void BorrarArchivoTXTBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarArchivoTXTBotonActionPerformed
        File archivo=new File("RegistroDeGaritas.txt");
        if(archivo.exists()){
          archivo.delete();
          JOptionPane.showMessageDialog(null, "Archivo borrado correctamente");
        } else {
          JOptionPane.showMessageDialog(null, "El archivo que desea borrar no existe");
        }
    }//GEN-LAST:event_BorrarArchivoTXTBotonActionPerformed

    private void CrearArchivoTXTBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearArchivoTXTBotonActionPerformed
        File archivo=new File("RegistroDeGaritas.txt");
        String estadoIluminacion="";
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                FileWriter escribirTXT=new FileWriter(archivo,true);
                PrintWriter escribirLinea=new PrintWriter(escribirTXT);
                
                escribirLinea.print("Garita     Estado\n");
                for (int i = 0; i <garitas.getLongitud(); i++) {
                    if(garitas.Obtener(i).getIluminadaGarita()){
                      estadoIluminacion="On";
                    } else {
                      estadoIluminacion="Off";
                    }
                 
                 escribirLinea.print(" #:"+garitas.Obtener(i).getNumeracion()+"         "+estadoIluminacion+"\n");
                }
                
                escribirLinea.close();
                escribirTXT.close();
                
                JOptionPane.showMessageDialog(null, "Archivo creado correctamente");
            } catch (IOException ex) {
                Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
           JOptionPane.showMessageDialog(null, "El archivo ya existe");
        }
        
    }//GEN-LAST:event_CrearArchivoTXTBotonActionPerformed

    private void BorrarYCrearTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarYCrearTXTActionPerformed
       File archivo=new File("RegistroDeGaritas.txt");
        String estadoIluminacion="";
        if(archivo.exists()){
            
            archivo.delete();
            JOptionPane.showMessageDialog(null, "Antiguo archivo borrado correctamente, se creara uno nuevo con los datos actuales");
            
            try {
                archivo.createNewFile();
                FileWriter escribirTXT=new FileWriter(archivo,true);
                PrintWriter escribirLinea=new PrintWriter(escribirTXT);
                
                escribirLinea.print("Garita     Estado\n");
                for (int i = 0; i <garitas.getLongitud(); i++) {
                    if(garitas.Obtener(i).getIluminadaGarita()){
                      estadoIluminacion="On";
                    } else {
                      estadoIluminacion="Off";
                    }
                 
                 escribirLinea.print(" #:"+garitas.Obtener(i).getNumeracion()+"         "+estadoIluminacion+"\n");
                }
                
                escribirLinea.close();
                escribirTXT.close();
                
                JOptionPane.showMessageDialog(null, "Archivo creado correctamente");
            } catch (IOException ex) {
                Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
           JOptionPane.showMessageDialog(null, "El archivo que desea borrar no existe en su lugar se creara uno nuevo con los datos actuales");
           try {
               archivo.createNewFile();
               FileWriter escribirTXT=new FileWriter(archivo,true);
                PrintWriter escribirLinea=new PrintWriter(escribirTXT);
                
                escribirLinea.print("Garita     Estado\n");
                for (int i = 0; i <garitas.getLongitud(); i++) {
                   if(garitas.Obtener(i).getIluminadaGarita()){
                     estadoIluminacion="On";
                   } else {
                     estadoIluminacion="Off";
                   }
                   
                   escribirLinea.print(" #:"+garitas.Obtener(i).getNumeracion()+"         "+estadoIluminacion+"\n");
               }
               
                escribirLinea.close();
                escribirTXT.close();
                
                JOptionPane.showMessageDialog(null, "Archivo creado correctamente");
           } catch (IOException ex) {
               Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
           } catch (Exception ex) {
               Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
    }//GEN-LAST:event_BorrarYCrearTXTActionPerformed

    private void ConsultarArchivoTXTBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarArchivoTXTBotonActionPerformed
       DatosDeGaritasTXTEscritorio.setVisible(true);
       File archivo=new File("RegistroDeGaritas.txt");
       if(!archivo.exists()){
         DatosDeGaritasTXTTexto.setText("No hay TXT por tanto no se puede mostrar nada");
        
       } else {
          DatosDeGaritasTXTTexto.setText(null);
           try {
               BufferedReader lineas=new BufferedReader(new FileReader(archivo));
               String leerLineas=lineas.readLine();
               while(leerLineas!=null){
                 DatosDeGaritasTXTTexto.append(leerLineas+"\n");
                 leerLineas=lineas.readLine();
               }
               lineas.close();
               
           } catch (IOException ex) {
               Logger.getLogger(Empresa1.class.getName()).log(Level.SEVERE, null, ex);
           }
          
       }
    }//GEN-LAST:event_ConsultarArchivoTXTBotonActionPerformed

    private void DatosDeGaritasTXTBotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosDeGaritasTXTBotonAceptarActionPerformed
        DatosDeGaritasTXTEscritorio.setVisible(false);
    }//GEN-LAST:event_DatosDeGaritasTXTBotonAceptarActionPerformed

    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empresa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa1().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlarmaBotonAceptar;
    private javax.swing.JFrame AlarmaEscritorio;
    private javax.swing.JComboBox<String> AlarmaEstado;
    private javax.swing.JRadioButton AlarmaExisteNo;
    private javax.swing.JRadioButton AlarmaExisteSi;
    private javax.swing.ButtonGroup AlarmaExistenSioNo;
    private javax.swing.JLabel AlarmaInfoEstadoAlarma;
    private javax.swing.JLabel AlarmaInfoExiste;
    private javax.swing.JLabel AlarmaInfoPlantila;
    private javax.swing.JButton AlarmaNoExistenAceptar;
    private javax.swing.JButton AlarmaNoExistenBorrarDatos;
    private javax.swing.JPanel AlarmaNueva;
    private javax.swing.JTextField AlarmaNumPlantilla;
    private javax.swing.JFrame AlarmasNecesitanReparacion;
    private javax.swing.JButton AlarmasNecesitanReparacionAceptar;
    private javax.swing.JButton AlarmasNecesitanReparacionBorrar;
    private javax.swing.JPanel AlarmasNecesitanReparacionPanel;
    private javax.swing.JTextArea AlarmasNecesitanReparacionTexto;
    private javax.swing.JFrame AlarmasNoExisten;
    private javax.swing.JPanel AlarmasNoExistenPanel;
    private javax.swing.JTextArea AlarmasNoExistenTextoMostrar;
    private javax.swing.JScrollPane AlarmasNoExistenVisual;
    private javax.swing.JButton BorrarArchivoTXTBoton;
    private javax.swing.JButton BorrarYCrearTXT;
    private javax.swing.JRadioButton CeracaCorrieteNo;
    private javax.swing.JButton CercaAceptar;
    private javax.swing.JTextField CercaAlturaM;
    private javax.swing.ButtonGroup CercaCorrienteSioNo;
    private javax.swing.JRadioButton CercaCorrieteSi;
    private javax.swing.JComboBox<String> CercaEstado;
    private javax.swing.JLabel CercaInfoAltura;
    private javax.swing.JLabel CercaInfoCorriente;
    private javax.swing.JLabel CercaInfoEstado;
    private javax.swing.JLabel CercaInfoPerimetro;
    private javax.swing.JLabel CercaInfoTipoAlambre;
    private javax.swing.JFrame CercaNueva;
    private javax.swing.JPanel CercaNuevaPanel;
    private javax.swing.JTextField CercaPerimetroM;
    private javax.swing.JTextField CercaTipoAlambre;
    private javax.swing.JButton ConsultarArchivoTXTBoton;
    private javax.swing.JButton CordonABuscarAceptar;
    private javax.swing.JTextArea CordonABuscarAreaDeTexto;
    private javax.swing.JButton CordonABuscarBuscar;
    private javax.swing.JLabel CordonABuscarInfo;
    private javax.swing.JTextField CordonABuscarTexto;
    private javax.swing.JPanel CordonAlturaYPerimetro;
    private javax.swing.JFrame CordonAlturaYPerimetroEscritorio;
    private javax.swing.JPanel CordonesNecesitanReparacion;
    private javax.swing.JButton CordonesNecesitanReparacionAceptar;
    private javax.swing.JFrame CordonesNecesitanReparacionEscritorio;
    private javax.swing.JTextArea CordonesNecesitanReparacionTexto;
    private javax.swing.JButton CrearArchivoTXTBoton;
    private javax.swing.JPanel DatosDeGaritasTXT;
    private javax.swing.JButton DatosDeGaritasTXTBotonAceptar;
    private javax.swing.JFrame DatosDeGaritasTXTEscritorio;
    private javax.swing.JTextArea DatosDeGaritasTXTTexto;
    private javax.swing.JLabel EscogerInfo;
    private javax.swing.JButton EscojerCerca;
    private javax.swing.JFrame EscojerCercaOMuro;
    private javax.swing.JPanel EscojerCercaOMuroPanel;
    private javax.swing.JButton EscojerMuro;
    private javax.swing.JButton GaritaBotonAceptar;
    private javax.swing.JFrame GaritaEscritorio;
    private javax.swing.JRadioButton GaritaEstaIliminadaNo;
    private javax.swing.JRadioButton GaritaEstaIluminadaSi;
    private javax.swing.JComboBox<String> GaritaEstado;
    private javax.swing.ButtonGroup GaritaIluminadaSioNo;
    private javax.swing.JLabel GaritaInfoEstaIluminada;
    private javax.swing.JLabel GaritaInfoEstado;
    private javax.swing.JLabel GaritaInfoNumeracion;
    private javax.swing.JLabel GaritaInfoPersonal;
    private javax.swing.JPanel GaritaNueva;
    private javax.swing.JTextField GaritaNumeracion;
    private javax.swing.JRadioButton GaritaPersonalNo;
    private javax.swing.JRadioButton GaritaPersonalSi;
    private javax.swing.ButtonGroup GaritaPersonalSioNo;
    private javax.swing.JButton GaritasEnFicheroBoton;
    private javax.swing.JPanel GaritasNecesitanReparacion;
    private javax.swing.JButton GaritasNecesitanReparacionAceptar;
    private javax.swing.JButton GaritasNecesitanReparacionBorrardatos;
    private javax.swing.JFrame GaritasNecesitanReparacionEscritorio;
    private javax.swing.JTextArea GaritasNecesitanReparacionTexto;
    private javax.swing.JPanel GaritasNoCubiertas;
    private javax.swing.JButton GaritasNoCubiertasAceptar;
    private javax.swing.JButton GaritasNoCubiertasBorrarDatos;
    private javax.swing.JFrame GaritasNoCubiertasEscritorio;
    private javax.swing.JTextArea GaritasNoCubiertasTexto;
    private javax.swing.JButton GaritasSinLuzAceptar;
    private javax.swing.JButton GaritasSinLuzBorrarDatos;
    private javax.swing.JFrame GaritasSinLuzEscritorio;
    private javax.swing.JPanel GaritasSinLuzPanel;
    private javax.swing.JTextArea GaritasSinLuzTexto;
    private javax.swing.JPanel GaritasYFicheros;
    private javax.swing.JFrame GaritasYFicherosEscritorio;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel InformacionTextoGrande;
    private javax.swing.JTextField MuroAlturaM;
    private javax.swing.JButton MuroBotonAceptar;
    private javax.swing.JComboBox<String> MuroEstado;
    private javax.swing.JTextField MuroGrosorCM;
    private javax.swing.JLabel MuroInfoAltura;
    private javax.swing.JLabel MuroInfoEstado;
    private javax.swing.JLabel MuroInfoGrosor;
    private javax.swing.JLabel MuroInfoMaterial;
    private javax.swing.JLabel MuroInfoPerimetroM;
    private javax.swing.JTextField MuroMaterialFabricacion;
    private javax.swing.JFrame MuroNuevoEscritorio;
    private javax.swing.JPanel MuroNuevoPanel;
    private javax.swing.JTextField MuroPerimetroM;
    private javax.swing.JButton NuevaCamara;
    private javax.swing.JButton NuevaGarita;
    private javax.swing.JButton NuevoCordon;
    private javax.swing.JComboBox<String> Operaciones;
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables

// Validaciones de códidigo
    
    private void ActivarBotonAlarma(){
      boolean botonSi=AlarmaExisteSi.isSelected();
      boolean botonNo=AlarmaExisteNo.isSelected();
      boolean estadoComboBox=AlarmaEstado.getSelectedIndex()==0;
      String texto=AlarmaNumPlantilla.getText();
      boolean verificarTexto=!texto.isEmpty();
      
      
      if(botonSi && !estadoComboBox && verificarTexto || botonNo && verificarTexto){
        AlarmaBotonAceptar.setEnabled(true);
      } else {
        AlarmaBotonAceptar.setEnabled(false);
      }
      
    }
    
    private void ActivarBotonGarita(){
       boolean botonPersonalSi=GaritaPersonalSi.isSelected();
       boolean botonPersonalNo=GaritaPersonalNo.isSelected();
       boolean estadoComboBox=GaritaEstado.getSelectedIndex()==0;
       boolean botonIluminadaSi=GaritaEstaIluminadaSi.isSelected();
       boolean botonIluminadaNo=GaritaEstaIliminadaNo.isSelected();
       String texto=GaritaNumeracion.getText();
       boolean verificarTexto=!texto.isEmpty();
       
       if(!estadoComboBox && botonPersonalSi && botonIluminadaSi && verificarTexto || 
          !estadoComboBox && botonPersonalSi && botonIluminadaNo && verificarTexto ||
          !estadoComboBox && botonPersonalNo && botonIluminadaSi && verificarTexto ||
          !estadoComboBox && botonPersonalNo && botonIluminadaNo && verificarTexto){
         GaritaBotonAceptar.setEnabled(true);
       } else {
         GaritaBotonAceptar.setEnabled(false);
       }
    }
    
    private void ActivarBotonCerca(){
      boolean botonCorrienteSi=CercaCorrieteSi.isSelected();
      boolean botonCorrienteNo=CeracaCorrieteNo.isSelected();
      boolean estadoComboBox=CercaEstado.getSelectedIndex()==0;
      String textoAltura=CercaAlturaM.getText();
      boolean vAltura=!textoAltura.isEmpty();
      String textoPerimetro=CercaPerimetroM.getText();
      boolean vPerimetro=!textoPerimetro.isEmpty();
      
      if(!estadoComboBox && botonCorrienteSi && vAltura && vPerimetro ||
         !estadoComboBox && botonCorrienteNo && vAltura && vPerimetro){
        CercaAceptar.setEnabled(true);
      } else {
        CercaAceptar.setEnabled(false);
      }
    }
    
    private void ActivarBotonBuscarCordon(){
      String texto=CordonABuscarTexto.getText();
      boolean validarTexto=!texto.isEmpty();
      
      if(validarTexto){
        CordonABuscarBuscar.setEnabled(true);
      } else {
        CordonABuscarBuscar.setEnabled(false);
      }
      
    }
    
    private void ActivarBotonMuro(){
        
      boolean estadoComboBox=MuroEstado.getSelectedIndex()==0;
      String textoAltura=MuroAlturaM.getText();
      boolean vAltura=!textoAltura.isEmpty();
      String textoPerimetro=MuroPerimetroM.getText();
      boolean vPerimetro=!textoPerimetro.isEmpty();
      String textoGrosor=MuroGrosorCM.getText();
      boolean vGrosor=!textoGrosor.isEmpty();
      
      if(!estadoComboBox && vAltura && vPerimetro && vGrosor){
        MuroBotonAceptar.setEnabled(true);
      } else {
        MuroBotonAceptar.setEnabled(false);
      }
      
      
    }
}
