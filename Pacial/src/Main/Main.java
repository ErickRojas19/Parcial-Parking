 
package Main;
 
import Lista.ListaParq;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        
        
        ListaParq lista = new ListaParq();
        
        while(true){
            int A= Integer.parseInt(JOptionPane.showInputDialog("Que acción desea realizar: \n1. Parquear \n2. Sacar \n3. Mostrar Autos Parqueados\n4. Atras"));
            switch(A){
                case 1: lista.guardarAuto();
                        break;
                 
                case 2: int M= Integer.parseInt(JOptionPane.showInputDialog("1. Sacar por placa\n2. Sacar por identificacion")); 
                        String dato = JOptionPane.showInputDialog("Introduzca la información"); 
                        lista.sacarAuto(M, dato); 
                        break;
                case 3: lista.mostrarTodo();
                 
                
            
            } 
        }
        
        
    }
}

