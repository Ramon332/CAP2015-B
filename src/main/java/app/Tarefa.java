package app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tarefa extends Atividade{
    private boolean isConcluido;

    @Override
    public String toString() {
        return this.getDescricao() + "(" + this.isConcluido() + ")";
    }
}
