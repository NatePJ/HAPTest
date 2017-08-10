package hbi.core.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.OrderLine;
import hbi.core.demo.mapper.OrderLineMapper;
import hbi.core.demo.service.IOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by NoName on 2017/8/9.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderLineServiceImpl extends BaseServiceImpl<OrderLine> implements IOrderLineService{
    @Autowired
    private OrderLineMapper orderLineMapper;

    @Override
    public Long selectMaxLineNumber(Long headerId) {
        Long lineNumber = null;
        if(headerId != null){
            lineNumber = orderLineMapper.selectMaxLineNumber(headerId);
        }
        return lineNumber == null ? 0L : lineNumber;
    }

    @Override
    public List<OrderLine> selectLine(IRequest request, OrderLine emp, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return orderLineMapper.selectLine(emp);
    }
}
