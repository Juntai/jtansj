package org.jtansj.util;

import java.util.List;

import org.ansj.domain.Term;
//import org.apache.commons.lang3.StringUtils;

// 转换分词结果为字符串形式，词与词性之间用“|”隔开，词与词之间用空格隔开
public class Transfer{
	public static String[] transfer(List<Term> rawResult){
		String[] results = new String[rawResult.size()];
		int i=0;
		for(Term term: rawResult){
			results[i] = term.getRealName() + "/" + term.getNatureStr();
			i++;
		}
//		String str = StringUtils.join(results, " ");
		return results;
	}
}
