import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("what is your video games name?");
    String name = scan.next();
    System.out.println(videoGameName(name));
    System.out.println("The Video Game Price is: " + vgPrice(60, 40) + " dollars");
  }

  static String videoGameName(String name) {
    String vgname = "your video games name is : " + name;
    return vgname;
    //This should print the video game name

  }

  static int vgPrice(int A, int B) {
    int videoGamePrice = A - B;
    return videoGamePrice;
    // this prints the video game price
  }
}
