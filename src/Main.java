public class Main
{
    //method to calculate 10 pin bowling score for valid input
    public static int bowlingScore(String gameScores)
{
    int score=0;
    int length=0;
    
    //remove empty spaces from input
    String game=gameScores.replaceAll("\\s+", "");
    
    //check for strike or spare in 10th turn
    if (game.charAt(game.length()-3)=='X' || game.charAt(game.length()-3)=='x')
    length=game.length()-2;
    else if (game.charAt(game.length()-2)=='/')
    length=game.length()-1;
    else
    length=game.length();
    
   for (int i=0;i<length;i++)
   {
       char prev='#';
       
       if (i>0)
       prev=game.charAt(i-1);
       
       if (getCharScore(game.charAt(i),prev)==-1)
       {
       score=-1;
       break;
       }
       else if (game.charAt(i)=='X' || game.charAt(i)=='x')
       score+=10+getCharScore(game.charAt(i+1),game.charAt(i))+getCharScore(game.charAt(i+2),game.charAt(i+1));
       else if (game.charAt(i)=='/')
       score+=getCharScore(game.charAt(i),prev)+getCharScore(game.charAt(i+1),game.charAt(i));
       else if (game.charAt(i)=='-')
       continue;
       else
       score+=getCharScore(game.charAt(i),prev);
       
   }
   
   return score;
    
}

   public static int getCharScore(char ch,char prev)
   {
      
       if (ch=='X' || ch=='x')
       return 10;
       else if (ch=='-')
       return 0;
       else if (ch=='/')
       {
           if (prev=='-')
           return 10;
           else
           return 10-Character.getNumericValue(prev);
       }
       else if (Character.getNumericValue(ch)>0 && Character.getNumericValue(ch)<10)
       return Character.getNumericValue(ch);
       else return -1;
       
   }
	public static void main(String args[]) 
	{
		for (int i=0;i<args.length-1;i++)
		args[0]+=args[i+1];
		
		System.out.println("Total score is:"+bowlingScore(args[0]));
		
	}
}
