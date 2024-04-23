public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("213434541");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP inválido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) 
            throw new CepInvalidoException();

        return "23.765-064";

    }

}