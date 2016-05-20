package org.jtansj.util;

import org.ansj.util.MyStaticValue;

// 设置isNameRecognition，isNumRecognition，isQuantifierRecognition
public class AnsjOptions {
	public static void setIsNameRec(Boolean isNameRec){
		MyStaticValue.isNameRecognition = isNameRec;
	}
	public static void setIsNumRec(Boolean isNumRec){
		MyStaticValue.isNumRecognition = isNumRec;
	}
	public static void setIsQuantifierRec(Boolean isQuantifierRec){
		MyStaticValue.isQuantifierRecognition = isQuantifierRec;
	}
}
