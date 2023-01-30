public class TheRunningTotal{
  public static void main(String[] args){
    int runningTotal = 0;
    int firstsum, secondsum,  thirdsum, fourthsum;
    firstsum = runningTotal + 5;
    secondsum = firstsum + 8;
    thirdsum = secondsum + 2;
    fourthsum = thirdsum + 3;
    runningTotal = fourthsum;
    System.out.println("At first the Running Total is "+ 0);
    System.out.println("After adding 5 to it, the Running Total is "+ firstsum);
    System.out.println("After adding 8 to it, the Running Total is "+ secondsum);
    System.out.println("After adding 2 to it, the Running Total is "+ thirdsum);
    System.out.println("After adding 3 to it, the Running Total is "+ fourthsum);
    System.out.println("Finally the Running Total is "+ runningTotal);

  }
}
