//Codificado por sAfOrAs
public class SyGSucesiones
{
    static int a[] = new int[100];
 
    static void llenarArreglo()
    {         
        for(int i=0;i<a.length;i++)
        {
            a[i]=(i+1);
        }       
    }
 
    static void arregloSucesivo()
    {
        int b=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=b+a[i];
            b=a[i];
        }
    }
 
    static void imprimirArreglo()
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
     
        System.out.println("");
    }
 
    public static void main(String[] args)
    {
        llenarArreglo();
        arregloSucesivo();
        imprimirArreglo();
    }
}
