package br.com.liftup.forum.config.validacao;

public class ErroDeFormularioDTO {

	private String campo;
	private String erro;
	
	public ErroDeFormularioDTO(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campo == null) ? 0 : campo.hashCode());
		result = prime * result + ((erro == null) ? 0 : erro.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "ErroDeFormularioDTO [campo=" + campo + ", erro=" + erro + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErroDeFormularioDTO other = (ErroDeFormularioDTO) obj;
		if (campo == null) {
			if (other.campo != null)
				return false;
		} else if (!campo.equals(other.campo))
			return false;
		if (erro == null) {
			if (other.erro != null)
				return false;
		} else if (!erro.equals(other.erro))
			return false;
		return true;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}
	
}
