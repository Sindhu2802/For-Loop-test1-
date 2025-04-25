import java.util.Scanner;
//Grading system
public class TestEX1{
    public static void main(String[] args)
    {
        int sub1 = 90;
        int sub2 = 78;
        int sub3 = 67;
        int sub4 = 45;
        int  sub5  = 35;

        int Total = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Enter the Total marks:"+ Total);
        int avg = Total/5;
        System.out.println("Enter the avg marks :"+avg );
        

      if(avg>=90)
      {
        System.out.println("My grade is A");
      }
      else if(avg>=80)
      {
        System.out.println("My grade is B");

      }
      else if(avg>=70)
      {
        System.out.println("My grade is C");
      }
      else if(avg>=60)
      {
        System.out.println("My grade is D");
      
      } else{
        System.out.println("My grade is F");
      }
    }
}


//prime numbers
class PrimeNum{
    public static void main(String[] args)
    {
        
        for(int i =2;i<=100;i++)
        {
            boolean prime = true;
            
            for(int j =2;j<i;j++)
            {
                if(i%j==0)
                {
                  prime = false;
                  break;
                }
            }
                
            if(prime)
            {
                System.out.println(i+" ");
            }
            }
        }
}

//reverse numbers

class reverse{
    public static void main(String[] args)
            {
                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
             
        int reversed = 0;

    
        while (a != 0) {
            int digit = a % 10;      
            reversed = reversed * 10 + digit; 
            a = a / 10;            
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);
    }
}


//armstrong
class Armstrong{
    public static void main(String[] args)
    {
       System.out.println("Armstrong numbers 1 to 999 are :");
        for(int i =1;i<=999;i++)
        {
            int n = i; //temp var
            int sum = 0;
            for(int j =n;j>0;j=j/10)
            {
                int digit = j % 10;
                sum =  sum +(digit*digit*digit);

            }
            if(sum==n)
            {
                System.out.println(n + " is a Armstrong number");
            }
            else{
                  //System.out.println(n + " is a not Armstrong number");
            }
        }
    }
}
    
    //number to word converter
class NumToWord
{
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");        

        int num = scan.nextInt();
        
        int reversed = 0;
          
        
        while(num>0){
                
            reversed = reversed * 10 +num % 10; 
            num = num / 10;  
        }
        while(reversed>0){
            int word = reversed % 10;
            reversed = reversed /  10;
        
        switch(word) {
            case 0:
                System.out.print(" Zero ");
                break;
            case 1:
                System.out.print(" One ");
                break;
            case 2:
                
                System.out.print(" Two ");
                break;
             case 3:
                System.out.print(" Three "); 
                break;
            case 4:
                System.out.print(" Four ");   
                break;
            case 5:
                System.out.print(" Five ");
                break;
            case 6:
                System.out.print(" Six");
                break;
            case 7:
                System.out.print(" Seven ");
                break;
            case 8:
                System.out.print(" Eight ");
                break;
            default:
            

        }


        
        }
    }



//fibonacci


class Fibonacci{
    public static void main(String[] args)
    {
       int n = 20;
       int a =0,b=1,c=0;
       System.out.println("Fibonacci series upto :" + n  );

       do{
        if(c>=1){
            System.out.println(c+" ");
        }
        a = b;
        b=c;
        c = a+b;
       }
        while(c<=n);
    
       }


    }

    //Magical number
class Magical {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
         int sum =0;

        while (num >9) {
            sum = 0; 
            int temp = num;
               
            
            while(temp>0){
            sum += temp % 10;
            temp = temp / 10;
        }
        num = sum ;
      
        }

        if (num== 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not a Magic Number");
        }


        scanner.close();
    }
}





  



//login attempt

class LoginAttempt{
    public static void main(String[]  args)
    {
       Scanner scan = new Scanner(System.in);
       int CorrectAccountNumber = 12345;
       int CorrectPIN = 2801;
      int i =0;
        while(i<=3)
        {
        
            System.out.println(" Enter the AccountNumber:" );
            int AccountNumber  =scan.nextInt();

            System.out.println("Enter the PINnumber :");
            int PINnumber = scan.nextInt();
           
           if(AccountNumber == CorrectAccountNumber && PINnumber == CorrectPIN){
            System.out.println("Login success");
           }
           else if(i==3)
           {
            System.out.println("Account locked");
            }

            else{
                System.out.println("try again");
               
            }
            i++; 
            
              
           }
         
           
        }
    }

    //numbers problems

class Patnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println(" Check Even or Odd");
            System.out.println(" Check Prime");
            System.out.println(" Reverse a Number");
            System.out.println("Exit");
            System.out.println("Enter your choice:");
            
            
            choice = scan.nextInt();  // Reading user's menu choice

            switch (choice) {
                case 1:
                    System.out.print("Enter the number: ");
                    int num1 = scan.nextInt();
                    if (num1 % 2 == 0) {
                        System.out.println(num1 + " is an even number.");
                    } else {
                        System.out.println(num1 + " is an odd number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the number: ");
                    int n = scan.nextInt();
                    boolean prime = true;

                    if (n <= 1) {
                        prime = false;
                    } else {
                        for (int j = 2; j <= n / 2; j++) {
                            if (n % j == 0) {
                                prime = false;
                                break;
                            }
                        }
                    }

                    if (prime) {
                        System.out.println(n + " is a prime number.");
                    } else {
                        System.out.println(n + " is not a prime number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the number: ");
                    int num2 = scan.nextInt();
                    int reversed = 0;
                    while (num2 != 0) {
                        int digit = num2 % 10;
                        reversed = reversed * 10 + digit;
                        num2 = num2 / 10;
                    }
                    System.out.println("Reversed Number: " + reversed);
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("  select between 1 and 4.");
                    
            } 
            

        } while(choice !=4);
        

        scan.close();
    }
}





//patterns 
class Patproblems {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);

       int pattern = scan.nextInt();

       System.out.println("Select the pattern :" + pattern);

        switch (pattern) {
            case 1:
                System.out.println("Square pattern:");
                int n = 5;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("Triangle pattern:");
                int r = 5;
                for (int i = 1; i <= r; i++) {
                    
                    for (int spa = 1; spa <= r - i; spa++) {
                        System.out.print(" ");
                    }
                    
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("X Pattern:");
                int k = 5;
                for (int i = 0; i < k; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j == i || j == 4 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println(" exiting");
        }

      
    }
}

//incre decre

class IncreDecre{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First NUmber : ");
        int a = scan.nextInt();
        System.out.println("Enter the Second number : ");
        int b = scan.nextInt();
        System.out.println("Enter the Third number : ");
        int c = scan.nextInt();
        
        if(a < b && b < c)
        {
             System.out.println("Increasing order");
        }
             else if (a > b && b > c)
            {
                System.out.println("Decreasing order");
            }
                else 
                {
                    System.out.println(" Neither increasing or decreasing order");
                }
    }
}

// pyramid 
class PyramidRepeats{
    public static void main(String[] args)
    {
   int r = 4;
    for(int i =1;i<=r;i++)
 {
    for(int spa =1;spa<=r-i;spa++)
  {
      System.out.print(" ");
  }
   for(int j =1;j<=i;j++)
  {
    System.out.print(i+" ");
  }
    System.out.println();
 }
    }

    }

class PatternRepeats{
    public static void main(String[] args) {
        int r = 4;
        int num = 0;
        for (int i = 1; i <= r; i++){
            num = num + i;
            for (int spa = 1; spa <= r - i; spa++) {
                System.out.print(" ");
            }
            int val = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val--;
            }
            System.out.println();
        }
    }
}

            
         
    


