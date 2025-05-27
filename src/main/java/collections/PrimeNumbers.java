package collections;


import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers{
	   public static void main (String[] args){
        	     int i=0;
             int num=0;
        	     List<Integer> primeList=new ArrayList<>();
            for(i=1;i<=20;i++)
                 {
            	       int counter=0;
                   for(num=i;num>=1;num--)
                       {
                	        if (i%num==0)
                    	        {
                    	          counter=counter+1;}
                       }
                   if(counter==2)
                	       {
                	        primeList.add(i);
                	       }
            	     }

        	     System.out.println(primeList);
        	     }

    }
