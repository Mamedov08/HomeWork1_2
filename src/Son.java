

public final class Son extends Father {
    public Son (String name, int age, colorEnum colorEnum, Babyk babyk) {
        super(name, age, colorEnum, babyk);

    }
    @Override
    public void makeHit() {
        System.out.println("Сын");
    }

}