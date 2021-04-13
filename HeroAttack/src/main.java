/**
 * main
 */
public class main {
    
    public static void main(String[] args) {
        Hero hero1 = new Hero("ABC",Hero.Skill.COLLIDING);
        Hero hero2 = new Hero("abc",Hero.Skill.WATERBALL);

        Battle battle = new Battle(hero1, hero2);
        battle.start();
    }
    
}
