/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ruben
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "factorial")
    public int factorial(@WebParam(name = "numero") int x) {
        if(x==0){
            return 1;
        }
        int result = x;
        for (int i = x-1;i>1;i--){
            result= result*i;           
            
        }
        
        return result;
    }
}
