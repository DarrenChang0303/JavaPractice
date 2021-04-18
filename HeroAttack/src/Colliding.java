/*
 * @Author: your name
 * @Date: 2021-04-15 14:45:08
 * @LastEditTime: 2021-04-19 01:00:05
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \HeroAttack\src\Colliding.java
 */
public class Colliding implements Skill {

    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        int damage = attackingHero.getStrength()-attackedHero.getDefense();
        attackedHero.lostHp(damage);
        return damage;
    }

    @Override
    public String toString(){
        return "Colliding";
    }
    
}
