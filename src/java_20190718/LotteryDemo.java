package java_20190718;

public class LotteryDemo {
	public static void main(String[] args) {
		//Math.random() => 0 蹂대떎 �겕嫄곕굹 媛숆퀬 1蹂대떎 �옉�� �뼇�닔瑜� 
		//double 媛믪쑝濡� 諛섑솚�븳�떎.
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			//temp�뒗 1蹂대떎 �겕嫄곕굹 媛숆낵 45 蹂대떎 �옉嫄곕굹 媛숈� �엫�쓽�쓽 媛�
			//留ㅻ쾲 �깉濡� �깮�꽦�릺�뼱�빞 �븳�떎.
			double random = Math.random();
			int temp = (int)(random * 45) + 1;
			
			if(i==0) {//泥ル쾲吏� 諛⑹� 臾댁“嫄� �엫�쓽�쓽 媛� temp瑜� ���옣�븳�떎.
				lotto[i] = temp;
			}else {
				//isExisted�뒗 �엫�쓽�쓽 媛� temp�� �씠�쟾 諛곗뿴�쓽 媛믪쓣 鍮꾧탳
				//�뻽�쓣 �븣 �룞�씪�븳 媛믪씠 �엳�뒗 寃쎌슦�뒗 true, �뾾�쑝硫� false
				boolean isExisted = false;
				//i==1 �븘�옒�쓽 for loop�뒗 1踰� 諛섎났
				//i==2 �븘�옒�쓽 for loop�뒗 2踰� 諛섎났
				//i==3 �븘�옒�쓽 for loop�뒗 3踰� 諛섎났 .....
				for(int j=0;j<i;j++) {
					if(lotto[j]==temp) {
						//�깉濡� �깮�꽦�븳 temp�� �씠�쟾 諛곗뿴�쓽 媛믪쓣
						//鍮꾧탳�빐�꽌 媛숈� 媛믪씠 議댁옱�븯硫� 
						isExisted = true;
						break;
					}
				}
				
				if(!isExisted) {
					lotto[i] = temp;
				}else {
					i--;//�씠�쟾 �쐞移섎줈 蹂�寃쏀븯硫� for臾몄뿉�꽌 i++濡� 
					//利앷��븯湲� �븣臾몄뿉 �썝 �쐞移섎줈 �떎�떆 �떆�룄�븷 �닔 �엳�쓬.
				}
			}
			
		}
		
		for(int i=0;i<lotto.length;i++) {
			for (int j = 0; j < lotto.length-(i+1); j++) {
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + ",");
		}
		
		
		
		
		
		
	}
}

