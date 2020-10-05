public class BeerSong {
    public static void main(String[] args){
        int beerNum = 99;
        String word = "бутылки ";

        while (beerNum > 0) {
            if (beerNum == 1) word = "бутылка ";
            //if (beerNum (90, 80, 70, 60, 50, 40, 30, 20, 10) word = "бутылок ";
            //System.out.println(beerNum + " " + word + "пива на стене");
            //System.out.println(beerNum + " " + word + "пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            System.out.println(" ");
            beerNum = beerNum - 1;
            if (beerNum > 0) System.out.println(beerNum + " " + word + "пива на стене");
            else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}
