//package com.common.base.util;
//import java.util.ArrayList;  
//import java.util.List;  
//
//import javafx.scene.control.Pagination;
//  
//public class PagerFactory {  
//    public static <T> Pagination createEmpty() {  
//        return create(1, 10);  
//    }  
//  
//    public static <T> Pagination create(Number pageIndex, Number pageSize) {  
//        return create(pageIndex, pageSize);  
//    }  
//  
//    public static <T> Pagination create(Number pageIndex, Number pageSize, Number rowsCount) {  
//        return create(pageIndex, pageSize, rowsCount);  
//    }  
//  
//    public static <T> Pagination create(Number pageIndex, Number pageSize, Number rowsCount, List<T> data) {  
//        Pagination p = new Pagination();  
//        if (data == null) {  
//            data = new ArrayList<T>(0);  
//        }  
//        p.setId(data);  
//        return p;  
//    }  
//  
//    public static <T> List<T> getPaginList(List<T> allList, int pageIndex, int pageSize) {  
//        List<T> result = new ArrayList<T>();  
//        int start = pageIndex < 2 ? 0 : ((pageIndex - 1) * pageSize);  
//        int end = start + pageSize > allList.size() ? allList.size() : start + pageSize;  
//        for (int i = start; i < end; i++) {  
//            result.add(allList.get(i));  
//        }  
//        return result;  
//    }  
//}  