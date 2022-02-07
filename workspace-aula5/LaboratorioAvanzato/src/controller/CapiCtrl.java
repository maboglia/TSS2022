package controller;

import java.util.ArrayList;
import java.util.List;

import dal.CapoDAO;
import dal.CapoDAOImpl;
import model.CapoAbbigliamento;
import model.Maglia;
import model.Pantalone;

public class CapiCtrl {

	private CapoDAO capi;

	public CapiCtrl() {
		this.capi = new CapoDAOImpl();
	}

	public void addMaglia(Maglia m) {
		this.capi.addCapo(m);
	}
	
	public void addPantalone(Pantalone p) {
		this.capi.addCapo(p);
	}
	
	public Pantalone getPantalone(int codArt) {
		if (this.capi.getCapo(codArt) instanceof Pantalone)
			return (Pantalone) this.capi.getCapo(codArt);
		return null;
	}
	
	public Maglia getMaglia(int codArt) {
		if (this.capi.getCapo(codArt) instanceof Maglia)
			return (Maglia) this.capi.getCapo(codArt);
		return null;
	}
	
	public List<Pantalone> getPantaloni(){
		
		List<Pantalone> pantaloni = new ArrayList<>();
		for (CapoAbbigliamento capo : this.capi.getCapi()) {
			if (capo instanceof Pantalone)
				pantaloni.add((Pantalone) capo);
		}
		return pantaloni;
	}
	public List<Maglia> getMaglia(){
		
		List<Maglia> maglie = new ArrayList<>();
		for (CapoAbbigliamento capo : this.capi.getCapi()) {
			if (capo instanceof Maglia)
				maglie.add((Maglia) capo);
		}
		return maglie;
	}
	

}
