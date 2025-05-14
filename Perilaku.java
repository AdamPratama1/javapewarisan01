/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kartun;

/**
 *
 * @author RPL
 */
public interface Perilaku {
       
    class Kartun {
    protected String name;
    protected int hp;
    protected int attackPoint;

    public Kartun(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPoint);
    }
}

// Kelas turunan (Subclass)
class Poweranger extends Kartun {
   
    public Poweranger(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void kekuatan() {
        System.out.println(name + " memiliki kekuatan super!");
    }
}

// Kelas turunan (Subclass)
class UpinIpin extends Kartun {
    public UpinIpin(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void anakkecil() {
        System.out.println(name + " adalah anak kecil yang ceria!");
    }
}

// Kelas turunan (Subclass)
class SpongeBob extends Kartun {
    public SpongeBob(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void kuning() {
        System.out.println(name + " berwarna kuning!");
    }

    public void berjalan() {
        System.out.println(name + " sedang berjalan.");
    }

    public void melompat() {
        System.out.println(name + " melompat dengan gembira!");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Poweranger poweranger = new Poweranger("Red Ranger", 100, 50);
        UpinIpin upin = new UpinIpin("Upin", 80, 20);
        SpongeBob spongebob = new SpongeBob("SpongeBob", 90, 10);

        poweranger.attack();
        poweranger.kekuatan();

        upin.attack();
        upin.anakkecil();

        spongebob.attack();
        spongebob.kuning();
        spongebob.berjalan();
        spongebob.melompat();
    }
}
    
    
    
}
