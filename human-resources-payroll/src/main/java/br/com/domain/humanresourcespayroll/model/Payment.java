package br.com.domain.humanresourcespayroll.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class reponsible for standardizing the Payment entity.
 * 
 * @author - Eduardo Isidoro Gonçalves.
 */
public class Payment implements Serializable {

	/**
	 * Atribute serialVersionUID of serializable.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atribute name.
	 */
	private String name;

	/**
	 * Atribute dailyIncome.
	 */
	private Double dailyIncome;

	/**
	 * Atribute days.
	 */
	private Integer days;

	/**
	 * Default constructor.
	 */
	public Payment() {

	}

	/**
	 * Constructor with all fields.
	 * 
	 * @param name        - Payment name parameter.
	 * @param dailyIncome - Payment dailyIncome parameter.
	 * @param days        - Payment days parameter.
	 */
	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	/**
	 * Method responsible for calculating total salary.
	 * 
	 * @return Return the total.
	 */
	public double getTotal() {
		return this.dailyIncome * days;
	}

	/**
	 * Method responsible for comparing objects.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dailyIncome, days, name);
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
		Payment other = (Payment) obj;
		return Objects.equals(dailyIncome, other.dailyIncome) && Objects.equals(days, other.days)
				&& Objects.equals(name, other.name);
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

	/**
	 * @return the days
	 */
	public Integer getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(Integer days) {
		this.days = days;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
