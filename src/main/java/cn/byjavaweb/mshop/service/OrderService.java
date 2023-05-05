package cn.byjavaweb.mshop.service;

import cn.byjavaweb.mshop.entity.Orders;
import cn.byjavaweb.mshop.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
	public OrderService(OrdersMapper mapper)
	{
		this.mapper = mapper;
	}
	
	private final OrdersMapper mapper;
	
	public List<Orders> getListOfStatus(int status, int start, int limit) {
		return mapper.getListOfStatus(status, start, limit);
	}
	
	public void dispose(int id) {
		mapper.dispose(id);
	}
	
	public void finish(int id) {
		mapper.finish(id);
	}
	
	public void delete(int id) {
		mapper.deleteById(id);
	}

	public List<Orders> findOrdersByUID(int userid){
		return mapper.selectByUID(userid);
	}

	public boolean update(Orders orders){
		return mapper.updateById(orders) > 0;
	}

	public Orders getByID(Orders orders){
		return mapper.selectById(orders.getId());
	}
}
