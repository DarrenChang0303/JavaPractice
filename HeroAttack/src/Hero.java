public class Hero {
    private String name; // 名字
    private int hp = 500; // 生命
    private int mp = 200; // 魔力
    private int strength = 150; // 力量
    private int wisdom = 80; // 智力
    private int defense = 50; // 防禦力
    private Skill skill; // 技能

    // public enum Skill {
    //     COLLIDING, WATERBALL
    // }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(Hero targetHero){
        int damage = skill.attack(this, targetHero);
        System.out.printf("%s使用%s，造成%d的傷害。\n",getName(),skill,damage);
        System.out.printf("%s的HP為%d。\n",targetHero.getName(),targetHero.getHp());
    }

    // public void attack(Hero targetHero) {
    // switch (skill) {
    // case COLLIDING:
    // System.out.printf("%s使用 衝撞攻擊 \n",getName());
    // targetHero.lostHp(getStrength() - targetHero.getDefense());
    // break;
    // case WATERBALL:
    // System.out.printf("%s使用 水球攻擊 \n",getName());
    // lostMp(5);
    // // TODO:處理Mp不足狀況
    // targetHero.lostHp(getWisdom() * 2);
    // break;

    // }
    // }

    public void lostHp(int hp) {
        setHp(getHp() - hp);
    }

    public void lostMp(int mp) {
        if (getMp() < mp) {
            System.out.println("Don't have enough Mp");
        } else {
            setMp(getMp() - mp);
        }
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
