package com.wz.test.worktest;
import com.wz.utils.StringUtils;
public class Test {
    public static void main(String[] args) {
        String[] str = {"流行乐","交响音乐会","43","中国民族音乐会","歌剧","|DJ","其他音乐会","民族民间舞",
                        "芭蕾舞","现代舞","其他舞蹈","话剧","默剧","音乐剧","儿童剧","其他戏剧（木偶剧、皮影戏等）",
                        "魔术","杂技","马戏","驯兽","其他杂技","相声","京剧","小品","评书评话","流行音乐会（演唱会）","32"};
        String goal = "";

        for(String s : str){
            goal = getYanChuCode(s);
            System.out.println(goal);
        }
    }

     /**
	 * 文化部接口演出类别传文化部接口规定代码
	 * @param leiBie
	 * @return
	 */
	public static String getYanChuCode(String leiBie){
		String yanChuLeiBie = "";
		if(StringUtils.isNotEmpty(leiBie)){
			if(leiBie.length()>2) {
				if(leiBie.contains("流行乐")){
					yanChuLeiBie="31";
				}else if(leiBie.contains("交响音乐会") || leiBie.contains("中国民族音乐会")){
					yanChuLeiBie="32";
				}else if(leiBie.contains("歌剧")){
					yanChuLeiBie="33";
				}else if(leiBie.contains("DJ")){
					yanChuLeiBie="34";
				}else if(leiBie.contains("其他音乐会")){
					yanChuLeiBie="35";
				}else if(leiBie.contains("民族民间舞")){
					yanChuLeiBie="36";
				}else if(leiBie.contains("芭蕾舞")){
					yanChuLeiBie="37";
				}else if(leiBie.contains("现代舞")){
					yanChuLeiBie="38";
				}else if(leiBie.contains("其他舞蹈")){
					yanChuLeiBie="40";
				}else if(leiBie.contains("话剧")){
					yanChuLeiBie="41";
				}else if(leiBie.contains("默剧")){
					yanChuLeiBie="42";
				}else if(leiBie.contains("音乐剧")){
					yanChuLeiBie="43";
				}else if(leiBie.contains("儿童剧")){
					yanChuLeiBie="44";
				}else if(leiBie.contains("其他戏剧（木偶剧、皮影戏等）")){
					yanChuLeiBie="45";
				}else if(leiBie.contains("魔术")){
					yanChuLeiBie="46";
				}else if(leiBie.contains("杂技")){
					yanChuLeiBie="47";
				}else if(leiBie.contains("马戏")){
					yanChuLeiBie="48";
				}else if(leiBie.contains("驯兽") || leiBie.contains("其他杂技")){
					yanChuLeiBie="49";
				}else if(leiBie.contains("相声")){
					yanChuLeiBie="50";
				}else if(leiBie.contains("京剧")||leiBie.contains("昆曲")||leiBie.contains("越剧")||leiBie.contains("沪剧")
						||leiBie.contains("淮剧")||leiBie.contains("滑稽戏")||leiBie.contains("其他戏曲")){
					yanChuLeiBie="51";
				}else if(leiBie.contains("小品")){
					yanChuLeiBie="52";
				}else if(leiBie.contains("评书评话")||leiBie.contains("独角戏、清口")||leiBie.contains("其他曲艺")){
					yanChuLeiBie="53";
				}else if(leiBie.contains("流行音乐会（演唱会）")||leiBie.contains("综艺晚会等其他演出")){
					yanChuLeiBie="54";
				}else{
					yanChuLeiBie="54"; //未区分或新增类别计入其他
				}
			}else{
				yanChuLeiBie=leiBie;	//老数据取数据库中原数据
			}
		}else {
			yanChuLeiBie="54";	//为空值时计入"其他"
		}
		return yanChuLeiBie;
	}
}