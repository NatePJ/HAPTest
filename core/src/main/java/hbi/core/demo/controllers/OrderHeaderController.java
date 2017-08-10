package hbi.core.demo.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.demo.dto.OrderHeader;
import hbi.core.demo.service.IOrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by NoName on 2017/8/8.
 */
@Controller
@RequestMapping("/order/headers")
public class OrderHeaderController extends BaseController {
    @Autowired
    private IOrderHeaderService service;

    @RequestMapping(value = "/query")
    @ResponseBody
    public ResponseData query(OrderHeader orderHeader, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request){
        IRequest requestContext = createRequestContext(request);
//        orderHeader.setHeaderId(2L);
        return new ResponseData(service.select(requestContext, orderHeader, page, pageSize));
    }

    @RequestMapping(value = "/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<OrderHeader> orderHeaders, BindingResult result, HttpServletRequest request) {
        getValidator().validate(orderHeaders, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, orderHeaders));
    }

    @RequestMapping(value = "/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody OrderHeader header) {
        service.remove(header);
        return new ResponseData();
    }

}
