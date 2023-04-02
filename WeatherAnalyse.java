import java.util.*;
import java.io.*;
public class WeatherAnalyse {
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\comp\\OneDrive\\Desktop\\java\\FebAirQualityReadings.txt");
		Scanner scan=new Scanner(file);
		LinkedHashMap<String,LinkedHashMap<Integer,Integer>> data=new LinkedHashMap();
		int mostPopulated=Integer.MIN_VALUE,leastPopulated=Integer.MAX_VALUE;
		String mostPopulatedDay="",leastPopulatedDay="";
		System.out.println("  Date     PoorAir BestAir");
		while(scan.hasNextLine()) {
			String temp=scan.nextLine();
			String date=temp.substring(0,10);
			String removedate=temp.substring(10,temp.length());
			removedate=removedate.replaceAll("^\\s+","");//Left Trim
			String s[]=removedate.split("\t");
			int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
			int sum=0;
			for(int i=0;i<s.length;i++) {
				int t=Integer.parseInt(s[i]);
				sum+=t;
				max=Math.max(max,t);
				min=Math.min(min,t);
			}
			if(sum>mostPopulated) {
				mostPopulated=sum;
				mostPopulatedDay=date;
			}
			if(sum<leastPopulated) {
				leastPopulated=sum;
				leastPopulatedDay=date;
			}
			LinkedHashMap<Integer,Integer> map=new LinkedHashMap();
			map.put(min,max);
			data.put(date,map);
		}
		for(String str:data.keySet()) {
			System.out.print(str+"  ");
			for(Integer a:data.get(str).keySet()) {
				System.out.println(a+"   "+data.get(str).get(a));
			}
		}
		System.out.println("Most populated Day is "+mostPopulatedDay+" "+mostPopulated);
		System.out.println("Least Populated Day is "+leastPopulatedDay+" "+leastPopulated);
	}
}