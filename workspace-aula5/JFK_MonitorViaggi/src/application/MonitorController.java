package application;

import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MonitorController {
	
	@FXML
	private TextArea txtResult;
	
	@FXML
	private TextField lblTesto;
	
	
	@FXML
	void doTranslate(ActionEvent event) {

		txtResult.clear();
		String riga = lblTesto.getText().toLowerCase();

		// Controllo sull'input
		if (riga == null || riga.length() == 0) {
			txtResult.setText("Inserire una o due parole.");
			return;
		}

		StringTokenizer st = new StringTokenizer(riga, " ");

		// Controllo su String Tokenizer (superfluo)
		if (!st.hasMoreElements()) {
			txtResult.setText("Inserire una o due parole.");
			return;
		}

		// Estraggo la prima parola
		String alienWord = st.nextToken();

		if (st.hasMoreTokens()) {
			// Devo inserire parola e traduzione nel dizionario

			// Estraggo la seconda parola
			String translation = st.nextToken();

			if (!alienWord.matches("[a-zA-Z]*") || !translation.matches("[a-zA-Z]*")) {
				txtResult.setText("Inserire solo caratteri alfabetici.");
				return;
			}

			// Aggiungo la parola aliena e traduzione nel dizionario
			//alienDictionary.addWord(alienWord, translation);

			txtResult.setText("La parola: \"" + alienWord + "\", con traduzione: \"" + translation + "\", è stata inserita nel dizionario.");

		} else {

			// Controllo che non ci siano caratteri non ammessi
			if (!alienWord.matches("[a-zA-Z]*")) {
				txtResult.setText("Inserire solo caratteri alfabetici.");
				return;
			}

			String translation = "pippo";

			if (translation != null) {
				txtResult.setText(translation);
			} else {
				txtResult.setText("La parola cercata non esiste nel dizionario.");
			}
		}
	}
}
