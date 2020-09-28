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
public class EratosthenesPrimeSieve implements PrimeSieve {

    private final int limit;

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean isPrime(int p) {
        int methodLimit = p;
        if (methodLimit < 2) {
            methodLimit = 2;
        }
        boolean[] isPrim = new boolean[methodLimit + 1];
        for (int i = methodLimit; i >= 2; i--) {
            isPrim[i] = true;
        }
        for (int i = 2; i * i <= methodLimit; i++) {
            if (isPrim[i]) {
                int nextImpossiblePrim = i + i;
                while (nextImpossiblePrim <= methodLimit) {
                    isPrim[nextImpossiblePrim] = false;
                    nextImpossiblePrim += i;
                }
            }
        }
        return isPrim[p];
    }

    @Override
    public void printPrimes() {
        int methodLimit = limit;
        if (methodLimit < 2) {
            methodLimit = 2;
        }
        boolean[] isPrim = new boolean[methodLimit + 1];
        for (int i = methodLimit; i >= 2; i--) {
            isPrim[i] = true;
        }
        for (int i = 2; i * i <= methodLimit; i++) {
            if (isPrim[i]) {
                int nextImpossiblePrim = i + i;
                while (nextImpossiblePrim <= methodLimit) {
                    isPrim[nextImpossiblePrim] = false;
                    nextImpossiblePrim += i;
                }
            }
        }
        for (int i = 1; i <= limit; ++i) {
            if (isPrim[i]) {
                System.out.println(i);
            }
        }
    }

}
