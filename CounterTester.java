// Counter Tester
public class CounterTester
{
   public static void main(String[] args)
   {
	//provide body here
      Counter myCounter = new Counter ();
      
            int counterValue = myCounter.getValue();
            System.out.println("Expected: 0");
            System.out.println("Observed: " + counterValue);
            
            myCounter.click();
            myCounter.click();
            counterValue = myCounter.getValue();
            System.out.println("\nExpected: 2");
            System.out.println("Observed: " + counterValue);
            
            myCounter.reset();
            counterValue = myCounter.getValue();
            System.out.println("\nExpected: 2");
            System.out.println("Observed: " + counterValue);
                                                          }
                                                         
  }                                 
