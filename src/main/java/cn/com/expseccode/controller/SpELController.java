package cn.com.expseccode.controller;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpELController {
    @RequestMapping("/spel")
    public String spEL(String expression){
        //实例化表达式解析对象
        ExpressionParser expressionParser = new SpelExpressionParser();
        //调用该对象的parseExpression去执行表达式
        Object value = expressionParser.parseExpression(expression).getValue();
        return value.toString();
    }
}
