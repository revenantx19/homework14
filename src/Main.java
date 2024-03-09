public class Main {
    public static void main(String[] args) {

        griffindor[] griffindors = {
                new griffindor("Гарри Поттер", 90, 60, 90, 80, 65),
                new griffindor("Гермиона Гнейнджер", 85, 95, 55, 30, 70),
                new griffindor("Рон Уизли", 45, 55, 85, 75, 35),
        };

        puffenduy[] puffenduys = {
                new puffenduy("Захария Смит", 43, 35, 80, 90, 85),
                new puffenduy("Седрик Грегори", 75, 50, 80, 95, 45),
                new puffenduy("Джастин Финч-Флетчли", 20, 25, 35, 64, 61),
        };
        kogtevran[] kogtevrans = {
                new kogtevran("Чжоу Чанг", 50, 45, 45, 58, 59, 23),
                new kogtevran("Падма Патил", 43, 56, 76, 22, 46, 36),
                new kogtevran("Маркус Белби", 33, 66, 12, 53, 65, 90),
        };
        slizerin[] slizerins = {
                new slizerin("Драко Малфой", 54, 44, 80, 57, 95, 20, 100),
                new slizerin("Грэхэм Монтегю", 35, 20, 20, 40, 21, 10, 50),
                new slizerin("Грегори Гойл", 40, 60, 40, 21, 53, 50, 60),
        };
        PrintService printService = new PrintService();
        printService.print(griffindors);
        printService.print(puffenduys);
        printService.print(kogtevrans);
        printService.print(slizerins);
        printService.printPowerGriffindor(griffindors);
        printService.printPowerPuffenduy(puffenduys);
        printService.printPowerKogtevran(kogtevrans);
        printService.printPowerSlizerin(slizerins);
        printService.printMostPowerfulStudent(griffindors, slizerins);
    }
}