package br.calebe.ticketmachine.exception;

/**
 *
 * @author Correção: João Pedro Rocha e Leonardo de Maria
 */
public class PapelMoedaInvalidaException extends Exception {
    
    //correção da issue 1:
    public PapelMoedaInvalidaException() {
    }

    public PapelMoedaInvalidaException(String message) {
        super(message);
    }

    public PapelMoedaInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public PapelMoedaInvalidaException(Throwable cause) {
        super(cause);
    }
}
