package com.oua.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.oua.spring.domain.UserDetails;
import com.oua.spring.model.UserModel;
import com.oua.spring.service.UserDetailsService;


@Consumes(MediaType.APPLICATION_JSON)
@Controller
public class ProductController {
	
	@Autowired
	private UserDetailsService userDetailsService; 
	
	
	  @RequestMapping(value="/list")
	    public ModelAndView list() {
	        List<UserModel> itemList = userDetailsService.list();
	        ModelAndView model = new ModelAndView("ItemMasterList");
	        model.addObject("itemList", itemList);
	        return model;
	    }

	  @RequestMapping(value="/loadAddForm")
	    public ModelAndView add() {
	        ModelAndView model = new ModelAndView("ItemMasterAdd");
	        UserDetails item=new UserDetails();
           model.addObject("item", item);
            List<UserModel> itemList =  userDetailsService.list();
	        model.addObject("itemList", itemList);
	        return model;
	    }
	  
	  @RequestMapping(value="/edit")
	    public ModelAndView edit(@RequestParam(value="id", required=true) Long id) {
		  System.out.println("Id= " + id);
	        ModelAndView model = new ModelAndView("ItemMasterAdd");
	        UserModel item=  userDetailsService.getUserDetails(id);
           model.addObject("item", item);
           List<UserModel> itemList = userDetailsService.list();
	        model.addObject("itemList", itemList);
	        return model;
	    }
	
	
	  @RequestMapping(value="/delete")
	    public ModelAndView delete(@RequestParam(value="id", required=true) Long id) {
	        ModelAndView model = new ModelAndView("ItemMasterAdd");
	        userDetailsService.delete(id);
	        List<UserModel> itemList =  userDetailsService.list();
	        model.addObject("itemList", itemList);
	        return model;
	    }
	
	
	  @RequestMapping(value ="/save")
	  @ResponseBody
	    public ModelAndView save(@ModelAttribute("item") UserDetails item) {
	        if(null != item ) 
	        	userDetailsService.add(item);
	         ModelAndView model = new ModelAndView("ItemMasterAdd");
			item=new UserDetails();
	        model.addObject("item", item);
	        List<UserModel> itemList =  userDetailsService.list();
	        model.addObject("itemList", itemList);
	        return model;
	      
	  }
	  
      @RequestMapping(value ="/saveNew", method = RequestMethod.POST )
	  @ResponseStatus( HttpStatus.CREATED )
	  @ResponseBody
	    public Map<String, Object> saveNew(UserDetails item) {
	        if(null != item ) 
	        	userDetailsService.add(item);
	         ModelAndView model = new ModelAndView("ItemMasterAdd");
	         Map<String, Object> map = new HashMap<String, Object>();
			item=new UserDetails();
			map.put("item", item);
			List<UserModel> itemList = userDetailsService.list();
	        map.put("itemList", itemList);
			map.put("message", "ItemMasterAdd");
	        return map;
	        
	  }

}

