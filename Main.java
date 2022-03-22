class Main {
  public static void main(String[] args) {
    int parzysta=1;
      for(int i=49;parzysta<=i;parzysta++)
        {
          if(parzysta%2==0)
            System.out.println(parzysta);
        }
    parzysta=50;
      for(int i=100;parzysta<=i;parzysta++)
        {
          if(parzysta%2 != 0)
            System.out.println(parzysta);
        }
    }
  }