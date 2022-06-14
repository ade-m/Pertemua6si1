package character;

import util.poin;

public class player {
    //attribute hp,attack, speed, stamina, posisi xy, tinggi
    //lompat, lari, attack,mati, respawn, gelinding,
    private int hp,stamina, speed,attack,tinggi;
    private static int skor =0;
    private poin posisi;

    public void lari(){
       posisi.setX(posisi.getX() + speed);
       System.out.println("Player berlari");
    }
    public void attack(){
        System.out.println("Player menyerang");
        //apakah ada musuh/enemy? kalau ada hp -attack
    }
    public void mati(){
        System.out.println("Player Mati, Game Over");
    }
    public void respawn(){
        hp=100;
        System.out.println("Respawn");
    }
    public void gelinding(){
        lari();
        tinggi-=3;
        System.out.println("Player bergelinding");
    }
    public player(int hp, int stamina, int speed, int attack, int tinggi, poin posisi) {
        this.hp = hp;
        this.stamina = stamina;
        this.speed = speed;
        this.attack = attack;
        this.tinggi = tinggi;
        this.posisi = posisi;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public poin getPosisi() {
        return this.posisi;
    }

    public void setPosisi(poin posisi) {
        this.posisi = posisi;
    }

}
