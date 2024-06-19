package com.store.book.online.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.book.online.dto.NewOrderDTO;
import com.store.book.online.dto.ViewOrderDTO;
import com.store.book.online.model.Book;
import com.store.book.online.model.Order;
import com.store.book.online.model.User;
import com.store.book.online.repository.BookRepository;
import com.store.book.online.repository.OrderRepository;
import com.store.book.online.repository.UserRepository;

@Service("OrderService")
@Transactional
public class OrderService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private OrderRepository orderRepository;
	/*
	 * registered user to order a book or books
	 */
	private static final Logger logger = LoggerFactory.getLogger(OrderService.class);
	public NewOrderDTO orderBook( NewOrderDTO orderDetails) {
		Order newOrder= new Order();	

		//registered user ordering books
		User user= userRepository.findUserByEmail(orderDetails.getEmail());

		if(userRepository.existsByEmail(orderDetails.getEmail())) {
			//lookup list of ordered books
			List<Book> orderedBooks= new ArrayList<Book>();
			for(String bookName: orderDetails.getBookNames()){
				if(bookRepository.existsByName(bookName)) {
					Book book= bookRepository.findBookByName(bookName);
					orderedBooks.add(book); 
				}else {
					logger.info("book "+bookName+" does not exists, please check the list of available books."); 
				}		 
			}
			if(!orderedBooks.isEmpty()) {
				newOrder.setUser(user);
				newOrder.setId(orderDetails.getOrderNo());
				newOrder.setOrderDate(new Date());
				newOrder.setBooks(orderedBooks);
				orderRepository.save(newOrder);
				logger.info("book(s) has been ordered successfully."); 
			}else {
				logger.info("no order has been made,please check the list of available books to make an order");
			}
		}else {
			logger.info("user "+orderDetails.getEmail()+" does not exist, please register in order to order a book.");
		}
		return orderDetails;
	}

	/*
	 *   book or books ordered by a user
	 */
	public List<Book> viewOrder(String userEmail,long orderNo){
		List<Book> books= new ArrayList<Book>();

		/*
		 * check if user exists to view list of books ordered
		 */
		if(userRepository.existsByEmail(userEmail)) {
			User user= userRepository.findUserByEmail(userEmail);
			Order viewOrder= new Order();
			for (Order order:user.getOrder() ) {
				if(order.getId().equals(orderNo)) {
					viewOrder=order;
					books=viewOrder.getBooks();
				}else
				{
					logger.info("Order does not exist. ");
				}
			}
		}else {
			logger.info("user "+userEmail +" does not exist, please register in order to order a book.");
		}
		return books;
	}
}
