package ALL;

//WAP to enter a char and check that it is vowel or not

import java.util.Scanner;

class AEIOU {

    public static void main(String[] args) 
    {

        char ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the char");
        ch=scan.next().toUpperCase().charAt(0);
    //     if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    //     System.out.println("Its Vowel");
    //     else
    //     System.out.println("Its Consonenet");
        
    // }
//}



switch(ch)
{
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
    System.out.println("Its Vowel");

    break;
    default:
    System.out.println("Its Consenent");
}
    }
}