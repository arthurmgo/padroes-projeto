package questao1;

import java.util.ArrayList;
import java.util.Iterator;

public class Casa {

    ArrayList<Comodo> comodos = new ArrayList<Comodo>();

    public ArrayList<Comodo> getComodos() {
        return comodos;
    }

    public Comodo getComodo(int id) {
        if (comodos.size() > id) {
            return comodos.get(id);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String s = "LISTA DE COMODOS DA CASA: \n\t";
        for (Comodo next : comodos) {
            s = s + "\n\t" + next.toString();
        }
        return s + "\n";
    }
    
    

}
