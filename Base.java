import java.util.Scanner;

   public class Base{
   
      public static void main(String[] args){
      
         Scanner p = new Scanner(System.in);
         
            System.out.println("What do you need? Press:");
            System.out.println("1. + - * /");
            System.out.println("2. a^2 + b^2 = c^2");
            System.out.println("3. Average");
            
            String t = p.next();
            
         if (t.equals("1")){
         
               System.out.print("What do you need: + - * / ?");
               String r = p.next();
               
            if (r.equals("+")){
               
               System.out.print("How many numbers would you like to add?");
               int numbers = p.nextInt();
               int sum = 0;
               
               for (int i=0;i<numbers;i++){
                  
                  System.out.print(i + 1 + ". Number is: ");
                  int next = p.nextInt();
                  sum += next;
               }
               System.out.print("Sum is " + sum);
            }
            
            else if (r.equals("-")){
            
               System.out.print("How many numbers would you like to substract? ");
               int numbers = p.nextInt();
               int sum = 0;   
              
         }
         
         else if (t.equals("2")){
         
               System.out.print("What do you need: a, b or c? ");
               String k = p.next();
      
            if (k.equals("a")){
         
               System.out.print("Whats b: ");
               double b = p.nextDouble();
   
               System.out.print("Whats c: ");
               double c = p.nextDouble();
  
               System.out.println("b = " + b + " c = " + c);
      
               System.out.println("a = " + Math.sqrt(c*c - b*b));
            }
            
            else if (k.equals("b")){
         
               System.out.print("Whats a: ");
               double a = p.nextDouble();
   
               System.out.print("Whats c: ");
               double c = p.nextDouble();
  
               System.out.println("b = " + a + " c = " + c);
      
               System.out.println("a = " + Math.sqrt(c*c - a*a));
            }
            
            else if (!k.equals("c")){
  
               System.out.println("Error 404");
               return;
            }
                  
            else {
         
               System.out.print("Whats a: ");
               double a = p.nextDouble();
   
               System.out.print("Whats b: ");
               double b = p.nextDouble();
  
               System.out.println("a = " + a + " b = " + b);
      
               System.out.println("c = " + Math.sqrt(a*a + b*b));
            }
               return;
         }
         else if (t.equals("3")){
                               
            System.out.println("How many numbers?");
            int numbReq = p.nextInt();
            int sum = 0;
            
            for (int i=0;i<numbReq;i++){
         
            System.out.print(i + 1 + " number is ");
            int next = p.nextInt();
            sum += next;
            }
            
            double average = (double) sum /numbReq;
            System.out.print("Gennemsnittet er disse verdier er " + average);
            return;
         }
         else {
            System.out.print("Error 404 Press 1, 2 or 3");
         }
      }
   }