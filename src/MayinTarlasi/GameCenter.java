package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;



public class GameCenter {
	


	public static void main(String[] args) {
		
		 Random ran= new Random();
		 Scanner scan= new Scanner(System.in);
		
 GameTable table=new GameTable();
CheckBomb checking= new CheckBomb();
 
 
 String[][] BombTable= new String[4][4];
 
 for(int i=0;i<4;i++)
 {
  int x=ran.nextInt(4);
  int y=ran.nextInt(4);
  BombTable[x][y]="1";
 }
 
 System.out.println("***MAYIN TARLASI OYUNUNA HOŞGELDİNİZ***");
 table.Table();

  int counter=0;
  boolean game=true;

 while(game) {
 

 int satir,sutun;
	
while(true) {
	
	while(true) {
	try {
	System.out.print("Satır numarasını giriniz:");
	satir=scan.nextInt();
	
	System.out.print("Sütun numarasını giriniz:");
	sutun=scan.nextInt();
	break;
	}
	catch (java.util.InputMismatchException e) {
		System.out.println("Lütfen satır sütun değerlerini sayı giriniz!");
		scan.next();
	}
	}

	boolean answer=checking.CheckRepeatCheckSpacing(satir, sutun);
	if(answer==true)
    break;
	else
	continue;
	

}

int x=checking.BombCheck(BombTable,satir, sutun);

if(x==0) {
System.out.println("Bombaya bastınız! Oyun bitti.");
table.loseTable(BombTable);
break;
}	

int bombNumber=checking.ControlBomb(BombTable,satir,sutun);

table.ChangeTable(bombNumber,satir,sutun);

counter++;
if(counter==12) {
	game=false;
     System.out.println("Oyunu kazandınız. Tebrikler!");
     table.winTable();
       }
 
    }
	
  }
	
}


