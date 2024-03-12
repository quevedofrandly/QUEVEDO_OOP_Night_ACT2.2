/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quevedo.rpg;

/**
 *
 * @author Acer
 */
public class Paladin extends Swordsman {
    private boolean hasResurrected;
    private int health;
    private boolean hasRessurected;
    
    public Paladin(){
        super();
        this.hasResurrected = false;
        
    }
    
    @Override
    public void receiveDamage(int damage){
        int dmgTaken = damage - shield;
        if(dmgTaken > 0){
            if(dmgTaken % 2 == 0){
                dmgTaken = dmgTaken / 2;
            }
            this.health = health - dmgTaken;
            if (this.health <= 0){
                resurrect();
            }
        }
    }
    public void resurrect(){
        if(!hasRessurected && this.health <= 0){
            this.health = 100;
            this.hasRessurected = true;
            //System.out.println(Paladin is resurrected);
        } else { 
            System.out.println("Paladin has died");
        }
    } 
}

    