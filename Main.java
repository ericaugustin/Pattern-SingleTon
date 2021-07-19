
class Main {
  public static void main(String[] args) {
    SingleTon teste1;
    teste1=SingleTon.getInstance();
    teste1.setData("Teste");
    System.out.println(teste1);
    System.out.println(teste1.getData());

    SingleTon teste2;
    teste2=SingleTon.getInstance();
    System.out.println(teste2);
    System.out.println(teste2.getData());

  }
}