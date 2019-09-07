import java.util.*;
class EndSort
{
    String s;
    int N;
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        N = sc.nextInt();
        System.out.println("Enter the numbers separated by a space");
        s = sc.next();
    }
    
    void output(String out)
    {
        System.out.println("The sorted elements are:" + out);
    }
    
    void sort()
    {   
        int i = 0;
        char ele = ' ';
        while(ele != '\0'){
            char ele = s.charAt(i);
            if(ele == ' ')
            {
                i++;
            }
            else{
                if (ele > s.charAt(i+2)){
                    
                }
            }
        }
        
        
    }
}
