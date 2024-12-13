package br.com.jpm.brasileirao_api.entity;

import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;


@Getter	
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "partida")
public class Partida implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "partida_id")
	private Long id;
	
	@Transient
	private String statusPartida;
	
	@ManyToOne
	@JoinColumn(name = "equipe_casa_id")
	private Equipe equipeCasa;
	
	@ManyToOne
	@JoinColumn(name = "equipe_visitante_id")
	private Equipe equipeVisitante;
	
	@Column(name = "placar_equipe_casa")
	private Integer placarEquipeCasa;
	
	@Column(name = "placar_equipe_visitante")
	private Integer placarEquipeVisitante;
	
	@Column(name = "gols_equipe_casa")
	private String golsEquipeCasa;
	
	@Column(name = "gols_equipe_visitante")
	private String golsEquipeVisitante;
	@Column(name = "placar_estendido_equipe_casa")
	private Integer placarEstendidoEquipeCasa;
	@Column(name = "placar_estendido_equipe_visitante")
	private Integer placarEstendidoEquipeVisitante;
	
	@ApiModelProperty(example = "dd/MM/yyyy HH:mm")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm", timezone = "America/Sao_paulo")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_hora_partida")
	private Date dataHoraPartida;
	
	@Column(name = "local_partida")
	private String localPartida;

}