package org.generation.italy;

/**
 * Classe entity-bean Cliente che effettua il mapping del record della tabella
 * Cliente
 *
 * @author Angelo Pasquarelli
 */
public class Prodotto {
	/***********************/
// DEFINIZIONE ATTRIBUTI
	/***********************/
	private String codiceProdotto;
	private String descrizione;

	/***************/
// COSTRUTTORI
	/***************/
	public Prodotto(String codiceProdotto, String descrizione) {
		this.codiceProdotto = codiceProdotto;
		this.descrizione = descrizione;
	}

	/********************/
// GETTERS & SETTERS
	/********************/
	public String getCodiceProdotto() {
		return codiceProdotto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	/***********************************************************************/
// METODI DERIVATI DALLA CLASSE OBJECT: toString(), equals(), hashCode()
	/***********************************************************************/

	@Override
	public String toString() {
		return "Prodotto{" + "codiceProdotto=" + codiceProdotto + ", descrizione=" + descrizione + '}';
	}

}