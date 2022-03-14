package model;

public class MonoPattino extends VeicoloNonTargato implements Noleggiabile{

    public MonoPattino() {
        this.tipo = TipoVeicolo.MONO_PATTINO;
        this.prezzo = getPrezzoCasuale();
    }

    @Override
    public double getCostoNoleggio() {
        return getPrezzoVendita() / tipo.getFattore();
    }

    @Override
    public double getPrezzoVendita() {
        return prezzo * 1.22;
    }
}
