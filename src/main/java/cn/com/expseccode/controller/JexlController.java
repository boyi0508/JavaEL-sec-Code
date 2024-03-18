package cn.com.expseccode.controller;

import org.apache.commons.jexl3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JexlController {

    @GetMapping("/jexl")
    public String jexl(String expression){
        //1.创建表达式对象
        JexlEngine jexlEngine = new JexlBuilder().create();
        //创建上下文
        MapContext mapContext = new MapContext();
        mapContext.set("exp",expression);
        //执行expression中得
        //表达式中得所有变量，都需要事先进行set进入jexlEngine。否则会报错。
        JexlExpression expression1 = jexlEngine.createExpression(expression);
        Object evaluate = expression1.evaluate(mapContext);
        return evaluate.toString();
    }
}
