/*
 * @Author: your name
 * @Date: 2021-04-15 14:45:27
 * @LastEditTime: 2021-04-19 00:57:47
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \HeroAttack\src\Waterball.java
 */
public class Waterball implements Skill {
    @Override
    public int attack(Hero attackingHero, Hero attackedHero) {
        attackingHero.lostMp(5);
        int damage = 2 * attackingHero.getWisdom();
        attackedHero.lostHp(damage);
        return damage;
    }
    @Override
    public String toString(){
        return "WaterBall";
    }

}
