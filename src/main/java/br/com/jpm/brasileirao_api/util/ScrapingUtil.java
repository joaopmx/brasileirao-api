package br.com.jpm.brasileirao_api.util;

import br.com.jpm.brasileirao_api.dto.PartidaGoogleDTO;

public class ScrapingUtil {

	private static final String BASE_URL_GOOGLE = "https://www.google.com/search>?q=";
	private static final String COMPLEMENTO_URL_GOOGLE = "&hl=pt-BR";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartidaGoogleDTO partida = new PartidaGoogleDTO();
		partida.getGolsEquipeCasa();
	}

}
