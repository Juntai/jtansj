package org.jtansj.analysis;

//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.ansj.domain.Term;
import org.ansj.library.UserDefineLibrary;
import org.ansj.recognition.NatureRecognition;
import org.ansj.splitWord.analysis.*;
import org.ansj.util.FilterModifWord;
import org.ansj.util.MyStaticValue;
import org.jtansj.util.Filter;
import org.jtansj.util.Transfer;


public class test {

	public static void main(String[] args) {	
		/* 测试：更改StaticValues.isNameRecognition是否立即生效；
		 * 结果：立即生效。
		 * */
//		List<Term> parse = NlpAnalysis.parse("毛小平是我们的伟大领袖。");
//	    System.out.println(parse);
//		MyStaticValue.isNameRecognition = false;
//		List<Term> parse1 = NlpAnalysis.parse("毛小平是我们的伟大领袖。");
//	    System.out.println(parse1);
//		MyStaticValue.isNameRecognition = true;
//		List<Term> parse2 = NlpAnalysis.parse("毛小平是我们的伟大领袖。");
//	    System.out.println(parse2);
	    
		/* 测试：更改StaticValues.isNumRecognition和isQuantifierRecognition是否立即生效；
		 * 结果：立即生效。
		 * */
//		List<Term> parse = ToAnalysis.parse("小明买了五十五斤梨。");
//	    System.out.println(parse);
//		MyStaticValue.isNumRecognition = false;
//		MyStaticValue.isQuantifierRecognition = true;
//		List<Term> parse1 = ToAnalysis.parse("小明买了五十五斤梨。");
//	    System.out.println(parse1);
//		MyStaticValue.isNumRecognition = false;
//		MyStaticValue.isQuantifierRecognition = false;
//		List<Term> parse2 = ToAnalysis.parse("小明买了五十五斤梨。");
//	    System.out.println(parse2);
//		MyStaticValue.isNumRecognition = true;
//		MyStaticValue.isQuantifierRecognition = false;
//		List<Term> parse3 = ToAnalysis.parse("小明买了五十五斤梨。");
//	    System.out.println(parse3);
		
	    /* 测试：更改用户词典设置是否立即生效；
		 * 结果：立即生效。
		 * */
		Set<String> StopWords = new HashSet<String>();
		System.out.println(StopWords.isEmpty());
		StopWords.clear();
		System.out.println(StopWords.isEmpty());
//		List<Term> parse = NlpAnalysis.parse("ansj分词是一个好分词软件。");
//	    System.out.println(parse);
//		MyStaticValue.userLibrary = "library/my.dic";
//		UserDefineLibrary.clear(); // 清空用户词典
//		UserDefineLibrary.loadLibrary(UserDefineLibrary.FOREST, MyStaticValue.userLibrary);
//		List<Term> parse1 = NlpAnalysis.parse("ansj分词是一个好分词软件。");
//	    System.out.println(parse1);
	
	    
		// TODO Auto-generated method stub
//		String[] stringarr = new String[]{"a","b"};
//		List<String> stringlist = Arrays.asList(stringarr);
//		System.out.println(testAnalysis.getArrayContent(stringarr));
//		System.out.println(testAnalysis.getListContent(stringlist));


//	    String str = "让战士们过一个欢乐祥和的新春佳节。";
//	    String[] naturesInclude = new String[]{"n", "nz"};
//	    String[] naturesRemove = new String[]{"v", "m"};
//	    String[] stopWords = new String[]{"的"};
//	    String[] methods = new String[]{"nlp", "dic", "to", "base", "index", "fastIndex"};
//	    String method = new String("nlp");
//	    String s = JtAnalysis.parse(str, method, stopWords, naturesInclude, naturesRemove);
//	    System.out.println(s);
//	    String s1 = JtAnalysis.parse(str, methods[0], stopWords, naturesInclude, naturesRemove);
//	    System.out.println(s1);

//	    for(String method: methods){
//	    	System.out.println(method + ":");
////	    	String s = JtAnalysis.parse(str, method, stopWords, naturesInclude, naturesRemove);
//	    	String s = testAnalysis.parseList(str, method, Arrays.asList(stopWords), Arrays.asList(naturesInclude), Arrays.asList(naturesRemove));
//            System.out.println(s);
//	    }

	    
	    // 基本分词
//		List<Term> parse = BaseAnalysis.parse("让战士们过一个欢乐祥和的新春佳节。");
//	    System.out.println(parse);
////	    new NatureRecognition(parse).recognition();
////        System.out.println(parse);	        
	    // 精准分词	
//		List<Term> parse = NlpAnalysis.parse("让战士们过一个欢乐祥和的新春佳节。");
//	    System.out.println(parse);		
//	    // 面向索引的分词
//	    List<Term> parse3 = IndexAnalysis.parse("旅游和美食");
//	    System.out.println(parse3);
//	    new NatureRecognition(parse3).recognition();
//	    System.out.println(parse3);
//      // 快速索引分词
//	    List<Term> parse4 = FastIndexAnalysis.parse("旅游和美食");
//	    System.out.println(parse4);
//	    // 用户自定义词典优先分词
//	    List<Term> parse5 = DicAnalysis.parse("让战士们过一个欢乐祥和的新春佳节。");
//	    System.out.println(parse5);
	}

}
