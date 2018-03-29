package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一个 24 小时制（小时:分钟）的时间列表，找出列表中任意两个时间的最小时间差并已分钟数表示。


示例 1：

输入: ["23:59","00:00"]
输出: 1

备注:

列表中时间数在 2~20000 之间。
每个时间取值在 00:00~23:59 之间。
 * @author wangzhi
 *
 */
public class leetcode539 {
	public static int findMinDifference(List<String> timePoints) {
		int a[]=new int[timePoints.size()];
		for (int i=0;i<timePoints.size();i++){
			a[i]=getNum(timePoints.get(i));
		}
		Arrays.sort(a);
		int min=24*60 ;
		for (int i=0;i<timePoints.size()-1;i++){
			if(min>a[i+1]-a[i]){
				min =a[i+1]-a[i];
			}
		}
		int last =24*60+a[0]-a[timePoints.size()-1];
		min=min<last?min:last;
		return min;
	}
	public static int getNum(String a){
		int time=0;
		time = a.charAt(0)*10*60+ a.charAt(1)*60+ a.charAt(3)*10+ a.charAt(4);
		return time;
	}
}
