/*
 * @Author: your name
 * @Date: 2021-04-15 23:43:37
 * @LastEditTime: 2021-04-19 01:32:13
 * @LastEditors: Please set LastEditors
 * @Description: Practice "Strategy Pattern"
 * @FilePath: \HeroAttack\src\main.java
 */
/**
 * main
 */
public class main {
    
    public static void main(String[] args) {
        Hero hero1 = new Hero("ABC",new Waterball());
        Hero hero2 = new Hero("abc",new Colliding());

        Battle battle = new Battle(hero1, hero2);
        battle.start();
    }
    
}
