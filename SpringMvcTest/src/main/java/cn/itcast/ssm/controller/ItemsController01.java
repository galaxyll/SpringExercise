package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

public class ItemsController01 implements Controller {


    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("Dell（666）");
        items_1.setPrice(6666);
        items_1.setDetail("人傻钱多戴，氪就完事了");

        Items items_2 = new Items();
        items_2.setName("Lenove(lll)");
        items_2.setPrice(5555);
        items_2.setDetail("美帝良心想,便宜就完事了");

        itemsList.add(items_1);
        itemsList.add(items_2);

        ModelAndView modelAndView = new ModelAndView();

        //相当于javaweb中的request域中的setAttribute
        modelAndView.addObject("itemsList",itemsList);
        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        return modelAndView;

    }
}
