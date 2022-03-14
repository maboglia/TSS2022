package controller;

import anagrafica.AnagraficaVeicoli;
import model.Veicolo;
import model.clienti.Cliente;
import model.clienti.ClienteNoleggiatore;
import model.clienti.ClienteNonNoleggiatoreException;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Noleggio {

    Veicolo v;
    Cliente c;
    LocalDate dataNoleggio;

    public Noleggio(Veicolo v, Cliente c) {
        this.v = v;
        this.c = c;
        this.dataNoleggio = LocalDate.now();
        ((ClienteNoleggiatore) c).addNoleggio(v);
    }

    @Override
    public String toString() {
        return this.dataNoleggio + ") " + this.c + " " + this.v;
    }
}

public class VeicoliNoleggio {

    List<Noleggio> noleggi = new ArrayList<>();

    public List<Noleggio> getNoleggi() {
        return noleggi;
    }

    public List<Veicolo> getVeicoliList(){

        return AnagraficaVeicoli.veicoliList;

    }

    public void addNoleggio(Veicolo v, Cliente c){

        if (c instanceof ClienteNoleggiatore)
            noleggi.add(new Noleggio(v, c));
        else {
            try {
                throw new ClienteNonNoleggiatoreException("Per noleggiare devi diventare cliente premium");
            } catch (ClienteNonNoleggiatoreException e) {
                System.err.println(e.getMessage());
                //e.printStackTrace();
            }
        }

    }

    public void printNoleggi(String nomeFile){

        //try with resources

        try(BufferedWriter out = new BufferedWriter( new FileWriter(  nomeFile ))) {

            for (Noleggio n : noleggi) {
                out.write(n.toString());
                out.write("\n---------------------------------------\n");
            }
        } catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        } catch (IOException e){
            System.err.println(e.getMessage());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

    }



}
