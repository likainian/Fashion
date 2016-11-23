package com.fun.administrator.fashion.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 16/11/23.
 */

public class HomeBean {

    /**
     * retcode : 200
     * retmsg : ok
     * focus : [{"template":"mplay","mid":"306493","name":"无名者","aword":"丁志诚率五虎玩潜伏","update":"更新至2集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=57d05b1c714428cfe7269820f070f0af&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=88a69d3f205eb8172a2b8a3e8fa39d23&amp;w=0&amp;h=0","focus":"http://img.funshion.com/sdw?oid=b4c9a39a4c2662b5ebc1607f3ff87329&amp;w=0&amp;h=0","vipfocus":"","banner":"http://img3.funshion.com/sdw?oid=c8cd5bac937a6062b7e6459eceaee937&amp;w=0&amp;h=0","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305957","name":"不可能完成的任务","aword":"[更新至24集]于震飙车解救枪下哑巴","update":"更新至28集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=2dd49d2ef88d128d27278bc3b8f5102b&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=25243003260dda40842cb3cfa3e0f1cb&amp;w=0&amp;h=0","focus":"http://img3.funshion.com/sdw?oid=1608160c81eed82acd0d8bc243e6574d&amp;w=0&amp;h=0","vipfocus":"","banner":"http://img2.funshion.com/sdw?oid=39aab4b87f8666273bc4f2ed503ed93c&amp;w=0&amp;h=0","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"304833","name":"七月半2：前世今生","aword":"利用\u201c见鬼十法\u201d招魂恐怖","update":"","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=e032f1438b0f842e68ed53fcff87223d&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=93576c48045758868d56fc65b1fe0be9&amp;w=0&amp;h=0","focus":"http://img2.funshion.com/sdw?oid=c23d67570bd2fc540bf261a62349b800&amp;w=0&amp;h=0","vipfocus":"","banner":"http://img3.funshion.com/sdw?oid=e6c92367896efa7189a346ab72fda9b9&amp;w=0&amp;h=0","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305145","name":"那年那兔那些事儿 第三季","aword":"每只兔子都有个大国梦","update":"更新至4集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=dff70f4b5a8719e96d52548278ebf291&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=e8ee1d686bcaeaeade71a243f1fe80f7&amp;w=0&amp;h=0","focus":"http://img2.funshion.com/sdw?oid=42fc5227fbb4834e011522d2cd66a4c9&amp;w=0&amp;h=0","vipfocus":"","banner":"http://img.funshion.com/sdw?oid=8bc289c533c9b8384003470e6e76bb81&amp;w=0&amp;h=0","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"306365","name":"叫我僵小鱼 日常篇","aword":"[更新至16集]一大波僵尸即将来袭","update":"更新至16集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=cb754eee00db8efab5801eb10ab32c7b&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=104dc591d41b8dee54785ee99504a660&amp;w=0&amp;h=0","focus":"http://img.funshion.com/sdw?oid=4e6b2da8b6a7064f5ee71130727f7be1&amp;w=0&amp;h=0","vipfocus":"","banner":"http://img1.funshion.com/sdw?oid=3a7f297187a72f42e3dbfb3899e3c2ed&amp;w=0&amp;h=0","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305809","name":"信者无敌","aword":"[全36集]陈宝国以少战多展豪情","update":"全36集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=8767bb12e960e8df0a35dcc683b5a225&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=7b805615f8e1cd1e6518e4102e2f4348&amp;w=0&amp;h=0","focus":"http://img.funshion.com/sdw?oid=b5705f54b10f038797518915e32f9fae&amp;w=0&amp;h=0","vipfocus":"","banner":"http://img.funshion.com/sdw?oid=bee3175fa7cb88df2a4edd50385b8f3f&amp;w=0&amp;h=0","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]
     * blocks : [{"id":"7","name":"热点推荐","template":"still","channel":{"id":"","code":"","name":"","template":"null","url":""},"contents":[{"template":"vplay","mid":"9317289","name":"攒一辈子运气就为这一秒","aword":"各路牛人幸运躲过灾祸","update":"","url":"","duration":"1:37","still":"http://img2.funshion.com/sdw?oid=8ec55f119c06b1d86ce8920430957b03&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"http://img2.funshion.com/sdw?oid=3d262de5bdcce1b1d5fb4d367d7b0906&amp;w=0&amp;h=0","picture02":"","picture06":""},{"template":"vplay","mid":"9304035","name":"装载老虎车辆被追尾","aword":"司机：信不信放老虎咬你","update":"","url":"","duration":"1:30","still":"http://img2.funshion.com/sdw?oid=cd8c386c1a15b5575cfde3f2b0c42dd2&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vtopic","mid":"3678","name":"宋佳穿深V长裙出席活动","aword":"露傲人事业线","update":"","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=79186fd2a472f27681b945e766272e07&amp;w=0&amp;h=0","poster":"","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vtopic","mid":"3229","name":"城玩！女神都有受虐的心","aword":"我看好你哦妹纸","update":"","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=8496a9e16223898370455ae6a2437a56&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9303829","name":"女星台上弹钢琴花式抬腿","aword":"尴尬！春光乍泄","update":"","url":"","duration":"1:01","still":"http://img1.funshion.com/sdw?oid=0d549e72de4ad5efb3cf91102c25f498&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304259","name":"妹子这造型简直逆天了","aword":"跪服!只能说是在下输了","update":"","url":"","duration":"3:19","still":"http://img3.funshion.com/sdw?oid=b7e87d392b21d5d67423184fcec82822&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9306005","name":"逆天了！高速上诡异一幕","aword":"两车猛烈相撞瞬间粉碎","update":"","url":"","duration":"0:23","still":"http://img.funshion.com/sdw?oid=de7adf4e3c188ce5e0fa33ba1be738c6&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"http://img.funshion.com/sdw?oid=42e833182ccf3f92444995ee12fd696f&amp;w=0&amp;h=0","picture02":"","picture06":""},{"template":"web","mid":"1478489415","name":"贯彻十八届六中全会精神","aword":"中国特色社会主义事业领导核心","update":"","url":"http://special.71.cn/161014/","duration":"","still":"http://img3.funshion.com/sdw?oid=e8d057bf6872ca84a6fe8ad09ba20a9d&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"24","name":"热门影视剧","template":"poster","channel":{"id":"","code":"","name":"","template":"null","url":""},"contents":[{"template":"mplay","mid":"305957","name":"不可能完成的任务","aword":"龙雪偷发电文惹怀疑","update":"更新至28集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=2dd49d2ef88d128d27278bc3b8f5102b&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=25243003260dda40842cb3cfa3e0f1cb&amp;w=0&amp;h=0"},{"template":"mplay","mid":"306493","name":"无名者","aword":"丁志诚率五虎玩潜伏","update":"更新至2集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=57d05b1c714428cfe7269820f070f0af&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=88a69d3f205eb8172a2b8a3e8fa39d23&amp;w=0&amp;h=0"},{"template":"mplay","mid":"305809","name":"信者无敌","aword":"杨雪助力陈宝国破难关","update":"全36集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=8767bb12e960e8df0a35dcc683b5a225&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=7b805615f8e1cd1e6518e4102e2f4348&amp;w=0&amp;h=0"},{"template":"mplay","mid":"90968","name":"新少林寺","aword":"华仔霆锋巅峰对决","update":"","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=9e37165069768b31edb70bef4c8eb12a&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=36f766e217320de4f57b819ef0c2f15f&amp;w=0&amp;h=0"},{"template":"mplay","mid":"305955","name":"刺青","aword":"黄明惨遭欺凌横死仓库","update":"更新至30集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=f7558ff1f04d5d0e0cd187b969d3c41a&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=1f68150d59905ce7f00ee6cef5369d49&amp;w=0&amp;h=0"},{"template":"mplay","mid":"306365","name":"叫我僵小鱼 日常篇","aword":"一大波僵尸即将来袭","update":"更新至16集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=cb754eee00db8efab5801eb10ab32c7b&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=104dc591d41b8dee54785ee99504a660&amp;w=0&amp;h=0"}]},{"id":"397","name":"同步追剧","template":"still","channel":{"id":"2","code":"tv","name":"电视剧","template":"cstill","url":""},"contents":[{"template":"mplay","mid":"300673","name":"活法","aword":"李国强意外获知江源病情","update":"更新至25集","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=aa1b3eea9108640e62d3db98a66a6392&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=6240d1a0883eea26b1f1a233b2606855&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"mplay","mid":"200992","name":"我是你的眼","aword":"陈实\u201c受贿\u201d被捕入狱","update":"更新至36集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=17dadac7f56bf3eb23492a9a12a5faa7&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=6a5e1b2f669ea7b5d308ccb9a07bfcaf&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305975","name":"下辈子还做我老爸","aword":"王力可放下仇恨捐肾救父","update":"更新至33集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=1840a5c8ffbbc98351d50f74b8f15032&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=3d8844654c0f3bc644814d00d10614e9&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305457","name":"绝命后卫师","aword":"张桐谱红军战士慷慨悲歌","update":"全32集","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=49dda968a715bc5ac170f3c213b6f1ce&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=b475502da94804ed2a83066f744b8505&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305647","name":"寒山令","aword":"李健刀斩日寇护诗碑","update":"全40集","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=f6b7d5e284269d8ad37283f44b83b47a&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=6d579f88eb322cbea5f28211ded7d17c&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305839","name":"国家底线","aword":"硬汉黄志忠为国\u201c守门\u201d","update":"全30集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=702f46c3e6ffccbcd1b373502df28c90&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=4c9968f3e7a56e21351c13b266e8e39b&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305513","name":"暗战危城","aword":"于震冲冠一怒为红颜","update":"全40集","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=eecdafadbc7840505f3d06814494e4b6&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=6b957c966a4e0f73c130570f9ad23b17&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305519","name":"红色护卫","aword":"张桐开挂助力小队勇夺图","update":"全34集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=6cb1dcb027b3a5e4c29bf8b7da3d0983&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=e7a65e82729e1e8116a659f63a3ecd39&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"305511","name":"我是红军","aword":"朱雨辰霸屏变红军战士","update":"全36集","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=790d42dba2595f8f62bf2837f695e5e9&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=2e842ca5a35431e140b1e196c6da34df&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"22","name":"热剧片花","template":"still","channel":{"id":"1016","code":"vseries","name":"电视片花","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9317545","name":"【鬼吹灯之精绝古城】超震撼预告","aword":"靳东陈乔恩古墓探险","update":"","url":"","duration":"1:40","still":"http://img3.funshion.com/sdw?oid=719783bd2028a4115a3449720c0a9396&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9305553","name":"【放弃我抓紧我】曝特辑","aword":"陈乔恩飞来横吻王凯","update":"","url":"","duration":"0:59","still":"http://img1.funshion.com/sdw?oid=30b45af3983597c126005259d2a5f348&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9317863","name":"【锦绣未央】再遇凶险","aword":"唐嫣罗晋遭暴民围困","update":"","url":"","duration":"2:44","still":"http://img3.funshion.com/sdw?oid=bdba959154a8780d7d5a09ba8502d3bb&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vtopic","mid":"3848","name":"女扑男正确姿势","aword":"女流氓来袭","update":"","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=68535ac03cb4789fa899bdae46be11a7&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"300","name":"热播大片","template":"poster","channel":{"id":"1","code":"movie","name":"电影","template":"cmedia","url":""},"contents":[{"template":"mplay","mid":"13475","name":"战狼传说","aword":"战狼甄子丹血战七狼党","update":"","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=79f783be1fcbad65dc9c3c06ebc36941&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=1eabf90a697ef5d50bd37bad8a0e3600&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"301199","name":"狂暴","aword":"一场报复的杀人狂欢","update":"全1集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=45382afc8af9648323bdbdf409843db4&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=d1fb8fb41bdfcfca731bd094e12a05d3&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"304833","name":"七月半2：前世今生","aword":"利用\u201c见鬼十法\u201d招魂恐怖","update":"","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=e032f1438b0f842e68ed53fcff87223d&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=4c37afd0b651e3bdd008b0a1aa39f7e1&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"98449","name":"画壁","aword":"柳岩露酥胸邓超玩暧昧","update":"","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=0068b5d6d4b0e6723423fea5e3cc1ad4&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=7775bd4c9efc4b7eabd60d2f72103365&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"116603","name":"钟馗伏魔：雪妖魔灵","aword":"神魔共浴破界为爱斩妖","update":"","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=ce5b554f33e243b27602dfffc31a5abf&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=e516f1c98817a8c242ab2d36d738a820&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"95512","name":"蓝色情人节","aword":"型男高斯林风流归来","update":"","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=5a8317d07a224077b7ac3553a0174026&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=d41be4551cb6e35f5e79ebee1e4346c4&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"302185","name":"恐怖空间","aword":"亚洲鬼王彭发导演监制","update":"","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=ae282fcd1de50e8e2590938a70740a96&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=881db3f07a41e25a0d8816d39cf7718b&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"112522","name":"大话天仙","aword":"爆笑解读武松金莲恋","update":"","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=3b4b88ca7c67fb6061b2383c55757bef&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=7fb1e8a8646754ba9c0878a1deff9865&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"115724","name":"天将雄师","aword":"成龙会战好莱坞双雄","update":"","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=dde2e4a381180926a8547938ca91a1ad&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=b3b89275d08eb0ccedb702b5a4e78b37&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"23","name":"电影片花","template":"still","channel":{"id":"1015","code":"vmovie","name":"电影片花","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9304537","name":"【蓝精灵：失落的村庄】\u201c萌闯丛林\u201d","aword":"神奇大冒险逗趣上演","update":"","url":"","duration":"1:28","still":"http://img2.funshion.com/sdw?oid=a83f42ae759ffa3dc1b71d195b196c75&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9306365","name":"【最萌身高差】终极预告 高以翔\u201c男男\u201d嘟嘴卖萌","aword":"","update":"","url":"","duration":"1:29","still":"http://img2.funshion.com/sdw?oid=01cfe3ed13b577fc87794510176f9d84&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vplay","mid":"9305715","name":"【长城】张靓颖献声《Battlefield》","aword":"向世界唱出中国","update":"","url":"","duration":"3:52","still":"http://img3.funshion.com/sdw?oid=952233e19b98e2a5b15b6a1155cb5d8e&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304495","name":"【间谍同盟】终极预告震撼发布","aword":"火线爱侣宿命纠葛成悬念","update":"","url":"","duration":"2:19","still":"http://img1.funshion.com/sdw?oid=deeb968026984862ab0a5dde0d8aa4f0&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"21","name":"资讯","template":"still","channel":{"id":"1020","code":"hot","name":"热点","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9295261","name":"黑貂激战大鼠一口咬头","aword":"凶猛缠斗现场惊人","update":"","url":"","duration":"3:21","still":"http://img.funshion.com/sdw?oid=ba1d942ae525012483912013ac5d697a&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"http://img.funshion.com/sdw?oid=fc9c33a950ebeb18ad4d94faed8cb4bc&amp;w=0&amp;h=0","picture02":"","picture06":""},{"template":"vplay","mid":"9295271","name":"这千年老龟成仙了！","aword":"开口瞬间惊呆众人","update":"","url":"","duration":"0:43","still":"http://img2.funshion.com/sdw?oid=0893b7af532949add3ba446d6c1d9f30&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9312239","name":"实拍致命弯道恐怖车祸","aword":"转弯瞬间车身诡异飞蹦","update":"","url":"","duration":"1:45","still":"http://img3.funshion.com/sdw?oid=9427f1ca99434479dab5548d8d8f9f03&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304489","name":"实拍日本大地震骇人一幕","aword":"疯狂海啸瞬间吞没城市","update":"","url":"","duration":"0:54","still":"http://img2.funshion.com/sdw?oid=f76547ddfde7cccedd787a36f3b24265&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"641","name":"纪录片","template":"still","channel":{"id":"1020","code":"hot","name":"热点","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9306629","name":"湖南一山洞现神龙","aword":"专家喜闻讯而来惊天发现","update":"","url":"","duration":"3:46","still":"http://img1.funshion.com/sdw?oid=4ebce9aea635945016dd5b9dc497045c&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9306535","name":"四川一湖原本清澈见底","aword":"旦夕之间充斥血红湖水","update":"","url":"","duration":"4:33","still":"http://img3.funshion.com/sdw?oid=a42220832e0af4c38e1fba2cbae5934c&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9306597","name":"渔民海滩边目击美人鱼","aword":"仰卧海面疑似怀抱幼崽哺乳","update":"","url":"","duration":"4:16","still":"http://img.funshion.com/sdw?oid=532835dae41c9878efed6548096ad923&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9306613","name":"东南亚岛上挖出超2米头颅","aword":"疑似远古巨人头颅大如人","update":"","url":"","duration":"3:59","still":"http://img.funshion.com/sdw?oid=f95d6911960c5bd84093c39cf1e3d702&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"12","name":"重磅娱乐","template":"still","channel":{"id":"1001","code":"ent","name":"娱乐","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"8964605","name":"女星被主持人甩来甩去","aword":"韩国节目太变态了","update":"","url":"","duration":"2:38","still":"http://img2.funshion.com/sdw?oid=6436c0d08e75c2725f4a95456a384535&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"http://img1.funshion.com/sdw?oid=a61beeb49f2f24755b648e6bd059f851&amp;w=0&amp;h=0","picture02":"","picture06":""},{"template":"vplay","mid":"9306255","name":"主播聚会清一色大长腿","aword":"傻傻分不清楚！","update":"","url":"","duration":"1:24","still":"http://img3.funshion.com/sdw?oid=ecdc5cef2ffd0094d92a02376b191102&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9303823","name":"宋佳穿深V长裙出席活动","aword":"露傲人事业线","update":"","url":"","duration":"1:01","still":"http://img1.funshion.com/sdw?oid=79186fd2a472f27681b945e766272e07&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304463","name":"赵丽颖用布盖大腿防走光","aword":"结果还是露出肉色安全裤","update":"","url":"","duration":"2:24","still":"http://img.funshion.com/sdw?oid=dae0b6d661c2fa7410a4a778358e2199&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"648","name":"本山和他的徒弟们","template":"still","channel":{"id":"1004","code":"funny","name":"搞笑","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9260545","name":"本山大叔的这个小品绝了","aword":"当演员竟有这多内幕！","update":"","url":"","duration":"11:52","still":"http://img.funshion.com/sdw?oid=5f721fe870cfde3eacceeec9a70c4b67&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9260713","name":"原来他对徒弟这么多意见","aword":"这话太硬了！不过挺逗的","update":"","url":"","duration":"6:37","still":"http://img.funshion.com/sdw?oid=9c86d68b621160b8b44aa379a2111a5f&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304775","name":"赵本山和女徒弟视频曝光","aword":"最后那个真漂亮","update":"","url":"","duration":"5:10","still":"http://img2.funshion.com/sdw?oid=dd409bdb7995751f5b4002f16872434f&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304779","name":"最宠的徒弟被央视赶下台","aword":"赵本山怎么也捧不红！","update":"","url":"","duration":"1:50","still":"http://img.funshion.com/sdw?oid=6bf56ce35c9d04b09095717bfa64d49c&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"14","name":"搞笑","template":"still","channel":{"id":"1004","code":"funny","name":"搞笑","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9304803","name":"想不开也别用头砸马桶啊","aword":"厉害了Word哥！","update":"","url":"","duration":"5:26","still":"http://img1.funshion.com/sdw?oid=8f0f388443cb35548fccc6c7d440f8ca&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304531","name":"这种数学老师给我来一打","aword":"看来你们的数学升级很好","update":"","url":"","duration":"0:38","still":"http://img3.funshion.com/sdw?oid=c132e078701bae45cd5f079820748450&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304505","name":"大老爷们卖萌我也是醉了","aword":"简直不敢多看一秒！","update":"","url":"","duration":"0:15","still":"http://img2.funshion.com/sdw?oid=b778f9fb01d36084514aaeaced22b616&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304533","name":"哥们你跪着也得跳完舞！","aword":"作死啊！笑死了","update":"","url":"","duration":"0:49","still":"http://img1.funshion.com/sdw?oid=e3176f1c150a7586c75892f53135de8e&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"447","name":"会员尊享","template":"poster","channel":{"id":"8","code":"vipmovie","name":"VIP","template":"cvip","url":""},"contents":[{"template":"mplay","mid":"302112","name":"纽约纽约","aword":"阮经天狂撩杜鹃","update":"","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=0b8d2fc5dd6115b9c23103b184d78a7d&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=a3a5f515c344d5be1665c801032752b2&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":""}]},{"id":"11","name":"王牌综艺","template":"still","channel":{"id":"4","code":"variety","name":"综艺","template":"cstill","url":""},"contents":[{"template":"mplay","mid":"101755","name":"金牌调解","aword":"残疾儿子母担忧","update":"2016-11-21期","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=5c5305e444a81730494a20659403ae1d&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=4c85dad01d2ac86c6e4b8be71f9d4305&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"96318","name":"非你莫属","aword":"美女让涂磊点歌深情对唱","update":"2016-11-20期","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=70a8a1d27030631af7009735e82d1e9d&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=5cb7a6bdad54a5ca4c2289be7d1b8e8b&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vtopic","mid":"3811","name":"相声小品反串无底线","aword":"宋小宝口臭熏晕皇上？","update":"","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=791f0bc9c836784ef4dd546074b2cb69&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"101751","name":"非常完美","aword":"浪荡公子刘再融牵手学生妹","update":"2016-11-19期","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=3799c4fd3959e9cda5c026d62f3feeaa&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=42aff0b537c2bdd98d58d09db0fce0c9&amp;w=0&amp;h=0","focus":"http://img3.funshion.com/sdw?oid=e90c423ea216f1bc4deec6d9d3d3b0a3&amp;w=0&amp;h=0","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"300096","name":"武林笼中对","aword":"梁娜裸绞降服艾罗娜","update":"2016-11-18期","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=af12fd263cd7187e23eaca42dd41c4e7&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=540e84d3c12ec7e6aec43fc9a82543ba&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"105880","name":"大声说出来","aword":"任性女为拍照逼男友上房顶","update":"2016-11-16期","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=6b1c5322956fa90ace199b5b9f633d13&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=659ada9dd0288b5703934579008a2223&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"10","name":"人气动漫","template":"poster","channel":{"id":"3","code":"cartoon","name":"动漫","template":"cmedia","url":""},"contents":[{"template":"mplay","mid":"94061","name":"越狱兔全集","aword":"神奇兔子爆笑牢狱","update":"全78集","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=b61712056dd6849216055e298dd5fc99&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=155a9d03b57a495c908047872c97e572&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":""},{"template":"mplay","mid":"114638","name":"奥特曼列传","aword":"一大波奥特曼来袭","update":"全65集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=9f87e0e7d2ba569b31d10b39bd2b82c2&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=dda675c5bc2d256e9c2da1ea44bec129&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"mplay","mid":"305145","name":"那年那兔那些事儿 第三季","aword":"每只兔子都有个大国梦","update":"更新至4集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=dff70f4b5a8719e96d52548278ebf291&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=e8ee1d686bcaeaeade71a243f1fe80f7&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"mplay","mid":"116586","name":"精灵梦叶罗丽","aword":"具有魔法的夜萝莉娃娃","update":"全26集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=590a81260bd473e67e73eea186eec784&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=f29c40ee9df1022abaf229c4e800f7f8&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"303010","name":"狐妖小红娘 第三季","aword":"那天我以为遇到了女神","update":"更新至13集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=390e22b8c69195f3942c27b3875246d6&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=f2d4a5cf86c42c17dd03822df23be171&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"mplay","mid":"202040","name":"我的世界 动画版","aword":"创造一个属于你的世界","update":"全200集","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=1e67428acf2bc1b25b5885d245822ade&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=7c664ada7973c6c5199ce2acd9e89bf6&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"114375","name":"恐龙世界总动员","aword":"霸王龙找妈妈","update":"全126集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=e4f5a15bdb7c1392ab77c1949dcda0dc&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=7e2f04a63e8d916537220817f24691b5&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"mplay","mid":"302053","name":"画江湖之不良人 第二季","aword":"中国式浪漫传奇武侠","update":"更新至18集","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=18f31791ba643632dd38f7ab40bd5824&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=c10b0e598d6b56be568c60324b1d658e&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":""},{"template":"mplay","mid":"85667","name":"黑猫警长第二部","aword":"机智勇敢屡破奇案","update":"全12集","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=2109693f400de782121150ccd9bd3e3e&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=98288cc3459e23698052eca186874642&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":""}]},{"id":"27","name":"动漫片花","template":"still","channel":{"id":"1018","code":"vcarton","name":"动漫片花","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"4007038","name":"【熊出没之冬日乐翻天】暴雪警报","aword":"","update":"","url":"","duration":"2:57","still":"http://img2.funshion.com/sdw?oid=58df4943d8c4b5a6c5f6053ea9e96bf0&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vplay","mid":"8706955","name":"【粉红猪小妹】寒冷冬日","aword":"","update":"","url":"","duration":"4:44","still":"http://img.funshion.com/sdw?oid=e74e4983281223dee8e9d1a9a090402c&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9295855","name":"真人版【火影忍者】鸣人VS佐助","aword":"","update":"","url":"","duration":"4:50","still":"http://img1.funshion.com/sdw?oid=eecaddab66594fa2419c26daa71d73cb&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vplay","mid":"9304647","name":"动画电影【名侦探柯南：纯黑的恶梦】完整预告片","aword":"","update":"","url":"","duration":"1:30","still":"http://img.funshion.com/sdw?oid=2c939c3cf99e7268bfd508130eea8e4e&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""}]},{"id":"625","name":"军事","template":"still","channel":{"id":"1026","code":"mil","name":"军事","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9306295","name":"F35急部署五角大楼打脸","aword":"落雷一劈即爆炸","update":"","url":"","duration":"2:07","still":"http://img.funshion.com/sdw?oid=c4c03d301256fed2400c27aa5fa1b8be&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9317829","name":"土耳其转买S400真相","aword":"弃购红旗9 骗完中国再骗俄？","update":"","url":"","duration":"4:41","still":"http://img2.funshion.com/sdw?oid=a3989dba0c3adea2befe929a0f730f8c&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304395","name":"越最强机欲再飞越中国岛","aword":"30年前一击令其有来无回","update":"","url":"","duration":"5:35","still":"http://img3.funshion.com/sdw?oid=10b4d9373c04982e18c87d599363a903&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9292275","name":"缅北多地发生武装冲突","aword":"大批难民涌向中缅边境","update":"","url":"","duration":"1:43","still":"http://img.funshion.com/sdw?oid=d66e449c58fb96e22dc21ac0090cd031&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]},{"id":"13","name":"五星体育","template":"still","channel":{"id":"1002","code":"sport","name":"体育","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9318059","name":"【欧冠第5轮】皇马2-1里斯本","aword":"C罗助攻本泽马绝杀","update":"","url":"","duration":"4:43","still":"http://img.funshion.com/sdw?oid=64b400719059f59bea7f67a6a35dfb19&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9294905","name":"空中突发意外小露春光","aword":"美女蹦极连衣裙瞬间脱落","update":"","url":"","duration":"1:01","still":"http://img3.funshion.com/sdw?oid=407dfc1e20656431869707e35be9c5bd&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304771","name":"五五开被恶搞登场非诚勿扰","aword":"惨遭女嘉宾集体狂喷","update":"","url":"","duration":"2:16","still":"http://img.funshion.com/sdw?oid=e948fe7407f363d46aaff189fb75e2b2&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vtopic","mid":"3770","name":"钢拳铁腿击爆五脏六腑","aword":"武僧一龙收割各路人头","update":"","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=752ca8743e4a8dbc15408830ef10b3e4&amp;w=0&amp;h=0","poster":"","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""}]},{"id":"17","name":"微电影","template":"still","channel":{"id":"5","code":"vfilm","name":"微电影","template":"cmedia","url":""},"contents":[{"template":"mplay","mid":"111633","name":"狠爱你","aword":"有点虐心、有点温情","update":"","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=08e97d7e50fdefc40bf93533e248b406&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=67219d392c6bb6709e472ae225a87883&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":""},{"template":"mplay","mid":"305949","name":"天下有贼II之浮生若梦","aword":"用已知的梦求解未知的你","update":"","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=612ff241ed0fc54391a751d57c7d9dc3&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=1f08c1e45a455d4a3404563d325d3f9b&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"mplay","mid":"305777","name":"昨天","aword":"时光倒流也回不到昨天","update":"","url":"","duration":"","still":"http://img2.funshion.com/sdw?oid=2aee4b5aff51f6fe71b0e5866c9bcc82&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=bb34f887df8c9c8c4b28c3114fde8d1c&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"mplay","mid":"118385","name":"完美约会","aword":"单身狗成功脱单大宝典","update":"","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=5ba9d4acc3b3219ec4b2fec6e810148f&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=af68d10ca89b536ae0802e7631da8abc&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":""},{"template":"mplay","mid":"211992","name":"一句问候","aword":"哑巴与教授情妇虐恋","update":"","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=972d7f9af4a121ec05d69b2d50cd1d83&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=f2f3481fc59978d2c2f6ab04399b039d&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":""},{"template":"mplay","mid":"301924","name":"东纪","aword":"节操可以丢渣男必须死","update":"","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=8df639827d1a74a97f3420d8e4821f8b&amp;w=0&amp;h=0","poster":"http://img1.funshion.com/sdw?oid=1f62336871ae2e24f0d13e66a2f415d7&amp;w=0&amp;h=0","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""}]},{"id":"623","name":"生活·旅游","template":"still","channel":{"id":"1007","code":"tour","name":"旅游","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9316843","name":"第一次吃这样的面包，怎么装成经常吃的样子?","aword":"","update":"","url":"","duration":"0:15","still":"http://img.funshion.com/sdw?oid=c2c2d47a58711b2ef6467a214ce8cdf5&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vplay","mid":"9316863","name":"别抢了！还是这份醉香红烧肉靠谱","aword":"","update":"","url":"","duration":"3:01","still":"http://img2.funshion.com/sdw?oid=ee64ce04dd6845e336bf9331ba5ec7c4&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vplay","mid":"9305871","name":"日本如何体外受精 让现场来告诉你","aword":"","update":"","url":"","duration":"4:49","still":"http://img2.funshion.com/sdw?oid=f8f3e484eb8179c63b7d24dad996030a&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9310747","name":"为了让人们尊重妓女，荷兰政府集资修建了这所博物馆","aword":"","update":"","url":"","duration":"1:41","still":"http://img2.funshion.com/sdw?oid=6950a6aa32ef20d45358275a1f6ec8de&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""}]},{"id":"624","name":"健康·母婴","template":"still","channel":{"id":"1009","code":"health","name":"健康","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9306107","name":"吃苹果到底削皮好还是不削皮好？","aword":"","update":"","url":"","duration":"1:11","still":"http://img.funshion.com/sdw?oid=1dc71f2500cf4a0b07039e1e52ce41de&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9296637","name":"女生那点事儿，什么样的身材最吸引男人？","aword":"","update":"","url":"","duration":"2:08","still":"http://img3.funshion.com/sdw?oid=47d457e213dbdeb62ef3a127a6fd3903&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9296631","name":"什么！男性常吃这种东西易不孕？","aword":"","update":"","url":"","duration":"1:08","still":"http://img1.funshion.com/sdw?oid=61071a0c45125c8b423d74d631c9edd7&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9296609","name":"竟有这样快速怀孕的奇葩方式？！","aword":"","update":"","url":"","duration":"4:05","still":"http://img2.funshion.com/sdw?oid=539102399d9a75f8285e1724952df06d&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""}]},{"id":"621","name":"汽车·时尚","template":"still","channel":{"id":"1005","code":"auto","name":"汽车","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9315031","name":"仇富路人向法拉利砸东西，车主吓了一跳","aword":"","update":"","url":"","duration":"0:19","still":"http://img.funshion.com/sdw?oid=c43134b67d5cfe523de9e839ac6b960f&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vplay","mid":"9304609","name":"1厘米！最窄漂移侧方位停车世界新纪录","aword":"","update":"","url":"","duration":"0:54","still":"http://img.funshion.com/sdw?oid=13d7f4edf369c782f4365b9065ecf34a&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vplay","mid":"9144899","name":"通向T台之路 维秘天使约瑟芬·斯可瑞娃","aword":"","update":"","url":"","duration":"0:34","still":"http://img2.funshion.com/sdw?oid=1b73355307c0489fc2fec6e33b3a6a1e&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vplay","mid":"9300271","name":"林志玲穿着两千万的衣服吊威亚 鼻子都吊歪了！","aword":"","update":"","url":"","duration":"2:03","still":"http://img.funshion.com/sdw?oid=9e3db0786850535f0ef0f01216a10357&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""}]},{"id":"657","name":"风行原创","template":"still","channel":{"id":"0","code":"","name":"","template":"","url":""},"contents":[{"template":"mplay","mid":"102463","name":"评影不离","aword":"佟大为版\u201c意外怀孕\u201d","update":"2016-11-01期","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=ccda358f1a6574c3064c123d186cc277&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=cb9e884dd97f7220c7e398df7d41c18b&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"http://img1.funshion.com/sdw?oid=3874e214b71d70965515de9901f4afc4&amp;w=0&amp;h=0","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"98097","name":"风行星风范","aword":"大鹏直言跟着冯小刚学不到东西","update":"2016-11-21期","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=fbaa3ca6a53f697ab4da7b804c0c9434&amp;w=0&amp;h=0","poster":"http://img3.funshion.com/sdw?oid=cc09e4ab792d4008d86efcbbbf4c55dc&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"http://img1.funshion.com/sdw?oid=3874e214b71d70965515de9901f4afc4&amp;w=0&amp;h=0","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"304855","name":"迷妹剧能叨","aword":"老九门让你抓狂的帅锅","update":"2019-09-20期","url":"","duration":"","still":"http://img3.funshion.com/sdw?oid=ab36c2203992e240b39229b92622d93c&amp;w=0&amp;h=0","poster":"http://img.funshion.com/sdw?oid=1cd4e985edec4677dabebc715746e69f&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"mplay","mid":"303415","name":"老司机电影恋爱学","aword":"矮个子男生如何搞定长腿妹","update":"2016-09-13期","url":"","duration":"","still":"http://img.funshion.com/sdw?oid=1429cc520d5f06adb4e237bfe80ea5fe&amp;w=0&amp;h=0","poster":"http://img2.funshion.com/sdw?oid=2159778056f3c5d4b50f90d6237e2016&amp;w=0&amp;h=0","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"http://img1.funshion.com/sdw?oid=3874e214b71d70965515de9901f4afc4&amp;w=0&amp;h=0","still_gif":"","picture02":"","picture06":""}]},{"id":"18","name":"游戏","template":"still","channel":{"id":"1011","code":"vgame","name":"游戏","template":"cvideo","url":""},"contents":[{"template":"vplay","mid":"9316507","name":"LOL十个劫同时开大结局会是怎样","aword":"火影劫疯狂屠杀","update":"","url":"","duration":"5:19","still":"http://img.funshion.com/sdw?oid=d1ed86f147ce715d7227cf9cd6d0f980&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9298227","name":"激光伤害8个9！DNF完全体暗帝58秒竞速新版擎天之柱！","aword":"伤害高的就是不讲道理。","update":"","url":"","duration":"1:33","still":"http://img1.funshion.com/sdw?oid=01bc46d6260c141dc6ba49e7a0e39dfe&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304079","name":"史上最难的植物大战僵尸2：全屏墓碑？彩陶盛宴","aword":"听说聪明的都喜欢玩？","update":"","url":"","duration":"5:46","still":"http://img.funshion.com/sdw?oid=7581b1fa9a4949480fc01183e0d6f9a2&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9303215","name":"GTA5搞笑碉堡集锦：不搞事我就浑身难受！","aword":"","update":"","url":"","duration":"5:19","still":"http://img1.funshion.com/sdw?oid=f50fa4e099ea6e8d79574fcaa76089c1&amp;w=0&amp;h=0","poster":"","focus":" ","banner":"","icon":"","picture01":"","picture02":"","corner":""}]}]
     */

    private String retcode;
    private String retmsg;
    /**
     * template : mplay
     * mid : 306493
     * name : 无名者
     * aword : 丁志诚率五虎玩潜伏
     * update : 更新至2集
     * url :
     * duration :
     * still : http://img3.funshion.com/sdw?oid=57d05b1c714428cfe7269820f070f0af&amp;w=0&amp;h=0
     * poster : http://img1.funshion.com/sdw?oid=88a69d3f205eb8172a2b8a3e8fa39d23&amp;w=0&amp;h=0
     * focus : http://img.funshion.com/sdw?oid=b4c9a39a4c2662b5ebc1607f3ff87329&amp;w=0&amp;h=0
     * vipfocus :
     * banner : http://img3.funshion.com/sdw?oid=c8cd5bac937a6062b7e6459eceaee937&amp;w=0&amp;h=0
     * icon :
     * picture01 :
     * corner :
     * still_gif :
     * picture02 :
     * picture06 :
     */

    private List<FocusBean> focus;
    /**
     * id : 7
     * name : 热点推荐
     * template : still
     * channel : {"id":"","code":"","name":"","template":"null","url":""}
     * contents : [{"template":"vplay","mid":"9317289","name":"攒一辈子运气就为这一秒","aword":"各路牛人幸运躲过灾祸","update":"","url":"","duration":"1:37","still":"http://img2.funshion.com/sdw?oid=8ec55f119c06b1d86ce8920430957b03&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"http://img2.funshion.com/sdw?oid=3d262de5bdcce1b1d5fb4d367d7b0906&amp;w=0&amp;h=0","picture02":"","picture06":""},{"template":"vplay","mid":"9304035","name":"装载老虎车辆被追尾","aword":"司机：信不信放老虎咬你","update":"","url":"","duration":"1:30","still":"http://img2.funshion.com/sdw?oid=cd8c386c1a15b5575cfde3f2b0c42dd2&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vtopic","mid":"3678","name":"宋佳穿深V长裙出席活动","aword":"露傲人事业线","update":"","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=79186fd2a472f27681b945e766272e07&amp;w=0&amp;h=0","poster":"","focus":"","banner":"","icon":"","picture01":"","picture02":"","corner":""},{"template":"vtopic","mid":"3229","name":"城玩！女神都有受虐的心","aword":"我看好你哦妹纸","update":"","url":"","duration":"","still":"http://img1.funshion.com/sdw?oid=8496a9e16223898370455ae6a2437a56&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9303829","name":"女星台上弹钢琴花式抬腿","aword":"尴尬！春光乍泄","update":"","url":"","duration":"1:01","still":"http://img1.funshion.com/sdw?oid=0d549e72de4ad5efb3cf91102c25f498&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9304259","name":"妹子这造型简直逆天了","aword":"跪服!只能说是在下输了","update":"","url":"","duration":"3:19","still":"http://img3.funshion.com/sdw?oid=b7e87d392b21d5d67423184fcec82822&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""},{"template":"vplay","mid":"9306005","name":"逆天了！高速上诡异一幕","aword":"两车猛烈相撞瞬间粉碎","update":"","url":"","duration":"0:23","still":"http://img.funshion.com/sdw?oid=de7adf4e3c188ce5e0fa33ba1be738c6&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"http://img.funshion.com/sdw?oid=42e833182ccf3f92444995ee12fd696f&amp;w=0&amp;h=0","picture02":"","picture06":""},{"template":"web","mid":"1478489415","name":"贯彻十八届六中全会精神","aword":"中国特色社会主义事业领导核心","update":"","url":"http://special.71.cn/161014/","duration":"","still":"http://img3.funshion.com/sdw?oid=e8d057bf6872ca84a6fe8ad09ba20a9d&amp;w=0&amp;h=0","poster":"","focus":"","vipfocus":"","banner":"","icon":"","picture01":"","corner":"","still_gif":"","picture02":"","picture06":""}]
     */

    private List<BlocksBean> blocks;

    public static HomeBean objectFromData(String str) {

        return new Gson().fromJson(str, HomeBean.class);
    }

    public static HomeBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), HomeBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HomeBean> arrayHomeBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomeBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HomeBean> arrayHomeBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HomeBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public List<FocusBean> getFocus() {
        return focus;
    }

    public void setFocus(List<FocusBean> focus) {
        this.focus = focus;
    }

    public List<BlocksBean> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlocksBean> blocks) {
        this.blocks = blocks;
    }

    public static class FocusBean {
        private String template;
        private String mid;
        private String name;
        private String aword;
        private String update;
        private String url;
        private String duration;
        private String still;
        private String poster;
        private String focus;
        private String vipfocus;
        private String banner;
        private String icon;
        private String picture01;
        private String corner;
        private String still_gif;
        private String picture02;
        private String picture06;

        public static FocusBean objectFromData(String str) {

            return new Gson().fromJson(str, FocusBean.class);
        }

        public static FocusBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), FocusBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<FocusBean> arrayFocusBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<FocusBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<FocusBean> arrayFocusBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<FocusBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAword() {
            return aword;
        }

        public void setAword(String aword) {
            this.aword = aword;
        }

        public String getUpdate() {
            return update;
        }

        public void setUpdate(String update) {
            this.update = update;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getStill() {
            return still;
        }

        public void setStill(String still) {
            this.still = still;
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }

        public String getFocus() {
            return focus;
        }

        public void setFocus(String focus) {
            this.focus = focus;
        }

        public String getVipfocus() {
            return vipfocus;
        }

        public void setVipfocus(String vipfocus) {
            this.vipfocus = vipfocus;
        }

        public String getBanner() {
            return banner;
        }

        public void setBanner(String banner) {
            this.banner = banner;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getPicture01() {
            return picture01;
        }

        public void setPicture01(String picture01) {
            this.picture01 = picture01;
        }

        public String getCorner() {
            return corner;
        }

        public void setCorner(String corner) {
            this.corner = corner;
        }

        public String getStill_gif() {
            return still_gif;
        }

        public void setStill_gif(String still_gif) {
            this.still_gif = still_gif;
        }

        public String getPicture02() {
            return picture02;
        }

        public void setPicture02(String picture02) {
            this.picture02 = picture02;
        }

        public String getPicture06() {
            return picture06;
        }

        public void setPicture06(String picture06) {
            this.picture06 = picture06;
        }
    }

    public static class BlocksBean {
        private String id;
        private String name;
        private String template;
        /**
         * id :
         * code :
         * name :
         * template : null
         * url :
         */

        private ChannelBean channel;
        /**
         * template : vplay
         * mid : 9317289
         * name : 攒一辈子运气就为这一秒
         * aword : 各路牛人幸运躲过灾祸
         * update :
         * url :
         * duration : 1:37
         * still : http://img2.funshion.com/sdw?oid=8ec55f119c06b1d86ce8920430957b03&amp;w=0&amp;h=0
         * poster :
         * focus :
         * vipfocus :
         * banner :
         * icon :
         * picture01 :
         * corner :
         * still_gif : http://img2.funshion.com/sdw?oid=3d262de5bdcce1b1d5fb4d367d7b0906&amp;w=0&amp;h=0
         * picture02 :
         * picture06 :
         */

        private List<ContentsBean> contents;

        public static BlocksBean objectFromData(String str) {

            return new Gson().fromJson(str, BlocksBean.class);
        }

        public static BlocksBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), BlocksBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<BlocksBean> arrayBlocksBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<BlocksBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<BlocksBean> arrayBlocksBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<BlocksBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public ChannelBean getChannel() {
            return channel;
        }

        public void setChannel(ChannelBean channel) {
            this.channel = channel;
        }

        public List<ContentsBean> getContents() {
            return contents;
        }

        public void setContents(List<ContentsBean> contents) {
            this.contents = contents;
        }

        public static class ChannelBean {
            private String id;
            private String code;
            private String name;
            private String template;
            private String url;

            public static ChannelBean objectFromData(String str) {

                return new Gson().fromJson(str, ChannelBean.class);
            }

            public static ChannelBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ChannelBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ChannelBean> arrayChannelBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ChannelBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ChannelBean> arrayChannelBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ChannelBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTemplate() {
                return template;
            }

            public void setTemplate(String template) {
                this.template = template;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class ContentsBean {
            private String template;
            private String mid;
            private String name;
            private String aword;
            private String update;
            private String url;
            private String duration;
            private String still;
            private String poster;
            private String focus;
            private String vipfocus;
            private String banner;
            private String icon;
            private String picture01;
            private String corner;
            private String still_gif;
            private String picture02;
            private String picture06;

            public static ContentsBean objectFromData(String str) {

                return new Gson().fromJson(str, ContentsBean.class);
            }

            public static ContentsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ContentsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ContentsBean> arrayContentsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ContentsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ContentsBean> arrayContentsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ContentsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getTemplate() {
                return template;
            }

            public void setTemplate(String template) {
                this.template = template;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAword() {
                return aword;
            }

            public void setAword(String aword) {
                this.aword = aword;
            }

            public String getUpdate() {
                return update;
            }

            public void setUpdate(String update) {
                this.update = update;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getStill() {
                return still;
            }

            public void setStill(String still) {
                this.still = still;
            }

            public String getPoster() {
                return poster;
            }

            public void setPoster(String poster) {
                this.poster = poster;
            }

            public String getFocus() {
                return focus;
            }

            public void setFocus(String focus) {
                this.focus = focus;
            }

            public String getVipfocus() {
                return vipfocus;
            }

            public void setVipfocus(String vipfocus) {
                this.vipfocus = vipfocus;
            }

            public String getBanner() {
                return banner;
            }

            public void setBanner(String banner) {
                this.banner = banner;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getPicture01() {
                return picture01;
            }

            public void setPicture01(String picture01) {
                this.picture01 = picture01;
            }

            public String getCorner() {
                return corner;
            }

            public void setCorner(String corner) {
                this.corner = corner;
            }

            public String getStill_gif() {
                return still_gif;
            }

            public void setStill_gif(String still_gif) {
                this.still_gif = still_gif;
            }

            public String getPicture02() {
                return picture02;
            }

            public void setPicture02(String picture02) {
                this.picture02 = picture02;
            }

            public String getPicture06() {
                return picture06;
            }

            public void setPicture06(String picture06) {
                this.picture06 = picture06;
            }
        }
    }
}
