package hbi.core.demo.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.demo.dto.OrderLine;

import java.util.List;

/**
 * Created by NoName on 2017/8/9.
 */
public interface IOrderLineService extends IBaseService<OrderLine>,ProxySelf<IOrderLineService> {
    Long selectMaxLineNumber(Long headerId);
    List<OrderLine> selectLine(IRequest request, OrderLine emp, int pageNum, int pageSize);
}
