class Main {
  public static void main(String[] args) {
    System.out.println("The Video Game Price is: ");
    System.out.println(vgPrice(60, 40) + " dollars");
  }


static int vgPrice(int A, int B){
  int videoGamePrice =  A - B;
  return videoGamePrice;  
}
}
