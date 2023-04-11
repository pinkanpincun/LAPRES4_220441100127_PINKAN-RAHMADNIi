

package com.mycompany.praktikum4;

/**
 *
 * @author LENOVO
 */
abstract class Bilangan {
    double nilai;
    
    public Bilangan(double nilai) {
        this.nilai = nilai;
    }
    
    abstract Bilangan tambah(Bilangan bilangan);
    
    abstract Bilangan kurang(Bilangan bilangan);
    
    abstract Bilangan kali(Bilangan bilangan);
    
    abstract Bilangan bagi(Bilangan bilangan);
}

class BilanganReal extends Bilangan {
    public BilanganReal(double nilai) {
        super(nilai);
    }
    @Override
    BilanganReal tambah(Bilangan bilangan) {
        BilanganReal b = (BilanganReal) bilangan;
        return new BilanganReal(this.nilai + b.nilai);
    }   
    
    
     @Override
    BilanganReal kurang(Bilangan bilangan) {
        BilanganReal b = (BilanganReal) bilangan;
        return new BilanganReal(this.nilai - b.nilai);
    }
     @Override
    BilanganReal kali(Bilangan bilangan) {
        BilanganReal b = (BilanganReal) bilangan;
        return new BilanganReal(this.nilai * b.nilai);
    }
     @Override
    BilanganReal bagi(Bilangan bilangan) {
        BilanganReal b = (BilanganReal) bilangan;
        return new BilanganReal(this.nilai / b.nilai);
    }
}

public class Praktikum4 {

    public static void main(String[] args) {
        BilanganReal A = new BilanganReal(9.25);
        BilanganReal B = new BilanganReal(1.25);
        
        BilanganReal C = A.tambah(B);
        System.out.println(C.nilai); // Output: 10.5
        
        BilanganReal D = A.kurang(B);
        System.out.println(D.nilai); // Output: 8.0
        
        BilanganReal E = A.kali(B);
        System.out.println(E.nilai); // Output: 11.5625
        
        BilanganReal F = A.bagi(B);
        System.out.println(F.nilai); // Output: 7.4

    }
}


 
