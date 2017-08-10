package hbi.core.demo.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.demo.dto.OrderLine;
import hbi.core.demo.service.IOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by NoName on 2017/8/9.
 */
@Controller
@RequestMapping("/order/lines")
public class OrderLineController extends BaseController {

    @Autowired
    private IOrderLineService service;

    @RequestMapping(value = "/query")
    @ResponseBody
    public ResponseData query(OrderLine orderLine, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.selectLine(requestContext, orderLine, page, pageSize));
    }


    @RequestMapping(value = "/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<OrderLine> orderLines, BindingResult result, HttpServletRequest request) {
        getValidator().validate(orderLines, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, orderLines));
    }

    @RequestMapping(value = "/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<OrderLine> orderLines) {
        service.batchDelete(orderLines);
        return new ResponseData();
    }

    @RequestMapping(value = "/max/line/number")
    @ResponseBody
    public Long selectMaxLineNumber(Long headerId,Long lineNumber) {
        return service.selectMaxLineNumber(headerId);
    }
}
