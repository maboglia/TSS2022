package model;

public abstract class VeicoloTargato extends Veicolo{

    private String targa;
    protected TipoPatente tipoPatente;

    public VeicoloTargato(String targa){
        this.targa = targa + getId();
    }

    @Override
    public int compareTo(Veicolo o) {

        if (o instanceof VeicoloTargato)
            return this.targa.compareTo(((VeicoloTargato) o).targa);

        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nVeicoloTargato{" +
                "targa='" + targa + '\'' +
                "patente: " + tipoPatente+
                '}';
    }
}
