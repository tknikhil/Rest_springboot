/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk.restexample2.restdemo2.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nikhil TK
 */
@RestController
public class DynamicFilteringController {

    //data1,data2
    @GetMapping("/d-filtering")
    public MappingJacksonValue retriveDynamicBean() {
        DynamicBean dynamicBean = new DynamicBean("value1", "value2", "vlaue3");

        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("data1", "data2");
        FilterProvider filters = new SimpleFilterProvider().addFilter("dynamicBeanFilter", simpleBeanPropertyFilter);
        MappingJacksonValue mapping = new MappingJacksonValue(dynamicBean);
        mapping.setFilters(filters);

        return mapping;
    }
    
    //data2,data3
    @GetMapping("/d-filtering-list")
    public MappingJacksonValue retriveDynamicListBean(){
        List<DynamicBean> dynamicBean = Arrays.asList(new DynamicBean("value11", "value12", "value13"));
        
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("data2","data3");
        FilterProvider filter = new SimpleFilterProvider().addFilter("dynamicBeanFilter", simpleBeanPropertyFilter);
        MappingJacksonValue mapping = new MappingJacksonValue(dynamicBean);
        mapping.setFilters(filter);
        
        return mapping;
    }
}
