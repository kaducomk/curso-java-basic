public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piaui"),
    MARANHAO ("MA", "Maranhão") ;

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
    String getSigla() {
        return sigla;
    }
    String getNome() {
        return nome;
    }
    

    String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
