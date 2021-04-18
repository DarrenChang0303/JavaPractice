/*
 * @Author: your name
 * @Date: 2021-04-15 23:26:11
 * @LastEditTime: 2021-04-19 00:46:38
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \HeroAttack\src\Battle.java
 */
public class Battle {
    private Hero[] heroes = new Hero[2];

    public Battle(Hero hero1, Hero hero2) {
        this.heroes[0] = hero1;
        this.heroes[1] = hero2;
    }

    public void start() {
        int turn = 1;

        while (!isBattleOver()) {
            turn = turn == 0 ? 1 : 0;
            processHeroTurn(turn);
        }
        System.out.printf("Winner is %s. \n",heroes[turn].getName());
    }

    private boolean isBattleOver(){
        return !(heroes[0].isAlive()&&heroes[1].isAlive());
    }

    private void processHeroTurn(int heroIndex){
        Hero attackingHero = heroes[heroIndex];
        Hero attackedHero = heroes[heroIndex == 0? 1:0];
        System.out.printf("It's %s turn. \n",attackingHero.getName());
        attackedHero.attack(attackedHero);

    }

}
