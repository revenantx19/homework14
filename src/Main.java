public class Main {
    public static void main(String[] args) {

        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 90, 60, 90, 80, 65),
                new Griffindor("Гермиона Гнейнджер", 85, 95, 55, 30, 70),
                new Griffindor("Рон Уизли", 45, 55, 85, 75, 35),
        };

        Puffenduy[] puffenduys = {
                new Puffenduy("Захария Смит", 43, 35, 80, 90, 85),
                new Puffenduy("Седрик Грегори", 75, 50, 80, 95, 45),
                new Puffenduy("Джастин Финч-Флетчли", 20, 25, 35, 64, 61),
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу Чанг", 50, 45, 45, 58, 59, 23),
                new Kogtevran("Падма Патил", 43, 56, 76, 22, 46, 36),
                new Kogtevran("Маркус Белби", 33, 66, 12, 53, 65, 90),
        };
        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 54, 44, 80, 57, 95, 20, 100),
                new Slizerin("Грэхэм Монтегю", 35, 20, 20, 40, 21, 10, 50),
                new Slizerin("Грегори Гойл", 40, 60, 40, 21, 53, 50, 60),
        };
        PrintService printService = new PrintService();
        printService.print(griffindors);
        printService.print(puffenduys);
        printService.print(kogtevrans);
        printService.print(slizerins);
        printService.printPowerGriffindor(griffindors[0], griffindors[1]);
        printService.printPowerPuffenduy(puffenduys[0], puffenduys[1]);
        printService.printPowerKogtevran(kogtevrans[0], kogtevrans[1]);
        printService.printPowerSlizerin(slizerins[0], slizerins[1]);
        printService.printMostPowerfulStudent(griffindors[0], slizerins[0]);
    }
}