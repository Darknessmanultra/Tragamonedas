/*
 * Copyright (c) 2023. Programacion Avanzada, DISC, UCN.
 */

package cl.ucn.disc.ads.tragamonedas.services;

import java.util.List;

/**
 * The Tragamonedas.
 *
 * @author Arquitectura de Sistemas.
 */
public interface Tragamonedas {

    /**
     * Places a bet verifying that the amount of the bet is equal to or less than the available balance.
     *
     * @param apuesta the value of the bet.
     * @return the value of the prize obtained.
     */
    int realizarApuesta(int apuesta);

    /**
     * @return the list of values in the wheels.
     */
    List<Character> getRuedasValues();

    /**
     * @return the value of saldo.
     */
    int getSaldo();

    /**
     * Spin the wheel!
     */
    void girarRuedas();

    /**
     * calculates the value of the prize to be obtained from the value of the bet.
     *
     * @param apuesta to use.
     * @return the prize value.
     */
    int getPremio(int apuesta);

    /**
     * @return true if the values of all wheels are equal but non-zero
     */
    boolean isValorRuedasIgualesDistintoDeCero();
}
