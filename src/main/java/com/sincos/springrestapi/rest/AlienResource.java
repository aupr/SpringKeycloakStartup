package com.sincos.springrestapi.rest;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
//@CrossOrigin
//@CrossOrigin(origins = "*")
public class AlienResource {

    @RequestMapping("aliens/kk")
    public String getAliens() {
        return "Hello Aliens";
    }

    @GetMapping("item/{name}/{item_type}")
    public Map<String, String> getuuu(@PathVariable("name") String myName, @PathVariable("item_type") String myItemType, KeycloakAuthenticationToken keycloakAuthenticationToken) {
        //Do your business with your name and item_type path Variable

        // To get the user id
        Principal principal = keycloakAuthenticationToken.getAccount().getPrincipal();
        System.out.println(principal.getName());

        KeycloakSecurityContext keycloakSecurityContext = keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext();

        System.out.println(keycloakSecurityContext.getRealm());
        System.out.println(keycloakSecurityContext.getToken().getPreferredUsername());

        // Full name
        System.out.println(keycloakSecurityContext.getToken().getName());

        //Last name
        System.out.println(keycloakSecurityContext.getToken().getFamilyName());
        // First name
        System.out.println(keycloakSecurityContext.getToken().getGivenName());

        System.out.println(keycloakSecurityContext.getToken().getMiddleName());
        System.out.println(keycloakSecurityContext.getToken().getNickName());
        System.out.println(keycloakSecurityContext.getToken().getGender());

        System.out.println(keycloakAuthenticationToken.getName());
        System.out.println(keycloakAuthenticationToken.getAccount().getRoles().toString());
        System.out.println(keycloakAuthenticationToken.getDetails().toString());
        System.out.println(keycloakAuthenticationToken.getCredentials().toString());
        //System.out.println(grantedAuthority.g);

        //return myName+"/"+myItemType;
        System.out.println("Requested!");


            HashMap<String, String> map = new HashMap<>();
            map.put(myName, myItemType);
            map.put("foo", "bar");
            map.put("aa", "bb");
            return map;

    }

    //@CrossOrigin(methods = RequestMethod.GET)
    @GetMapping("item2/{name}/{item_type}")
    public String getyyyy(@PathVariable Map<String,String> pathVars){
        //try something like
        String name= pathVars.get("name");
        String type= pathVars.get("item_type");
        //Do your business with your name and item_type path Variable
        return name+"/"+type;
    }
}
