package app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tarefa extends Atividade{
    private boolean isConcluido; //boolean significa verdadeiro/falso

    public Tarefa(String descricao, boolean isConcluido){
        this.setDescricao(descricao);
        this.setConcluido(isConcluido);

    }
    public String getDetalhes() {
        return this.getDescricao() + "(" + this.isConcluido() + ")";
    }
}
