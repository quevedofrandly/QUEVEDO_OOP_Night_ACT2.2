/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quevedo.rpg;

/**
 *
 * @author Acer
 */
public class Character {
    private int health;
    private int damage;
    private int shield;
    
    public Character(int health, int damage, int shield){
        this.health = health;
        this.damage = damage;
        this.shield = shield;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    public int getShield(){
        return shield;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void receiveDamage(int damage){
        int dmgtaken = damage - shield;
        if(dmgtaken > 0){
            this.health = health - dmgtaken;
        } if (this.health <= 0){
            System.out.println("Character has died");
        }
    }
}


