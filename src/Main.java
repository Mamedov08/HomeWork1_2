public class Main {
    public static void main(String[] args) {

    Babyk babyk = new Babyk("face");
    Father father = new Father("Хан", 18, colorEnum.Black, babyk);
        System.out.println(father.getInfo());
        father.lega("Welcome");
        father.makeHit();
        System.out.println("---------");


        Babyk babyk1 = new Babyk("Beige");
        Son son = new Son("Islam", 12, colorEnum.Black, babyk);
        System.out.println(son.getInfo());
        father.lega("THE END");


    }
}
