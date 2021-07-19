
class SingleTon {
  private static final SingleTon instancia = new SingleTon();
  private String data;

  private SingleTon(){
    this.data="";
  }
  public static SingleTon getInstance(){
  return instancia;
  }
  public void setData(String data){
    this.data=data;
  }
  public String getData(){
    return this.data;
  }
}