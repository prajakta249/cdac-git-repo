class Fibonnacci
{
  public static void main(String[] args)
  {
    int n=10, f1=0, s1=1;
    System.out.println("Fibonnacci Series till " +n+ " terms: " );
    for(int i=1;i<=n;i++)
    {
      System.out.println(f1 + ", ");
      int nextTerm = f1+s1;
      f1=s1;
      s1=nextTerm;
      
      
    }
  }
}
