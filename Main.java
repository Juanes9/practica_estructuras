package practica_estructuras;
import javax.swing.JOptionPane;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        RegistroEstudiante Re = new RegistroEstudiante();
        LinkedList<ESTUDIANTE_INGENIERIA> listaEI= new LinkedList<>();
        Re.registroEstudiante(listaEI);
    }
}
