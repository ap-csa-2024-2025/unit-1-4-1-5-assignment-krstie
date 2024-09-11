public class Problem3
{
  public static void main(String[] args)
  {
    int value = 2931;
    System.out.println("Four digit number:");
    System.out.println(value);
    int valFour = (value % 2930);
    int valThree = (value % 2928);
    int valTwo = (value % 2922);
    int valOne =(value % 2929);
    System.out.println("Here are the digits:");
    System.out.println(valFour);
    System.out.println(valThree);
    System.out.println(valTwo);
    System.out.println(valOne);
  }
}