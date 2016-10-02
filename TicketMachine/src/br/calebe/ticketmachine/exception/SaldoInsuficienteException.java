package br.calebe.ticketmachine.exception;

/**
 *
 * @author Correção: João Pedro Rocha e Leonardo de Maria
 */
public class SaldoInsuficienteException extends Exception {
    //correção de issue 3:
    public SaldoInsuficienteException() {
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }

    public SaldoInsuficienteException(Throwable cause) {
        super(cause);
    }
}
