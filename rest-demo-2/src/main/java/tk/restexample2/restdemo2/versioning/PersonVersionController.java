/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk.restexample2.restdemo2.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nikhil TK
 */
@RestController
public class PersonVersionController {

//    Versioning based on URI
    @GetMapping("/v1/personv1")
    public PersonV1 getPersonV1() {
        return new PersonV1("Nikhil TK");
    }

    @GetMapping("/v2/personv2")
    public PersonV2 getPersonV2() {
        return new PersonV2(new Name("Nikhil", "TK"));
    }

// End here
    
//Versioning Based on request Parameter
    @GetMapping(value = "person/param", params = "version=1")
    public PersonV1 getParamV1() {
        return new PersonV1("Nikhil TK");
    }

    @GetMapping(value = "person/param", params = "version=2")
    public PersonV2 getParamV2() {
        return new PersonV2(new Name("Nikhil", "TK"));
    }
    
 // End Here
    
//Versioning Based on header Parameter
    @GetMapping(value = "person/header", headers = "X-API-VERSION=1")
    public PersonV1 getHeaderV1() {
        return new PersonV1("Nikhil TK");
    }

    @GetMapping(value = "person/header", headers = "X-API-VERSION=2")
    public PersonV2 getHeaderV2() {
        return new PersonV2(new Name("Nikhil", "TK"));
    }
    
 // End Here
    
//Versioning Based on produces Parameter or MIME TYPE Versioning
    @GetMapping(value = "person/produces", produces = "application/and.company.app-v1+json")
    public PersonV1 getProducesV1() {
        return new PersonV1("Nikhil TK");
    }

    @GetMapping(value = "person/produces", produces = "application/and.company.app-v2+json")
    public PersonV2 getProducesV2() {
        return new PersonV2(new Name("Nikhil", "TK"));
    }
    
 // End Here
}
