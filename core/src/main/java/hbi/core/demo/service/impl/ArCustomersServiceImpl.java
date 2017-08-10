package hbi.core.demo.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.ArCustomers;
import hbi.core.demo.service.IArCustomersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by NoName on 2017/8/10.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ArCustomersServiceImpl extends BaseServiceImpl<ArCustomers> implements IArCustomersService {
}
