package dal;

import java.util.List;

import model.CapoAbbigliamento;

public interface CapoDAO {

	void addCapo(CapoAbbigliamento capo);
	CapoAbbigliamento getCapo(int codArt);
	List<CapoAbbigliamento> getCapi();
	void updCapo(CapoAbbigliamento capo);
	void delCapo(int codArt);
	
	
}
