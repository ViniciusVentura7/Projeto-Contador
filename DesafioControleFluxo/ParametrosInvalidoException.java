public class ParametrosInvalidoException extends Exception {

    String mensagem = "O segundo parâmetro deve ser MAIOR que o primeiro";
    public ParametrosInvalidoException (String mensagem) {
        super(mensagem);
    }
}
