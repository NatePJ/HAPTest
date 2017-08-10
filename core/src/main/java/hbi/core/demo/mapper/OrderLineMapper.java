package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.OrderLine;

import java.util.List;

/**
 * Created by NoName on 2017/8/9.
 */
public interface OrderLineMapper extends Mapper<OrderLine> {
    Long selectMaxLineNumber(Long headerId);
    List<OrderLine> selectLine(OrderLine emp);
    void deleteByHeaderId(Long headerId);
}
