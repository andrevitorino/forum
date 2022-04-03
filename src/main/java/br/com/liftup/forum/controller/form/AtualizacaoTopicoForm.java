package br.com.liftup.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.liftup.forum.modelo.Topico;
import br.com.liftup.forum.repository.TopicoRepository;

public class AtualizacaoTopicoForm {

	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String titulo;

	@NotNull
	@NotEmpty
	@Length(min = 10)
	private String mensagem;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mensagem == null) ? 0 : mensagem.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		AtualizacaoTopicoForm other = (AtualizacaoTopicoForm) obj;
		if (mensagem == null) {
			if (other.mensagem != null)
				return false;
		} else if (!mensagem.equals(other.mensagem))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AtualizacaoTopicoForm [titulo=" + titulo + ", mensagem=" + mensagem + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getOne(id);

		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);

		return topico;
	}

}