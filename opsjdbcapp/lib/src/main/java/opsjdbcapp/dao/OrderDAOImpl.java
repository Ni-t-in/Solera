package opsjdbcapp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import opsjdbcapp.model.Customer;
import opsjdbcapp.model.Order;
import opsjdbcapp.model.Product;
import opsjdbcapp.utility.DBConnectionUtils;

public class OrderDAOImpl implements OrderDAO{

	@Override
	public String addProduct(Product product) {
		try {
			PreparedStatement prs = DBConnectionUtils.getDBConnection().prepareStatement("insert into product(product_id,product_name,product_price,description) values(?,?,?,?);");
			prs.setInt(1, product.getProductId());
			prs.setString(2,product.getProductName());
			prs.setDouble(3, product.getPrice());
			prs.setString(4, product.getDescription());
			int suc = prs.executeUpdate();
			
			if(suc > 0) {
				return "Product added successfully.";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Error";
	}

	@Override
	public String addCustomer(Customer customer) {
		try {
			PreparedStatement prs = DBConnectionUtils.getDBConnection().prepareStatement("insert into customer(customer_id,customer_name,contact_number) values(?,?,?);");
			prs.setInt(1, customer.getCustId());
			prs.setString(2,customer.getCustomerName());
			prs.setLong(3, customer.getContactNumber());

			int suc = prs.executeUpdate();
			
			if(suc > 0) {
				return "Customer added successfully.";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Error";
	}

	@Override
	public String placeOrder(Order order) {
		try {
			PreparedStatement prs = DBConnectionUtils.getDBConnection().prepareStatement("insert into order_master(order_id,product_id,customer_id,quantity) values(?,?,?,?);");
			
			prs.setInt(1, order.getOrderId());
			prs.setInt(2, order.getProdId());
			prs.setInt(3, order.getCustId());
			prs.setFloat(4, order.getQuantity());
			
			int suc = prs.executeUpdate();
			
			if(suc > 0) {
				return "Order placed sucessfully.";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Error";
	}

	@Override
	public String getOrderByOrderId(Integer orderId) {
		String customerName = "", productName = "";
		Float quantity = 0f;
		Long contact = 0l;
		
		try {
			PreparedStatement prs = DBConnectionUtils.getDBConnection().prepareStatement("select customer_name,product_name,quantity,contact_number from order_master join product on order_master.product_id = product.product_id join customer on order_master.customer_id = customer.customer_id where order_id = ?;");
			prs.setInt(1, orderId);
			
			ResultSet rs = prs.executeQuery();
			if(rs.next()) {
				customerName = rs.getString(1);
				productName = rs.getString(2);
				quantity = rs.getFloat(3);
				contact = rs.getLong(4);
			}
			else {
				return "Error";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Customer Name : " + customerName + "\nProduct Name : " + productName + "\nQuantity : " + quantity + "\nContact Number : " + contact;
		
	}

	@Override
	public String updateOrder(Integer orderId,Integer prodId) {
		try {
			PreparedStatement prs = DBConnectionUtils.getDBConnection().prepareStatement("update order_master set product_id = ? where order_id = ?;");
			
			prs.setInt(1, prodId);
			prs.setInt(2, orderId);
			
			prs.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Order updated successfully;";
	}

	@Override
	public String deleteOrder(Integer orderId) {
		try {
			PreparedStatement prs = DBConnectionUtils.getDBConnection().prepareStatement("delete from order_master where order_id = ?;");
		
			prs.setInt(1, orderId);
			
			prs.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Order deleted successfully;";
	}

}
