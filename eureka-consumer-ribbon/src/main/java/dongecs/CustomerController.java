package dongecs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author dongecs
 * @create 2018-10-19 0:10
 * @desc
 **/
@RestController
public class CustomerController {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("customer")
    public String customer(){
        return this.restTemplate.getForObject("http://eureka-client/test", String.class);
    }
}
