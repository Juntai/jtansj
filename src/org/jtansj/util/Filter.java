package org.jtansj.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.ansj.domain.Term;

// 对分词结果过滤停用词和词性

public class Filter {
	private static Set<String> StopWords = new HashSet<String>();
	private static List<String> NaturesInclude = new ArrayList<String>();
	private static List<String> NaturesRemove = new ArrayList<String>();
	
	// 添加停用词
	public static void insertStopWord(String[] sws){
		StopWords.addAll(Arrays.asList(sws));
	}
	// 清除停用词词典
	public static void clearStopWord(){
		StopWords.clear();
	}
	// 停用词典是否为空
	public static Boolean stopWordsIsEmpty(){
		return StopWords.isEmpty();
	}
	// 当前的停用词
	public static String[] showStopWords(){
		return StopWords.toArray(new String[0]);
	}
	// 添加需要提取的词性
	public static void insertNaturesInclude(String[] nis){
		NaturesInclude.addAll(Arrays.asList(nis));
	}
	// 添加需要去除的词性
	public static void insertNaturesRemove(String[] nrs){
		NaturesRemove.addAll(Arrays.asList(nrs));
	}
	// 删除停用词，提取指定词性或删除指定词性
	// 注意：提取词性和删除词性只能一个有效
	public static List<Term> modifyResult(List<Term> all){
		List<Term> result = new ArrayList<Term>();
		for(Term term: all){
			if(StopWords.size()>0 && StopWords.contains(term.getRealName())){
				continue;
			}
			
			if(NaturesRemove.size()>0 && NaturesRemove.contains(term.getNatureStr())){
				continue;
			}else if(NaturesInclude.size()>0 && !NaturesInclude.contains(term.getNatureStr())){
				continue;
			}
			
			result.add(term);
		}
		return result;
	}
	
}
