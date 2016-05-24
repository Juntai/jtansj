package org.jtansj.util;

import org.ansj.util.MyStaticValue;

// 设置isNameRecognition，isNumRecognition，isQuantifierRecognition
public class AnsjOptions {
	public static void setIsNameRec(boolean isNameRec){
		MyStaticValue.isNameRecognition = isNameRec;
	}
	public static void setIsNumRec(boolean isNumRec){
		MyStaticValue.isNumRecognition = isNumRec;
	}
	public static void setIsQuantifierRec(boolean isQuantifierRec){
		MyStaticValue.isQuantifierRecognition = isQuantifierRec;
	}
}
