//Codificado por sAfOrAs
public class Matriz
{
    static int MAX=100;
    static int a1[]=new int[MAX];
    static void rellenaraleatorios(int x[])
    {
        for(int i=0;i<x.length;i++)      
        {
            x[i]=(int)(Math.random()*100+1);
        }
    }
     
    static void imprimir(int x[])
    {
        for(int i=0;i<x.length;i++)
        {                    
            if(i%10==0)
                System.out.print(" \n ");
             
            System.out.print("  "+(i+1));
        }
    }
 
    //static void muestre(int y[])
    //{
//      System.out.print()
//  }
 
    public static void main(String[] args)
    {
        rellenaraleatorios(a1);
        imprimir(a1);
    }
}
