/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos.dreib.towimmer18.EratosthenesPrimeSieve;

import java.util.ArrayList;

/**
 *
 * @author Tobias
 */
public class Main {

    public static void main(String[] args) {
        PrimeSieve primeSieve = new EratosthenesPrimeSieve(100);
        primeSieve.printPrimes();
        System.out.println(primeSieve.isPrime(7));
        summandAlgorithm(10);
    }

    public static void summandAlgorithm(int o) {
        PrimeSieve primeSieve = new EratosthenesPrimeSieve(o);
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int k = 1; k < o; k++) {
            if (primeSieve.isPrime(k)) {
                System.out.println(k);
                primes.add(k);
            }
        }
    }
}
