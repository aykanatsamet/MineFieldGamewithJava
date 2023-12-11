package MayinTarlasi;

import java.util.HashSet;
import java.util.Set;


public class CheckBomb {
	 Set<String> girilenDegerler =new HashSet<>();
	
	
public boolean CheckRepeatCheckSpacing(int x,int y)
{
	String str=Integer.toString(x)+","+Integer.toString(y);
	
	if(x<1 || x>4 || girilenDegerler.contains(str)) {
		System.out.println("Tekrar değer giriniz, (1-4) arasında ve tekrarsız!");
		return false;
	}
	if(y<1 || y>4 || girilenDegerler.contains(str)) {
		System.out.println("Tekrar değer giriniz! (1-4) arasında ve tekrarsız");
		return false;
	}
	
	girilenDegerler.add(str);
			
		
	return true;
}


public int BombCheck(String[][] bombTable,int a,int b) {
	
	if(bombTable[a-1][b-1]=="1") {
			
		return 0;
			
		}

		return 1;
} 



public int ControlBomb(String[][] BombTable,int satir,int sutun) {
	
	int x=0;
	
	if(satir-1==0 && sutun-1==0)
	{
	if(BombTable[1][0]=="1")
		x++;
	if(BombTable[0][1]=="1")
	   x++;
	if(BombTable[1][1]=="1")
		   x++;
	return x;
	}
	
	if(satir-1==0 && sutun-1==BombTable[0].length-1)
	{
	if(BombTable[satir-1][BombTable[0].length-2]=="1")
		x++;
	if(BombTable[satir][BombTable[0].length-2]=="1")
	   x++;
	if(BombTable[satir][BombTable[0].length-1]=="1")
		x++;
	return x;
	}
	if(satir-1==BombTable.length-1 && sutun-1==0)
	{
	if(BombTable[BombTable.length-2][sutun-1]=="1")
		x++;
	if(BombTable[BombTable.length-2][sutun]=="1")
	   x++;
	if(BombTable[BombTable.length-1][sutun]=="1")
		x++;
	return x;
	}
	if(satir-1==BombTable.length-1 && sutun-1==BombTable[0].length-1)
	{
	if(BombTable[satir-1][BombTable[0].length-2]=="1")
		x++;
	if(BombTable[BombTable.length-2][sutun-1]=="1")
	   x++;
	if(BombTable[BombTable.length-2][BombTable[0].length-2]=="1")
		x++;
	return x;
	}
	
 
	  
   if(satir-1==0 && sutun-1<BombTable[0].length-1 && sutun-1>0) {
	  
	   if(BombTable[satir-1][sutun-2]=="1")
		   x++;
	   if(BombTable[satir-1][sutun]=="1")
		   x++;
	   if(BombTable[satir][sutun-2]=="1")
	     x++;
	   if(BombTable[satir][sutun-1]=="1")
		   x++;
	   if(BombTable[satir][sutun]=="1")
		  x++;  
	   
	   return x;
   }
	
   if(sutun-1==0 && satir-1<BombTable.length-1 && satir-1>0) {
		  
	   if(BombTable[satir-2][sutun-1]=="1")
		   x++;
	   if(BombTable[satir][sutun-1]=="1")
		   x++;
	   if(BombTable[satir-2][sutun]=="1")
	     x++;
	   if(BombTable[satir-1][sutun]=="1")
		   x++;
	   if(BombTable[satir][sutun]=="1")
		  x++;  
	   
	   return x;
   }
   
   
   if(satir-1==BombTable.length-1 && sutun-1<BombTable[0].length-1 && sutun-1>0) {
		  
	   if(BombTable[satir-1][sutun-2]=="1")
		   x++;
	   if(BombTable[satir-1][sutun]=="1")
		   x++;
	   if(BombTable[satir-2][sutun-2]=="1")
	     x++;
	   if(BombTable[satir-2][sutun-1]=="1")
		   x++;
	   if(BombTable[satir-2][sutun]=="1")
		  x++;  
	   
	   return x;
   }
   
   if(sutun-1==BombTable[0].length-1 && satir-1<BombTable.length-1 && satir-1>0) {
		  
	   if(BombTable[satir-2][sutun-1]=="1")
		   x++;
	   if(BombTable[satir][sutun-1]=="1")
		   x++;
	   if(BombTable[satir-2][sutun-2]=="1")
	     x++;
	   if(BombTable[satir-1][sutun-2]=="1")
		   x++;
	   if(BombTable[satir][sutun-2]=="1")
		  x++;  
	   
	   return x;
   }
   
   for(int i=1;i<BombTable.length-1;i++)
   {
   for(int j=1;j<BombTable[0].length-1;j++) {
	   
	   if(BombTable[satir-1][sutun-1]==BombTable[i][j]) {
		   
		   if(BombTable[satir-2][sutun-2]=="1")
			   x++;
		   if(BombTable[satir-1][sutun-2]=="1")
			   x++;
		   if(BombTable[satir][sutun-2]=="1")
			   x++;
		   if(BombTable[satir-2][sutun-1]=="1")
			   x++;
		   if(BombTable[satir][sutun-1]=="1")
			   x++;
		   if(BombTable[satir-2][sutun]=="1")
			   x++;
		   if(BombTable[satir-1][sutun]=="1")
			   x++;
		   if(BombTable[satir][sutun]=="1")
			   x++;
		   
	 return x;
			
	      }
	   
       }
   }
		
		

	return x;
}

}
