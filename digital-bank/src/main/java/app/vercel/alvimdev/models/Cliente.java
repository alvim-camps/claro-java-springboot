package app.vercel.alvimdev.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;
}
