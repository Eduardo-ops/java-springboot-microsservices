package br.com.domain.humanresourcesoauth.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Class reponsible for standardizing the User entity.
 * 
 * @author - Eduardo Isidoro Gonçalves.
 */
public class User implements Serializable, UserDetails {

	/**
	 * Atribute serialVersionUID of serializable.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atribute id.
	 */
	private Long id;

	/**
	 * Atribute name.
	 */
	private String name;

	/**
	 * Atribute email.
	 */
	private String email;

	/**
	 * Atribute password.
	 */
	private String password;

	/**
	 * Atribute roles.
	 */
	private Set<Role> roles = new HashSet<>();

	/**
	 * Default constructor.
	 */
	public User() {

	}

	/**
	 * Constructor with all fields.
	 * 
	 * @param id       - User id parameter.
	 * @param name     - User name parameter.
	 * @param email    - User email parameter.
	 * @param password - User password parameter.
	 */
	public User(Long id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName()))
				.collect(Collectors.toList());
	}

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// O retorno dependerá de uma lógica.
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// O retorno dependerá de uma lógica.
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// O retorno dependerá de uma lógica.
		return true;
	}

	@Override
	public boolean isEnabled() {
		// O retorno dependerá de uma lógica.
		return true;
	}

}
