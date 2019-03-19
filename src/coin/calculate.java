package coin;

public class calculate {

	public static int panduan(int a){
		int fif_num=1,twe_num=1,fiv_num=2,one_num=3;
		int b=a;
		//int c=0;
		if(b%50==0&&b/50<=fif_num)
			return 1;
		else 
			b=b-(b/50)*50;
		if(b%20==0&&b/20<=twe_num)
			return 1;
		else 
			b=b-(b/20)*20;
		if(b%5==0&&b/5<=fiv_num)
			return 1;
		else 
			b=b-(b/5)*5;
		if(b/1<=one_num)
			return 1;
		else
			return 0;
		
		
	}
}
