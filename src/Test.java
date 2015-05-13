import java.util.Collections;
import java.util.List;


public class Test {

    /**
     * <pre>
     * 
     * </pre>
     *
     * @param args
     */
    public static void main(String[] args) {

//    	//LinkedHashMap<String, String> tmp = new LinkedHashMap<String, String>();
//    	Map<String, String> tmp = new HashMap<String, String>();
//    	  tmp.put("a", "aaa");
//    	  tmp.put("a", "ccc");
//    	  tmp.put("b", "bbb");
//    	  tmp.put("d", "ddd");
//    	  Iterator<String> iterator_2 = tmp.keySet().iterator();
//    	  while (iterator_2.hasNext()) {
//    	  Object key = iterator_2.next();
//    	  System.out.println("tmp.get("+key+") is :" + tmp.get(key));
//    	  }
//    	SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd"); // 日期格式
//    	SimpleDateFormat dfTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");// 时间格式
//		Calendar date = Calendar.getInstance(); // 当前时间
//		date.set(Calendar.DATE, date.get(Calendar.DATE) + 1); // 日期 加1 天
//		String ymd = dfDate.format(date.getTime()); // 获取日期格式
//		try {
//	        Date vaildDate = dfTime.parse(ymd +"  10:10:10" ); // 获取 时间
//	        System.out.println(vaildDate.toString());
//        } catch (ParseException e) { // 有异常 就返回 当前时间
//        }
//		Calendar date = Calendar.getInstance(); // 当前时间
//		int nowHour=date.get(Calendar.HOUR_OF_DAY);
//		 System.out.println(nowHour);
    	
//    	
//    	List<Long> list = new ArrayList<Long>();
//    	
//    	list.add(1L);
//    	list.add(2L);
//    	list.add(3L);
//    	list.add(4L);
//  	
//
//    	System.out.println(list.toString());
//    	LinkedHashSet<Long> leftCateAdvCodeSet= new LinkedHashSet<Long>();
//    	leftCateAdvCodeSet.add(1L);
//    	leftCateAdvCodeSet.add(2L);
//    	leftCateAdvCodeSet.add(3L);
//    	leftCateAdvCodeSet.add(4L);
//    	List<Long> leftCateAdvCodeList=new ArrayList<Long>(leftCateAdvCodeSet);
//    	for(Long l:leftCateAdvCodeList){
//    		System.out.println(l);
//    	}
    	
//    	String ids="123";
//		ids = ids.trim();
//		String[] idArray = ids.split(",");
//		List<Long> result = new ArrayList<Long>();
//		for (int i = 0, length = idArray.length; i < length; i++) {
//
//
//		}
//		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
//		java.util.Date date1 = new Date();
//		 try {
//	        String s = myFormatter.format(date1);
//
//	        System.out.println(s);
//        } catch (Exception e1) {
//        	System.out.println(date1);
//        }
    	
//		Calendar cNow = Calendar.getInstance();//设置当前时间
//    	SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd"); // 日期格式
//		String nowDate = dfDate.format(cNow.getTime()); // 获取日期格式
//    	System.out.println(nowDate);
//    	
//		cNow.set(Calendar.DATE, cNow.get(Calendar.DATE) + 1); // 日期 加1 天
//		String firstDate = dfDate.format(cNow.getTime()); // 获取第1天预告日期
//		cNow.set(Calendar.DATE, cNow.get(Calendar.DATE) + 1); // 日期 加1 天
//		String secondDate = dfDate.format(cNow.getTime()); // 获取第1天预告日期
//		cNow.set(Calendar.DATE, cNow.get(Calendar.DATE) + 1); // 日期 加1 天
//		String thirdDate = dfDate.format(cNow.getTime()); // 获取第2天预告日期
//		System.out.println(thirdDate);
    	
//    	int [] sizeArray ={200,380};
//    	Random r = new Random(2);
//    	
//    	for(int i =0 ;i<=10;i++){
//    		int num = r.nextInt(2);
//    		System.out.println(num);
//    	}
//    	List<Long> list = new ArrayList<Long>();
//    	List<List<Long>> result = new ArrayList<List<Long>>();
//    	list.add(1L);
//    	list.add(2L);
//    	list.add(3L);
//    	list.add(4L);
//    	list.add(5L);
//    	list.add(6L);
//    	list.add(7L);
//    	
//    	result.add(list.subList(0, 2));
//    	result.add(list.subList(3, 5));
//    	result.add(list.subList(6, 8));
//    	
//    	String linkUrl = "123?ref456";
//		if (linkUrl.indexOf("ref") != -1) {
//			linkUrl = linkUrl.substring(0,linkUrl.indexOf("?ref"));
//			System.out.println(linkUrl);
////		}
//
//		String s = "12345";
//		String s1="12";
//		if(s.contains(s1)){
//			System.out.println(s.contains(s1));
//		}
    	
//    	String ip = "123.0.23.1";
//
//
//    	Calendar cNow = Calendar.getInstance();//设置当前时间
//    	SimpleDateFormat dfDate = new SimpleDateFormat("yyyy-MM-dd hh:mm"); // 日期格式
//		String nowDate = dfDate.format(cNow.getTime()); // 获取日期格式
//
//		String result ="";
//		for(String num:ip.split("[.]")){
//			result +=Long.toHexString(Long.parseLong(num))+"-";
//		}
//		System.out.println(result+nowDate);
    	
//    	List<String> resultLists1 = Collections.emptyList();
//    	List<String> resultLists2= Collections.EMPTY_LIST;
//    	
//    	resultLists1.add("123");
//    	
//    	resultLists2.add("234");
    	
    	String s1="4.0.5";
    	String s2="4.0.5";
    	System.out.println(s1.compareTo(s2));
    	
    }
}
