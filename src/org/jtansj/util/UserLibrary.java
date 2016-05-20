package org.jtansj.util;

import org.ansj.library.UserDefineLibrary;
import org.ansj.util.MyStaticValue;

// 用户自定义字典设置
public class UserLibrary {
	// 设置用户字典路径
	public static void set(String userLibrary){
		MyStaticValue.userLibrary = userLibrary;
	}
	// 先清空，再加载用户字典
	public static void load(){
		UserDefineLibrary.clear(); // 清空用户词典
		UserDefineLibrary.loadLibrary(UserDefineLibrary.FOREST, MyStaticValue.userLibrary);

	}
//	// 插入用户字典,测试未通过，字典不生效，先弃用
//	public static void insert(){
//		UserDefineLibrary.loadLibrary(UserDefineLibrary.FOREST, MyStaticValue.userLibrary);
//
//	}
	// 清空用户字典
	public static void clear(){
		UserDefineLibrary.clear();
	}

}
