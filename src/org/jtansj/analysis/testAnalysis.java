package org.jtansj.analysis;

import java.util.List;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.NlpAnalysis;

import org.jtansj.util.Filter;
import org.jtansj.util.Transfer;

public class testAnalysis {
	public static String parse(String str, String stopWords){
		// 从NlpAanalysis获得分词结果
		List<Term> rawResult = NlpAnalysis.parse(str);
		
		
		// 过滤停用词
		String[] sws = stopWords.split(" ");
	    Filter.insertStopWord(sws);
		
		rawResult = Filter.modifyResult(rawResult);

		return Transfer.transfer(rawResult);		
	}
	public static String parseList(String str, String method, List<String> stopWords, List<String> naturesInclude, List<String> naturesRemove){
		
		String result = JtAnalysis.parse(str, method, stopWords.toArray(new String[0]), naturesInclude.toArray(new String[0]), naturesRemove.toArray(new String[0]));
		return result;
	}
	public static String getListContent(List<String> stopWords){
		String result = stopWords.getClass().getName() + ":";
		for(String term: stopWords){
			result = result + term + ",";
		}
		return result;
	}
	public static String getArrayContent(String[] stopWords){
		String result = stopWords.getClass().getName() + ":";
		for(String term: stopWords){
			result = result + term + ",";
		}
		return result;
	}
}
