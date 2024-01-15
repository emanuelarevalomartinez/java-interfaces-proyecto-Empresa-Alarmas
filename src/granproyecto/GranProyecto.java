
package granproyecto;
import static java.awt.PageAttributes.MediaType.C;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.BreakIterator;
import java.util.Scanner;

public class GranProyecto {
    static Scanner valor;
    
    public static void trabajoConFichero() throws FileNotFoundException, IOException{
        valor =new Scanner(System.in);
        int opcion;
        int parada=0;
        
        System.out.println("implementa el metodo eliminar linea que esta en POE");  // ELIMINAR LINEA A LINEA Y NO EL ARCHIVO COMPLETO
       
        System.out.println("\n Escoja una de las opciones a continuacion "
                         + "\n (1) AGREGAR DATOS "
                         + "\n (2) OBTENER DATOS "
                         + "\n (3) BORRAR DATOS "
                         + "\n (4) FINALIZAR OPERACIONES  ");
        
        System.out.print("ESCRIBA AQUI SU OPCION >>>> ");
        
        opcion=valor.nextInt();
        System.out.println("\n");
        
        opciones(opcion);
        
       
    }
    
    public static void opciones(int escojer) throws FileNotFoundException, IOException{
      switch(escojer){
        
            case 1: File archivo =new File("C:\\Users\\Emanuel\\Desktop\\emanuel.txt"); // crar archivo
                    FileWriter escribir; // esto hace que se pueda manipular el archivo en todo caso sobreescribir o escribir
                    PrintWriter linea;  // eso hace que se escriba en la linea correspondiente del archivo
                      if(!archivo.exists()){ 
                          archivo.createNewFile();
                          FileWriter escribir2;
                          PrintWriter linea2;
                          
                          escribir2=new FileWriter(archivo,true);
                          linea2=new PrintWriter(escribir2);
                          
                          String datosAMostrar="Nombre      Edad\n";
                          linea2.print(datosAMostrar);
                          
                          linea2.close();
                          escribir2.close();
                      }
                    System.out.print("ingrese el nombre>>> ");
                    String nombre=valor.next();
                    System.out.print("Ingrese su edad>>> ");
                    int edad=valor.nextInt();
                    
                    escribir=new FileWriter(archivo,true);  // se pone true para que si ya existe se escriba lo siguiente a continuacion
                    linea=new PrintWriter(escribir); // se pone (escribir) porque es el que perimite modificar las lineas
                    
                    
                    linea.println("\n"+nombre+"      "+edad);
                    
                    linea.close();
                    escribir.close();
                    
                    trabajoConFichero();
                    
                    break;

            case 2: File mostrarArchivo=new File("C:\\Users\\Emanuel\\Desktop\\emanuel.txt");
                        if(!mostrarArchivo.exists()){
                            System.out.println("Lo siento no se ha agrado ningun dato aun ");
                        } else {
                            FileReader leer=new FileReader(mostrarArchivo);
                            BufferedReader leerLinea=new BufferedReader(leer);
                            String imprimir;
                            while((imprimir=leerLinea.readLine())!=null){
                                System.out.println(imprimir);
                            }
                            leerLinea.close();
                        }
                    trabajoConFichero();
                    break;
            case 3: File archivo3=new File("C:\\Users\\Emanuel\\Desktop\\emanuel.txt");
                    if(archivo3.exists()){  archivo3.delete();};
                    System.out.println("Archivo de datos eliminado con exito");
                     trabajoConFichero();
                    break;
            case 4: System.out.println("HASTA PRONTO ");
                    break;
            default : System.out.println("\n OPCION ESCOJIDA "+(escojer)+" INCORRECTA , POR FAVOR RECTIFIQUE SU OPCION \n");
                     trabajoConFichero();
                     break;
        }
    }
    
    
    public static void Empresa(){
        valor=new Scanner(System.in);
        System.out.print("decea iniciar la presentacion: (1) SI (2) NO\n Indicar >>> :");
        int ejecucion=valor.nextInt();
        
        if(ejecucion==1){
          Empresa1 interfaceGrafica=new Empresa1();
          interfaceGrafica.setVisible(true);
        } if(ejecucion==2){
          System.out.println("Hasta pronto");
        } else if(ejecucion!=1 && ejecucion!=2){
           System.out.println("Opcion Incorrecta  RECTIFIQUE ");
           Empresa();
        }
        
    }
    
   

    public static void main(String[] args) throws Exception {
      /*  
    Cordon ca =new Cerca("bueno",true,1.0,2, "mal");
    Cordon cb =new Cerca("bueno",true,1.2,2.5, "mal");
    Cordon cc =new Cerca("bueno",true,2.2,2.7, "mal");
    Cordon cd =new Cerca("bueno",false,2.3,2.9, "mal");
    
    Cordon ma=new Muro(45,"Ormigon",3.4,4.1, "mal");
    Cordon mb=new Muro(41,"Ormigon",3.0,4.2, "mal");
    Cordon mc=new Muro(39,"Ormigon",4,4.3, "mal");
    
    Garita ga=new Garita(1,true,true,"bien");
    Garita gb=new Garita(2,true,false,"regular");
    Garita gc=new Garita(3,true,true,"mal");
    
    Alarma aa=new Alarma(1,false,"bien");
    Alarma ab=new Alarma(2,false,"regular");
    Alarma ac=new Alarma(3,false,"mal");
        
    
    
    
    Empresa zz=new Empresa();
    
    Lista<Cerca> cercas=new Lista<Cerca>();
    Lista<Muro> muros=new Lista<Muro>();
    Lista<Garita> garitas=new Lista<Garita>();
    Lista<Alarma> alarmas=new Lista<Alarma>();
    
    
    cercas.add((Cerca) ca);
    cercas.add((Cerca) cb);
    cercas.add((Cerca) cc);
    cercas.add((Cerca) cd);
    
    muros.add((Muro) ma);
    muros.add((Muro) mb);
    muros.add((Muro) mc);
    
    garitas.add(ga);
    garitas.add(gb);
    garitas.add(gc);
    
    alarmas.add(aa);
    alarmas.add(ab);
    alarmas.add(ac);
    
    zz.setCercas(cercas);
    
    zz.setMuros(muros);
    
    zz.setGaritas(garitas);
    
    zz.setAlarmas(alarmas);
    
    */
    
   
    
       // añddir que el numero de plantilla de la alarma no se pueda repetir en la interface , ni la garita
        
     // trabajoConFichero();  // Metodo de trabajo con ficheros , Arriba
     
     //Empresa();
     
   
     
     
    
    }
    
}
