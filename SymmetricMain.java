
import java.util.Scanner;
class SymmetricMain
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Akshara Anilkumar\n Rollno:23MCA009\n date: 14-FEB-2024");
System.out.println("enter the order of matrix");
int m=in.nextInt();
int n=in.nextInt();
int matrix1[][]=new int[m][n];
int matrix2[][]=new int[m][n];

System.out.println("enter the elements of matrix");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
matrix1[i][j]=in.nextInt();
}
}
System.out.println("entered matrix :");

for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(matrix1[i][j]+" ");
}
System.out.println();
}

if(m != n)
{
System.out.println("cannot find symmetric");
}
else
{
 boolean sym=true;
 for(int i=0;i<m;i++)
 {
 for(int j=0;j<n;j++)
 {
 if(matrix1[i][j]!=matrix1[j][i])
 sym=false;
}
}
if(sym)
{
System.out.println("matrix is symmetric matrix");
}
else
{
System.out.println("matrix is not symmetric matrix");
}
}
}
}
