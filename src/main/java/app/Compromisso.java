package app;

public class Compromisso extends Atividade{
    private Calendar dataIncial;
    private Calendar dataFinal;

    @Override
    public String getDetalhes() {
        return this.getDescricao() + "(" + this.getDataInicial().getTime() + ")";
    }

}
