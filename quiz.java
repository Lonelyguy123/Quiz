import java.util.*;
class quiz
{
   Scanner sc = new Scanner(System.in);
   public void main()
   {
       int a = 0;
       do
       {
           int score = 0;char opt = 'e';
           System.out.println("Primary quiz will start now.U will reach the secondary quiz if u qualify in the this one");
           System.out.println("First question");
           System.out.println("For which of the following principles is the nobel price awarded?");
           System.out.println("Options-a-Literature,Peace and economics,b-Physics and Chemistry,c-Physiology or Medicine,d-All of the above");
           System.out.println("Enter your choice");
           opt = sc.next().charAt(0);
           if (opt == 'd' || opt == 'D')
           {
               System.out.println("Your answer is correct");
               score++;
           }
           else
           System.out.println("Your answer is incorrect");
           System.out.println("Second question");
           System.out.println("Friction can be reduced by changing from what to what?");
           System.out.println("Options-a-rolling to sliding,b-sliding to rolling,c-dynamic to static,d-potential to kinetic energy");
           System.out.println("Enter your choice");
           opt = sc.next().charAt(0);
           if (opt=='b' || opt=='B')
           {
               System.out.println("Your answer is correct");
               score++;
           }
           else
           System.out.println("Your answer is incorrect");
           System.out.println("Third question");
           System.out.println("DRDL stands for?");
           System.out.println("Options-a-Defense research and Developement laboratory,b-Differential research and Documentaion,c-Departement of research and Developement laboratory,d-None of the above");
           System.out.println("Enter your choice");
           opt = sc.next().charAt(0);
           if (opt=='a' || opt=='A')
           {
               System.out.println("Your answer is correct");
               score++;
           }
           else
           System.out.println("Your answer is incorrect");
           System.out.println("Fourth question");
           System.out.println("Who was Dr. Zakir Hussain?");
           System.out.println("Options-a-First vice president of India,b-First Speaker of Lok sabha,c-First Muslim president of India,d-First president of the Indian National Congress");
           System.out.println("Enter your choice");
           opt = sc.next().charAt(0);
           if (opt=='c' || opt=='C')
           {
               System.out.println("Your answer is correct");
               score++;
           }
           else
           System.out.println("Your answer is incorrect");
           if (score>2)
           {
               System.out.println("You have successfully qualified for the secondary quiz,it will start now");
               score = 0;
               System.out.println("First question");
               System.out.println("India has the largest deposits of what in the world?");
               System.out.println("Options-a-copper,b-gold,c-mica,d-none of the above");
               System.out.println("Enter your choice");
               opt = sc.next().charAt(0);
               if (opt=='c' || opt=='C')
               {
                  System.out.println("Your answer is correct");
                  score++;
               }
               else
               System.out.println("Your answer is incorrect");
               System.out.println("Second question");
               System.out.println("Which was India's first satellite?");
               System.out.println("Options-a-Aryabhatta,b-Bhaskara 1,c-Bhaskara 2,d-Brahmamihir");
               System.out.println("Enter your choice");
               opt = sc.next().charAt(0);
               if (opt=='a' || opt=='A')
               {
                  System.out.println("Your answer is correct");
                  score++;
               }
               else
               System.out.println("Your answer is incorrect");
               System.out.println("Third question");
               System.out.println("In Which year did terrorists crash two planes into New York's World Trade Centre on September 11?");
               System.out.println("Options-a-2000,b-2001,c-2002,d-2003");
               System.out.println("Enter your choice");
               opt = sc.next().charAt(0);
               if (opt=='b' || opt=='B')
               {
                  System.out.println("Your answer is correct");
                  score++;
               }
               else
               System.out.println("Your answer is incorrect");
               System.out.println("Fourth question");
               System.out.println("In which season we need more fat?");
               System.out.println("Options-a-spring,b-winter,c-summer,d-rainy");
               System.out.println("Enter your choice");
               opt = sc.next().charAt(0);
               if (opt=='b' || opt=='B')
               {
                  System.out.println("Your answer is correct");
                  score++;
               }
               else
               System.out.println("Your answer is incorrect");
               if (score>2)
               {
                   score=0;
                   System.out.println("You have qualified for the final quiz,it will start now");
                   System.out.println("First question");
                   System.out.println("When was Indira Gandhi assassinated?");
                   System.out.println("Options-a-1982,b-1984,c-1987,1983");
                   System.out.println("Enter your choice");
                   opt = sc.next().charAt(0);
                   if (opt=='b' || opt=='B')
                   {
                       System.out.println("Your answer is correct");
                       score++;
                    }
                   else
                   System.out.println("Your answer is incorrect");
                   System.out.println("Second question");
                   System.out.println("Where is the satellite launching station located in India?");
                   System.out.println("Options-a-Sriharikota(Andhra Pradesh),b-Salem(Tamil Nadu),c-Solapur(Maharashtra),d-Warangal(Andhra Pradesh)");
                   System.out.println("Enter your choice");
                   opt = sc.next().charAt(0);
                   if (opt=='a' || opt=='A')
                   {
                       System.out.println("Your answer is correct");
                       score++;
                   }
                   else
                   System.out.println("Your answer is incorrect");
                   System.out.println("Third question");
                   System.out.println("What are the number of countries in the United Nations?");
                   System.out.println("Options-a-180,b-181,c-191,d-195");
                   System.out.println("Enter your choice");
                   opt = sc.next().charAt(0);
                   if (opt=='c' || opt=='C')
                   {
                       System.out.println("Your answer is correct");
                       score++;
                   }
                   else
                   System.out.println("Your answer is incorrect");
                   System.out.println("Fourth question");
                   System.out.println("Who was the freedom fighter who died when the British lathi charged on him?");
                   System.out.println("Options-a-Bal Ganghadhar Tilak,b-Lala Lajpat Rai,c-Bipin Chandra Pal,d-Gopal Krishna Gokhale");
                   System.out.println("Enter your choice");
                   opt = sc.next().charAt(0);
                   if (opt=='c' || opt=='C')
                   {
                       System.out.println("Your answer is correct");
                       score++;
                   }
                   else
                   System.out.println("Your answer is incorrect");
                   System.out.println("Your score in the final quiz is" + score);
                }
               else
               {
                   System.out.println("You have not qualified for the final quiz,your secondary quiz score is" + score);
               }
            }
           else
           {
               System.out.println("You have not qualified for the secondary quiz,your primary quiz score is" + score);
           }
           System.out.println("Enter 1 if u want to try again");
           a = sc.nextInt();
        }
        while (a==1);
    }
}
        
    

       
            
                   
                   
                       
                   
           
               
               
           
               
           
           
           
           
           
           
       
       
       
   
   
