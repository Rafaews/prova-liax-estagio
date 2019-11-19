/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author Flávio
 *
 */

public class Associado {

	private Long cd_associado;
	private String nm_associado;
	private Date dt_nascimento;
	private Date dt_cadastro;

	

	public Long getCd_associado() {
		return cd_associado;
	}

	public void setCd_associado(Long cd_associado) {
		this.cd_associado = cd_associado;
	}

	public String getNm_associado() {
		return nm_associado;
	}

	public void setNm_associado(String nm_associado) {
		this.nm_associado = nm_associado;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public Date getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_associado == null) ? 0 : cd_associado.hashCode());
		result = prime * result + ((dt_cadastro == null) ? 0 : dt_cadastro.hashCode());
		result = prime * result + ((dt_nascimento == null) ? 0 : dt_nascimento.hashCode());
		result = prime * result + ((nm_associado == null) ? 0 : nm_associado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Associado other = (Associado) obj;
		if (cd_associado == null) {
			if (other.cd_associado != null)
				return false;
		} else if (!cd_associado.equals(other.cd_associado))
			return false;
		if (dt_cadastro == null) {
			if (other.dt_cadastro != null)
				return false;
		} else if (!dt_cadastro.equals(other.dt_cadastro))
			return false;
		if (dt_nascimento == null) {
			if (other.dt_nascimento != null)
				return false;
		} else if (!dt_nascimento.equals(other.dt_nascimento))
			return false;
		if (nm_associado == null) {
			if (other.nm_associado != null)
				return false;
		} else if (!nm_associado.equals(other.nm_associado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Associado [cd_associado=" + cd_associado + ", nm_associado=" + nm_associado + ", dt_nascimento="
				+ dt_nascimento + ", dt_cadastro=" + dt_cadastro + "]";
	}

}
