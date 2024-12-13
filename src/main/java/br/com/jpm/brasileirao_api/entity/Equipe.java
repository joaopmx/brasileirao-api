package br.com.jpm.brasileirao_api.entity;

import java.io.Serializable;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;


@Getter	
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "equipe")
public class Equipe implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="equipe_id")
	private Long id;
	
	@Column(name ="nome_id")
	private String nomeEquipe;
	
	@Column(name ="ur_logo_equipe")
	private String urlLogoEquipe;
}
