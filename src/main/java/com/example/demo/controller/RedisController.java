package com.example.demo.controller;

/**
 * Created by 张齐 on 2019/11/21.
 */



        import com.example.demo.Common;
        import com.example.demo.utils.RedisUtil;
        import org.springframework.beans.factory.annotation.Autowired;

        import org.springframework.stereotype.Controller;

        import org.springframework.ui.ModelMap;

        import org.springframework.web.bind.annotation.RequestMapping;

        import org.springframework.web.bind.annotation.RequestMethod;

        import org.springframework.web.bind.annotation.ResponseBody;



/**

 * @ClassName: RedisController

 * @Auther: zhangyingqi

 * @Date: 2018/8/29 16:15

 * @Description:

 */

@Controller

@RequestMapping(value="/redis")

public class RedisController {

    @Autowired

    RedisUtil redisUtil;



    /**

     * @auther: zhangyingqi

     * @date: 16:23 2018/8/29

     * @param: []

     * @return: org.springframework.ui.ModelMap

     * @Description: 执行redis写/读/生命周期

     */

    @RequestMapping(value = "getRedis",method = RequestMethod.POST)

    @ResponseBody

    public  Common getRedis(){

        redisUtil.set("20182018","这是一条测试数据",1);

        Long resExpire = redisUtil.expire("20182018",60,1);//设置key过期时间

        //logger.info("resExpire="+resExpire);

        String res = redisUtil.get("20182018",1);

        return new Common(200,"存入并读取",res);

    }



}
