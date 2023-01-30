import java.util.*;  
public class Binarysearch_with_Bubblesort 
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); 
int i,size,temp,Start = 0,Search,c=0;
int Mid;

System.out.println("Enter the size of array");  //Taking the size of array from user
size = sc.nextInt(); 

int[] Data = new int[size];
int Finish = size-1;

for (i=0;i<size;i++)// Taking the input from the user
{
System.out.println("Enter "+(i+1)+" number -->");  
Data[i]= sc.nextInt();  
}

System.out.println("Entered Data by the User"); //Showing the entered data

for(i=0;i<size;i++)
{
    System.out.print(Data[i]+" ,");
}

for(i=0;i<size;i++)
{
    for(int j=0;j<(size-i-1);j++)
    {
        if(Data[j]>Data[j+1])
        {
            temp = Data[j];
            Data[j]= Data[j+1];
            Data[j+1]=temp;
        }
    }
}

System.out.println("\nSorted Data -->");
for(i=0;i<size;i++)
{
    System.out.print(Data[i]+" ,");
}
System.out.println("\nEnter the searching Number/Element -->");
Search =sc.nextInt();

while(Start <= Finish)
{
  Mid = (Start+Finish)/2;
  if(Search == Data[Mid])
  {
    System.out.println("\nEntered Searching Element is present at location "+(Mid+1));
    c=1;
    break;
  }
  else if (Search < Data[Mid])
  {
    Finish = Mid-1;
  }
  else if (Search > Data[Mid])
  {
    Start = Mid+1;
  }
}
if(c!=1)
{
    System.out.println("Entered Searching Element is NOT Present");
}
}  
}  