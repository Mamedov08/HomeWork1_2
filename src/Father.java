public class Father extends Family {

    private Babyk babyk;

    public Father (String name , int age , colorEnum colorEnum, Babyk Babyk) {
        super(name, age , colorEnum, Babyk);
        this.babyk= babyk;

    }

    @Override
    public colorEnum getBabyk() {
        return colorEnum.Beige;

    }
    public void makeHit () {
        System.out.println("Teacher!");
    }

    public void lega (String solo) {
        System.out.println(solo);
    }
    public final String getInfo() {
        return "Name: " +getName() +
                "\nAge: " + getAge() +
                "\nColorHair: " + getColorEnum() +
                "\nColorBody: " + getBabyk();


    }




}
