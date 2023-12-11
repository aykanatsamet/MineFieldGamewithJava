package MayinTarlasi;



public class GameTable {

	 public String[][] DrawTable=  { {" "," "," "," "},{" "," "," "," "} ,{" "," "," "," "},{" "," "," "," "}};
	 
public void Table() {
	
	int i,j;
	
	System.out.println("_____________");
   for(i=0;i<4;i++) {
	 for(j=0;j<4;j++) {
		   System.out.print("| "+DrawTable[i][j]);
	 }
	 System.out.print("|");
	 System.out.println();
	 System.out.println("_____________");
		
	    }
  

}

public void ChangeTable(int number,int satir,int sutun) {
	
	DrawTable[satir-1][sutun-1]=Integer.toString(number);
	Table();
		
}

public void winTable() {
	   for(int k=0;k<DrawTable.length;k++) {
	    	 
	    	 for(int m=0;m<DrawTable[0].length;m++) {
	    		 if(DrawTable[k][m]==" ")
	    			 DrawTable[k][m]="X";
                       }
                 }
	   Table();

      }
public void loseTable(String[][] BombTable) {
	  for(int k=0;k<DrawTable.length;k++) {
	    	 
	    	 for(int m=0;m<DrawTable[0].length;m++) {
	    		 if(BombTable[k][m]=="1") {
	    			 BombTable[k][m]="X";
	    			 DrawTable[k][m]=BombTable[k][m]; 
	    		        }
	    
                   }
              }
	 Table();
	
}


}
