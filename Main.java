import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<Programa> programas = new ArrayList<>();

        Programa dibujo = new Programa("Dibujo", 2500000, 6, 7);
        Programa pintura = new Programa("Pintura", 27000000, 8, 9);
        Programa escultura = new Programa("Escultura", 3000000, 10, 12);

        programas.add(dibujo);
        programas.add(pintura);
        programas.add(escultura);

       
        
        String nombre = JOptionPane.showInputDialog("Ingrese el nomnbre del niño");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad "));
        

        Programa programaAplicable = null;

        for(Programa programa : programas){

            if(edad >= programa.getEdadMinima() && edad <= programa.getEdadMaxima()){
                programaAplicable = programa;
                break; //salimos del ciclo
            }
        }
      
        Niño niño = new Niño();
        
        if( programaAplicable == null ){
          JOptionPane.showMessageDialog(null, "No hay programas aplicables");
        
        } else {
          
        
          JOptionPane.showMessageDialog(null, "Le aplica el programa "  + programaAplicable.getNombre() +  " con un costo de :  " +  programaAplicable.getValorBase()+ "Quiere inscribirlo? ");
          int opcion = JOptionPane.showConfirmDialog(null, programaAplicable, "Confirmar inscripción", JOptionPane.YES_NO_OPTION);
          if (opcion == JOptionPane.YES_OPTION){
           
           niño.tieneMateriales = JOptionPane.showConfirmDialog(null, "¿Desea agregar materiales premium?", "Materiales premium", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
           niño.tieneClases= JOptionPane.showConfirmDialog(null, "¿Desea agregar clases intensivas?", "Clases intensivas", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
           niño.tieneTalleres=JOptionPane.showConfirmDialog(null, "¿Desea agregar talleres de fin de semana?", "Talleres de fin de semana", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
          }
        }
        
       //MOSTRAR PROGRAMAS DE NIÑOS   

       for(Programa programa: programas){
       System.out.println("Programa: " + programa.nombre);
       }


       } 
      
    }

