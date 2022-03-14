package model;

import java.util.Random;

public abstract class Veicolo implements Comparable<Veicolo> { //Pascal case

    private static int counter = 1;

    private int id;
    protected TipoVeicolo tipo;
    protected int anno;
    protected double prezzo;
    protected double costoNoleggio;
    protected double prezzoVendita;//camel case

    public Veicolo(){//Pascal case
        this.id = counter++;

    }
    public Veicolo(int anno){//Pascal case
        this();
        this.anno = anno;

    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    protected double getPrezzoCasuale() {

        double price = 0;
        Random r = new Random();

        switch (tipo){

            case AUTO : price = r.nextDouble(15000); break;
            case BARCA : price = r.nextDouble(50000); break;
            case BICI : price = r.nextDouble(5000);; break;
            case CAMION : price = r.nextDouble(150000); break;
            case CAMPER : price = r.nextDouble(75000); break;
            case MONO_PATTINO : price = r.nextDouble(1500); break;

        }
        return price;


    }

    public abstract double getCostoNoleggio();//camel case

    public abstract double getPrezzoVendita();

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Veicolo o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "id: " + id
                + "\ntipo: " + tipo
                + "\nanno: " + anno
                + "\nprezzo vendita: " + getPrezzoVendita()
                + "\ncosto noleggio giornaliero: " + getCostoNoleggio();
    }
}
