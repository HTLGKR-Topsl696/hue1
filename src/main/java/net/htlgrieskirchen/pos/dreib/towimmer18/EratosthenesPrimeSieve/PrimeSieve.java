/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos.dreib.towimmer18.EratosthenesPrimeSieve;

/**
 *
 * @author towimmer18
 */
public interface PrimeSieve {
    // Ueberprueft ob p eine Primzahl ist oder nicht.
    public boolean isPrime(int p);
    
    // Gibt alle Primzahlen bis zur Obergrenze auf der Konsole aus.
    public void printPrimes();
}
