import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("what is your video games name?");
    String name = scan.next();
    System.out.println(videoGameName(name));
    System.out.println("How much is the video game?");
    int price = scan.nextInt();
    System.out.println("How much do you have?");
    int amount = scan.nextInt();

    // This prints the statement that includes the vgPrice method
    System.out.println("Your leftover amount is: " + vgPrice(amount, price) + " dollars");
  }

  static String videoGameName(String name) {
    String vgname = "your video games name is : " + name;
    return vgname;
    // This should print the video game name
  }

  static int vgPrice(int amount, int price) {
    int videoGamePrice = amount - price;
    return videoGamePrice;
    // this prints the video game price
  }
}
