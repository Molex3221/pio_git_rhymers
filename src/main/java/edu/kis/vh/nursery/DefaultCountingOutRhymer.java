package edu.kis.vh.nursery;

/**
 * Bazowa klasa wyliczankowa, której działanie przypomina strukturę stosu.
 */
public class DefaultCountingOutRhymer {

    public static final int size = 12;
    public static final int ERROR = -1;
    public static final int LAST = size-1;
    private final int[] NUMBERS = new int[size];

    public int Total = ERROR;

    /**
     * Dodaje nową wartość do wyliczanki (na szczyt stosu).
     * * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++Total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta..
     * * @return true jeśli wyliczanka jest pusta, w przeciwnym razie false
     */
    public boolean callCheck() {
        return Total == ERROR;
    }

    /**
     * Sprawdza, czy wyliczanka jest pełna.
     * * @return true jeśli wyliczanka osiągnęła maksymalny rozmiar, w przeciwnym razie false
     */
    public boolean isFull() {
        return Total == LAST;
    }

    /**
     * Zwraca wartość ze szczytu wyliczanki bez jej usuwania.
     * * @return wartość na szczycie wyliczanki lub wartość ERROR, gdy wyliczanka jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return NUMBERS[Total];
    }

    /**
     * Zwraca i zdejmuje wartość ze szczytu wyliczanki.
     * * @return zdjęta wartość z wyliczanki lub wartość ERROR, gdy wyliczanka jest pusta
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return NUMBERS[Total--];
    }

}