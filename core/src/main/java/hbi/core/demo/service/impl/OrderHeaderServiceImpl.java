package hbi.core.demo.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.OrderHeader;
import hbi.core.demo.mapper.OrderLineMapper;
import hbi.core.demo.service.IOrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by NoName on 2017/8/8.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderHeaderServiceImpl extends BaseServiceImpl<OrderHeader> implements IOrderHeaderService {
    @Autowired
    private OrderLineMapper orderLineMapper;

    @Override
    public void remove(OrderHeader emp) {
        orderLineMapper.deleteByHeaderId(emp.getHeaderId());
        deleteByPrimaryKey(emp);
    }
}
