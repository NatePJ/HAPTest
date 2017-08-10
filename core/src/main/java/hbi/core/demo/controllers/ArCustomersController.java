//package hbi.core.demo.controllers;
//
//import com.hand.hap.system.dto.ResponseData;
//import hbi.core.demo.dto.ArCustomers;
//import hbi.core.demo.service.IArCustomersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//
//import static com.hand.hap.account.constants.UserConstants.DEFAULT_PAGE;
//
///**
// * Created by NoName on 2017/8/10.
// */
//@Controller
//public class ArCustomersController {
//    @Autowired
//    private IArCustomersService service;
//
//    @RequestMapping(value = "/query")
//    @ResponseBody
//    public ResponseData query(ArCustomers customers, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
//                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request){
//        IRequest requestContext = createRequestContext(request);
////        orderHeader.setHeaderId(2L);
//        return new ResponseData(service.select(requestContext, customers, page, pageSize));
//    }
//}
