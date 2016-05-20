package org.jtansj.util;

import static org.ansj.util.MyStaticValue.LIBRARYLOG;

import java.io.File;

import org.ansj.library.UserDefineLibrary;
import org.ansj.util.MyStaticValue;
import org.nlpcn.commons.lang.tire.library.Library;
import org.nlpcn.commons.lang.util.StringUtil;

// 歧义词典的设置、加载和清空
public class AmbiguityLibrary {
	public static void set(String ambiguityLibrary){
		MyStaticValue.ambiguityLibrary = ambiguityLibrary;
	}
	
	public static void load() {
		String ambiguityLibrary = MyStaticValue.ambiguityLibrary;
		if (StringUtil.isBlank(ambiguityLibrary)) {
			LIBRARYLOG.warn(
					"init ambiguity  warning :" + ambiguityLibrary + " because : file not found or failed to read !");
			return;
		}
		ambiguityLibrary = MyStaticValue.ambiguityLibrary;
		File file = new File(ambiguityLibrary);
		if (file.isFile() && file.canRead()) {
			try {
				UserDefineLibrary.ambiguityForest = Library.makeForest(ambiguityLibrary);
			} catch (Exception e) {
				LIBRARYLOG.warn("init ambiguity  error :" + new File(ambiguityLibrary).getAbsolutePath()
						+ " because : not find that file or can not to read !");
//				e.printStackTrace();
			}
			LIBRARYLOG.info("User sets ambiguityLibrary ok!");
		} else {
			LIBRARYLOG.warn("init ambiguity  warning :" + new File(ambiguityLibrary).getAbsolutePath()
					+ " because : file not found or failed to read !");
		}
	}
	
	// 清空歧义词典
	public static void clear(){
		UserDefineLibrary.ambiguityForest = null;
	}

}
