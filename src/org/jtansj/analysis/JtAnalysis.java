package org.jtansj.analysis;
import java.util.ArrayList;
import java.util.List;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.BaseAnalysis;
import org.ansj.splitWord.analysis.DicAnalysis;
import org.ansj.splitWord.analysis.FastIndexAnalysis;
import org.ansj.splitWord.analysis.IndexAnalysis;
import org.ansj.splitWord.analysis.NlpAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;

import org.jtansj.util.Filter;
import org.jtansj.util.Transfer;

public class JtAnalysis {
	
	public static String[] parse(String str, String method, boolean stopWords, String[] naturesInclude,
			String[] naturesRemove){
		// 根据method选择分词方法，从ansj获得分词结果
		List<Term> rawResult = new ArrayList<Term>();
		if("nlp".equals(method)){
		    rawResult = NlpAnalysis.parse(str);
		}else if("dic".equals(method)){
			rawResult = DicAnalysis.parse(str);  //用户自定义词典优先，设置见org.ansj.util.MyStaticValue.LIBRARYLOG
		}else if("to".equals(method)){
			rawResult = ToAnalysis.parse(str);
		}else if("base".equals(method)){
			rawResult = BaseAnalysis.parse(str);
		}else if("index".equals(method)){
			rawResult = IndexAnalysis.parse(str);
		}else if("fastIndex".equals(method)){
			rawResult = FastIndexAnalysis.parse(str);
		}
		
		// 处理停用词和词性，保留词性和删除词性只能一个有效
//		if(naturesInclude.length > 0){
//			Filter.insertNaturesInclude(naturesInclude);
//		}else if(naturesRemove.length > 0){
//			Filter.insertNaturesRemove(naturesRemove);
//		}
		if((stopWords && !Filter.stopWordsIsEmpty()) || naturesInclude.length > 0 || naturesRemove.length > 0){
			rawResult = Filter.modifyResult(rawResult, naturesInclude, naturesRemove);
		}

		return Transfer.transfer(rawResult);		
	}

}
