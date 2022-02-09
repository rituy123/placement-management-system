package com.cg.placementmanagement.Placement.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.placementmanagement.Placement.model.Studentlogin;
import  com.cg.placementmanagement.Placement.service.StudentLoginService;



@Controller
public class StudentLoginController {
	
	@Autowired
    private StudentLoginService userService;

                                  
    @RequestMapping(path = "/studentlogin", method = RequestMethod.GET)
    public ModelAndView llogin() {
    	ModelAndView mav1 = new ModelAndView("studentlogin");
        mav1.addObject("user1", new Studentlogin());
        return mav1;
    }

    @PostMapping("/studentlogin")
    public String llogin(@ModelAttribute("user1") Studentlogin user1 ) {
    	
    	Studentlogin oauthUser1 = userService.StudentLogin(user1.getUsername(), user1.getPassword());
    	

    	System.out.print(oauthUser1);
    	if(Objects.nonNull(oauthUser1)) 
    	{	
  
    		return "redirect:/studenttab";
    	
    		
    	} else {
    		return "redirect:/studentlogin";
    		
    	
    	}

}
    
    @RequestMapping(value = {"/logout1"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    	
	  
        return "redirect:/studentlogin";
    }
    @RequestMapping("/studenttab")
    public String studenttab() {
        return "studenttab";
    }
    @RequestMapping("/placementstudent")
    public String placementstudent() {
        return "placementstudent";
    }
    @RequestMapping("/Aboutus")
    public String Aboutus() {
        return "Aboutus";
    }
    //@RequestMapping("/studentstuindex")
    //public String studentstuindex() {
    //    return "studentstuindex";
  //  }
  
    
    
//    @GetMapping("/adminindex")
//    public String adminindex() {
//        return "adminindex"; //defect-details.html page name to open it
//    }

 
   
//    @GetMapping("/collegeindex")
//    public String collegeindex() {
//        return "collegeindex"; //defect-details.html page name to open it
//    }

//    @GetMapping("/newstudent")
//    public String newstudent() {
//        return "newstudent"; //defect-details.html page name to open it
//    }

}
