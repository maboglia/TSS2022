package anagrafica;

import model.clienti.Cliente;
import model.clienti.ClienteNoleggiatore;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnagraficaClienti {

    public static Map<Integer, Cliente> clienti;

    static {

        clienti = new TreeMap<>();

        Cliente c = new Cliente("pippo");
        Cliente d = new ClienteNoleggiatore("paperino");
        Cliente e = new Cliente("paperina");
        Cliente f = new ClienteNoleggiatore("giovanni");
        Cliente g = new Cliente("francesca");
        Cliente h = new Cliente("andrea");

        clienti.put(c.getCodCliente(), c);
        clienti.put(d.getCodCliente(), d);
        clienti.put(e.getCodCliente(), e);
        clienti.put(f.getCodCliente(), f);
        clienti.put(g.getCodCliente(), g);
        clienti.put(h.getCodCliente(), h);



    }




}
