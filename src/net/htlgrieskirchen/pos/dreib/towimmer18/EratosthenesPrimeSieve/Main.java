/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos.dreib.towimmer18.EratosthenesPrimeSieve;

/**
 *
 * @author Tobias
 */
public class Main {
    public static void main(String[] args) {
        PrimeSieve primeSieve = new EratosthenesPrimeSieve(100);
        primeSieve.printPrimes();
        System.out.println(primeSieve.isPrime(881));
    }
    
    public static void summandAlgorithm() {
        
    }
}
