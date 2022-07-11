/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk.restexample2.restdemo2.filtering;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nikhil TK
 */
@RestController
public class StaticFilteringController {

    /**
     *
     * @return StaticBean object with static filtering value
     */
    @GetMapping("/filtering")
    public StaticBean retriveStaticBean(){
        return new StaticBean("value1","vlaue2","vlaue3");
        
    }
    
    @GetMapping("/filtering-list")
    public List<StaticBean> retriveListStaticBean(){
        return Arrays.asList(new StaticBean("value1","vlaue2","vlaue3"),new StaticBean("value11","vlaue12","vlaue13"));
        
    }
}
