package view;

import anagrafica.AnagraficaClienti;
import anagrafica.AnagraficaVeicoli;
import controller.VeicoliNoleggio;
import model.Noleggiabile;
import model.Veicolo;
import model.clienti.Cliente;

import java.util.Random;

public class NoleggioMezzi {

    public static void main(String[] args) {

        VeicoliNoleggio ctrlNolo = new VeicoliNoleggio();

//        ctrlNolo.getVeicoliList().stream().forEach(System.out::println);
//        ctrlNolo.getVeicoliList().stream().forEach(v -> System.out.println(v));

//        ctrlNolo.getVeicoliList().stream().filter(v -> (v instanceof Noleggiabile)).forEach(System.out::println);

        Random r = new Random();

        for (Cliente c: AnagraficaClienti.clienti.values()) {
            Veicolo v = ctrlNolo.getVeicoliList().get(r.nextInt(ctrlNolo.getVeicoliList().size()));
            ctrlNolo.addNoleggio(v, c);
        }

        ctrlNolo.addNoleggio(ctrlNolo.getVeicoliList().get(0), AnagraficaClienti.clienti.get(4));

        ctrlNolo.printNoleggi("C:\\Users\\teacher\\Desktop\\noleggi.txt");

        ;
    }

}
