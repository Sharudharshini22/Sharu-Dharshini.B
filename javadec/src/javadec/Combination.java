package javadec;

public class Combination {

	public static void main(String[] args) {
    int arr[]= {4,5,8};
    int i,j,k;
    for(i=0;i<arr.length;i++)
    {
    	for(j=0;j<arr.length;j++)
    	{
    		for(k=0;k<arr.length;k++)
    		{
    			if(i!=j && j!=k &&i!=k)
    			{
    		      System.out.println(arr[i]+""+ arr[j]+""+ arr[k]);
    		   
    			}
    		}
    		
    	}
	}

}
}