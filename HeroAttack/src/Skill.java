/*
 * @Author: your name
 * @Date: 2021-04-16 16:55:20
 * @LastEditTime: 2021-04-15 20:30:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \HeroAttack\src\Skill.java
 */
/**
 * @param <Hero>
 * @description: 
 * @param attackingHero 攻擊者
 * @param attackedHero  被攻擊者
 * @return 回傳此次攻擊的傷害值
 */
public interface Skill {

    int attack(Hero attackingHero,Hero attackedHero);
    
}
