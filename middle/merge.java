/*
 * 
 * 
 * 
 * 
 * 
 给出一个区间的集合，请合并所有重叠的区间。

示例 1:

输入: [[1,3],[2,6],[8,10],[15,18]]
输出: [[1,6],[8,10],[15,18]]
解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
示例 2:

输入: [[1,4],[4,5]]
输出: [[1,5]]
解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。 
 * 
 * 
 * 
 * 
 * 
 * 
 */




//package ceshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class merge {
	
	public class Interval {
		int start;
		int end;
		Interval() { start = 0; end = 0; }
		Interval(int s, int e) { start = s; end = e; }
	}
	
	public List<Interval> merge(List<Interval> intervals) {
	        
    	List<Interval> result = new ArrayList<>();
        List<Interval> temp = intervals;
        
        if(intervals.isEmpty()){return result;}
        
        Collections.sort(temp,new Comparator<Interval>(){
            @Override
            public int compare(Interval a,Interval b){
                return a.start - b.start;
            }
        });
        
        Iterator<Interval> it = temp.iterator();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        while(it.hasNext()){
            Interval s = it.next();
            if(end >= s.start && end <= s.end){end = s.end;continue;}
            else if(end >= s.start && end > s.end){continue;}
            result.add(new Interval(start,end));
            start = s.start;
            end = s.end;
        }
        result.add(new Interval(start,end));
        return result;
    }
}

