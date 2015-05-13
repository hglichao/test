package com.yihaodian.mandy.test;

import java.util.ArrayList;
import java.util.List;

import com.yihaodian.mandy.model.Product;
import com.yihaodian.mandy.service.MandyRequest;
import com.yihaodian.mandy.service.MandyRespone;
import com.yihaodian.mandy.service.MandyService;
import com.yihaodian.mandy.service.MandyServiceFactory;
import com.yihaodian.mandy.service.ProductSearchRequest;
import com.yihaodian.mandy.service.ProductSearchRespone;

public class TestMandyCommonTest {
	public static void main(String[] args) {
		MandyService mandy = (new MandyServiceFactory("http://mandy.yihaodian.com:9090/search/mandy")).getMandyService();
		try{
			for(int i=0;i<1;i++){
				MandyRequest req = new MandyRequest();
				// 必选项
				req.setRequestType(ProductSearchRequest.RQT_COMMON);
				req.setProvinceId(1);// 省份ID：1为上海……根据用户所在省份确定
				req.setMcsiteid(1);

				// 可选项
				boolean isCategorySelected = false;
				boolean isBrandSelected = true;
				{// 依据上面的两个boolean值确定（分类）、（品牌）两个可选参数
					if(isCategorySelected){
						// 增加categoryId限制
						req.setCategoryId(5117);
					}
					if(isBrandSelected){
						// 增加品牌限制
						req.setBrandId(0);
					}
				}
				//查询是否店中店产品
				req.setIsDianzhongdian(2);//1代表店中店商品,2代表1号店商品,0为所有商品
				//是否有库存  0:否  , 1:是
				req.setStock(1);
				//是否系列商品  0:否  , 1:是
				req.setSeries(0);
				//销售类型 
				req.setSaleType(2);
				
				// 分页相关设置
				int pageSize = 32;	//每页32个产品
				int pageNum = 1;	//显示第一页
				// 设置一页的产品个数
				req.setPageSize(pageSize);
				// 设置此页产品的位移，有效值（0～结果数-1）
				req.setPageOffset((pageNum - 1) * pageSize);
				// 排序相关设置
				//req.setSortType(MandyRequest.ST_PRICE_ASC); //按照价格升序
				req.setSortType(MandyRequest.ST_SALENUMBER); // 按照销量降序
				
				req.setKeyword("手表");
				//导购属性
				//导购属性 6498,6269
				List<String> attributes = new ArrayList<String>();
				attributes.add(0,"6498");
				attributes.add(1,"6269");
				req.setAttributes(attributes);
				// 价格区间 
				//req.setPriceRangeMin(150);
				//req.setPriceRangeMax(170);
				//筛选条件  f 筛选条件 01 促销 02 有赠品 03新品 012 促销 有赠品 023 有赠品 新品 013 促销 新品 0123 促销 有赠品 新品
				//req.setFilter("01");
				//置顶商品ID
				List<Long> purchaseIds=new ArrayList<Long>();
				//purchaseIds.add(new Long(1004006));
				//req.setPurchaseIds(purchaseIds);
				// 调用搜索
				MandyRespone resp=mandy.search(req);
				// 打印结果（结果数+查询条件+当前页产品列表）
				System.out.println(resp.getProductCount());
				System.out.println(resp.getLuceneCondition());
		//		System.out.println(resp);
				List<Product> products=resp.getProducts();
				for(Product p:products)
					System.out.println(p.toString());
			}
		}catch (Exception e) {
//			System.err.println(url);
			e.printStackTrace();
		}
	}
}
