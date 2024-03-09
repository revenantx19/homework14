public class PrintService {

    public void printMostPowerfulStudent(griffindor[] griffindors, slizerin[] slizerins) {
        griffindor harry = griffindors[0];
        slizerin malfoi = slizerins[0];
        int powerHarry = harry.getMagicPower() + harry.getDistanceTransgression();
        int powerMalfoi = malfoi.getMagicPower() + malfoi.getDistanceTransgression();
        if (powerHarry > powerMalfoi) {
            System.out.println(harry.getName() + " обладает бОльшей мощностью магии, чем " + malfoi.getName());
        } else if (powerHarry == powerMalfoi) {
            System.out.println(harry.getName() + " и " + malfoi.getName() + " равны по силе");
        } else {
            System.out.println(malfoi.getName() + " обладает бОльшей мощностью магии, чем " + harry.getName());
        }
    }
    public void print(griffindor[] griffindors) {
        for (int i = 0; i < griffindors.length; i++) {
            griffindor person = griffindors[i];
            System.out.println("Имя: " + person.getName()
                    + "; Сила магии: " + person.getMagicPower()
                    + "; Дистанция перемещения: " + person.getDistanceTransgression()
                    + "; Благородство: " + person.getNobility()
                    + "; Честь: " + person.getHonor()
                    + "; Храбность: " + person.getBravery());
        }
        System.out.println();
    }
    public void printPowerGriffindor(griffindor[] griffindors) {
        griffindor harry = griffindors[0];
        griffindor hermiona = griffindors[1];
        int powerHarry = harry.getBravery() + harry.getHonor() + harry.getNobility();
        int powerHermiona = hermiona.getBravery() + hermiona.getHonor() + hermiona.getNobility();
        if (powerHarry > powerHermiona) {
            System.out.println(harry.getName() + " лучший Гриффиндорец, чем " + hermiona.getName());
        } else if (powerHarry == powerHermiona) {
            System.out.println(harry.getName() + " и " + hermiona.getName() + " равны по характеристикам");
        } else {
            System.out.println(hermiona.getName() + " лучший Гриффиндорец, чем " + harry.getName());
        }
        System.out.println();
    }
    public void print(puffenduy[] puffenduys) {
        for (int i = 0; i < puffenduys.length; i++) {
            puffenduy person = puffenduys[i];
            System.out.println("Имя: " + person.getName()
                    + "; Сила магии: " + person.getMagicPower()
                    + "; Дистанция перемещения: " + person.getDistanceTransgression()
                    + "; Трудолюбие: " + person.getHardworking()
                    + "; Верность: " + person.getHonest()
                    + "; Честность: " + person.getRight());
        }
        System.out.println();
    }
    public void printPowerPuffenduy(puffenduy[] puffenduys) {
        puffenduy zaxaria = puffenduys[0];
        puffenduy sedric = puffenduys[1];
        int powerZaxaria = zaxaria.getHardworking() + zaxaria.getHonest() + zaxaria.getRight();
        int powerSedric = sedric.getHardworking() + sedric.getHonest() + sedric.getRight();
        if (powerZaxaria > powerSedric) {
            System.out.println(zaxaria.getName() + " лучший Пуффендуец, чем " + sedric.getName());
        } else if (powerZaxaria == powerSedric) {
            System.out.println(zaxaria.getName() + " и " + sedric.getName() + " равны по характеристикам");
        } else {
            System.out.println(sedric.getName() + " лучший Пуффендуец, чем " + zaxaria.getName());
        }
        System.out.println();
    }
    public void print(kogtevran[] kogtevrans) {
        for (int i = 0; i < kogtevrans.length; i++) {
            kogtevran person = kogtevrans[i];
            System.out.println("Имя: " + person.getName()
                    + "; Сила магии: " + person.getMagicPower()
                    + "; Дистанция перемещения: " + person.getDistanceTransgression()
                    + "; Ум: " + person.getSmart()
                    + "; Мудрость: " + person.getWise()
                    + "; Остроумие: " + person.getWitty()
                    + "; Творчество: " + person.getCreative());
        }
        System.out.println();
    }
    public void printPowerKogtevran(kogtevran[] kogtevrans) {
        kogtevran chzhou = kogtevrans[0];
        kogtevran padma = kogtevrans[1];
        int powerChzhou = chzhou.getSmart() + chzhou.getWise() + chzhou.getWitty() + chzhou.getCreative();
        int powerPadma = padma.getSmart() + padma.getWise() + padma.getWitty() + padma.getCreative();
        if (powerChzhou > powerPadma) {
            System.out.println(chzhou.getName() + " лучший Пуффендуец, чем " + padma.getName());
        } else if (powerChzhou == powerPadma) {
            System.out.println(chzhou.getName() + " и " + padma.getName() + " равны по характеристикам");
        } else {
            System.out.println(padma.getName() + " лучший Пуффендуец, чем " + chzhou.getName());
        }
        System.out.println();
    }
    public void print(slizerin[] slizerins) {
        for (int i = 0; i < slizerins.length; i++) {
            slizerin person = slizerins[i];
            System.out.println("Имя: " + person.getName()
                    + "; Сила магии: " + person.getMagicPower()
                    + "; Дистанция перемещения: " + person.getDistanceTransgression()
                    + "; Хитрость: " + person.getTricky()
                    + "; Решительность: " + person.getResolute()
                    + "; Амбициозность: " + person.getAmbition()
                    + "; Находчивость: " + person.getResourcefulness()
                    + "; Жажда власти: " + person.getThirstOfPower());
        }
        System.out.println();
    }
    public void printPowerSlizerin(slizerin[] slizerins) {
        slizerin malfoi = slizerins[0];
        slizerin grehem = slizerins[1];
        int powerMalfoi = malfoi.getTricky() + malfoi.getResolute() + malfoi.getAmbition() + malfoi.getResourcefulness() + malfoi.getThirstOfPower();
        int powerGrehem = grehem.getTricky() + grehem.getResolute() + grehem.getAmbition() + grehem.getResourcefulness() + grehem.getThirstOfPower();
        if (powerMalfoi > powerGrehem) {
            System.out.println(malfoi.getName() + " лучший Пуффендуец, чем " + grehem.getName());
        } else if (powerMalfoi == powerGrehem) {
            System.out.println(malfoi.getName() + " и " + grehem.getName() + " равны по характеристикам");
        } else {
            System.out.println(grehem.getName() + " лучший Пуффендуец, чем " + malfoi.getName());
        }
        System.out.println();
    }

}
