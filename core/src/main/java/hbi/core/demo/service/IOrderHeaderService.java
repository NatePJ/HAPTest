package hbi.core.demo.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.demo.dto.OrderHeader;

/**
 * Created by NoName on 2017/8/8.
 */
public interface IOrderHeaderService extends IBaseService<OrderHeader>,ProxySelf<IOrderHeaderService> {
    void remove(OrderHeader emp);
}
