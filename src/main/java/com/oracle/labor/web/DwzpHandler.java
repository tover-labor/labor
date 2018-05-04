package com.oracle.labor.web;

import com.oracle.labor.common.codetable.IndustryOperation;
import com.oracle.labor.common.codetable.OrgtypeOperation;
import com.oracle.labor.common.codetable.RegioncodeOperation;
import com.oracle.labor.common.codetable.RegtypeOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/service/dwzp")
public class DwzpHandler {
    @RequestMapping(value = "/dwxz",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String dwxz(String val){
        String result=OrgtypeOperation.getOption(val);

        return result;
    }
    @RequestMapping(value = "/dwjjlx",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String dwjjlx(String val){
        System.out.println("访问到");
        String result=RegtypeOperation.getOption(val);
        System.out.println(result);
        return result;
    }
    @RequestMapping(value = "/dwhy",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String dwhy(String val){
        String result=IndustryOperation.getOption(val);
        return result;
    }
//    @RequestMapping(value = "/city",produces = "text/html;charset=UTF-8")
//    @ResponseBody
//    public String City(String val){
//        String result=RegioncodeOperation.getOption();
//        return result;
//    }


}
