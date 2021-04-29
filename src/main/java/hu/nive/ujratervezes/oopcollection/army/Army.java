package hu.nive.ujratervezes.oopcollection.army;

public class Army {

    int healthPoints;
    int damagePoints;
    boolean shield;

    public int addUnit(MilitaryUnit militaryUnit) {
        return 1;
    }

    public damageAll(int damage) {
        --healthPoints;

    }

    public getArmyDamage() {
        return damagePoints;
    }

    public getArmySize() {
        return addUnit(MilitaryUnit militaryUnit);

    }


}


//addUnit(MilitaryUnit militaryUnit), amivel egy katonai egységet tudunk hozzáadni a sereghez,
//
//damageAll(int damage), ami a sereg minden egységének életerejéből levonja a paraméterül kapott értéket,
//valamint eltávolítja a seregből azokat az egységeket, melyeknek így 25 pont alá csökkent az életerejük
//(azaz harcképtelenek vagy halottak),
//
//getArmyDamage(), ami visszaadja, hogy az aktuális támadással mennyi sebzést okoz a sereg összesen,
//
//getArmySize(), ami visszaadja, hogy hány egységből áll a sereg.