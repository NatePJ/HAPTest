package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.OrderHeader;

import java.util.List;

/**
 * Created by NoName on 2017/8/8.
 */
public interface OrderHeaderMapper extends Mapper<OrderHeader> {
    List<OrderHeader> select(OrderHeader orderHeader);
}
