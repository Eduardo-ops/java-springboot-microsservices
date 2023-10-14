package br.com.domain.humanresourcesworker.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class reponsible for standardizing the Worker entity.
 * 
 * @author - Eduardo Isidoro Gonçalves.
 */
@Entity
@Table(name = "TB_WORKER")
public class Worker implements Serializable {

	/**
	 * Atribute serialVersionUID of serializable.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atribute id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * Atribute name.
	 */
	private String name;

	/**
	 * Atribute dailyIncome.
	 */
	private Double dailyIncome;

	/**
	 * Default constructor.
	 */
	public Worker() {

	}

	/**
	 * Constructor with all fields.
	 * 
	 * @param id          - Worker id parameter.
	 * @param name        - Worker name parameter.
	 * @param dailyIncome - Worker dailyIncome parameter.
	 */
	public Worker(Long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	/**
	 * Method responsible for comparing objects.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/**
	 * Method responsible for comparing objects.
	 * 
	 * @param obj - Object of comparinson.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;

		return Objects.equals(id, other.id);
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dailyIncome
	 */
	public Double getDailyIncome() {
		return dailyIncome;
	}

	/**
	 * @param dailyIncome the dailyIncome to set
	 */
	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
}
