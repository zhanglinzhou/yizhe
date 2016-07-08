package com.dashen.xiangmu.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/6/29.
 */
public class ListTeMaiBean {

    /**
     *
     * getList()得到所有TeMai的品牌集合
     * getList1()得到内部的集合
     *
     * error_code : 0
     * error_message : true
     * data : {"list":[{"tid":"284","title":"媛媛公主特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2016-06-29_10_13_49.jpg","brand_discount":"2","brand_end_time":"2016-07-09","brand_start_time":"2015-09-30","total":15,"goods_list":{"list":[{"show_mode":2,"num_iid":"529189650152","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DoOgepTf0fXUcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2axWW33Pc9Oewg1qdhPjl1T3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoaTVIvILUt8hunFCRHKC4nllbGUog1ZvonEqY%2Bakgpmw","id":"817704","spare_id":"817704","show_commission_cent":1,"commission_cent":123,"isrec":-1,"app_isrec":"-1","pic":"https://gd1.alicdn.com/imgextra/i1/2519117228/TB2H1vXoFXXXXXoXXXXXXXXXXXX_!!2519117228.jpg_290x290.jpg","title":"儿童运动两件套","promotion_price":49.9,"price":59.9,"ispost":"1","icon_top_left":2,"site":"天猫","discount":8.33,"volume":"9181","shop_name":"媛媛公主旗舰店"},{"show_mode":2,"num_iid":"530651561440","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3Dj1Mvt9swVq4cQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2ehhhvG7JUBp2Y%2Bdtp35Zpr3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoaTVIvILUt8hdS9taPv7BMOuYaAzX%2FeJmnEqY%2Bakgpmw","id":"817655","spare_id":"817655","show_commission_cent":1,"commission_cent":97,"isrec":-1,"app_isrec":"-1","pic":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1DRUcKpXXXXbtXpXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"儿童透气防晒外套","promotion_price":39,"price":49,"ispost":"1","icon_top_left":2,"site":"天猫","discount":7.96,"volume":"2840","shop_name":"媛媛公主旗舰店"},{"show_mode":2,"num_iid":"528886044887","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3D4OhLzTC1EQccQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2TYqinvZ2ZjLpOjgxi0uT233i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoaTVIvILUt8hqC97BJGOfdx6Nsz0b6xoynEqY%2Bakgpmw","id":"776523","spare_id":"776523","show_commission_cent":1,"commission_cent":122,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i1/TB1lEVrLpXXXXbtaXXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"儿童网纱背心裙","promotion_price":49,"price":59,"ispost":"1","icon_top_left":2,"site":"天猫","discount":8.31,"volume":"2646","shop_name":"媛媛公主旗舰店"}]}},{"tid":"89","title":"唐朝特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2015-03-16_10_51_49.png","brand_discount":"1","brand_end_time":"2016-07-09","brand_start_time":"2015-03-16","total":16,"goods_list":{"list":[{"show_mode":2,"num_iid":"520795460029","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DjhdatrXDXBEcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2eDAFBmbm921FBt5vao9QZz3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoRjXetFc3aPD0HVlT1d43em7TJnP3Tz5P3EqY%2Bakgpmw","id":"817637","spare_id":"817637","show_commission_cent":1,"commission_cent":94,"isrec":-1,"app_isrec":"-1","pic":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1_07jIFXXXXbfXFXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"唐朝碎花背心裙","promotion_price":38,"price":279,"ispost":"1","icon_top_left":2,"site":"天猫","discount":1.36,"volume":"207","shop_name":"唐朝女装旗舰店"},{"show_mode":2,"num_iid":"520252610161","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DQdRpWKujdvocQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2ZPOaFLU6Eg9%2FKJpqXxEpU73i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoRjXetFc3aPD0xeH0fZ6f30pc27MdZABoXEqY%2Bakgpmw","id":"817668","spare_id":"817668","show_commission_cent":1,"commission_cent":146,"isrec":-1,"app_isrec":"-1","pic":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1zi7HLVXXXXaKXpXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"唐朝波西米亚长裙","promotion_price":59,"price":335,"ispost":"1","icon_top_left":2,"site":"天猫","discount":1.76,"volume":"192","shop_name":"唐朝女装旗舰店"},{"show_mode":2,"num_iid":"44845071381","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3Dxycoc2WLzvEcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2WhhEIdOn7BXHBMajAjK1gD3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoRjXetFc3aPDbVfM5SnqSkXT5T9QT2HZKCGFCzYOOqAQ","id":"443317","spare_id":"443317","show_commission_cent":1,"commission_cent":97,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i4/2091025306/TB2pjnBcpXXXXbqXpXXXXXXXXXX_!!2091025306.jpg_290x290.jpg","title":"唐朝修身印花裙","promotion_price":38,"price":499,"ispost":"1","icon_top_left":2,"site":"天猫","discount":0.78,"volume":"186","shop_name":"唐朝女装旗舰店"}]}},{"tid":"262","title":"韩都衣舍男装特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2016-04-12_18_35_37.jpg","brand_discount":"2","brand_end_time":"2016-07-09","brand_start_time":"2015-08-24","total":19,"goods_list":{"list":[{"show_mode":2,"num_iid":"529042552330","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DoxpWsbtcTiccQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2bICz9EV%2FiEK2Y%2Bdtp35Zpr3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F296OO8y80G8Ixs0CaHRgzbGmFP6kAhwFFOqnFRRMNUUSGFCzYOOqAQ","id":"817736","spare_id":"817736","show_commission_cent":1,"commission_cent":202,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i2/849727411/TB2dgYtnpXXXXbvXpXXXXXXXXXX_!!849727411.jpg_290x290.jpg","title":"韩都衣舍夏凉T恤","promotion_price":69,"price":158,"ispost":"1","icon_top_left":2,"site":"天猫","discount":4.37,"volume":"3084","shop_name":"AMH官方旗舰店"},{"show_mode":2,"num_iid":"43947894995","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DH5i9oX%2F9hkwcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2VTSUYopjC7FbJxUEh8sgi%2F3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F296OO8y80G8Ixs0CaHRgzbxpCC9SGztR1TRBPAbERHHMYOae24fhW0","id":"817641","spare_id":"817641","show_commission_cent":1,"commission_cent":199,"isrec":-1,"app_isrec":"-1","pic":"https://gd1.alicdn.com/bao/uploaded/i1/TB1yVeOLVXXXXXsXVXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"韩都衣舍印花T恤","promotion_price":68,"price":158,"ispost":"1","icon_top_left":2,"site":"天猫","discount":4.3,"volume":"1921","shop_name":"AMH官方旗舰店"},{"show_mode":2,"num_iid":"527904310523","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3Dbw7ZqolOdcwcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2T0JA6e%2B8iXsPLNzIt%2Fz56j3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F296OO8y80G8Ixs0CaHRgzbSi2vg8qR0x7PxDR%2BtDrRIiGFCzYOOqAQ","id":"817658","spare_id":"817658","show_commission_cent":1,"commission_cent":170,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i4/849727411/TB26bbdnpXXXXcOXpXXXXXXXXXX_!!849727411.jpg_290x290.jpg","title":"韩都衣舍立体印花衫","promotion_price":58,"price":158,"ispost":"1","icon_top_left":2,"site":"天猫","discount":3.67,"volume":"1319","shop_name":"AMH官方旗舰店"}]}},{"tid":"34","title":"北极绒内衣特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2015-08-29_09_37_34.png","brand_discount":"2","brand_end_time":"2016-07-09","brand_start_time":"2015-03-14","total":9,"goods_list":{"list":[{"show_mode":2,"num_iid":"43559782135","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DqvO5h%2BihJwkcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2V0vgLTZbnx1Px3RkWSJTuz3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F2mDlBbjGzGfRLb6XiRE4gJbf%2BCSorSPLnMMoGgkk4rGyGFCzYOOqAQ","id":"629910","spare_id":"629910","show_commission_cent":1,"commission_cent":109,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i2/TB1_QoWJFXXXXbkXFXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"北极绒男士内裤4条","promotion_price":23,"price":113,"ispost":"1","icon_top_left":2,"site":"天猫","discount":2.04,"volume":"19493","shop_name":"北极绒居家旗舰店"},{"show_mode":2,"num_iid":"526570288692","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://app.1zhe.com/app_jump.php?num_iid=526570288692","id":"","spare_id":"818318","show_commission_cent":1,"commission_cent":183,"isrec":-1,"app_isrec":"-1","pic":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1I1rXMXXXXXbWXpXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"北极绒男士内裤5条","promotion_price":38.8,"price":298,"ispost":"1","icon_top_left":2,"site":"天猫","discount":1.3,"volume":"1744","shop_name":"北极绒居家旗舰店"},{"show_mode":2,"num_iid":"43611480797","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DUpAXVnvPxekcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2W8ghWhwddI8smcYjUfw1pL3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F2mDlBbjGzGfRLb6XiRE4gJDiRk%2BMr103tc6Yaj%2FC3htCGFCzYOOqAQ","id":"673366","spare_id":"673366","show_commission_cent":1,"commission_cent":47,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i4/TB1SFFbHXXXXXXEaXXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"北极绒男士背心","promotion_price":9.9,"price":43,"ispost":"1","icon_top_left":2,"site":"天猫","discount":2.3,"volume":"1461","shop_name":"北极绒居家旗舰店"}]}},{"tid":"109","title":"欧诗漫特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2015-09-02_09_38_10.png","brand_discount":"1","brand_end_time":"2016-07-09","brand_start_time":"2015-05-26","total":10,"goods_list":{"list":[{"show_mode":2,"num_iid":"35073614313","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3Dfo7Jb8Gr7tIcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2fh01M0UnJi1Px3RkWSJTuz3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F339EC8DZw7RMzgOarqsZgmq%2FEslbRW3dmQbjIY7Bo5M8YOae24fhW0","id":"344090","spare_id":"344090","show_commission_cent":1,"commission_cent":160,"isrec":-1,"app_isrec":"-1","pic":"http://gw.alicdn.com/bao/uploaded/i3/TB1XmTsIFXXXXb.XpXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"欧诗漫营养美肤套装","promotion_price":89,"price":291,"ispost":"1","icon_top_left":2,"site":"天猫","discount":3.06,"volume":"25518","shop_name":"欧诗漫旗舰店"},{"show_mode":2,"num_iid":"14798928263","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DWxWZE%2FVCofMcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2azPUk88IQpQ%2BvZA5LFGqMT3i4vlPtZLR2YFjQKVD0fESwLOVfw4%2BYKaHXtGR9rB3szgOarqsZgmoggO7T3McszmEEHOWPAtkcYOae24fhW0","id":"730568","spare_id":"730568","show_commission_cent":1,"commission_cent":45,"isrec":-1,"app_isrec":"-1","pic":"https://img.alicdn.com/bao/uploaded/i2/TB1logWHpXXXXciapXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"欧诗漫走珠眼霜","promotion_price":25,"price":98,"ispost":"1","icon_top_left":2,"site":"天猫","discount":2.55,"volume":"13363","shop_name":"欧诗漫旗舰店"},{"show_mode":2,"num_iid":"17283184309","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DojRT9J0YK14cQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2axWW33Pc9Oe%2FKJpqXxEpU73i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F339EC8DZw7RMzgOarqsZgmDnHN4l2lhikLItYs3ViUtcYOae24fhW0","id":"299711","spare_id":"299711","show_commission_cent":1,"commission_cent":88,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i4/441622457/TB2tOZtrVXXXXalXXXXXXXXXXXX_!!441622457.jpg_290x290.jpg","title":"欧诗漫美白防晒霜","promotion_price":49,"price":96,"ispost":"1","icon_top_left":2,"site":"天猫","discount":5.1,"volume":"7958","shop_name":"欧诗漫旗舰店"}]}},{"tid":"135","title":"人本特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2015-12-10_15_02_00.jpg","brand_discount":"3","brand_end_time":"2016-07-09","brand_start_time":"2015-05-06","total":12,"goods_list":{"list":[{"show_mode":2,"num_iid":"12366464235","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DmVhaebBfkqYcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2XZyvT6XKJ56HBMajAjK1gD3i4vlPtZLR2YFjQKVD0fESwLOVfw4%2BYL7QwxGy4RkvYUxQzekwq7N8rlt3kWK7cLM81QMQQ2AO8YOae24fhW0","id":"743222","spare_id":"743222","show_commission_cent":1,"commission_cent":71,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i4/705657896/TB29o5lgFXXXXabXXXXXXXXXXXX_!!705657896.jpg_290x290.jpg","title":"人本经典情侣帆布鞋","promotion_price":45,"price":99,"ispost":"1","icon_top_left":2,"site":"天猫","discount":4.55,"volume":"15428","shop_name":"人本鞋类旗舰店"},{"show_mode":2,"num_iid":"526294628707","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DY8qEclkDYWwcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2QdLVCxq%2FCxELzyWwQxzkU%2F3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F1Hf8RXlzHtvYUxQzekwq7Ngyl%2BP%2FEk79xJA71kgJvkdSGFCzYOOqAQ","id":"729222","spare_id":"729222","show_commission_cent":1,"commission_cent":93,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i1/705657896/TB2fny9jFXXXXXVXXXXXXXXXXXX_!!705657896.jpg_290x290.jpg","title":"人本情侣休闲板鞋","promotion_price":59,"price":139,"ispost":"1","icon_top_left":2,"site":"天猫","discount":4.24,"volume":"14952","shop_name":"人本鞋类旗舰店"},{"show_mode":2,"num_iid":"10924965668","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3D6fGI9xA4u2gcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2UsyUYK1MrYLDOz%2BQ0Bmwbz3i4vlPtZLR2YFjQKVD0fESwLOVfw4%2BYL7QwxGy4RkvYUxQzekwq7NAEzJPTX9yz8hYgVJSAMYocYOae24fhW0","id":"729217","spare_id":"729217","show_commission_cent":1,"commission_cent":77,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i4/705657896/TB29wxSkFXXXXaaXpXXXXXXXXXX_!!705657896.jpg_290x290.jpg","title":"人本休闲懒人鞋","promotion_price":49,"price":119,"ispost":"1","icon_top_left":2,"site":"天猫","discount":4.12,"volume":"14926","shop_name":"人本鞋类旗舰店"}]}},{"tid":"136","title":"达芙妮特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2015-05-07_10_33_34.jpg","brand_discount":"1","brand_end_time":"2016-07-09","brand_start_time":"2015-05-07","total":8,"goods_list":{"list":[{"show_mode":2,"num_iid":"43684588303","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3D596Pg36M%2Bm8cQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2U1AT1kNPXQaWI6w0dMGH8j3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F3L5EO2LRMxlapitxi3Iv6zjuF2bPlO3UsqKzxIP%2BGEiMYOae24fhW0","id":"370732","spare_id":"370732","show_commission_cent":1,"commission_cent":47,"isrec":-1,"app_isrec":"-1","pic":"https://img.alicdn.com/imgextra/i4/2095709439/TB2JoujcFXXXXczXXXXXXXXXXXX_!!2095709439.jpg_290x290.jpg","title":"达芙妮坡跟凉鞋","promotion_price":19,"price":109,"ispost":"1","icon_top_left":2,"site":"天猫","discount":1.74,"volume":"1666","shop_name":"锦奔服饰专营店"},{"show_mode":2,"num_iid":"43509506471","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3Dgq8cFiU6bpwcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2f1xl5nCDuJUxlg8LvO%2Bev%2F3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F3L5EO2LRMxlapitxi3Iv6zP9id9xE0wdKMIsnaHr26GcYOae24fhW0","id":"681216","spare_id":"681216","show_commission_cent":1,"commission_cent":30,"isrec":-1,"app_isrec":"-1","pic":"https://img.alicdn.com/imgextra/i3/2111198399/TB2gw1IcFXXXXXkXpXXXXXXXXXX_!!2111198399.jpg_290x290.jpg","title":"达芙妮超高跟凉鞋","promotion_price":19,"price":109,"ispost":"1","icon_top_left":2,"site":"天猫","discount":1.74,"volume":"267","shop_name":"锦奔服饰专营店"},{"show_mode":2,"num_iid":"521040986378","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3D%2Fs2aw35Vq4kcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2Vp0ytmA%2BJbI%2Fl0%2B1yuzCtL3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F2mDlBbjGzGfbPRTNum%2FKEHu7nBw5GVJGl7K18NzTQqeXEqY%2Bakgpmw","id":"818313","spare_id":"818313","show_commission_cent":1,"commission_cent":67,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i2/1715171039/TB2sojSeXXXXXXNXpXXXXXXXXXX_!!1715171039.jpg_290x290.jpg","title":"鞋柜编织鱼嘴凉鞋","promotion_price":19.9,"price":259,"ispost":"1","icon_top_left":2,"site":"天猫","discount":0.77,"volume":"180","shop_name":"连达鞋类专营店"}]}},{"tid":"229","title":"芬腾特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2015-12-23_15_46_15.jpg","brand_discount":"2","brand_end_time":"2016-07-09","brand_start_time":"2016-05-13","total":12,"goods_list":{"list":[{"show_mode":2,"num_iid":"530219353134","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3D5BwCsUaZ37QcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2axWW33Pc9OewSB8%2FImevID3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F1xtBvJ2jTHZjLXHgxkwSvM3zS2wXVPu31Ogxq7rtdWD8YOae24fhW0","id":"817727","spare_id":"817727","show_commission_cent":1,"commission_cent":125,"isrec":-1,"app_isrec":"-1","pic":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1mhIdMpXXXXXpXFXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"芬腾舒适家居套装","promotion_price":79,"price":409,"ispost":"1","icon_top_left":2,"site":"天猫","discount":1.93,"volume":"9628","shop_name":"芬腾雪靓专卖店"},{"show_mode":2,"num_iid":"44342764515","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DnZ%2BRfg7uxCQcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2WWXLX%2FCmMttJhSgLssdd1b3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F1xtBvJ2jTHZjLXHgxkwSvMfRTnWKk9i%2BOTtLjTehARq8Yl7w3%2FA2kb","id":"748465","spare_id":"748465","show_commission_cent":1,"commission_cent":125,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i2/TB178W4HpXXXXX7XXXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"芬腾情侣卡通套装","promotion_price":79,"price":359,"ispost":"1","icon_top_left":2,"site":"天猫","discount":2.2,"volume":"5641","shop_name":"芬腾雪靓专卖店"},{"show_mode":2,"num_iid":"531743544910","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DLQkfonA1Zo0cQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2bOZ7baxk8BSahEP0ZrOLIr3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F1xtBvJ2jTHZjLXHgxkwSvMjM27HhaA63wOqWbOtipwLsYOae24fhW0","id":"817724","spare_id":"817724","show_commission_cent":1,"commission_cent":93,"isrec":-1,"app_isrec":"-1","pic":"http://img01.taobaocdn.com/bao/uploaded/i1/TB1S60KJVXXXXXPXpXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"芬腾可爱条纹套装","promotion_price":59,"price":329,"ispost":"1","icon_top_left":2,"site":"天猫","discount":1.79,"volume":"3748","shop_name":"芬腾雪靓专卖店"}]}},{"tid":"263","title":"京铭意特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2016-06-28_16_02_41.jpg","brand_discount":"2","brand_end_time":"2016-07-08","brand_start_time":"2015-08-24","total":9,"goods_list":{"list":[{"show_mode":2,"num_iid":"520034997109","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DJdXXJ6R0RHkcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2RzY30pe5gCHPfl2ZNdwIln3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F0%2BrPHwhMrXDSb%2B8c7DtSQMH8DpzgWC2EVxL88w%2B4RATHEqY%2Bakgpmw","id":"816986","spare_id":"816986","show_commission_cent":1,"commission_cent":122,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i3/TB1DdD6IXXXXXcqXVXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"京铭意飘逸沙滩裙","promotion_price":46,"price":228,"ispost":"1","icon_top_left":0,"site":"天猫","discount":2.15,"volume":"219","shop_name":"京铭意旗舰店"},{"show_mode":2,"num_iid":"44689694328","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DQdjpbRMtfzMcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2RJ0rZT49VklNMWYSf9G9hH3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F0%2BrPHwhMrXDSb%2B8c7DtSQMJejc2Pvr3%2Brtoo%2FSAZ%2FrriGFCzYOOqAQ","id":"816987","spare_id":"816987","show_commission_cent":1,"commission_cent":747,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i4/1920643363/TB2FXjioXXXXXalXpXXXXXXXXXX_!!1920643363.jpg_290x290.jpg","title":"京铭意森女系长裙","promotion_price":158,"price":780,"ispost":"1","icon_top_left":0,"site":"天猫","discount":2.03,"volume":"168","shop_name":"京铭意旗舰店"},{"show_mode":2,"num_iid":"531672401997","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DqEgvMuJUBsscQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2UMjf66e%2BzzRmSMhGfkQJ773i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F0%2BrPHwhMrXDSb%2B8c7DtSQMW2FuBmmZ3AAr93ZrfjrxR3EqY%2Bakgpmw","id":"816993","spare_id":"816993","show_commission_cent":1,"commission_cent":652,"isrec":-1,"app_isrec":"-1","pic":"http://img03.taobaocdn.com/bao/uploaded/i3/TB1JUE3JFXXXXb8XXXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"京铭意气质收腰裙","promotion_price":138,"price":298,"ispost":"1","icon_top_left":0,"site":"天猫","discount":4.63,"volume":"55","shop_name":"京铭意旗舰店"}]}},{"tid":"472","title":"雪俐特卖","brand_logo":"http://appcdn.1zhe.com/upload/admin/task/2016-05-06_09_41_46.jpg","brand_discount":"1","brand_end_time":"2016-07-07","brand_start_time":"2016-04-24","total":27,"goods_list":{"list":[{"show_mode":2,"num_iid":"529684989211","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DYsI%2Fms9IldIcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2bWmGzS4Z4ZAJYccVKkURIj3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F27EHRcbYdfPDnzXVwL7y%2BQY1nhWwOhBFW%2Bf0DjoZn5syGFCzYOOqAQ","id":"759481","spare_id":"759481","show_commission_cent":1,"commission_cent":122,"isrec":-1,"app_isrec":"-1","pic":"https://g-search1.alicdn.com/img/bao/uploaded/i4/i3/TB1TggxMpXXXXb5XpXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"雪俐薄款针织套装","promotion_price":49,"price":378,"ispost":"1","site":"天猫","discount":1.3,"volume":"2146","shop_name":"雪俐旗舰店"},{"show_mode":2,"num_iid":"528202401860","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3D55tUV8r%2FcEMcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2ee7iHB9DmMErumJQoe%2FxcP3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F27EHRcbYdfPDnzXVwL7y%2BQeW%2BxxfNs%2BZfcUatCk6kkGSGFCzYOOqAQ","id":"816469","spare_id":"816469","show_commission_cent":1,"commission_cent":119,"isrec":-1,"app_isrec":"-1","pic":"https://gd1.alicdn.com/bao/uploaded/i1/TB1xbsTHpXXXXb2apXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"雪俐情侣睡衣两件套","promotion_price":48,"price":298,"ispost":"1","icon_top_left":0,"site":"天猫","discount":1.61,"volume":"1377","shop_name":"雪俐旗舰店"},{"show_mode":2,"num_iid":"528140816080","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3Dq1aD7vZhTuMcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2ee7iHB9DmMEjGYPrSmetxH3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F27EHRcbYdfPDnzXVwL7y%2BQGVF3E9mWlTl6bx6CN1%2FKSSGFCzYOOqAQ","id":"816486","spare_id":"816486","show_commission_cent":1,"commission_cent":796,"isrec":-1,"app_isrec":"-1","pic":"https://gd1.alicdn.com/bao/uploaded/i1/TB1OUkGJVXXXXaZXXXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"雪俐简约家居服","promotion_price":58,"price":298,"ispost":"1","icon_top_left":0,"site":"天猫","discount":1.95,"volume":"1238","shop_name":"雪俐旗舰店"}]}}]}
     */

    private int error_code;
    private String error_message;
    private DataBean data;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * tid : 284
         * title : 媛媛公主特卖
         * brand_logo : http://appcdn.1zhe.com/upload/admin/task/2016-06-29_10_13_49.jpg
         * brand_discount : 2
         * brand_end_time : 2016-07-09
         * brand_start_time : 2015-09-30
         * total : 15
         * goods_list : {"list":[{"show_mode":2,"num_iid":"529189650152","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DoOgepTf0fXUcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2axWW33Pc9Oewg1qdhPjl1T3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoaTVIvILUt8hunFCRHKC4nllbGUog1ZvonEqY%2Bakgpmw","id":"817704","spare_id":"817704","show_commission_cent":1,"commission_cent":123,"isrec":-1,"app_isrec":"-1","pic":"https://gd1.alicdn.com/imgextra/i1/2519117228/TB2H1vXoFXXXXXoXXXXXXXXXXXX_!!2519117228.jpg_290x290.jpg","title":"儿童运动两件套","promotion_price":49.9,"price":59.9,"ispost":"1","icon_top_left":2,"site":"天猫","discount":8.33,"volume":"9181","shop_name":"媛媛公主旗舰店"},{"show_mode":2,"num_iid":"530651561440","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3Dj1Mvt9swVq4cQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2ehhhvG7JUBp2Y%2Bdtp35Zpr3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoaTVIvILUt8hdS9taPv7BMOuYaAzX%2FeJmnEqY%2Bakgpmw","id":"817655","spare_id":"817655","show_commission_cent":1,"commission_cent":97,"isrec":-1,"app_isrec":"-1","pic":"http://img04.taobaocdn.com/bao/uploaded/i4/TB1DRUcKpXXXXbtXpXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"儿童透气防晒外套","promotion_price":39,"price":49,"ispost":"1","icon_top_left":2,"site":"天猫","discount":7.96,"volume":"2840","shop_name":"媛媛公主旗舰店"},{"show_mode":2,"num_iid":"528886044887","app_goods_mode":2,"bai_chuan_mode":1,"pro_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3D4OhLzTC1EQccQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2TYqinvZ2ZjLpOjgxi0uT233i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoaTVIvILUt8hqC97BJGOfdx6Nsz0b6xoynEqY%2Bakgpmw","id":"776523","spare_id":"776523","show_commission_cent":1,"commission_cent":122,"isrec":-1,"app_isrec":"-1","pic":"http://img.alicdn.com/imgextra/i1/TB1lEVrLpXXXXbtaXXXXXXXXXXX_!!0-item_pic.jpg_290x290.jpg","title":"儿童网纱背心裙","promotion_price":49,"price":59,"ispost":"1","icon_top_left":2,"site":"天猫","discount":8.31,"volume":"2646","shop_name":"媛媛公主旗舰店"}]}
         */

        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String tid;
            private String title;
            private String brand_logo;
            private String brand_discount;
            private String brand_end_time;
            private String brand_start_time;
            private int total;
            private GoodsListBean goods_list;

            public String getTid() {
                return tid;
            }

            public void setTid(String tid) {
                this.tid = tid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getBrand_logo() {
                return brand_logo;
            }

            public void setBrand_logo(String brand_logo) {
                this.brand_logo = brand_logo;
            }

            public String getBrand_discount() {
                return brand_discount;
            }

            public void setBrand_discount(String brand_discount) {
                this.brand_discount = brand_discount;
            }

            public String getBrand_end_time() {
                return brand_end_time;
            }

            public void setBrand_end_time(String brand_end_time) {
                this.brand_end_time = brand_end_time;
            }

            public String getBrand_start_time() {
                return brand_start_time;
            }

            public void setBrand_start_time(String brand_start_time) {
                this.brand_start_time = brand_start_time;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public GoodsListBean getGoods_list() {
                return goods_list;
            }

            public void setGoods_list(GoodsListBean goods_list) {
                this.goods_list = goods_list;
            }

            public static class GoodsListBean {
                /**
                 * show_mode : 2
                 * num_iid : 529189650152
                 * app_goods_mode : 2
                 * bai_chuan_mode : 1
                 * pro_url : http://s.click.taobao.com/t?e=m%3D2%26s%3DoOgepTf0fXUcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2axWW33Pc9Oewg1qdhPjl1T3i4vlPtZLRwpkcK8XwAwRIH0g3yL3n%2F07BfF6vgoVoaTVIvILUt8hunFCRHKC4nllbGUog1ZvonEqY%2Bakgpmw
                 * id : 817704
                 * spare_id : 817704
                 * show_commission_cent : 1
                 * commission_cent : 123
                 * isrec : -1
                 * app_isrec : -1
                 * pic : https://gd1.alicdn.com/imgextra/i1/2519117228/TB2H1vXoFXXXXXoXXXXXXXXXXXX_!!2519117228.jpg_290x290.jpg
                 * title : 儿童运动两件套
                 * promotion_price : 49.9
                 * price : 59.9
                 * ispost : 1
                 * icon_top_left : 2
                 * site : 天猫
                 * discount : 8.33
                 * volume : 9181
                 * shop_name : 媛媛公主旗舰店
                 */

                private List<ListBean1> list;

                public List<ListBean1> getList1() {
                    return list;
                }

                public void setList1(List<ListBean1> list) {
                    this.list = list;
                }

                public static class ListBean1 {
                    private int show_mode;
                    private String num_iid;
                    private int app_goods_mode;
                    private int bai_chuan_mode;
                    private String pro_url;
                    private String id;
                    private String spare_id;
                    private int show_commission_cent;
                    private int commission_cent;
                    private int isrec;
                    private String app_isrec;
                    private String pic;
                    private String title;
                    private double promotion_price;
                    private double price;
                    private String ispost;
                    private int icon_top_left;
                    private String site;
                    private double discount;
                    private String volume;
                    private String shop_name;

                    public int getShow_mode() {
                        return show_mode;
                    }

                    public void setShow_mode(int show_mode) {
                        this.show_mode = show_mode;
                    }

                    public String getNum_iid() {
                        return num_iid;
                    }

                    public void setNum_iid(String num_iid) {
                        this.num_iid = num_iid;
                    }

                    public int getApp_goods_mode() {
                        return app_goods_mode;
                    }

                    public void setApp_goods_mode(int app_goods_mode) {
                        this.app_goods_mode = app_goods_mode;
                    }

                    public int getBai_chuan_mode() {
                        return bai_chuan_mode;
                    }

                    public void setBai_chuan_mode(int bai_chuan_mode) {
                        this.bai_chuan_mode = bai_chuan_mode;
                    }

                    public String getPro_url() {
                        return pro_url;
                    }

                    public void setPro_url(String pro_url) {
                        this.pro_url = pro_url;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getSpare_id() {
                        return spare_id;
                    }

                    public void setSpare_id(String spare_id) {
                        this.spare_id = spare_id;
                    }

                    public int getShow_commission_cent() {
                        return show_commission_cent;
                    }

                    public void setShow_commission_cent(int show_commission_cent) {
                        this.show_commission_cent = show_commission_cent;
                    }

                    public int getCommission_cent() {
                        return commission_cent;
                    }

                    public void setCommission_cent(int commission_cent) {
                        this.commission_cent = commission_cent;
                    }

                    public int getIsrec() {
                        return isrec;
                    }

                    public void setIsrec(int isrec) {
                        this.isrec = isrec;
                    }

                    public String getApp_isrec() {
                        return app_isrec;
                    }

                    public void setApp_isrec(String app_isrec) {
                        this.app_isrec = app_isrec;
                    }

                    public String getPic() {
                        return pic;
                    }

                    public void setPic(String pic) {
                        this.pic = pic;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public double getPromotion_price() {
                        return promotion_price;
                    }

                    public void setPromotion_price(double promotion_price) {
                        this.promotion_price = promotion_price;
                    }

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getIspost() {
                        return ispost;
                    }

                    public void setIspost(String ispost) {
                        this.ispost = ispost;
                    }

                    public int getIcon_top_left() {
                        return icon_top_left;
                    }

                    public void setIcon_top_left(int icon_top_left) {
                        this.icon_top_left = icon_top_left;
                    }

                    public String getSite() {
                        return site;
                    }

                    public void setSite(String site) {
                        this.site = site;
                    }

                    public double getDiscount() {
                        return discount;
                    }

                    public void setDiscount(double discount) {
                        this.discount = discount;
                    }

                    public String getVolume() {
                        return volume;
                    }

                    public void setVolume(String volume) {
                        this.volume = volume;
                    }

                    public String getShop_name() {
                        return shop_name;
                    }

                    public void setShop_name(String shop_name) {
                        this.shop_name = shop_name;
                    }
                }
            }
        }
    }
}
