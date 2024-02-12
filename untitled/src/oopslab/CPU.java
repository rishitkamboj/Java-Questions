package oopslab;

/* implement a class CPU having private data members manufacturer and price. two inner classes processor and ram .
processor class have private data member no_of_cores, manufacturer and private method getCache() and setCache()..
ram class have private data members memory and manufacturer..... and private methods getClockSpeed() and setClockSpeed().
finally implement a driver class main to create a CPU object and display all the details of that object in user console.
*/

 class CPU1{
   private String manufacturer;
   private float price;

    class Processor{
     private int no_of_cores;
     private String manufacturer;

     private int getCache(){
         return 123;
     }
      int get(){
         return getCache();
     }


   private void setCache(){
       System.out.println("Set the cache value");
       return;
   }
    void set(){
         setCache();
   }
   }

    public class Ram{
       private long memory;
       private String manufacturer;

       private int getClockspeed(){
           return 123;
       }
       public int getClock(){
           return getClockspeed();
       }
   private void setClockspeed(){
       System.out.println("Set the clock speed");
   }
   public void setClock(){
         setClockspeed();
   }
   }

}

public class CPU{
    public static void main(String[] args) {

        CPU1 cpu = new CPU1();
        CPU1.Processor processor = cpu.new Processor();
        int cacheValue = processor.get();
        System.out.println("Cache Value: " + cacheValue);
        processor.set();
        CPU1.Ram ram = cpu.new Ram();
        int clockSpeed = ram.getClock();
        System.out.println("Clock Speed: " + clockSpeed);
        ram.setClock();
    }

}
