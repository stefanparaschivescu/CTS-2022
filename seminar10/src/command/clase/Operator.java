package command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Command> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void invoca(Command command) {
        listaComenzi.add(command);
    }

    public void executaComanda() {
        if (listaComenzi.size() > 0) {
            listaComenzi.get(0).executa();
            listaComenzi.remove(0);
        }

    }
}
