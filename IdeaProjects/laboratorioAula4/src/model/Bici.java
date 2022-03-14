package model;

public class Bici extends VeicoloNonTargato{

    private TipoBici tipoBici;

    public Bici(TipoBici tipoBici) {
        this.tipoBici = tipoBici;
        this.tipo = TipoVeicolo.BICI;
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
