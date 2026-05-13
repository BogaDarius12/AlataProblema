public static void main() {
    //new GUI_Form();
    Trompeta trompeta = new Trompeta();
    trompeta.play();
    trompeta.adjust();
    System.out.println(trompeta.What());

    System.out.println("-------------------------");

    Suflat suflat = new Suflat();
    suflat.play();
    suflat.adjust();
    System.out.println(suflat.What());
    new GUI_Form();
}