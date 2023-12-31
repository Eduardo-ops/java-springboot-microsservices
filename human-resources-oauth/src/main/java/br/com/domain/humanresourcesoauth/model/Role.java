package br.com.domain.humanresourcesoauth.model;

import java.io.Serializable;

/**
 * Class reponsible for standardizing the Role entity.
 * 
 * @author - Eduardo Isidoro Gonçalves.
 */
public class Role implements Serializable {

	/**
	 * Atribute serialVersionUID of serializable.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atribute id.
	 */
	private Long id;

	/**
	 * Atribute roleName.
	 */
	private String roleName;

	/**
	 * Default constructor.
	 */
	public Role() {

	}

	/**
	 * Constructor with all fields.
	 * 
	 * @param id       - Role id parameter.
	 * @param roleName - Role roleName parameter.
	 */
	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
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
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
