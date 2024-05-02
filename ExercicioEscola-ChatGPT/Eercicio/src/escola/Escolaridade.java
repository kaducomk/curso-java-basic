package escola;

public enum Escolaridade {
    ENSINO_FUNDAMENTAL("EF", "Ensino Fundamental"),
    ENSINO_MEDIO ("EM", "Ensino Médio"),
    ENSINO_SUPERIOR ("ES", "Ensino Superior");

    private String nome;
    private String sigla;

    private Escolaridade(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
