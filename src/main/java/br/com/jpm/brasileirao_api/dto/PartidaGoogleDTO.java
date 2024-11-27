package br.com.jpm.brasileirao_api.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// O Lombok cria os getters, setters e constructors atráves dessas instruções

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PartidaGoogleDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String statusPartida;
	private String tempoPartida;
	
	// Informações da equipe da casa
	private String nomeEquipeCasa;
	private String urlLogoEquipeCasa;
	private String placarEquipeCasa;
	private String golsEquipeCasa;
	private String placarEstendidoEquipeCasa;
	
	// Informações da equipe da casa
	private String nomeEquipeVisitante;
	private String urlLogoEquipeVisitante;
	private String placarEquipeVisitante;
	private String golsEquipeVisitante;
	private String placarEstendidoEquipeVisitante;
	
	
}
